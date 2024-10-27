package de.vedantwankha.java.liang.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargeFactorialTest {

    @Test
    void factorial() {
        System.out.println(LargeFactorial.factorial(50L));
    }
}