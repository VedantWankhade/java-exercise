package de.vedantwankha.java.liang.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodOverridingTest {
    @Test
    void testOverriding() {
        A1 a1 = new A1();
        B1 b1 = new B1();
        A1 ab1 = new B1();
        C1 c1 = new C1();
        A1 ca1 = new C1();
        System.out.println(a1.getVal());
        System.out.println(b1.getVal());
        System.out.println(ab1.getVal());
        System.out.println(c1.getVal());
        System.out.println(ca1.getVal());
    }
}