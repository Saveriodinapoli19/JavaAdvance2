package Esercizio22;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class Esercizio22Test {
private final Esercizio22 test = new Esercizio22();
String input = "2002-03-01T13:00:00Z";
    OffsetDateTime data = OffsetDateTime.parse(input);
    @Test
    void dataFull() {
        String result = test.dataFull(data);
        DateTimeFormatter dataFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String output = data.format(dataFull);
        assertEquals("venerdì 1 marzo 2002",result, output);
    }

    @Test
    void dataMedium() {
        String result = test.dataMedium(data);
        DateTimeFormatter dataMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        String output = data.format(dataMedium);
        assertEquals("1 mar 2002", result, output);
    }

    @Test
    void dataShort() {
        String result = test.dataShort(data);
        DateTimeFormatter dataShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String output = data.format(dataShort);
        assertEquals("01/03/02",result, output);
    }
}