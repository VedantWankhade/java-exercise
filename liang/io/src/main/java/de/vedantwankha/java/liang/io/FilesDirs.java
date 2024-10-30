package de.vedantwankha.java.liang.io;

import java.io.File;
import java.util.Date;

public class FilesDirs {
    public static void filesDirs() {
        File file = new File("src/main/java/de/vedantwankha/java/liang/io/Main.java");
        System.out.println("file.exists(): " + file.exists());
        System.out.println("file.length(): " + file.length());
        System.out.println("file.canRead(): " + file.canRead());
        System.out.println("file.canWrite(): " + file.canWrite());
        System.out.println("file.isDirectory(): " + file.isDirectory());
        System.out.println("file.isFile(): " + file.isFile());
        System.out.println("file.isAbsolute(): " + file.isAbsolute());
        System.out.println("file.isHidden(): " + file.isHidden());
        System.out.println("file.getAbsolutePath(): " + file.getAbsolutePath());
        System.out.println("file.getPath(): " + file.getPath());
        System.out.println("file.lastModified(): " + new Date(file.lastModified()));
        System.out.println("file.getName(): " + file.getName());

        File dir = new File("src");
        System.out.println("dir.exists(): " + dir.exists());
        System.out.println("dir.isDirectory(): " + dir.isDirectory());
        System.out.println("dir.getAbsolutePath(): " + dir.getAbsolutePath());
        System.out.println("dir.getName(): " + dir.getName());
    }
}
