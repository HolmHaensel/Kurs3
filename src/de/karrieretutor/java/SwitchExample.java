package de.karrieretutor.java;

import java.util.Scanner;

public class SwitchExample {

    /**
     * @param args as String[] -  die übergeben Argumente
     * @brief Das ist die Einstiegsmethode
     */
    public static void main(String[] args) {
        do {
            System.out.print("Bitte geben Sie ihr Anliegen an: ");
            Scanner sc = new Scanner(System.in);     // Scanner für input
            String anliegen = sc.next().toLowerCase();

            switch (anliegen) {
                case "kündigung":
                    System.out.println("Kündigung");
                    break;
                case "neu":
                    System.out.println("Neuer Vertrag");
                    break;
                case "mitnahme":
                    System.out.println("Rufnummermitnahme");
                    break;
                case "störung":
                    System.out.println("Störung");
                    break;
                case "feedback":
                    System.out.println("Feedback");
                    break;
                case "ende":
                    System.out.println("Programmende");
                    return;
                default:
                    System.out.println("Eingabefehler");
                    break;
            }
        } while (true);
    }

}
