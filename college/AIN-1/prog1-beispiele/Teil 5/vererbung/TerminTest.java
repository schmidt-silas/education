// TerminTest.java
package vererbung;

/**
 * TerminTest ist eine Main-Klasse, die Terminentit&amp;auml;ten verwendet.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * 
 * @author H.Drachenfels
 * @version 5.8.2016
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
        Termin t = new Termin(Datum.heute(), "Programmiertechnik 1");
        System.out.println(t);

        OrtsTermin ot = new OrtsTermin("G151",
                Datum.valueOf(11, 10, 2016),
                "Uebung");
        ot.verschieben(Datum.heute());
        System.out.println(ot);
    }
}