package de.vedantwankha.java.liang.oop;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ImmutableObjectsTest {
    @Test
    void testMutable() {
        MutableObject mo = new MutableObject();
        int v = mo.getValue();
        Date d = mo.getDate();
        d.setTime(123123L); // changing value through reference
    }

    @Test
    void testImmutable() {
        ImmutableObjectA a = new ImmutableObjectA();
        a.getValue();
        // cant do anything else
        // its immutable

        // but wait
        // we know that MutableObjectB is mutable
        MutableObjectB b = new MutableObjectB();
        b.getValue();
        b.getDate().setTime(123123L); // mutable

        // and MutableObjectB is a subclass of ImmutableObjectA
        // so if we cast object of ImmutableObjectA into MutableObjectB then the object of ImmutableObjectA becomes mutable
        MutableObjectB b2 = (MutableObjectB) new ImmutableObjectA();
        b2.getDate().setTime(123123L);

        // to prevent this the class ImmutableObjectA must be marked as final
        // so any mutable class cant extend it
    };

}