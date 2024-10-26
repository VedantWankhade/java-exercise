package de.vedantwankha.java.liang.basics;

public class SelectionSort {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // only need to iterate until length - 1 since the last element will automatically be sorted as the largest
            int currentIndex = i;
            while (++currentIndex < arr.length) {
                if (arr[currentIndex] < arr[i]) {
                    arr[i] += arr[currentIndex] - (arr[currentIndex] = arr[i]);
                }
            }
        }
        return arr;
    }
}
