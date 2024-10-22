package de.vedantwankha.java.liang.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Constants {
    public static void constants() {
        int a = 2;
        final int b = 2;
        a = 4;
        // b = 4; // fails

        int[] arr1 = new int[4];
        arr1[2] = 4;
        final int[]arr2 = new int[4]; // the reference is constant not the items inside the array
        arr2[3] = 4; // possbile since this is not reassigning the reference

        arr1 = new int[6];
        // arr2 = new int[6]; // not possible since this is reassigning the reference

        // you can still do this
        int[] arr3 = new int[] {2, 3, 4};
        // but craeting an array of named constants is not possible
        // what you instead want is an immutable array / list
        // you can simmulate this by wrapping a private array in a class and only providing getters for array elements
        // see de.vedantwankha.java.liang.oop.ImmutableArray for this

        // or you can use collections
        List<Integer> arr4 = Arrays.asList(1, 2, 3);
        arr4.set(0, 99); // modifiable
        arr4 = Collections.unmodifiableList(arr4);
        arr4.set(0, 100); // throws UnsupportedOperationException

        // Java 9+ List has a builtin method for it
        List<Integer> arr5 = List.of(1, 2, 3);
        arr5.set(0, 99); // this also throws an UnsupportedOperationException
    }
}
