// FallunterscheidungString.java

import java.util.Scanner;

/**
 * FallunterscheidungString gibt die Anzahl der Tage eines Monats aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class FallunterscheidungString {
    private FallunterscheidungString() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        System.out.print("Monat eingeben: ");
        String month = new Scanner(System.in).next();

        switch (month) {
        case  "Februar":
            System.out.println("28 oder 29 Tage");
            break;
        case "April":
        case "Juni":
        case "September":
        case "November":
            System.out.println("30 Tage");
            break;
        case  "Januar":
        case  "Maerz":
        case  "Mai":
        case  "Juli":
        case  "August":
        case  "Oktober":
        case  "Dezember":
            System.out.println("31 Tage");
               break;
        default:
            System.err.println("Eingabefehler!");
        }
    }
}