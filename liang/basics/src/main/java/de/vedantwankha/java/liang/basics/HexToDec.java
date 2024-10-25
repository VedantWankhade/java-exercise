package de.vedantwankha.java.liang.basics;

public class HexToDec {
    public static int hexToDec(String hexString) {
        int dec = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char digit = hexString.charAt(hexString.length() - i - 1);
            int dint = digit - '0';
            if (digit >= 'A' && digit <= 'F') {
                dint = digit - 'A' + 10;
            }
            dec += dint * Math.pow(16, i);
        }
        return dec;
    }
}
