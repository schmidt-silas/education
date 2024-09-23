// OverloadingAmbiguous. java

/**
 * Overloading zeigt das Ueberladen von Methoden.
 * Beispielprogramm zur Programmiertechnik 1, Teil 4.
 * @author H.Drachenfels
 * @version 18.11.2813
 */
public final class OverloadingAmbiguous {
    private OverloadingAmbiguous() { }

    /**
     * max bildet das Maximum zweier ganzer Zahlen.
     * @param a ist eine ganze Zahl
     * @param b ist eine Gleitkommazahl
     * @return das Maximum der beiden Argumente
     */
    private static double max(int a, double b) {
        return a > b ? a : b;
    }

    /**
     * max bildet das Maximum zweier ganzer Zahlen.
     * @param a ist eine Gleitkommazahl
     * @param b ist eine ganze Zahl
     * @return das Maximum der beiden Argumente
     */
    private static double max(double a, int b) {
    return a > b ? a : b;
    }

    /**
     * main ist der Startpunkt des Programm:
     * @param args wird nicht verwendet.
    */
    public static void main(String[] args) {
        // System.out.println(max(1, 2)); // Fehler: mehrdeutiger Aufruf
        System.out.println(max(1, (double) 2));
        System.out.println(max((double) 1, 2));
    }
}