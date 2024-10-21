package de.vedantwankha.java.liang.basics.checkpoint;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoundDouble_2_16_6_Test {
    @Test
    public void testRoundUp() {
        assertEquals(2, RoundDouble_2_16_6.round(2.3));
        assertEquals(3, RoundDouble_2_16_6.round(2.5));
        assertEquals(3, RoundDouble_2_16_6.round(2.7));
    }
}
