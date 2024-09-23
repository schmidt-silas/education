// Fallunterscheidung.java

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.in;

/**
 * Fallunterscheidung gibt die Anzahl der Tage eines Monats aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class Fallunterscheidung {
    private Fallunterscheidung() { }

    private static final Scanner EINGABE = new Scanner(in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        out.print("Monat eingeben [1-12]: ");
        int month = EINGABE.hasNextInt() ? EINGABE.nextInt() : 0;

        switch (month) {
        case  2:
            out.println("28 oder 29 Tage");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            out.println("30 Tage");
            break;
        case  1:
        case  3:
        case  5:
        case  7:
        case  8:
        case  10:
        case  12:
            out.println("31 Tage");
            break;
        default:
            err.println("Eingabefehler!");
        }
    }
}