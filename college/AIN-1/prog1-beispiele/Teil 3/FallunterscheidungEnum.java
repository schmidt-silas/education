// FallunterscheidungEnum.java

/**
 * FallunterscheidungEnum gibt die Anzahl der Tage eines Monats aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class FallunterscheidungEnum {
    private FallunterscheidungEnum() { }

    private enum Month {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        Month m = Month.valueOf(new java.util.Scanner(System.in).next());
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
            System.out.println("31 Tage");
        }
    }
}