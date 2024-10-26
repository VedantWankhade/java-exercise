package de.vedantwankha.java.liang.basics;

public class VariadicMethod {
    public static void variadicMethod() {
        System.out.println(sum(1));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(new int[] {1, 2}));
        int[] arr = new int[] {1, 2};
        System.out.println(sum(arr));

        System.out.println(sum2(new int[] {1, 2}));
        // System.out.println(sum2(1, 2, 3); // wont work as sum2 is not variadic
    }

    private static int sum(int... nums) {
        int sum = 0;
        for (int n: nums) {
            sum += n;
        }
        return sum;
    }

    // public static void sum(int[] nums) {} // this is considered exact same definition as above method hence wont compile as duplicate

    private static int sum2(int[] nums) {
        // impl
        return -1;
    }

}
