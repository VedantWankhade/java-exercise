package de.vedantwankha.java.liang.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomCharacterTest {

    @Test
    void randomCharacter() {
        int i = 20;
        while (i-- > 0) System.out.print(RandomCharacter.randomCharacter());
        System.out.println();
        i = 20;
        while (i-- > 0) System.out.print(RandomCharacter.randomCharacter('a', 'c'));
        System.out.println();
        i = 90;
        while (i-- > 0) System.out.print(RandomCharacter.randomCharacter('\u0000', '\uFFFF'));
        System.out.println();
    }
}