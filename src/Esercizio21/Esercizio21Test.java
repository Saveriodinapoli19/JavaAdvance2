package Esercizio21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Esercizio21Test {
private final Esercizio21 test = new Esercizio21();
    @Test
    void nullability() {
    boolean result = test.nullability(5, null);
    assertFalse(result);
    }

}