// PrintInt.java

/**
 * PrintInt schreibt ganze Zahlen auf die Standardausgabe.
 * Beispielprogramm zur Programmiertechnik 1, Teil 4.
 * @author H.Drachenfels
 * @version 17.2.2811
 */
public final class PrintInt {
    private PrintInt() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        // 1. Versuch: ohne Klassenmethode printInt
        System.out.printf("%10d%n", 1);
        System.out.printf("%10d%n", 123);
        System.out.printf("%10d%n", 1234567898);

        // 2. Versuch: Herleitung der Klassenmethode printInt
        {
            int n = 1;
            System.out.printf("%10d%n", n);
        }
        {
            int n = 123;
            System.out.printf("%10d%n", n);
        }
        {
            int n = 1234567898;
            System.out.printf("%10d%n", n);
        }

        // 3. Versuch: mit Klassenmethode printInt
        printInt(1);
        printInt(123);
        printInt(1234567898);
    }

    /**
     * printInt gibt eine ganze Zahl auf der Konsole aus.
     * @param n ist eine ganze Zahl.
     */
    private static void printInt(int n) {
        System.out.printf("%10d%n", n);
    }
}