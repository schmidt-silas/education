// FallunterscheidungMonth.java
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * Fallunterscheidunglionth gibt die Anzahl der Tage eines Monats aus.
 * Demonstriert Ausnahmebehandlung mit try-catch.
 * Benutzerfreundlichere Fassung des Programms FallunterscheidungEnum.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * version 28.5.2028
 */
public final class FallunterscheidungMonth {
    private FallunterscheidungMonth() { }

    private enum Month {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        System.out.print("Monat eingeben [ ");
        for (Month m : Month.values()) {
            System.out.printf("%s ", m);
        }
        System.out.print("]: ");

        try {
            Month m = Month.valueOf(EINGABE.next());

            switch (m) {
            case FEB:
                System.out.println("28 oder 29 Tage");
                break;
            case APR:
            case JUN:
            case SEP:
            case NOV:
                System.out.println("30 Tage");
                break;
            default:
                System. out.println("31 Tage");
            }

        } catch (NoSuchElementException x) {
            System.err.println("Fehler: keine Eingabe");
        } catch (IllegalArgumentException x) {
            System.err.println("Fehler: kein Monat");
        }
    }
}