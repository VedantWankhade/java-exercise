package de.vedantwankha.java.liang.basics;

public class GCD {
    public static int gcd(int a, int b) {
        // quick swap a and b -> a = a + b - (b = a)
        a = a > b ? a + b - (b = a) : a; // swap if a > b
        for (int i = a; i > 0; i--) {
            if (b % i == 0 && a % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
