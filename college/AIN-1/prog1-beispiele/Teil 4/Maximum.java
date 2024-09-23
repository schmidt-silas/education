// Maximum.java

/**
 * Maximum gibt die groesste der als Argumente uebergebenen Zahlen aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 4.
 * @author H.Drachenfels
 * @version 17.2.2011
 */
public final class Maximum {
/** Es soll keine Instanzen der Klasse geben. */
    private Maximum() { }

    /**
     * max bildet das Maximum zweier ganzer Zahlen.
     * @param m ist die eine ganze Zahl.
     * @param n ist die andere ganze Zahl.
     * @return das Maximum der beiden Argumente.
     */ 
    private static int max(int m, int n) {
        return m > n ? m : n;
    }

    /**
     * main ist der Startpunkt des Programms.
     * @param args mindestens eine ganz Zahl als Feldelement.
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Aufruf: java Maximum Zahl ...");
            System.exit(1);
        }

        int m = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; ++i) {
            int n = Integer.parseInt(args[i]);
            m = max(m, n);
        }

        System.out.printf("Maximum: %d%n", m);
    }
}