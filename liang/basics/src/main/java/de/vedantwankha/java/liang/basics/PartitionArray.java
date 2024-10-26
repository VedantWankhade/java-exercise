package de.vedantwankha.java.liang.basics;

public class PartitionArray {
    public static int[] partition(int[] arr) {
        int lo = 1, hi = arr.length - 1;
        int pivot = arr[0];
        while (lo < hi) {
            if (arr[lo] > pivot)
                arr[lo] += arr[hi] - (arr[hi--] = arr[lo]);
            else
                lo++;
        }
        arr[hi] += arr[0] - (arr[0] = arr[hi]);
        return arr;
    }
}
