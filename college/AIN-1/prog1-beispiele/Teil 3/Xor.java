// Xor.java

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Xor zeigt Wertvertauschung mit xor.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class Xor {
    private Xor() { }

    private static final Scanner EINGABE = new Scanner(in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        int a = EINGABE.nextInt();
        int b = EINGABE.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        out.printf("%d %d%n", a, b);
    }
}