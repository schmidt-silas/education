// Klausur.java

/**
 * Klausur gibt eine Punkteliste f&uuml;r Klausuraufgaben aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 2.
 * @author H.Drachenfels
 * @version 7.1.2019
 */
public final class Klausur {
    private Klausur() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        int punkteAufgabe_1 = 12;
        int punkteAufgabe_2 = 8;
        int punkteAufgabe_3 = 18;

        System.out.printf("Aufgabe 1: %d Punkten%n", punkteAufgabe_1);
        System.out.printf("Aufgabe 2: %d Punkten%n", punkteAufgabe_2);
        System.out.printf("Aufgabe 3: %d Punkten%n", punkteAufgabe_3);
    }
}