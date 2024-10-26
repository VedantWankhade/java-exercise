package de.vedantwankha.java.liang.basics;

public class MergeSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        if (arr1.length == 0 && arr2.length == 0) return arr1;
        else if (arr1.length == 0) return arr2;
        else if (arr2.length == 0) return arr1;

        int[] res = new int[arr1.length + arr2.length];
        int arr1Index = 0, arr2Index = 0, i;
        for (i = 0; i < res.length && arr1Index < arr1.length && arr2Index < arr2.length; i++) {
            if (arr1[arr1Index] < arr2[arr2Index]) {
                res[i] = arr1[arr1Index++];
            } else {
                res[i] = arr2[arr2Index++];
            }
        }
        if (arr1Index == arr1.length) {
            for (; i < res.length; i++) {
                res[i] = arr2[arr2Index++];
            }
        } else {
            for (; i < res.length; i++) {
                res[i] = arr1[arr1Index++];
            }
        }
        return res;
    }
}
