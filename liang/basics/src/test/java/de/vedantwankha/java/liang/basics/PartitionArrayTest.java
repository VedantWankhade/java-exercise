package de.vedantwankha.java.liang.basics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PartitionArrayTest {

    @Test
    void partition() {
        System.out.println(Arrays.toString(PartitionArray.partition(new int[]{10, 1, 5, 16, 61, 9, 11, 1})));
    }
}