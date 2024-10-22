package de.vedantwankha.java.liang.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstantsTest {

    @Test
    void constants() {
        try {
            Constants.constants();
        } catch (UnsupportedOperationException e) {
            System.out.println("See I told you, you cant modify");
            e.printStackTrace();
        }
    }
}