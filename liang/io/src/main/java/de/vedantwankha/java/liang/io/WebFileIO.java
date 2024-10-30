package de.vedantwankha.java.liang.io;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebFileIO {
    public static void webFileIO() throws IOException {
        URL url = new URL("https://vedaant.dev");
        Scanner sc = new Scanner(url.openStream());
        while (sc.hasNextLine()) System.out.println(sc.nextLine());
    }
}
