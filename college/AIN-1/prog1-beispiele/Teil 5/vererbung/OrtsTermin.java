// OrtsTermin.java
package vererbung;

/**
 * OrtsTermin ist ein Bauplan f&amp;uuml;r Terminentit&amp;auml;ten.
 * OrtsTermin ist eine Unterklasse von Termin.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * 
 * @author H.Drachenfels
 * @version 5.8.2016
 */
public final class OrtsTermin extends Termin {
    private final String wo;

    /**
     * Konstruktor zum Initialisieren einer neuen Terminentit&amp;auml;t.
     * 
     * @param wo   ist der Ort des Termins (darf nicht null oder leer sein)
     * @param wann ist das Datum des Termins (darf nicht null sein)
     * @param was  ist die Beschreibung des Termins (darf nicht null sein)
     */
    public OrtsTermin(String wo, Datum wann, String was) {
        super(wann, was);
        if (wo == null || wo.length() == 0) {
            throw new IllegalArgumentException("ungueltiger Termin");
        }
        this.wo = wo;
    }

    /**
     * Instanzmethode zum Abfragen der Beschreibung eines Termins.
     * 
     * @return die Beschreibung des Termins
     */
    public String getOrt() {
        return this.wo;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.wo, super.toString());
    }
}