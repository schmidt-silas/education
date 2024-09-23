// ShortVar.java

package aufgabe1.bonus;

import java.util.Scanner;

/**
 * IntVar zeigt den Umgang mit Variablen vom Typ int.
 * &Uuml;bungsaufgabe 1 zur Programmiertechnik 1.
 * @author Silas Schmidt
 * @version 23.10.2022
 */
public final class ShortVar {
    private ShortVar() {
    }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        final Short max = 0x7FFF;
        final Short min = -0x8000;

        System.out.printf("%s%d%s%d%s%n", "Zwei ganze Zahlen zwischen ",
                min, " und ", max, " eingeben:");

        short zahl1 = EINGABE.nextShort();
        short zahl2 = EINGABE.nextShort();

        System.out.printf("%d%s%o%s%x%n", zahl1, " ist oktal ", zahl1,
                " und hexadezimal ", zahl1);
        System.out.printf("%d%s%o%s%x%n", zahl2, " ist oktal ", zahl2,
                " und hexadezimal ", zahl2);

        System.out.printf("%d%s%d%s%d%n", zahl1, " + ", zahl2,
                " ist ", zahl1 + zahl2);
        System.out.printf("%d%s%d%s%d%n", zahl1, " - ", zahl2,
                " ist ", zahl1 - zahl2);
        System.out.printf("%d%s%d%s%d%n", zahl1, " * ", zahl2,
                " ist ", zahl1 * zahl2);
        System.out.printf("%d%s%d%s%d%n", zahl1, " / ", zahl2,
                " ist ", zahl1 / zahl2);
        System.out.printf("%d%s%d%s%d%n", zahl1, " % ", zahl2,
                " ist ", zahl1 % zahl2);

        System.out.printf("%d%s%d%s%b%n", zahl1, " == ", zahl2,
                " ist ", zahl1 == zahl2);
        System.out.printf("%d%s%d%s%b%n", zahl1, " != ", zahl2,
                " ist ", zahl1 != zahl2);
        System.out.printf("%d%s%d%s%b%n", zahl1, " < ", zahl2,
                " ist ", zahl1 < zahl2);
        System.out.printf("%d%s%d%s%b%n", zahl1, " <= ", zahl2,
                " ist ", zahl1 <= zahl2);
        System.out.printf("%d%s%d%s%b%n", zahl1, " > ", zahl2,
                " ist ", zahl1 > zahl2);
        System.out.printf("%d%s%d%s%b%n", zahl1, " >= ", zahl2,
                " ist ", zahl1 >= zahl2);
    }
}
