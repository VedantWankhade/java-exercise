package de.vedantwankha.java.liang.oop;

import java.util.Date;

public class DateExample {
    public static void dateExample() {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(Date.from(d.toInstant()));
    }
}
