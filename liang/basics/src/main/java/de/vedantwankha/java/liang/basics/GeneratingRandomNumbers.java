package de.vedantwankha.java.liang.basics;

import java.util.Random;

/**
 * https://en.wikipedia.org/wiki/Random_number_generation
 * https://unix.stackexchange.com/questions/268952/using-dev-random-dev-urandom-to-generate-random-data
 */
public class GeneratingRandomNumbers {
    public static void random() {
        double r1 = Math.random();
        System.out.println(r1);

        int r2 = (int) (Math.random() * 10);
        System.out.println(r2);

        Random generator = new Random();

        double r3 = generator.nextDouble();
        System.out.println(r3);

        int r4 = generator.nextInt();
        System.out.println(r4);

        // rand between
        // (int) (Math.random() * (high - low)) + low
        int r5 = (int) (Math.random() * (4 - 2)) + 2;
        System.out.println(r5);

        int r6 = generator.nextInt(2, 4);
        System.out.println(r6);

        // random generator with a seed will always generate the same sequence of random numbers
        Random generatorWithSeed = new Random(2123L);
        System.out.println("Same always: " + generatorWithSeed.nextInt());
    }
}
