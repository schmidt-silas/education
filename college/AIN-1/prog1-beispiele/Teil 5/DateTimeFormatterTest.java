// DateTimeFormatterTest.java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * DateTimeFormatterTest zeigt den Umgang mit der Klasse DateTimeFormatter.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * @author H.Drachenfels
 * @version 24.5.2017
 */
public final class DateTimeFormatterTest {
    private DateTimeFormatterTest() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwnedet
     */
    public static void main(String[] args) {

        DateTimeFormatter[] datumsFormate = {
            DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL),

            DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
                             .withLocale(Locale.GERMAN),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                             .withLocale(Locale.GERMAN),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)
                             .withLocale(Locale.GERMAN),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                             .withLocale(Locale.GERMAN),

            DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
                             .withLocale(Locale.ENGLISH),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                             .withLocale(Locale.ENGLISH),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)
                             .withLocale(Locale.ENGLISH),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                             .withLocale(Locale.ENGLISH),

            DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
                             .withLocale(Locale.UK),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                             .withLocale(Locale.UK),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)
                             .withLocale(Locale.UK),
            DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                             .withLocale(Locale.UK),
        };

        LocalDate heute = LocalDate.now();

        for (DateTimeFormatter f : datumsFormate) {
            String s = f.format(heute);
            System.out.println(s);
        }
    }
}

