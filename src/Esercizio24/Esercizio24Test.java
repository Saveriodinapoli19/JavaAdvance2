package Esercizio24;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Esercizio24Test {
private final Esercizio24 test = new Esercizio24();
String input = "2023-03-01T13:00:00Z";
OffsetDateTime data = OffsetDateTime.parse(input);
    @Test
    void getYear() {
        int result = test.getYear(data);
        assertEquals(2023, result);
    }

    @Test
    void getMonth() {
    String result = test.getMonth(data);
    assertEquals("MARCH", result);
    }

    @Test
    void getDay() {
    int result = test.getDay(data);
    assertEquals(01, result);
    }

    @Test
    void getDayWeek() {
    String result = test.getDayWeek(data);
    assertEquals("WEDNESDAY", result);
    }
}