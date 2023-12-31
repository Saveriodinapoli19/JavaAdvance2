package Esercizio25;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Esercizio25Test {
private final Esercizio25 test = new Esercizio25();
String input = "2023-03-01T13:00:00Z";
OffsetDateTime data = OffsetDateTime.parse(input);

    @Test
    void updatedYear() {
    String result = test.updatedYear(data);
    assertEquals("2024-02-08T13:00Z", result);
    }

    @Test
    void localize() {
    String result = test.localize(data);
    assertEquals("01 marzo 2023", result);
    }
}