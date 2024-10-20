package de.vedantwankha.java.liang.basics.elementary;

import org.junit.Test;

public class ConstantsTest {
    @Test
    public void testConstants() {
        try {
            Constants.constants();
        } catch (UnsupportedOperationException e) {
            System.out.println("See I told you, you cant modify");
            e.printStackTrace();
        }
    }
}
