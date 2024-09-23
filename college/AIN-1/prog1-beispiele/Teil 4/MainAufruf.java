// MainAufruf.java

/**
 * MainAufruf zeigt den Aufruf der Klassenmethode main.
 * Beispielprogramm zur Programmiertechnik 1, Teil 4.
 * @author H.Drachenfels
 * @version 24.4.2012
 */
public final class MainAufruf {
    private MainAufruf() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        Programm.main(new String[] {"mit", "drei", "Argumenten"});
    }
}

