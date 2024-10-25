package de.vedantwankha.java.liang.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexToDecTest {

    @Test
    void hexToDec() {
        assertEquals(10, HexToDec.hexToDec("A"));
        assertEquals(9, HexToDec.hexToDec("9"));
        assertEquals(0, HexToDec.hexToDec("0"));
        assertEquals(15, HexToDec.hexToDec("F"));
    }
}