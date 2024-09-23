// DateFormatTest.java
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * DateFormatTest zeigt den Umgang mit der Klasse DateFormat.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * @author H.Drachenfels
 * @version 5.8.2016
 */
public final class DateFormatTest {
    private DateFormatTest() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwnedet
     */
    public static void main(String[] args) {

        Date heute = new Date();

        DateFormat[] datumsFormate = {
            DateFormat.getDateInstance(),
            DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.GERMAN),
            DateFormat.getDateInstance(DateFormat.SHORT, Locale.GERMAN),
            DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.GERMAN),
            DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMAN),
            DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN),
            DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.ENGLISH),
            DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH),
            DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ENGLISH),
            DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH),
            DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH),
        };

        for (DateFormat df : datumsFormate) {
            String s = df.format(heute);
            System.out.println(s);
        }
    }
}

