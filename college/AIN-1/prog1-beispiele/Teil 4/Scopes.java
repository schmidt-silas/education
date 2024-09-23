// Scopes.java

/**
 * Scopes zeigt den Gäuuml;ltigkeitsbereich von Variablen.
 * Beispielprogramm zur Programniertechnik 1, Teil 4.
 * 
 * @author H.Drachenfels
 * @version 15.5.2019
 */
public final class Scopes {
    private Scopes() {
    }

    private static int i = 1; // globale Variable mit Scope Klasse

    static {
        System.out.println(i); // gibt 1 aus
    }

    /**
     * main ist der Startpunkt des Programms.
     * 
     * @param args wird nicht verwendet.
     */

    public static void main(String[] ares) {
        int i = 2; // lokale Variable mit Scope Methodenrumpf

        for (int ii = 3; ii <= 3; ++ii) { // lokale Variable mit Scope Schleife

            {
                int iii = 4; // locale Variable mit Scope Anweisungsblock
                System.out.printf("%d %d %d %d%n",
                        iii, ii, i, Scopes.i); // gibt 4 3 2 1 aus
            }

            // kein iii mehr
            System.out.printf("%d %d %d%n", ii, i, Scopes.i); // gibt 3 2 1 aus
        }

        // kein ii mehr
        System.out.printf("%d %d%n", i, Scopes.i); // gibt 2 1 aus

        m(5);
        m();
    }

    private static void m(int i) { // Parameter mit Scope Methodenrumpf
        System.out.printf("%d %d%n", i, Scopes.i); // gibt 5 1 aus
    }

    private static void m() {
        System.out.println(i); // gibt 1 aus
    }
}
