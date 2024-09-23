// DoSchleife.java

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

/**
 * DoSchleife gibt eine Zahl zwischen 0 und 255 bin&auml;r aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class DoSchleife {
    private DoSchleife() { }

    private static final Scanner EINGABE = new Scanner(in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        int n = 0;

        // Dezimalzahl einlesen
        do {
            out.println("Zahl zwischen 0 und 255 eingeben: ");
            n = EINGABE.nextInt();
        } while (n < 0 || n > 255);

        // Binaerzahl ausgeben
        out.print("       "); // sieben Leerzeichen

        do {
            out.printf("%d\b\b", n % 2);
            n /= 2;
        } while (n > 0);

        out.println();
    }
}