// Noten.java
package aufgabe4;

/**
 * Noten-Klassen Deutsch.
 * <p>
 * Beschreibung als DLC fuer 50 Euro extra.
 * </p>
 * @author Silas Schmidt
 * @version 01.12.2022
 */
public final class Noten {
    private Noten() { }

    /** Beste Note.*/
    public static final double BEST = 1.0;
    /** Schlechteste Note.*/
    public static final double WORST = 5.0;

    /**
     * main ist der Startpunkt des Programms.
     * @param note wird nicht verwendet.
     * @return zulaessig.
     */
    public static boolean istZulaessig(String note) {
        boolean zulaessig = false;
        note = note.replace(",", ".");

        if (note.matches("^\\d\\.\\d$")) {
            String[] s = note.split("\\.");

            int vk = Integer.parseInt(s[0]); // VorkommaStelle
            int nk = Integer.parseInt(s[1]); // Nachkommastelle

            boolean vkt = ((vk >= BEST) && (vk <= WORST));
            boolean nkt = (((nk == 3 || nk == 7) && (vk < 4))
                || ((nk == 0) && (vk <= WORST)));

            zulaessig = (vkt && nkt);
        }

        return zulaessig;
    }

    /**
     * @param note wird nicht verwendet.
     * @return Double.
    */
    public static double toDouble(String note) {
        if (Noten.istZulaessig(note)) {
            note = note.replace(",", ".");
            return Double.parseDouble(note);
        } else {
            throw new IllegalArgumentException("Note liegt nicht im "
                + "gültigen Bereich. ");
        }
    }

    /**
     * @param noteDouble wird nicht verwendet.
     * @return String.
    */
    public static String toString(double noteDouble) {
        if (noteDouble >= BEST && noteDouble <= WORST) {
            String note = String.format("%.1f", noteDouble);
            note = note.replace(".", ",");
            return note;
        } else {
            throw new IllegalArgumentException("Note liegt nicht zwischen "
                + "der besten oder schlechtesten Note. ");
        }
    }

    /**
     * istBestanden testen.
     * @param note wird nicht verwendet.
     * @return bestanden.
    */
    public static boolean istBestanden(double note) {
        return note <= 4;
    }

    /**
     * bessere note berechnen.
     * @param note wird nicht verwendet.
     * @param beste wird nicht verwendet
     * @return beste.
    */
    public static double bessere(Double note, Double beste) {
        if (note < beste) {
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
    public static double schlechtere(Double note, Double schlechteste) {
        if (note > schlechteste) {
            schlechteste = note;
        }
        return schlechteste;
    }
}