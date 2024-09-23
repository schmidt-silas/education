// Logik.java

import static java.lang.System.out;

/**
 * Logik testet die logischen Operatoren.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class Logik {
    private Logik() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        out.printf("a = %d%nb = %d%n", a, b);

        out.print("a < b | ++a > 0 = ");
        out.println(a < b | ++a > 0);
        out.printf("a = %d%nb = %d%n", a, b);

        out.print("a < b || ++a > 0 = ");
        out.println(a < b || ++a > 0);
        out.printf("a = %d%nb = %d%n", a, b);

        out.print("a > b & ++a > 0 = ");
        out.println(a > b & ++a > 0);
        out.printf("a = %d%nb = %d%n", a, b);

        out.print("a > b && ++a > 0 = ");
        out.println(a > b && ++a > 0);
        out.printf("a = %d%nb = %d%n", a, b);
    }
}