// IntArithmetik.java

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/**
 * IntArithmetik testet die arithmetischen Operatoren mit ganzen Zahlen.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class IntArithmetik {
    private IntArithmetik() { }

    private static final Scanner EINGABE = new Scanner(in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        out.print("Zwei ganze Zahlen eingeben: ");

        int a = EINGABE.nextInt();
        int b = EINGABE.nextInt();

        out.printf("-(%d): %d%n", a, -a);
        out.printf("~%d: %d%n", a, ~a);
        out.printf("~%d: %d%n", b, ~b);
        out.printf("%d + %d: %d%n", a, b, a + b);
        out.printf("%d - %d: %d%n", a, b, a - b);
        out.printf("%d * %d: %d%n", a, b, a * b);
        out.printf("%d / %d: %d%n", a, b, a / b);
        out.printf("%d %% %d: %d%n", a, b, a % b);
        out.printf("%d / %d: %d%n", b, a, b / a);
        out.printf("%d %% %d: %d%n", b, a, b % a);
        out.printf("%d & %d: %d%n", a, b, a & b);
        out.printf("%d | %d: %d%n", a, b, a | b);
        out.printf("%d ^ %d: %d%n", a, b, a ^ b);
        out.printf("%d << %d: %d%n", a, b, a << b);
        out.printf("%d >> %d: %d%n", a, b, a >> b);
        out.printf("%d >>> %d: %d%n", a, b, a >>> b);
        out.printf("-(%d) >> %d: %d%n", a, b, -a >> b);
        out.printf("-(%d) >>> %d: %d%n", a, b, -a >>> b);
    }
}