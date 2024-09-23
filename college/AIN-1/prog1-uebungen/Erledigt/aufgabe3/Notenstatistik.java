// Notenstatistik.java
package aufgabe3;

import java.util.Locale;
import java.util.Scanner;
/**
 * erstellt eine Notenstatistik.
 * <p>
 * Das Programm erwartet Pr&uuml;fungsnoten im Format
 * <code>Ganze,Zehntel</code> oder <code>Ganze.Zehntel</code>,
 * wobei <code>Ganze</code> und <code>Zehntel</code> nur aus
 * je einer Dezimalziffer bestehen d&uuml;rfen.
 * Andere Eingaben werden wegen Formatfehler ignoriert.
 * </p>
 * <p>
 * Das Programm gibt die folgende Statistik aus:
 * </p>
 * <ul>
 * <li>die Anzahl der ber&uuml;cksichtigten Noten</li>
 * <li>die Anzahl der Bestandenen</li>
 * <li>die beste Note</li>
 * <li>die schlechteste Note</li>
 * <li>den Durchschnitt der Bestandenen</li>
 * <li>die Durchfallquote in Prozent</li>
 * </ul>
 * <p>
 * Es werden in der Statistik nur die nach HTWG-Pr&uuml;fungsordnung
 * zul&auml;ssigen Noten (1,0 1,3 1,7 2,0 2,3 2,7 3,0 3,3 3,7 4,0 5,0)
 * ber&uuml;cksichtigt.
 * Andere Eingaben werden wegen falscher Vorkommastelle oder
 * falscher Nachkommastelle ignoriert.
 * Alle Noten bis 4,0 gelten als bestanden, nur die 5,0 als durchgefallen.
 * </p>
 * @author Silas Schmidt
 * @version 26.11.2022
 */
public final class Notenstatistik {
    private Notenstatistik() { }

    private static final Scanner EINGABE = new Scanner(System.in);
    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMANY);

        int anzahl = 0; // Anzahl beruecksichtigter Noten
        double best = 5; // Beste Note
        double least = 0; // Schlechteste Note
        int k = 0; // Anzahl Bestandene
        double durchfallquote; // Durchfallquote
        double durchschnitt = 0; // Durchschnitt Bestandene
        double summe = 0; // summe aller Bestandenen noten
        String note;
        //--------------------------------------------------- Noten einlesen
        System.out.println("Noten im Format Ganze,Zehntel "
                           + "oder Ganze.Zehntel eingeben (Ende mit Strg-D):");
        while (EINGABE.hasNext()) {
            //---------------------------------------------- Eingabe pruefen
            String note1 = EINGABE.next();
            note = note1.replace(",", ".");
            Boolean pattern = note.matches("^\\d\\.\\d$");
            /* (1) die Zeichen im String note pruefen ... */
            if (Boolean.TRUE.equals(pattern)) {
                String[] s = note.split("\\.");
                int vk = Integer.parseInt(s[0]);    // VorkommaStelle
                int nk = Integer.parseInt(s[1]);    // Nachkommastelle
                boolean test = (vk > 0 && vk < 4);

                if ((((nk == 0) || (nk == 3) || (nk == 7)) && test)
                    || ((nk == 0) && ((vk == 5) || (vk == 4)))) {
                    double notex = Double.parseDouble(note);
                    anzahl++;
                    if (vk != 5) {
                        summe = summe + notex;
                        k++;
                    }
                    if (notex < best) {
                        best = notex;
                    }
                    if (notex > least) {
                        least = notex;
                    }
                } else if ((nk != 0) && (nk != 3) && (nk != 7)
                    && (vk > 0) && (vk < 6)) {
                    System.out.printf("Note %s wird wegen Nachkommastelle "
                        + " %d ignoriert! %n", note1, nk);
                } else if (((nk == 0) || (nk == 3) || (nk == 7))
                    && ((vk == 4) || (vk == 5))) {
                    System.out.printf("Note %s wird wegen Nachkommastelle "
                        + " %d ignoriert! %n", note1, nk);
                } else {
                    System.out.printf("Note %s wird wegen Vorkommastelle "
                        + "%d ignoriert! %n", note1, vk);
                }
            } else {
                System.out.println("Note " + note1
                    + " wird wegen Formatfehler ignoriert!");
            }
            //------------------------------------------------ Note erfassen
            /* (2) Notensumme Bestandene, Anzahl Bestandene,
                Anzahl Durchgefallene sowie beste
                und schlechteste Note aktualisieren ... */
        //------------------------------------------ Notenstatistik ausgeben
        } // main
        durchschnitt = summe / k;
        durchfallquote = (100 - (100 * (k / (float) anzahl)));
        // Durchschnitt Bestandene
        /* (3) Durchschnitt und Durchfallquote berechnen
        und dann die gesamte Statistik ausgeben ... */
        System.out.println("Anzahl beruecksichtigter Noten: " + anzahl);
        System.out.println("Anzahl Bestandene: " + k);
        if (anzahl != 0) {
            System.out.printf("Beste Note: %.1f %n", best);
            System.out.printf("Schlechteste Note: %.1f %n", least);
            System.out.printf("Durchschnitt Bestandene: %.1f %n",
                durchschnitt);
            System.out.printf("Durchfallquote: %.1f %%", durchfallquote);
        }
    }
}