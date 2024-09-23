// Programm.java

/**
 * Programm zeigt den Zugriff auf Komandozeilenargumente.
 * Beispielprogramm zur Programmiertechnik 1, Teil 4.
 * @author H.Drachenfels
 * @version 24.4.2012
 */
public final class Programm {
    /** Es soll keine Instanzen der Klasse geben. */
    private Programm() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args Feld mit beliebig vielen Zeichenketten.
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; ++i) {
            System.out.printf("%d: %s%n", i, args[i]);
        }
    }
}

