package de.vedantwankha.java.liang.oop;

public class MethodOverriding {
}

class A1 {
    private int val = 1;
    public int getVal() {
        return val;
    }
}

class B1 extends A1 {
    private int val = 99;
}

class C1 extends A1 {
    private int val = 20;
    public int getVal() {return val;}
}

class D1 extends A1 {
    private int val = 30;
    // private int getVal() {return val;} // wont compile - reducing access not allowed
}

class A2 {
    private int val = 1;
    private int getVal() {
        return val;
    }
}

class D2 extends A2 {
    private int val = 30;
     private int getVal() {return val;} // this will work but this method does not technically override method in A2 - they are unrelated
}