package de.vedantwankha.java.liang.basics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArraysTest {

    @Test
    void merge() {
        System.out.println(Arrays.toString(MergeSortedArrays.merge(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(MergeSortedArrays.merge(new int[]{}, new int[]{})));
        System.out.println(Arrays.toString(MergeSortedArrays.merge(new int[]{}, new int[]{1})));
        System.out.println(Arrays.toString(MergeSortedArrays.merge(new int[]{1}, new int[]{1})));
        System.out.println(Arrays.toString(MergeSortedArrays.merge(new int[]{1}, new int[]{})));
        System.out.println(Arrays.toString(MergeSortedArrays.merge(new int[]{1, 5, 16, 61, 111}, new int[]{2, 4, 5, 6})));
    }
}