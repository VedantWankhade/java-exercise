package de.vedantwankha.java.liang.basics;

public class RandomCharacter {
    public static char randomCharacter() {
//        return (char) ((Math.random() * (int)('z' - 'a')) + 'a' + 1);
        return (char) ('a' + Math.random() * ('z' - 'a' + 1));
    }

    public static char randomCharacter(char c1, char c2) {
        return (char) (c1 + Math.random() * (c2 - c1 + 1));
    }
}
