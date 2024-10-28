package de.vedantwankha.java.liang.oop;

/**
 * Constructors are not inherited
 * and if we dont call super constructors explicitly then super() will be called implicitly
 */
public class ConstructorChainingExample {
}

class A {
    int val;
    public A(int val) {
        this.val = val;
    }
}

class B extends A {
    public B(int val) {
        super(val);
    }
}

// following class C wont compile
// because since we have not defined any constructor for C
// java gives us an implicit parameterless constructor
// public C() {} this constructor implicitely calls super()
// but super() i.e parameterless constructor of A does not exist

/*
class C extends A {
}
*/


// an empty constructor will also call super()
// hence the following will also not compile
/*
class D extends A {
    public D(){
    }
}
*/

// neither will the following
/*
class E extends A {
    public D(int val){
    }
}
*/

// this will also not work, even though we have implemented the constructor (its not empty)
// there is still an implicit call to super() inserted in the first line of constructor
/*
class F extends A {
    public D(int val){
        System.out.println(val);
    }
}
*/

class Person {
    public Person() {
        System.out.println("Person created");
    }
}

class Student extends Person {

}

class Teacher extends Person {
    public Teacher() {
        System.out.println("Teacher created");
    }
}