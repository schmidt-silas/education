// WhileSchleife.java

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

/**
 * WhileSchleife liest ganze Zahlen ein und gibt deren Summe aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class WhileSchleife {
    private WhileSchleife() { }

    private static final Scanner EINGABE = new Scanner(in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        int sum = 0;

        out.println("Ganze Zahlen eingeben (Ende mit Strg-Z):");

        while (EINGABE.hasNextInt()) {
            sum += EINGABE.nextInt();
        }

        out.printf("Summe: %d%n", sum);
    }
}