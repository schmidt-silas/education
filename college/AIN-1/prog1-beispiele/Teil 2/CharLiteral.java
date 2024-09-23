// CharLiteral.java

/**
 * CharLiteral zeigt die Ausgabe von Zeichenliteralen auf der Konsole.
 * Beispielprogramm zur Programmiertechnik 1, Teil 2.
 * @author H.Drachenfels
 * @version 7.1.2019
 */
public final class CharLiteral {
    private CharLiteral() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        System.out.print('H');
        System.out.print('a');
        System.out.print('l');
        System.out.print('l');
        System.out.print('o');
        System.out.print('\n');
        System.out.print("Hallo\12"); // Zeilenwechsel hat Zeichencode oktal 12
        System.out.println("Hal" + "lo");
        System.out.printf("%s%n", "Hallo");
        System.out.printf("%c%c%c%c%c%n", 'H', 'a', 'l', 'l', 'o');
    }
}