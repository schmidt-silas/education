// MaximumVariabel.java

/**
 * MaximumVariabel zeigt eine Methode mit variabler Anzahl von Argumenten.
 * Beispielprogramm zur Programmiertechnik 1, Teil 4.
 * @author H.Drachenfels
 * @version 6.7.2017
 */
public final class MaximumVariabel {
    /** Es soll keine Instanzen der Klasse geben. */
    private MaximumVariabel() { }

    /**
     * max bildet das Maximum von ein oder mehreren ganzen Zahlen.
     * @param a ist die eine ganze Zahl.
     * @param b enthaelt die uebrigen ganzen Zahlen.
     * @return das Maximum der Argumente.
     */
    private static int max(int a, int... b) {
        int m = a;
        for (int n : b) {
            if (m < n) {
                m = n;
            }
        }
        return m;
    }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        // Aufrufe mit impliziter Felderzeugung:
        System.out.println(max(10));
        System.out.println(max(11, 12));
        System.out.println(max(13, 14, 15));

        // die gleichen Aufrufe mit expliziter Felderzeugung:
        System.out.println(max(10, new int[0]));
        System.out.println(max(11, new int[] {12}));
        System.out.println(max(13, new int[] {14, 15}));
    }
}

