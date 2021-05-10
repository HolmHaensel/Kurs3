package de.karrieretutor.java;

import java.util.Scanner;

public class InputExample {

    /**
     * @brief Das ist die Einstiegsmethode
     * @param args as String[] -  die übergeben Argumente
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);


        // scan.next() liest einen String ein
        System.out.print("Geben Sie Ihren Namen ein: ");
        String name = scan.next();
        System.out.println("\nIhr Name ist: " + name);

        // scan.nextInt() liest einen Integer ein
        // In diesem Fall wird der Input weder ausgegeben noch in einer
        // Variable gespeichert -> Der Inhalt des Inputs geht verloren
        System.out.print("Geben Sie Ihre Körpergröße ein: ");
        double hoehe = scan.nextDouble();

        // scan.nextFloat() liest einen Float ein
        // In diesem Beispiel wird der Input in der Variable
        // gewicht gespeichert und später wiederverwendet.
        System.out.println("Geben Sie Ihr Gewicht ein: ");
        float gewicht = scan.nextFloat();
        double bmi = gewicht / (hoehe * hoehe);
        System.out.println("Ihr BMI ist: " + bmi);
    }

}
