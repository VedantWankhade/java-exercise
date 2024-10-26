package de.vedantwankha.java.liang.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search() {
        assertEquals(-2, BinarySearch.search(new int[] {0, 2}, 1));
        assertEquals(-2, BinarySearch.search(new int[] {0, 2}, 1));
        assertEquals(0, BinarySearch.search(new int[] {0, 2}, 0));
        assertEquals(1, BinarySearch.search(new int[] {0, 2}, 2));

        // returns " -(insertion point+1)"
        assertEquals(-2, BinarySearch.arraysBinSearch(new int[] {0, 2}, 1));
        assertEquals(-3, BinarySearch.arraysBinSearch(new int[] {0, 2}, 3));
        assertEquals(0, BinarySearch.arraysBinSearch(new int[] {0, 2}, 0));
        assertEquals(1, BinarySearch.arraysBinSearch(new int[] {0, 2}, 2));
    }
}