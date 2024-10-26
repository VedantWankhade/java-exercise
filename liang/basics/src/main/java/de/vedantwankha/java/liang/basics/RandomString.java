package de.vedantwankha.java.liang.basics;

public class RandomString {
    public static String randomString(int length) {
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < length; i++) {
            rs.append(RandomCharacter.randomCharacter('a', 'z'));
        }
        return rs.toString();
    }
}
