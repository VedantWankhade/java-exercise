package de.vedantwankha.java.liang.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * write a cli app to receive args as follows
 * source_file target_file old_string new_string
 * replace all occurrences of old_string with new_string in source_file and write to target_file
 */
public class ReplaceTextInFile {
    public static void replaceAll(String... args) {
        if (args.length != 4) {
            printHelp();
            System.exit(1);
        }

        var sourceFile = new File(args[0]);
        var targetFile = new File(args[1]);
        String oldString = args[2];
        String newString = args[3];
        var logger = System.getLogger("replaceAll");
        logger.log(System.Logger.Level.INFO, "Source file set to: " + sourceFile.getAbsolutePath());
        logger.log(System.Logger.Level.INFO, "Target file set to: " + targetFile.getAbsolutePath());
        logger.log(System.Logger.Level.INFO, "Checking if source file exists...");

        if (!sourceFile.exists()) {
            logger.log(System.Logger.Level.ERROR, "Source file does not exist\n" + "Exiting...");
            System.exit(1);
        }
        if (targetFile.exists()) {
            logger.log(System.Logger.Level.WARNING, "Target file already exists\n" + "Contents will be replaced");
        } else {
            logger.log(System.Logger.Level.INFO, "Target file does not exist\n" + "File will be created");
        }
        logger.log(System.Logger.Level.INFO, "Replacing " + oldString + " with " + newString);

        // read and repalce
        StringBuilder contents = new StringBuilder();
        try(Scanner sc = new Scanner(sourceFile)) {
            while (sc.hasNextLine())
                contents.append(sc.nextLine().replaceAll(oldString, newString));
        } catch (FileNotFoundException e) {
            logger.log(System.Logger.Level.ERROR, "Source file does not exist or may not be readable\n" + "Exiting...");
            System.exit(1);
        }

        // write
        try (PrintWriter pw = new PrintWriter(targetFile)) {
            pw.write(contents.toString());
        } catch (FileNotFoundException e) {
            logger.log(System.Logger.Level.ERROR, "Target file may not be writable\n" + "Exiting...");
            logger.log(System.Logger.Level.INFO, "Dumping the contents to STDIN");
            System.out.println(contents);
            System.exit(1);
        }
        logger.log(System.Logger.Level.INFO, "Done");
    }

    private static void printHelp() {
        System.out.println("""
                Error : missing arguments
                Usage:
                    source_file target_file old_string new_string
                """);
    }
}
