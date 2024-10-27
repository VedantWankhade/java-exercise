package de.vedantwankha.java.liang.oop;

public class Regexes {
    public static void regexes() {
        System.out.println("java".matches("java"));
        System.out.println("javax".matches("java"));
        System.out.println("javax".matches("java.")); // . -> one char
        System.out.println("javaxx".matches("java."));
        System.out.println("javaxxav".matches("java.*")); // .* -> 0 or any number of chars
        System.out.println("java".matches("java.*"));
        System.out.println("java".matches("java.?")); // .? -> 0 or one char
        System.out.println("javax".matches("java.?"));
    }
}
