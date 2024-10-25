package de.vedantwankha.java.liang.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    @Test
    void gcd() {
        assertEquals(25, GCD.gcd(125, 2525));
    }
}