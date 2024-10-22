package de.vedantwankha.java.liang.basics.checkpoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundDouble_2_16_6_Test {
    @Test
    void round() {
        assertEquals(2, RoundDouble_2_16_6.round(2.3));
        assertEquals(3, RoundDouble_2_16_6.round(2.5));
        assertEquals(3, RoundDouble_2_16_6.round(2.7));
    }
}