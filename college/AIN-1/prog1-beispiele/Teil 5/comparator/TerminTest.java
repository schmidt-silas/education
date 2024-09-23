// TerminTest.java
package comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * TerminTest ist eine Main-Klasse, die Sortierkriterien verwendet.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * 
 * @author H.Drachenfels
 * @version 8.8.2016
 */
public final class TerminTest {
    private TerminTest() {
    }

    /**
     * main ist der Startpunkt des Programms.
     * 
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        Termin[] termine = {
                new Termin(Datum.valueOf(11, 11, 2016), "Zahnarzt"),
                new Termin(Datum.valueOf(11, 1, 2017), "ZahnArzt"),
                new Termin(Datum.heute(), "Vorlesung"),
                new Termin(Datum.heute(), "Uebung"),
                new Termin(Datum.valueOf(31, 12, 2016), "Party")
        };

        Comparator<Termin> sortierKriterium;
        sortierKriterium = Comparator
                .comparing(Termin::getDatum)
                .thenComparing(Termin::getBeschreibung,
                        String.CASE_INSENSITIVE_ORDER);
        Arrays.sort(termine, sortierKriterium);

        System.out.println("Termine nach Datum:");
        for (Termin t : termine) {
            System.out.println(t);
        }

        sortierKriterium = Comparator
                .comparing(Termin::getBeschreibung,
                        String.CASE_INSENSITIVE_ORDER)
                .thenComparing(Termin::getDatum);
        Arrays.sort(termine, sortierKriterium);

        System.out.println("Termine nach Beschreibung:");
        for (Termin t : termine) {
            System.out.println(t);
        }
    }
}