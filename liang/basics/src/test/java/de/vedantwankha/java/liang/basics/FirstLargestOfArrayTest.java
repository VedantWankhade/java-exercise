package de.vedantwankha.java.liang.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLargestOfArrayTest {

    @Test
    void indexOfLargest() {
        assertEquals(FirstLargestOfArray.indexOfLargest(new int[]{1, 2, 3, 3}), 2);
        assertEquals(FirstLargestOfArray.indexOfLargest(new int[]{1, 3, 2, 3}), 1);
    }
}