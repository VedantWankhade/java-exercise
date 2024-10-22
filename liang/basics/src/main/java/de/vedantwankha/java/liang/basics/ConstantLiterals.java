package de.vedantwankha.java.liang.basics;

public class ConstantLiterals {
    public static void literal() {
        System.out.println(15); // integer
        System.out.println(1_5); // underscore can be used to separate digits for easier understanding
        System.out.println(15L); // long
        System.out.println(1_5L); // long
        System.out.println(0B1111); // binary literal (this is a byte type - 1 byte)
        System.out.println(0B0000000000001111); // binary literal (this is an integer type - 4 bytes)
        System.out.println(017); // octal
        System.out.println(0xF); // hexadecimal
        System.out.println(23.28);  // double
        System.out.println(23.28F); // float
        System.out.println(2.328e10); // double
        System.out.println(2.328e10F); // float
    }
}
