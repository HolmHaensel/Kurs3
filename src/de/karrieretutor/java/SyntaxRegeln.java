package de.karrieretutor.java;
import java.util.Scanner;

public class SyntaxRegeln {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Übung
        a) Schreiben Sie einen Kommentar in Java, der über mehrere Zeilen geht.
        b) Verwenden Sie die Klasse Scanner, um eine Tastatureingabe zu ermöglichen.
        Fordern Sie den Nutzer auf sein Alter, seinen Namen und sein Geburtsdatum einzugeben.
        Das Geburtsdatum soll in mehreren Ganzzahlen gespeichert werden. Geben Sie anschließend den
        Satz "Sie heißen <Name>, sind <Alter> Jahre alt und am <Geburtsdatum> geboren." mit den gesammelten Werten aus.
         */

        // a)
        System.out.println("Geben Sie Ihren Namen ein: ");
        String name = scan.next();
        System.out.println("Geben Sie Ihr Alter ein: ");
        String alter = scan.next();
        System.out.println("Geben Sie Ihr Geburtsdatum ein: ");
        String datum = scan.next();


        System.out.printf("Sie heißen %s, sind %s Jahre alt und am %s geboren.", name, alter, datum);
    }
}
