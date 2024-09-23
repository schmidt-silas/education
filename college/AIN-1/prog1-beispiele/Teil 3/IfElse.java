// IfElse.java

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/**
 * IfElse testet die Zuordnung von if und else.
 * Beispielprogramm zur Programmiertechnik 1, Teil 3.
 * @author H.Drachenfels
 * @version 9.1.2019
 */
public final class IfElse {
    private IfElse() { }

    private static final Scanner EINGABE = new Scanner(in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        out.print("Note als ganze Zahl eingeben: ");
        int note = EINGABE.nextInt();

        /*
         * Vorsicht:
         * Der Compiler ordnet das else dem zweiten if zu.
         * Er richtet sich nicht nach Einrueckungen.
         */
        if (note <= 4)
            if (note >= 1) out.println("bestanden");
        else
            out.println("nicht bestanden");

        /*
         * Geschweifte Klammern verhindern Irrtuemer wie oben.
         */
        if (note <= 4) {
            if (note >= 1) out.println("bestanden");
        } else {
            out.println("nicht bestanden");
        }
    }
}