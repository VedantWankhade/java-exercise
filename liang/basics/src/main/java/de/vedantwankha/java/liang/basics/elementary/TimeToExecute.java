package de.vedantwankha.java.liang.basics.elementary;

public class TimeToExecute {
    public static void benchmark() {
        long before = System.currentTimeMillis();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            System.out.println("Failed to sleep :(");
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
