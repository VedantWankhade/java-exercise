package de.vedantwankha.java.liang.oop;

import static org.junit.jupiter.api.Assertions.*;

class ImmutableArrayTest {
    ImmutableArray arr;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        arr = new ImmutableArray(1, 2, 3);
    }

    @org.junit.jupiter.api.Test
    void length() {
        System.out.println(arr.get(0));
    }

    @org.junit.jupiter.api.Test
    void get() {
        System.out.println(arr.length());
    }
}