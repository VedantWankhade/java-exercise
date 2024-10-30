package de.vedantwankha.java.liang.io;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WebFileIOTest {

    @Test
    void webFileIO() {
        try {
            WebFileIO.webFileIO();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}