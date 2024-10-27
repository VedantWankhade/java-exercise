package de.vedantwankha.java.liang.oop;

import java.util.Date;

public class ImmutableObjects {
}

// this is immutable
class ImmutableObjectA {
    private int value;
    public int getValue() {return this.value;}
}

final class ActualImmutableObjectA {
    private int value;
    public int getValue() {return this.value;}
}

class MutableObjectB extends ImmutableObjectA {
    // members of ImmutableObjectA
    public int value;
    private Date date = new Date();
    public Date getDate() {return this.date;}
}

class MutableObject {
    private int value;
    final private Date date = new Date(); // even when set final the value of this object is mutable

    public int getValue() {return this.value;}
    public Date getDate() {return this.date;}
}
