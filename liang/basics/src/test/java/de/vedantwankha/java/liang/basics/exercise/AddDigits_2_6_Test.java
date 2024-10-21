package de.vedantwankha.java.liang.basics.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddDigits_2_6_Test {
    @Test
    public void testAddDigits() {
        assertEquals(2, AddDigits_2_6.addDigits(200));
        assertEquals(14, AddDigits_2_6.addDigits(932));
    }
}
