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
        DateTimeFormatter dataFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String output = data.format(dataFull);
        assertEquals("venerdì 1 marzo 2002", output);
    }

    @Test
    void dataMedium() {
        DateTimeFormatter dataMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        String output = data.format(dataMedium);
        assertEquals("1 mar 2002", output);
    }

    @Test
    void dataShort() {
        DateTimeFormatter dataShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String output = data.format(dataShort);
        assertEquals("01/03/02", output);
    }
}