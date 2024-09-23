// ArrayVar.java

/**
 * ArrayVar zeigt den Umgang mit Feldern.
 * Beispielprogramm zur Programmiertechnik 1, Teil 2.
 * @author H.Drachenfels
 * @version 7.1.2019
 */
public final class ArrayVar {
    private ArrayVar() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        int[] anIntArray = new int[] {3421, 3442, 3635, 3814};

        for (int i = 0; i < anIntArray.length; ++i) {
            System.out.printf("%d: %d%n", i, anIntArray[i]);
        }

        int[] anotherIntArray = {0}; // kurz fuer new int[1] oder new int[] {0}

        for (int i = 0; i < anotherIntArray.length; ++i) {
            System.out.printf("%d: %d%n", i, anotherIntArray[i]);
        }

        anotherIntArray = anIntArray.clone();

        for (int i = 0; i < anotherIntArray.length; ++i) {
            System.out.printf("%d: %d%n", i, anotherIntArray[i]);
        }
    }
}