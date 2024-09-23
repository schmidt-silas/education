// Mittelwert.java
import java.util.Scanner;

/**
 * Mittelwert zeigt die Mittelwertberechnung zweier ganzer Zahlen.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 29.10.2019
 */
public final class Mittelwert {
    private Mittelwert() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        System.out.println("Zwei ganze Zahlen eingeben: ");
        int a = EINGABE.nextInt();
        int b = EINGABE.nextInt();
        int c;
        //c = (a + b) / 2;     // falsch, wenn a + b > Integer.MAX_VALUE
        //c = a / 2 + b / 2;   // falsch, wenn a und b ungerade
        //c = a + (b - a) / 2; // falsch, wenn b - a > Integer.MAX_VALUE
        //c = a + b >> 1;      // falsch, wenn a + b > Integer.MAX_VALUE
        //c = a + b >>> 1;     // ok, wenn a + b positiv
        //c = (int) (((long) a + (long) b) / 2); // ok, wenn a und b int
        c = a / 2 + b / 2 + (a % 2 + b % 2) / 2; // ok, aber viele Oper.

        System.out.printf("Mittelwert: %d%n", c);
    }
}