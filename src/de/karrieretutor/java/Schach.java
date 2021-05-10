package de.karrieretutor.java;

/**
 *
 */
public class Schach {
    public static void main(String[] args) {
            String[][] ar = new String[8][8];
            for (int i = 0; i < ar.length; i++) {
                char a = 'a';
                int an = a;
                char bs = (char) (an + i);
                System.out.println("###" + bs + "#########");
                for (int j = 0; j < ar[i].length; j++) {
                    ar[i][j] = String.valueOf(bs) + j;
                    System.out.println("########" + j + "#########");
                    System.out.println(ar[i][j]);
                }
            }
        }
    }

