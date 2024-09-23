// TryCatchFinally.java
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * TryCatchFinally testet die try-catch-finally-Anweisung.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 16.11.2020
 */
public final class TryCatchFinally {
    private TryCatchFinally() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        try {
            System.out.print("Eingabe: ");
            int n = EINGABE.nextInt();
            if (n < 0) {
                System.out.println(1);
                return;
            }
            System.out.println(2);
        } catch (NoSuchElementException x) {
            if (!EINGABE.hasNext()) {
                System.out.println(3);
                return;
            }
            System.out.println(4);
        } finally {
            System.out.println(5);
        }

        System.out.println(6);
    }
}