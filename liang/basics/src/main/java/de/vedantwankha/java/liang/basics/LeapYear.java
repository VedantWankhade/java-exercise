package de.vedantwankha.java.liang.basics;

public class LeapYear {
    public static boolean is(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
