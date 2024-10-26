package de.vedantwankha.java.liang.basics;

public class FirstLargestOfArray {
    public static int indexOfLargest(int[] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }
}
