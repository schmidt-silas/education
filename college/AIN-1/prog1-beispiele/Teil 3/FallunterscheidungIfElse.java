// FallunterscheidungIfElse.java
import java.util.Scanner;

/**
 * FallunterscheidungIfElse gibt die Anzahl der Tage eines Monats aus.
 * Umformulierung des switch-case-Programms mit if-else.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class FallunterscheidungIfElse {
    private FallunterscheidungIfElse() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        System.out.print("Monat eingeben [1-12]: ");
        int month = EINGABE.hasNextInt() ? EINGABE.nextInt() : 0;

        if (month == 2) {
            System.out.println("28 oder 29 Tage");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 Tage");
        } else if (month == 1
                   || month == 3
                   || month == 5
                   || month == 7
                   || month == 8
                   || month == 10
                   || month == 12
                   /* oder einfacher: month >= 1 && month <= 12 */) {
            System.out.println("31 Tage");
        } else {
            System.err.println("Eingabefehler!");
        }
    }
}