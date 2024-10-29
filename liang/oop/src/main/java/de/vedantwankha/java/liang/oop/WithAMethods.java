package de.vedantwankha.java.liang.oop;

public class WithAMethods {
    public static void useWithAMethods() {
        var p1 = new Point(1, 2, 3);
        var p2 = p1.withX(99);
        var p3 = p2.withX(10).withY(20);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

class Point {
    private final int x, y, z;
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point withX(int x) {
        return new Point(x, this.y, this.z);
    }
    public Point withY(int y) {
        return new Point(this.x, y, this.z);
    }
    public Point withZ(int z) {
        return new Point(this.x, this.y, z);
    }
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}
