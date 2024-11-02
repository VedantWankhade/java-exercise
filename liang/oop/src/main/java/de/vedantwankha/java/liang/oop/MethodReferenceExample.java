package de.vedantwankha.java.liang.oop;

public class MethodReferenceExample {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void demo() {
        Addable a = MethodReferenceExample::add;
        System.out.println(a.add(2, 3));

    }}

interface Addable {
    int add(int a, int b);
}
