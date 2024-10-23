package de.vedantwankha.java.liang.basics.checkpoint;

/**
 * Write conditional expression that returns -1 or 1 randomly.
 */
public class Conditional_3_14_4 {
    public static int solution() {
        // Math.random() * 2 to "evenly" generate number < 1 and > 1
        return (int) (Math.random() * 2) == 0 ? -1 : 1;
        // or just do
        // return (int) (Math.random() < 0.5 ? -1 : 1;
    }
}
