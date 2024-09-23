// Histogramm.java
package aufgabe2;

import java.util.Scanner;

/**
 * Histogramm liest ganze Zahlen zwischen 1 und 6 ein und
 * gibt deren H&auml;ufigkeitsverteilung als Histogramm aus.
 * @author Silas Schmidt
 * @version 13.11.2022
 */
public final class Histogramm {
    private Histogramm() {
    }
    private static final Scanner EINGABE = new Scanner(System.in);
    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        /* (1) hier ein Feld von Zaehlern definieren */
        final int max = 12;
        final int min = 1;
        int[] zaehlerArr = new int[max - min + 1];
        // ---------------------------------------------------- Zahlen einlesen
        System.out.println("Ganze Zahlen zwischen "
            + min + " und " + max + " eingeben "
            + "(Ende mit Strg-D):");
        while (EINGABE.hasNextInt()) {
            int number = EINGABE.nextInt();
            /*
             * (2) hier Anweisungen fuer das
             * Pruefen und Zaehlen der Eingabe schreiben
             */
            if ((number >= min) && (number <= max)) {
                zaehlerArr[number - 1] += 1;
            } else {
                System.out.println("Falsche Eingabe wird ignoriert: "
                        + number);
            }
        }
        // ------------------------------------------------ Histogramm ausgeben
        /* (3) hier Anweisungen fuer die Histogrammausgabe schreiben */
        System.out.println("Histogramm:");
        for (int i = 0; i < zaehlerArr.length; i++) {
            for (int j = 0; j < zaehlerArr[i]; j++) {
                int k = (j + 1) % (max - 1);
                if (k == 0 && j != 0) {
                    System.out.print("$");
                } else {
                    System.out.print(i + 1);
                }
            }
            System.out.println(" (" + zaehlerArr[i] + ")");
        }
    }
}
