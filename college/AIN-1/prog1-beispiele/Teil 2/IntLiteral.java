// IntLiteral.java

/**
 * IntLiteral zeigt die Ausgabe von Zahlenliteralen auf der Konsole.
 * Beispieprogramm zur Programmiertechnik 1, Teil 2.
 * @version 7.1.2019
 */
public final class IntLiteral {
    private IntLiteral() { }

    /**
     * main ist der Startpunkt des Programmes.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        System.out.println(12);
        System.out.println(012);
        System.out.println(0x12);
        System.out.printf("%x%n", 12);
        System.out.printf("%d%n", 012);
        System.out.printf("%o%n", 0x12);
    }
}