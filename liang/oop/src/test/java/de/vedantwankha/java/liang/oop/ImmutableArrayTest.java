package de.vedantwankha.java.liang.oop;

import org.junit.Before;
import org.junit.Test;

public class ImmutableArrayTest {
    ImmutableArray arr; 

    @Before
    public void init() {
       arr = new ImmutableArray(1, 2, 3);
    }

    @Test
    public void testGet() {
        System.out.println(arr.get(0));
    }

    @Test
    public void testLength() {
        System.out.println(arr.length());
    }
}
