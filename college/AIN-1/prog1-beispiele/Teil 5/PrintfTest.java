// PrintfTest.java
import java.util.Scanner;

/**
 * PrintfTest testet die Formatierung mit printf.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * @author H.Drachenfels
 * @version 19.12.2016
 */
public final class PrintfTest {
    private PrintfTest() { }

    /**
     * main ist der Startpunkt des Programms.
     * Beispiel: java PrintfTest %d%4.1f%6s%n 12 3,4 fuenf
     * @param args ein Format-String und Werte f&uuml;r die L&uuml;cken
     */
    public static void main(String[] args) {

        Object[] values = new Object[args.length - 1];

        for (int i = 1; i < args.length; ++i) {
            Scanner s = new Scanner(args[i]);
            if (s.hasNextInt()) {
                values[i - 1] = s.nextInt();
            } else if (s.hasNextDouble()) {
                values[i - 1] = s.nextDouble();
            } else {
                values[i - 1] = args[i];
            }
        }

        System.out.printf(args[0], values);
    }
}

