// Exceptions.java
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * Exceptions zeigt den Umgang mit verschiedenen Ausnahmearten.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * @author H.Drachenfels
 * @version 10.12.2019
 */
public final class Exceptions {
    private Exceptions() {
        // fatale Ausnahme werfen
        throw new AssertionError("illegal class instantiation");
    }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        try {
            int n = InputOutput.readInt(); // evtl. InputException
            n = sqrt(n); // evtl. IllegalArgumentException
            InputOutput.print(n);
            Exceptions e = new Exceptions(); // AssertionError
            e.sqrt(n);
        } catch (InputException x) {
            String s = x.getMessage();
            System.err.println(s); // Umgebungsfehler (Falscheingabe)
        } catch (IllegalArgumentException x) {
            x.printStackTrace(); // Programmierfehler besser nicht fangen
        } catch (AssertionError e) {
            e.printStackTrace(); // Programmierfehler besser nicht fangen
        }
    }

    private static int sqrt(int n) {
        if (n < 0) {
            // ungepruefte Ausnahme mit Fehlermeldung werfen
            throw new IllegalArgumentException(String.valueOf(n));
        }
        return (int) Math.sqrt(n);
    }
}

class InputException extends Exception { // Klasse fuer gepruefte Ausnahmen
    public InputException(String s) {
        super("illegal input \"" + s + '\"');
    }

    public InputException(Throwable t) {
        super(t);
    }
}

final class InputOutput {
    private InputOutput() {
        // fatale Ausnahme werfen
        throw new AssertionError("illegal class instantiation");
    }

    private static final Scanner IN = new Scanner(System.in);

    public static int readInt() throws InputException {
        try {
            if (IN.hasNext() && !IN.hasNextInt()) {
                // gepruefte Ausnahme mit Fehlermeldung werfen
                throw new InputException(IN.next());
            }
            return IN.nextInt();
        } catch (NoSuchElementException x) {
            // gepruefte Ausnahme mit Ursache werfen
            throw new InputException(x);
        }
    }

    public static void print(int n) {
        System.out.println(n);
    }
}

