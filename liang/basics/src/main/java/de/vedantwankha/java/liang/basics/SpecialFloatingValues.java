package de.vedantwankha.java.liang.basics;

/**
 * Dividing an int with 0 throws ArithmeticException but dividing a float with 0 does not
 */
public class SpecialFloatingValues {
    public static void specialFloats() {
//        int a = 2 / 0;  // ArithmeticException
        double b = 2.0 / 0; // runs fine
        System.out.println(b); // prints Infinity
        System.out.println(Double.isInfinite(b));
        System.out.println(b == Double.POSITIVE_INFINITY);
        System.out.println(b == Double.NEGATIVE_INFINITY);
        System.out.println(Double.isNaN(b)); // not NaN

        double c = 0.0 / 0;
        System.out.println(Double.isNaN(c)); // NaN represents undefined

        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN == Double.NaN); // doesnt work
        System.out.println(c == Double.NaN); // doesnt work
    }
}
