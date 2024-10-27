package de.vedantwankha.java.liang.oop;

import java.security.SecureRandom;
import java.util.Random;

/**
 * random numbers generated with java.util.Random are deterministic
 * random numbers generated with java.security.SecureRandom are non deterministic hence are secure
 */
public class SecureRandomNumbers {
    public static void random() {
        Random r1 = new Random();
        System.out.println(r1.nextInt());

        SecureRandom r2 = new SecureRandom();
        System.out.println(r2.nextInt());
    }
}
