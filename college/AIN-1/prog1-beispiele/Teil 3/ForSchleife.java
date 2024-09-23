// ForSchleife.java

/**
 * ForSchleife gibt zweimal alle Elemente eines Felds aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class ForSchleife {
    private ForSchleife() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        double[] anArray = {3.625, 3.648, 3.853, 4.042};

        for (int i = 0; i < anArray.length; ++i) {
            System.out.println(anArray[i]);
        }

        // das gleiche mit for-each-Schleife
        for (double n : anArray) {
            System.out.println(n);
        }
    }
}