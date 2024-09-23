// Noten.java
package aufgabe4.schweiz;

/**
 * Noten-Klassen Schweiz.
 * <p>
 * Beschreibung als DLC fuer 50 Euro extra.
 * </p>
 * @author Silas Schmidt
 * @version 01.12.2022
 */
public final class Noten {
    private Noten() { }

    /** Beste Note.*/
    public static final double BEST = 6.0;
    /** Schlechteste Note.*/
    public static final double WORST = 1.0;

    /**
     * main ist der Startpunkt des Programms.
     * @param note wird nicht verwendet.
     * @return zulaessig.
     */
    public static Boolean istZulaessig(String note) {
        Boolean zulaessig = false;
        note = note.replace(",", ".");

        if (note.matches("^\\d\\.\\d$")) {
            String[] s = note.split("\\.");

            int vk = Integer.parseInt(s[0]); // VorkommaStelle
            int nk = Integer.parseInt(s[1]); // Nachkommastelle

            Boolean vkt = ((vk <= BEST) && (vk >= WORST));
            Boolean nkt = (nk == 5 && vk < BEST)
                || (nk == 0 && vk <= BEST);

            zulaessig = (vkt && nkt);
        }

        return zulaessig;
    }

    /**
     * TODO: IllegalArgumentException.
     * @param note wird nicht verwendet.
     * @return Double.
    */
    public static Double toDouble(String note) {
        note = note.replace(",", ".");
        return Double.parseDouble(note);
    }

    /**
     * TODO: IllegalArgumentException.
     * @param noteDouble wird nicht verwendet.
     * @return String.
    */
    public static String toString(Double noteDouble) {
        String note = String.format("%.1f", noteDouble);
        note = note.replace(".", ",");
        return note;
    }

    /**
     * istBestanden testen.
     * @param note wird nicht verwendet.
     * @return bestanden.
    */
    public static Boolean istBestanden(Double note) {
        return note >= 4;
    }

    /**
     * bessere note berechnen.
     * @param note wird nicht verwendet.
     * @param beste wird nicht verwendet
     * @return beste.
    */
    public static Double bessere(Double note, Double beste) {
        if (note > beste) {
            beste = note;
        }
        return beste;
    }

    /**
     * schlechtere note berechnen.
     * @param note wird nicht verwendet.
     * @param schlechteste wird nicht verwendet
     * @return schlechteste.
    */
    public static Double schlechtere(Double note, Double schlechteste) {
        if (note < schlechteste) {
            schlechteste = note;
        }
        return schlechteste;
    }
}