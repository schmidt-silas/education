// Ascii.java
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ascii gibt den Ascii-Code von Zeichen aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.11.2021
 */
public final class Ascii {
    private Ascii() { }

    private static final Reader EINGABE = new InputStreamReader(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     * @throws IOException bei Einlesefehlern.
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Zeichen eingeben (Ende mit Strg-D/Strg-Z):");
        int c;
        while ((c = EINGABE.read()) != -1) {
            if (c > 127) {
                System.out.println("kein ASCII-Zeichen");
            } else {
                System.out.printf("0x02x\t%1$3d\t0%1$03o\t", c);

                if (Character.isWhitespace(c)) {
                    System. out.println("Zwischenraum");
                } else if (Character.isISOControl(c)) {
                    System.out.println("Steuerzeichen");
                } else {
                    System.out.printf("Zeichen %c%n", c);
                }
            }
        }
    }
}