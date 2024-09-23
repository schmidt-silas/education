// Zeichenfolgen.java

/**
 * Zeichenfolgen zeigt den Umgang mit der Schnittstelle CharSequence.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * 
 * @author H.Drachenfels
 * @version 16.12.2019
 */
public final class Zeichenfolgen {
    private Zeichenfolgen() {
    }

    /**
     * main ist der Startpunkt des Programms.
     * 
     * @param args wird nicht verwnedet
     */
    public static void main(String[] args) {
        CharSequence[] beispiele = {
                "Hallo",
                new StringBuilder("Hi"),
                LeereZeichenfolge.VALUE
        };

        for (CharSequence cs : beispiele) {
            System.out.println(cs.length());
            if (cs.length() > 0) {
                System.out.printf("%c%s%n",
                        cs.charAt(0),
                        cs.subSequence(1, cs.length()));
            }
        }
    }
}

/**
 * LeereZeichenfolgen zeigt die Implementierung der Schnittstelle CharSequence.
 */
final class LeereZeichenfolge implements CharSequence {
    public static final LeereZeichenfolge VALUE = new LeereZeichenfolge();

    private LeereZeichenfolge() {
    } // eine einzige Instanz reicht

    @Override
    public char charAt(int index) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start != 0 || end != 0) {
            throw new IndexOutOfBoundsException();
        }

        return this;
    }

    @Override
    public String toString() {
        return "";
    }
}