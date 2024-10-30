package de.vedantwankha.java.liang.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class FileIO {
    public static void fileIO() {
        // read
        System.out.println(read("README.md"));
        System.out.println(read("pom.xml"));

        // write
        try {
            write("helloooooooo", "/tmp/newFile.txt");
            System.out.println(read("/tmp/newFile.txt"));
        } catch (FileAlreadyExistsException ex) {
            System.out.println("File already exists" + ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.out.println("file doesnt exists" + ex.getMessage());
        }
    }

    private static String read(String filePath) {
        File readFromFile = new File(filePath);
        StringBuilder contents = new StringBuilder();;
        try(Scanner sc = new Scanner(readFromFile)) {
            while (sc.hasNextLine())
                contents.append(sc.nextLine());
        } catch (FileNotFoundException ex) {
            contents.append("[ERROR] File ").append(readFromFile.getAbsoluteFile()).append(" not found");
        }
        return contents.toString();
    }

    private static void write(String contents, String filePath) throws FileNotFoundException, FileAlreadyExistsException {
        File writeToFile = new File(filePath);
        if (writeToFile.exists()) {
            throw new FileAlreadyExistsException("File exists bro");
        }
        try(PrintWriter writer = new PrintWriter(writeToFile)) {
            writer.println(contents);
        }
    }
}
