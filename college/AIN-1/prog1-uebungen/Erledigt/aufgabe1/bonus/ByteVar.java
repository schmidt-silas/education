// ByteVar.java

package aufgabe1.bonus;

import java.util.Scanner;

/**
 * @author Silas Schmidt
 * @version 23.10.2022
 */
public final class ByteVar {
    private ByteVar() {
    }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        final byte max = 0x7F;
        final byte min = -0x80;

        System.out.printf("%s%d%s%d%s%n", "Zwei ganze Zahlen zwischen ",
                min, " und ", max, " eingeben:");

        byte zahl1 = EINGABE.nextByte();
        byte zahl2 = EINGABE.nextByte();

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
