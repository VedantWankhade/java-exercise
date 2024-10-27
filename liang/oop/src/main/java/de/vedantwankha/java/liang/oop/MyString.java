package de.vedantwankha.java.liang.oop;

public class MyString {
    private final char[] chars;
    private int length;

    public MyString(char[] chars) {
        this.chars = new char[chars.length];
        this.length = chars.length;
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }

    @Override
    public String toString() {
        return new String(chars);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MyString)) return false;
        MyString s = (MyString) o;
        for (int i = 0; i < this.length; i++)
            if (this.chars[i] != s.chars[i]) return false;
        return true;
    }

    public char charAt(int i) {
        return this.chars[i];
    }

    public int length() {
        return this.length;
    }

    public MyString toLowerCase() {
        MyString newString = new MyString(this.chars);
        for (int i = 0; i < this.length; i++) {
            if (newString.charAt(i) <= 'Z' && newString.charAt(i) >= 'A')
                newString.chars[i] = (char) (newString.charAt(i) + 32);
        }
        return newString;
    }

    public MyString toLowerCaseMutate() {
        for (int i = 0; i < this.length; i++) {
            if (this.charAt(i) <= 'Z' && this.charAt(i) >= 'A')
                this.chars[i] = (char) (this.charAt(i) + 32);
        }
        return this;
    }

    public MyString substring(int lo, int hi) throws IllegalArgumentException {
        if (lo < 0 || hi < 0) throw new IndexOutOfBoundsException("out of bounds");
        if (hi <= lo) throw new IllegalArgumentException("Invalid arguments hi <= lo");
        char[] chars = new char[hi - lo];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = this.chars[lo + i];
        }
        return new MyString(chars);
    }
}
