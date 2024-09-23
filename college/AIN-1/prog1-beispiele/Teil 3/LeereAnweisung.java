// LeereAnweisung.java

/**
 * LeereAnweisung zeigt Fehlerquelle durch leere Anweisung.
 * Beispielprogramm zur Programniertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class LeereAnweisung {
    private LeereAnweisung() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        int[] a = {18, 20, 30, 40};

        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }
}