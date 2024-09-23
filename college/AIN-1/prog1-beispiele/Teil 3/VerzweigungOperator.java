// VerzweigungOperator.java
import java.util.Scanner;

/**
 * VerzweigungOperator liest zwei Zahlen ein und gibt das Maximum aus.
 * Variante von Verzweigung.java mit Bedingungsoperator.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 17.4.2019
 */
public final class VerzweigungOperator {
    private VerzweigungOperator() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        System.out.print("Zwei Zahlen eingeben: ");
        int m = EINGABE.nextInt();
        int n = EINGABE.nextInt();

        if (m == n) {
            System.out.println("Beide Zahlen sind gleich!");
        } else {
            // Stilempfehlung: Bedingungsoperator vermeiden
            System.out.printf("Maximum: %d%n", m > n ? m : n);
        }
    }
}