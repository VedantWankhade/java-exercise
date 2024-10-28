package de.vedantwankha.java.liang.oop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInheritanceExampleTest {
    @Test
    void testConstructors() {
        A a = new A(2);
        B b = new B(99);
        System.out.println(a.val);
        System.out.println(b.val);

        Person p1 = new Person();
        Student p2 = new Student();
        Person p3 = new Student();
        Teacher p4 = new Teacher();
        Person p5 = new Teacher();
    }
}