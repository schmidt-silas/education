// Notenspiegel.java
package aufgabe5;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Notenspiegel liest die Namen von F&auml;chern mit den zugeh&ouml;rigen Noten
 * in eine verkettete Liste ein und gibt dann einen Notenspiegel aus.
 * 
 * @author TODO: Name eintragen
 * @version TODO: Datum eintragen
 */
public final class Notenspiegel {
    private Notenspiegel() {
    }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * 
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        FachnotenListe liste = new FachnotenListe(); // leere Liste

        // --------------------------------------------- Notenspiegel einlesen
        System.err.printf(
                "Faecher mit Noten zwischen %d und %d eingeben "
                        + "(Ende mit Strg-D):%n",
                Note.BESTE.intValue(), Note.SCHLECHTESTE.intValue());

        while (EINGABE.hasNext()) {
            try {
                // ------------------------------------ Fach und Note einlesen

                /*
                 * TODO: (1) erst das Fach mit next() einlesen,
                 * dann mit hasNextInt() pruefen,
                 * ob die Note als ganze Zahl vorliegt,
                 * und die Note je nachdem mit nextInt()
                 * oder next() einlesen und schliesslich
                 * in ein Wertobjekt verpacken
                 */

                // --------------------- neue Fachnote in Notenliste eintragen

                /*
                 * TODO: (2) ein neues Fachnote-Objekt erzeugen
                 * und am Listenanfang einfuegen
                 */

            } catch (IllegalArgumentException x) {
                System.err.printf("Eingabefehler: %s%n", x.getMessage());
                continue;
            } catch (NoSuchElementException x) {
                System.err.println("Fach ohne Note ignoriert!");
                break;
            }
        }

        // --------------------------------------------- Notenspiegel ausgeben

        /*
         * TODO: (3) tabellarischen Notenspiegel
         * mit der Ueberschrift NOTENSPIEGEL ausgeben
         */

    } // main
}
