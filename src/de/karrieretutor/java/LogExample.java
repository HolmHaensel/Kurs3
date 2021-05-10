package de.karrieretutor.java;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class LogExample {

    /**
     * @brief Das ist die Einstiegsmethode
     * @param args as String[] -  die übergeben Argumente
     */
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("log.txt"));
        System.setOut(ps);

        System.out.println("Folgende Argumente wurden übergeben:");
        for (String argument : args) {
            System.out.println("argument = " + argument);
        }
        ps.close();
    }

}
