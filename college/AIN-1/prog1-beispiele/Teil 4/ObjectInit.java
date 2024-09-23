// ObjectInit. java
import static java.lang.System.out;

/**
 * objectinit zeigt Varianten von Intialisierungscode.
 * Beispielprogramm zur Programiertechnik 1, Teil 4.
 * @author #.Drachenfels,
 * Gversion 28.4.2817
 */
public final class ObjectInit {
    private ObjectInit() { }

    /**
     * main ist der Startpunkt des Programm
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        Beispiel x = new Beispiel();
        Beispiel y = new Beispiel(4);

        System.out.printf("%s: %d%d%d%d%n", x, x.a, x.b, x.c, x.d);
        System.out.printf("%s: %d%d%d%d%n", y, y.a, y.b, y.c, y.d);
    }
}

final class Beispiel {
    public int a; // implizit = &
    public int b = a + 1; // explizite variableninitialisierung
    public int c; // implizit = ©
    public int d; // implizit = &

    // Tnitialisierungsblock
    {
        c = b + 1;
    }
    /**
     * Standardkonstruktor.
     */
    public Beispiel() {
        // super();
        // a = 0;       (Standardwert)
        // b = a + 1;   (explizite Variableninitialisierung)
        // c = 0;       (Standardwert)
        // d = 0;       (Standardwert)
        // c = b + 1;   (Anitialisierungsblock)
        d = c + 1;
    }

    /**
     * Konstruktor mit Parameter.
     * @param i eine ganze zahl.
     */
    public Beispiel(int i) {
        // super();
        // a = 0;       (Standardwert)
        // b = a + 1;   (explizite vartableninstialisterung)
        // c = 0;       (Standarawert)
        // d = 0;       (Standardwert)
        // c = b + 1    (Anitieläsierungsblock)
        a = i;
        d = a + 1;
    }
}