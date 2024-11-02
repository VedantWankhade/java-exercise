package de.vedantwankha.java.liang.oop;

public class FunctionalInterfaceExample {
    public static void demo() {
        var addr = new Adder() {
            @Override
            public int add(int v1, int v2) {
                return v1 + v2;
            }
        };
        printAdd(22, 44, addr::add);
    }
    public static void printAdd(int a, int b, Adder addr) {
        System.out.println(addr.add(a, b));
    }
}

@FunctionalInterface
interface Adder {
    int add(int v1, int v2);
}
