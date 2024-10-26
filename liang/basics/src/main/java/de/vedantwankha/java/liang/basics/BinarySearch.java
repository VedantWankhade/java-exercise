package de.vedantwankha.java.liang.basics;

import java.util.Arrays;

public class BinarySearch {
    public static int search(int[] arr, int key) {
         int lo = 0, hi = arr.length - 1;
         int mid = 0;
         while (lo <= hi) {
             mid = lo + (hi - lo) / 2;
             if (arr[mid] == key) return mid;
             else if (key < arr[mid]) hi = mid - 1;
             else lo = mid + 1;
         }
         return -mid - 1; // return -(insertion point+1)
        // why not return -insertionpoint itself
        // -> because its not possible
        // it will be ambiguous when the insertion point is 0
    }

    public static int arraysBinSearch(int[] arr, int key) {
        return Arrays.binarySearch(arr, key); // returns " -(insertion point+1)"
    }
}
