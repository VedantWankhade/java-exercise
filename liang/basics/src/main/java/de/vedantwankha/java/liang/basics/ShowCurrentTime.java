package de.vedantwankha.java.liang.basics;

public class ShowCurrentTime {
    public static void show() {
        long totalSeconds = System.currentTimeMillis() / 1000;
        int currentSecond = (int) (totalSeconds % 60);
        int totalMinutes = (int) (totalSeconds / 60);
        int currentMinutes = (int) (totalMinutes % 60);
        int totalHours = totalMinutes / 60;
        int currentHour = totalHours % 24;
        System.out.println(currentHour + "H " + currentMinutes + "M " + currentSecond + "S\n");
    }
}
