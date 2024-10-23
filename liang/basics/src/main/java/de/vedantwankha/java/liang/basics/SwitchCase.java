package de.vedantwankha.java.liang.basics;

import java.lang.reflect.Type;

public class SwitchCase {
    public static void switchCase() {
        int day = 2;
        switch (day) {
            case 0:
                System.out.println("Mon");
                break;
            case 1:
                System.out.println("Tue");
                break;
            case 2:
                System.out.println("Wed");
                break;
            default:
                System.out.println("Invalid day");
        }

        // no fallthrough in following style of switch
        switch (day) {
            case 0 -> System.out.println("Mon");
            case 1 -> System.out.println("Tue");
            case 2 -> System.out.println("Wed");
            default -> System.out.println("Invalid day");
        }

        // switch as an expression since java 23
        System.out.println(switch(day) {
            case 0 -> "Mon";
            case 1 -> "Tue";
            case 2 -> "Wed";
            default -> "INvalid";
        });
    }
}
