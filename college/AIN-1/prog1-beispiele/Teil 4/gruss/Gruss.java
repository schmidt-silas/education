// Gruss.java
package gruss;

/**
 * Gruss ist ein Beispiel f&uuml;r ein Klasse in einem Paket.
 * Beispielprogramm zur Programmiertechnik 1, Teil 4.
 * @author H.Drachenfels
 * @version 13.2.2019
 */
public final class Gruss {
    /** Es soll keine Instanzen der Klasse geben. */
    private Gruss() { }

    /**
     * hallo gibt Hallo auf der Konsole aus.
     */
    public static void hallo() {
        System.out.println("Hallo");
    }
}

