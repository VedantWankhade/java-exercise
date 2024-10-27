package de.vedantwankha.java.liang.oop;

import java.math.BigInteger;

/**
 * Factorial can be very large causing overflow
 */
public class LargeFactorial {
    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (long i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
