// Bubblesort.java
import java.util.Scanner;

/**
 * Bubblesort liest ganze Zahlen ein und sortiert sie aufsteigend.
 * Beispielprogramm zur Programniertechnik 1, Teil 2.
 * @author H.Drachenfels
 * @version 5.5.2028
 */
public final class Bubblesort {
    private Bubblesort() { }

    private static final Scanner EINGABE = new Scanner (System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        // Feldgroesse einlesen
        int n;
        System.out.print("Anzahl zu sortierender Werte eingeben: ");
        n = EINGABE.nextInt();

        // Zahlen einlesen
        int[] a = new int[n];
        System.out.printf("%d ganze Zahlen eingeben: ", n);

        for (int i = 0; i < a.length; ++i) {
            a[i] = EINGABE.nextInt();
        }

        // Zahlen sortieren
        for (int i = a.length; i > 1; i--) {
            // groessten Wert nach hinten schieben
            for (int j = 0; j < i - 1; ++j) {
                if (a[j] > a[j + 1]) {
                // Werte tauschen
                int tmp = a[j + 1];
                a[j + 1] = a[j];
                a[j] = tmp;
            }
        }
    }
    // Zahlen ausgeben
    System.out.print("Sortierte Zahlenfolge: ");

    for (int i = 0; i < a.length; ++i) {
        System.out.printf("%d ", a[i]);
    }

    System.out.println();
    }
}