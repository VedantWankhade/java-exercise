package de.vedantwankha.java.liang.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InnerClassExampleTest {
    @Test
    void test() {
        OuterClass ic = new OuterClass();
        OuterClass.InnerClass a = ic.new InnerClass();
        ic.setVal(99);
        a.print();
    }
}