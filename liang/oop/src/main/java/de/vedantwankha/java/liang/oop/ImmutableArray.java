package de.vedantwankha.java.liang.oop;

public class ImmutableArray {
    private final int[] arr;

    public ImmutableArray(int... val) {
        arr = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            arr[i] = val[i];
        }
    }

    public int length() {
        return arr.length;
    }

    public int get(int index) {
        return arr[index];
    }
}
