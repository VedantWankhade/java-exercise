package de.vedantwankha.java.liang.basics;

/**
 * Assignment statement assigns a value to a variable but it can also act as an expression meaning it evaluates to a value.
 */
public class AssignmentStatementAndExpression {
    public static void assignment() {
        // variable = expression (this whole thing is an assignment statement which in turn is also an expression)
        int a = 2; // statement
        System.out.println(a);
        System.out.println(a = 4); // statement used as expression (a = 4 evaluates to 4)
        int b = 2;
        int c;
        // this is also possible
        c = b = a = 23;
        System.out.println(c + " " + b);
        // int m = n = 2; // but the variables need to be declared first hence this is not possible
    }
}
