// DatumTest.java
package formattable;
import java.util.IllegalFormatPrecisionException;

/**
 * DatumTest zeigt den Umgang mit formatierbarem Datum.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * @author H.Drachenfels
 * @version 8.8.2016
 */
public final class DatumTest {
    private DatumTest() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        Datum[] a = {Datum.valueOf(4, 10, 2016), Datum.valueOf(27, 1, 2017)};

        for (Datum d : a) {
            System.out.printf("%s%n", d);
        }

        System.out.println();

        for (Datum d : a) {
            // maximale Anzahl Zeichen 4 (.precision) fuer String
            System.out.printf("%.4s%n", d.toString());
        }

        System.out.println();

        try {
            for (Datum d : a) {
                // maximale Anzahl Zeichen 4 (.precision) fuer Datum
                System.out.printf("%.4s%n", d);
            }
        } catch (IllegalFormatPrecisionException x) {
            System.err.println(x);
        }

        System.out.println();

        for (Datum d : a) {
            // minimale Anzahl Zeichen 11 (width) rechtsbuendig (ohne Flag)
            System.out.printf("%11s", d);
        }

        System.out.println();

        for (Datum d : a) {
            // minimale Anzahl Zeichen 11 (-width) linksbuendig (mit Flag)
            System.out.printf("%-11s", d);
        }

        System.out.println();
    }
}

