package de.vedantwankha.java.liang.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnnotationsExampleTest {

    @Test
    void demo() {
        try {
            AnnotationsExample.demo();
        } catch (NoSuchMethodException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}