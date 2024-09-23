// ForSchleifeWhile.java

/**
 * ForSchleifeWhile gibt alle Elemente eines Felds aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019 while-Schleife statt for-Schleife (nicht nachahmenswert)
 */
public final class ForSchleifeWhile {
    private ForSchleifeWhile() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        double[] anArray = {3.625, 3.648, 3.853, 4.042};

        { // Lebensdauer der Laufvariablen beschraenken
            int i = 0;                          // Initialisierung
            while (i < anArray.length) {        // Fortsetzungsbedingung
                System.out.println(anArray[i]);
                ++i;                            // Fortschaltung
            }
        }

        { // for-each-Schleife braucht mit while ebenfalls Indexlaufvariable
            int i = 0;
            while (i < anArray.length) {
                double n = anArray[i];
                System.out.println(n);
                ++i;
            }
        }
    }
}