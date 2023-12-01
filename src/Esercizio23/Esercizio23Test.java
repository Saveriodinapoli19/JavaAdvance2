package Esercizio23;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class Esercizio23Test {
private final Esercizio23 testing = new Esercizio23();
    String input = "2023-03-01T13:00:00Z";
    OffsetDateTime data = OffsetDateTime.parse(input);
    @Test
    void dataFormat() {
   String result = testing.dataFormat(data);
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String output = data.format(dateTime);
        assertEquals("01 marzo 2023", result, output);
    }
}