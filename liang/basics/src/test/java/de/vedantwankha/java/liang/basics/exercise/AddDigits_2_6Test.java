package de.vedantwankha.java.liang.basics.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigits_2_6Test {

    @Test
    void addDigits() {
        assertEquals(2, AddDigits_2_6.addDigits(200));
        assertEquals(14, AddDigits_2_6.addDigits(932));
    }
}