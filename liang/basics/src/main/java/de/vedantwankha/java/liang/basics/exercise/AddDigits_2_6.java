package de.vedantwankha.java.liang.basics.exercise;
/**
 * Add digits of an integer
 */
public class AddDigits_2_6 {
    public static int addDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
        return sum;
    }
}
