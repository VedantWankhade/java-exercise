package de.vedantwankha.java.liang.oop;

public class InnerClassExample {
}

class OuterClass {
    private int val;
    public void setVal(int val) {
        this.val = val;
    }

    class InnerClass {
        public void print() {
            System.out.println(this + " " + val);
        }
    }
}
