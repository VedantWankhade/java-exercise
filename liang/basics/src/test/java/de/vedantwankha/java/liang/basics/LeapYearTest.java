package de.vedantwankha.java.liang.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void leapYear() {
        assertTrue(LeapYear.is(2008));
        assertFalse(LeapYear.is(1900));
        assertFalse(LeapYear.is(2002));
    }
}