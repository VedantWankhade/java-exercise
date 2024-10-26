package de.vedantwankha.java.liang.basics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleArrayTest {

    @Test
    void shuffle() {
        System.out.println(Arrays.toString(ShuffleArray.shuffle(new int[]{1, 2, 3, 4, 5})));
    }
}