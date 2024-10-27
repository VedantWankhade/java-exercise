package de.vedantwankha.java.liang.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringTest {
    @Test
    void testConstructor() {
        MyString s = new MyString(new char[]{'a', 'b', 'c'});
        System.out.println(s);
    }

    @Test
    void testCharAt() {
        MyString s = new MyString(new char[]{'a', 'b', 'c'});
        System.out.println(s.charAt(1));
        assertEquals('b', s.charAt(1));
    }

    @Test
    void testLength() {
        MyString s = new MyString(new char[]{'a', 'b', 'c'});
        System.out.println(s.length());
        assertEquals(3, s.length());
    }

    @Test
    void testEquals() {
        MyString s1 = new MyString(new char[]{'a', 'b', 'c'});
        MyString s2 = new MyString(new char[]{'a', 'b', 'c'});
        MyString s3 = new MyString(new char[]{'x', 'b', 'c'});
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        assertTrue(s1.equals(s2));
        assertFalse(s1.equals(s3));
        // same as below since assertEquals calls o1.equals(o2)
//        assertEquals(s1, s2);
//        assertNotEquals(s1, s3);
    }

    @Test
    void testToLowerCase() {
        MyString s1 = new MyString(new char[]{'A', 'B', 'C'});
        System.out.println(s1.toLowerCase());
        MyString s2 = new MyString(new char[]{'A', 'B', 'Z'});
        System.out.println(s2.toLowerCase());
        MyString s3 = new MyString(new char[]{'A', 'b', 'Z'});
        System.out.println(s2.toLowerCase());

        // test the immutability
        MyString original = new MyString(new char[]{'X', 'Y', 'Z'});
        MyString pointer = original;
        System.out.println(original);
        System.out.println(pointer);
        original = original.toLowerCase();
        System.out.println(original);
        System.out.println(pointer);

        // test the immutability
        MyString original1 = new MyString(new char[]{'M', 'U', 'T', 'A', 'T', 'E'});
        MyString pointer1 = original1;
        System.out.println(original1);
        System.out.println(pointer1);
        original1.toLowerCaseMutate();
        System.out.println(original1);
        System.out.println(pointer1);
    }

    @Test
    void testSubstring() {
        MyString s1 = new MyString(new char[]{'a', 'b', 'c'});
        System.out.println(s1.substring(0, 3));
        System.out.println(s1.substring(0, 2));
        System.out.println(s1.substring(0, 1));
        System.out.println(s1.substring(-1, 2));
        System.out.println(s1.substring(5, 0));
        assertEquals(new MyString(new char[]{'a', 'b'}), s1.substring(0, 2));
        assertEquals(new MyString(new char[]{'a', 'b'}), s1.substring(0, 2));
    }
}