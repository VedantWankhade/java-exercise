package de.vedantwankha.java.liang.basics;

public class ShuffleArray {
    public static int[] shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ri = randomIndex(arr.length);
            arr[i] += arr[ri] - (arr[ri] = arr[i]);  // swap
        }
        return arr;
    }

    private static int randomIndex(int len) {
        return (int) (Math.random() * len);
    }
}
