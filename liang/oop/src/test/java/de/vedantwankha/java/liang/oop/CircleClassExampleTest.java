package de.vedantwankha.java.liang.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleClassExampleTest {
    @Test
    void testCircleClass() {
        CircleClassExample c = new CircleClassExample();
        System.out.println(c.name);
        System.out.println(c.radius);
        System.out.println(c.isFill);
        System.out.println(c);
    }
}