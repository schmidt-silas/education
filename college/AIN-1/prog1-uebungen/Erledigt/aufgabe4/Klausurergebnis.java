// Klausurergebnis.java
package aufgabe4;

import aufgabe4.schweiz.Noten;
import java.util.Locale;
import java.util.Scanner;

/**
 * Klausurergebnis erstellt eine Notenstatistik.
 * <p>
 * Das Programm liest Noten als Strings ein und bestimmt die beste und
 * die schlechteste Note, den Durchschnitt der Bestandenen sowie
 * die Durchfallquote in Prozent.
 * Das Programm ber&uuml;cksichtigt dabei nur die laut Noten.istZulaessig
 * erlaubten Noten. Andere Noten werden unter Ausgabe einer Warnung ignoriert.
 * Welche Noten besser und schlechter sind, welche als bestanden oder
 * durchgefallen gelten und wie die String-Darstellung der Noten aussieht,
 * wird mit Methoden der Klasse Noten bestimmt.
 * </p>
 * Das Programm gibt als Klausurergebnis folgende Werte aus:
 * <ul>
 * <li>die Anzahl der ber&uuml;cksichtigten Noten</li>
 * <li>die Anzahl der Bestandenen</li>
 * <li>die beste Note</li>
 * <li>die schlechteste Note</li>
 * <li>den Durchschnitt der Bestandenen</li>
 * <li>die Durchfallquote</li>
 * </ul>
 *
 * @author Silas Schmidt
 * @version 01.12.2022
 */
public final class Klausurergebnis {
    private Klausurergebnis() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMAN);

        int zahl = 0;
        int bestandene = 0;
        double durchschnitt;
        double summe = 0.0;
        double durchfallquote;
        final int hundert = 100;
        double beste = Noten.WORST;
        double schlechteste = Noten.BEST;

        //--------------------------------------------------- Noten einlesen
        System.out.println("Noten im Format Ganze,Zehntel "
                           + "oder Ganze.Zehntel eingeben (Ende mit Strg-D):");

        while (EINGABE.hasNext()) {
            String note = EINGABE.next();
            //---------------------------------------------- Eingabe pruefen
            if (Boolean.TRUE.equals(Noten.istZulaessig(note))) {
                zahl++;
                /* (1) note pruefen ... */
                beste = Noten.bessere(Noten.toDouble(note), beste);
                schlechteste = Noten.schlechtere(
                    Noten.toDouble(note), schlechteste);
                //------------------------------------------------ Note erfassen
                /* (2) Notensumme Bestandene, Anzahl Bestandene,
                             Anzahl Durchgefallene sowie
                             beste und schlechteste Note aktualisieren ... */
                if (Noten.istBestanden(Noten.toDouble(note))) {
                    bestandene++;
                    summe = summe + Noten.toDouble(note);
                }
            } else {
                System.out.println("Unzulaessige Note " + note
                    + " wird ignoriert!");
            }

        } // while
        //------------------------------------------ Notenstatistik ausgeben
        /* (3) Durchschnitt und Durchfallquote berechnen
                     und dann die gesamte Statistik ausgeben ... */
        durchschnitt = summe / bestandene;
        durchfallquote = (hundert - (hundert * (bestandene / (float) zahl)));

        System.out.println("Anzahl beruecksichtigter Noten: " + zahl);
        System.out.println("Anzahl Bestandene: " + bestandene);
        if (zahl != 0) {
            System.out.printf("Beste Note: %s %n",
                Noten.toString(beste));
            System.out.printf("Schlechteste Note: %s %n",
                Noten.toString(schlechteste));
            System.out.printf("Durchschnitt Bestandene: %s %n",
                Noten.toString(durchschnitt));
            System.out.printf("Durchfallquote: %.1f%%", durchfallquote);
        }
    } // main
}


