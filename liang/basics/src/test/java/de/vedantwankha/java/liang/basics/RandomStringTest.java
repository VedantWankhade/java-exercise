package de.vedantwankha.java.liang.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomStringTest {

    @Test
    void randomString() {
        System.out.println(RandomString.randomString(0));
        System.out.println(RandomString.randomString(1));
        System.out.println(RandomString.randomString(2));
        System.out.println(RandomString.randomString(3));
        System.out.println(RandomString.randomString(10));
    }
}