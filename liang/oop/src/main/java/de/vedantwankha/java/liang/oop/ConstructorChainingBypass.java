package de.vedantwankha.java.liang.oop;

import java.math.BigInteger;

/**
 * a subclass constructor will always call super() as its first statement
 */
public class ConstructorChainingBypass {
    public static void demo() {
        PositiveBigInteger numA1 = new PositiveBigInteger("1");
        PositiveBigInteger numA2 = new PositiveBigInteger("-11"); // will construct the object before throwing exception
        PositiveBigIntegerWithBypass numB1 = new PositiveBigIntegerWithBypass("1");
        PositiveBigIntegerWithBypass numB2 = new PositiveBigIntegerWithBypass("-11"); // will not construct the object before throwing exception
    }
}

class PositiveBigIntegerWithBypass extends BigInteger {
    private static boolean isNegative(String s) {
        return s.charAt(0) == '-';
    }

    // the trick is to call a method in super() argument list
    public PositiveBigIntegerWithBypass(String val) {
        super(ensurePositive(val));
    }

    private static String ensurePositive(String s) {
        if (isNegative(s)) throw new IllegalArgumentException("Negative value provided");
        return s;
    }
}

class PositiveBigInteger extends BigInteger {
    // following creates a BigInteger even if its negative
    public PositiveBigInteger(String val) {
        super(val); // i have to call this before doing anything
        if (isNegative(val)) throw new IllegalArgumentException("Negative value provided");
    }

    private static boolean isNegative(String s) {
        return s.charAt(0) == '-';
    }
}
