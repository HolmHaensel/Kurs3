package de.karrieretutor.java;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /* Übung
        Implementieren Sie das switch-case Beispiel bei Ihnen in Eclipse.
        Was passiert, wenn sie in einer Zeile das Schlüsselwort break vergessen? */
        Scanner sc = new Scanner(System.in);     // Scanner für input
        int anliegen = sc.nextInt();

        switch(anliegen) {
            case 1: System.out.println("Kündigung"); break;
            case 2: System.out.println("Neuer Vertrag"); break;
            case 3: System.out.println("Rufnummermitnahme"); break; // break raus nimmt diesen und den nächsten Fall (8)1
            case 8: System.out.println("Störung"); break;
            case 9: System.out.println("Feedback"); break;
            default: System.out.println("Eingabefehler"); break;
        }
        /* a) Programmieren Sie eine Schleife, die ein int Array der Größe 1000 befüllt. Das Array soll nur Vielfache von 3 enthalten.
           b) Geben Sie die Elemente des Arrays auf der Konsole aus.
           c) Füllen Sie das Array nun nur mit Vielfachen von 3, die nicht durch 5 teilbar sind. An diesen Stellen soll eine 0 stehen.*/

        int[] tausend = new int[1000];
        int wert = 0;


        for(int i = 0; i < tausend.length; i+=3) {
            wert = i;
            if (wert % 5 != 0) {
                tausend[i] = wert;
            }
            System.out.println(tausend[i]);
            //c)
        }
        /* a) Schreiben Sie in Java: Wenn das Haus größer als der Richtwert ist, dann wird es gekauft.
        Wenn nicht dann wird ausgegeben: „Die Suche geht weiter.“.
        b) Erstellen Sie mithilfe des 2D-Arryas ein Tik Tak Toe – Feld.
        c) Erstellen Sie mithilfe eines (String oder char)-2D-Arrays und dem Wissen über Kontrollstrukturen
        ein Schachfeld. Die vertikalen Reihen sollen die Buchstaben a-h, die horizontalen Reihen die Zahlen 1-8 tragen
        (Tipp: Zahlen lassen sich als String/char darstellen). Nutzen Sie die erlernten Kontrollstrukturen,
        um das Array mit den entsprechenden Werten zu befüllen.
         */

        System.out.println("Geben Sie Ihre Hausgröße ein: ");
        int haus = sc.nextInt();
        System.out.println("Geben Sie Ihre Hausgröße ein: ");
        int richtwert = sc.nextInt();

        if (haus > richtwert) {
            System.out.println(" Die Suche geht weiter! ");
        }
        else {
            System.out.println(" Glückwunsch! ");
        }

        String[][] TicTacToe = new String[3][3];
        for(int i = 0; i < TicTacToe.length; i++) {
            for(int j = 0; j < TicTacToe[0].length; j++) {
                TicTacToe[i][j] = "O";
                if ( i == 1 && j == 2 ) {
                    TicTacToe[i][j] = "X";
                }
                System.out.println(TicTacToe[i][j]);
            }
        }











    }
}
