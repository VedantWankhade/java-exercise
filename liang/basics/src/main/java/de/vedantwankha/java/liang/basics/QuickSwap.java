package de.vedantwankha.java.liang.basics;

/**
 * quick swap two numbers without introducing any auxiliary variables
 * do it in one statement
 */
public class QuickSwap {
    public static void quickSwap() {
        // this way of swapping has a risk
        // for large numbers, it potentially could lead to overflow

        int a = 2, b = 99;
        System.out.println("a: " + a + " b: " + b);
        // quick swap with a = a + b - (b = a)
        a = a + b - (b = a);
        System.out.println("a: " + a + " b: " + b);
        a +=  b - (b = a);
        System.out.println("a: " + a + " b: " + b);

        // lets say you want smaller number of the two in a and bigger one in b then you can do the following
        // a = a > b ? a + b - (b = a) : a; // swap if a > b
    }
}
