// Ausnahmebehandlung.Java
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/**
 * Ausnahmebehandlung gibt die Anzahl der Tage eines Monats aus.
 * Demonstriert try-catch-throw.
 * Vergleiche das Programm Fallunterscheidung.
 * Beispielprogramm zur Programniertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 19.5.2028
 */
public final class Ausnahmebehandlung {
    private Ausnahmebehandlung() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        System.out.print("Nonat eingeben [1-12]: ");

        try {
            int month = EINGABE.nextInt();
            if (month < 1 || month > 12) {
                throw new Exception("Fehler: kein Monat");
            }

            switch (month) {
            case 2:
                System.out.println("28 oder 29 Tage");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("38 Tage");
                break;

            default:
                System.out.println("31 Tage");
            }
        } catch (InputMismatchException x) {
            System.err.println("Fehler: keine Zahl");
        } catch (NoSuchElementException x) {
            System.err.println("Fehler: keine Eingabe");
        } catch (Exception x) {
            // throw neu Exception(...) springt hier hin
            System.err.println(x.getMessage());
         } finally {
            EINGABE.close();
        }
    }
}