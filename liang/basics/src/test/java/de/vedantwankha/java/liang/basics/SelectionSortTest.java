package de.vedantwankha.java.liang.basics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void sort() {
        System.out.println(Arrays.toString(SelectionSort.sort(new int[]{1, 7, 4, 3, 2, 10})));
        System.out.println(Arrays.toString(SelectionSort.sort(new int[]{1})));
    }
}