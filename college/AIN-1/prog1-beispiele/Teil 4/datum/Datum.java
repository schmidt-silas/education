// Datum.java
package datum;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Datum ist ein Bauplan f&uuml;r Datumswerte.
 * Version mit vollst&auml;ndiger Konsistenzpr&uuml;fung
 * und weiteren Verbesserungen.
 * Beispielprogramm zur Programmiertechnik 1, Teil 4.
 * @author H.Drachenfels
 * @version 12.8.2019
 */
public final class Datum {
    private final int tag;
    private final int monat;
    private final int jahr;

    private Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    /**
     * Fabrikmethode, die ein value object mit dem angegebenen Datum liefert.
     * @param tag ist der Tag im Monat als Zahl zwischen 1 und 31
     * @param monat ist der Monat im Jahr als Zahl zwischen 1 und 12
     * @param jahr ist das Jahr
     * @return Referenz auf das value object
     */
    public static Datum valueOf(int tag, int monat, int jahr) {
        // Datum pruefen
        int maxTag;
        switch (monat) {
        case 2:
            if (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0)) {
                maxTag = 29; // Schaltjahr
            } else {
                maxTag = 28; // kein Schaltjahr
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            maxTag = 30;
            break;
        default:
            maxTag = 31;
            break;
        }

        if (tag < 1 || tag > maxTag || monat < 1 || monat > 12) {
            throw new IllegalArgumentException("ungueltiges Datum");
        }

        // value object erzeugen
        return new Datum(tag, monat, jahr);
    }

    /**
     * Fabrikmethode, die ein value object mit dem angegebenen Datum liefert.
     * @param s ist ein datum im ISO-Format (siehe toString)
     * @return Referenz auf das value object
     */
    public static Datum valueOf(String s) {
        Scanner sc = new Scanner(s);
        if (!sc.hasNext(FORMAT)) {
            throw new IllegalArgumentException(s);
        }

        // value object erzeugen
        sc.useDelimiter("-");
        int jahr = sc.nextInt();
        int monat = sc.nextInt();
        int tag = sc.nextInt();

        if (s.charAt(0) == '-') {
            jahr = -jahr;
        }

        return valueOf(tag, monat, jahr);
    }

    private static final Pattern FORMAT
        = Pattern.compile("^-?\\d+-\\d{2}-\\d{2}$");

    /**
     * Fabrikmethode, die ein value object mit dem aktuellen Datum liefert.
     * @return Referenz auf das value object
     */
    public static Datum heute() {
        // Systemkalender ablesen
        Calendar c = Calendar.getInstance();

        // value object erzeugen
        return new Datum(c.get(Calendar.DAY_OF_MONTH),
                         c.get(Calendar.MONTH) + 1,
                         c.get(Calendar.YEAR));
    }

    /**
     * Instanzmethode, die den Tag des Datums liefert.
     * @return Tag des Datums als Zahl zwischen 1 und 31
     */
    public int getTag() {
        return this.tag;
    }

    /**
     * Instanzmethode, die den Monat des Datums liefert.
     * @return Monat des Datums als Zahl zwischen 1 und 12
     */
    public int getMonat() {
        return this.monat;
    }

    /**
     * Instanzmethode, die das Jahr des Datums liefert.
     * @return Jahr des Datums
     */
    public int getJahr() {
        return this.jahr;
    }

    @Override
    public String toString() {
        if (this.jahr < 0) {
            return String.format("%05d-%02d-%02d",
                                 this.jahr, this.monat, this.tag);
        }

        return String.format("%04d-%02d-%02d",
                             this.jahr, this.monat, this.tag);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof Datum) {
            Datum that = (Datum) o;
            return this.tag == that.tag
                   && this.monat == that.monat
                   && this.jahr == that.jahr;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (this.jahr << 9) + (this.monat << 5) + this.tag;
    }
}

