package de.vedantwankha.java.liang.basics.checkpoint;
/**
 *  Write an expression that rounds up or down a double value in a variable to an integer.
 */
public class RoundDouble_2_16_6 {
    public static int round(double d) {
        // System.out.println(d);
        int id = (int) d;
        // System.out.println(id + 0.5);
        int upd = id + 0.5 > d ? id : id + 1;
        System.out.println(upd);
        return upd;
    }
}
