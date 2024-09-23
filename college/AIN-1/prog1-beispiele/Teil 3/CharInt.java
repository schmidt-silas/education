// CharInt.java

/**
 * CharInt testet Zeichenarithmetik.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class CharInt {
    private CharInt() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        char a = 'a';

        System.out.print("a = ");
        System.out.println(a);

        System.out.print("(a + 0) = ");
        System.out.println(a + 0);

        System.out.print("(++a) = ");
        System.out.println(++a);

        System.out.print("(a += 1) = ");
        System.out.println(a += 1);

        System.out.print("(a++) = ");
        System.out.println(a++);

        System.out.print("(int) a = ");
        System.out.println((int) a);
    }
}