package de.vedantwankha.java.liang.basics.checkpoint;

/**
 * Print size, max and min values of byte, short, int, long, float and double
 */
public class TypeLimits_2_9_1 {
    public static void solution() {
        print("byte", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        print("char", Character.SIZE, Character.MIN_VALUE, Character.MAX_VALUE);
        print("int", Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        print("long", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        print("float", Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE); // min value is so small that it shows as 0.0 when printed
        print("double", Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
    }

    private static void print(String typeName, int byteSize, double min, double max) {
        System.out.printf("%s -> %d %f %f\n", typeName, byteSize, min, max);
    }

    private static void print(String typeName, int byteSize, long min, long max) {
        System.out.printf("%s -> %d %d %d\n", typeName, byteSize, min, max);
    }
}
