// DoubleLiteral.java

/**
 * DoubleLiteral zeigt die Ausgabe von Gleitkommaliteralen auf der Konsole.
 * Beispielprogramm zur Programmiertechnik 1, Teil 2.
 * @author H.Drachenfels
 * @version 7.1.2019
 */
public final class DoubleLiteral {
    private DoubleLiteral() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        System.out.println((1e-30 + 1e30) - 1e30);
        System.out.println(1e-30 + (1e30 - 1e30));

        System.out.println(12.3456789);
        System.out.println(1234567.89);

        System.out.printf("%f%n", 12.3456789);
        System.out.printf("%f%n", 1234567.89);

        System.out.printf("%e%n", 12.3456789);
        System.out.printf("%e%n", 1234567.89);
    }
}
