// Zufall.java

/**
 * Zufall legt ein Feld zuf&auml;lliger L&auml;nge
 * mit zuf&auml;lligen Werten an und gibt es aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 4.
 * @author H.Drachenfels
 * @version 11.1.2018
 */
public final class Zufall {
    /** Es soll keine Instanzen der Klasse geben. */
    private Zufall() { }

    /**
     * zufallszahlen wird mit statischem Initialisierungsblock initialisiert.
     */
    private static final int[] ZUFALLSZAHLEN;

    static {
        java.util.Random r = new java.util.Random();
        ZUFALLSZAHLEN = new int[r.nextInt(10) + 1];  // maximal 10 Zahlen
        for (int i = 0; i < ZUFALLSZAHLEN.length; ++i) {
            ZUFALLSZAHLEN[i] = r.nextInt();
        }
    }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        for (int n : ZUFALLSZAHLEN) {
            System.out.println(n);
        }
    }
}

