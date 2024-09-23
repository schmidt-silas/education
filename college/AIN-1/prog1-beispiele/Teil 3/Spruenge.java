// Spruenge.java

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.System.err;

/**
 * Spruenge liest ganze Zahlen ein und gibt deren Summe aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class Spruenge {
    private Spruenge() { }

    private static final Scanner EINGABE = new Scanner(in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        int sum = 0;

        out.println("Ganze Zahlen eingeben (Ende mit Strg-D oder =):");

        while (EINGABE.hasNext()) {
            //--------------------------------------- Eingabefehler behandeln
            if (!EINGABE.hasNextInt()) {
                // Fehlerursache: Der Benutzer hat keine Ziffern eingegeben
                String s = EINGABE.next();
                if (s.equals("=")) {
                    break;  // hinter die Schleife springen
                }

                err.printf("Folgende Eingabe wird ignoriert: %s%n", s);
                continue;  // zum naechsten Schleifendurchlauf springen
            }

            //------------------------------------------------- Eingabe lesen
            int n = EINGABE.nextInt();

            //-------------------------------------------------- aufsummieren
            sum += n;
        }

        out.printf("Summe: %d%n", sum);
        return;  // aus dem Programm springen (normales Programmende)
    }
}