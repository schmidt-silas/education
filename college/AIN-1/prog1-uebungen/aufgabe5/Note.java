package aufgabe5;

public class Note {
    private final int note;

    private Note(int note) {
        if (note != 10 && note != 13 && note != 17 && note != 20 && note != 23 && note != 27 && note != 30 && note != 33
                && note != 37 && note != 40 && note != 50) {
            throw new IllegalArgumentException("unzulaessige Note " + note);
        }
        this.note = note;
    }

    public static final Note BESTE = new Note(50);
    public static final Note SCHLECHTESTE = new Note(10);

    public static Note valueOf(int note) {
        return new Note(note);
    }

    public static Note valueOf(String note) {
        try {
            int parsedNote = Integer.parseInt(note);
            return valueOf(parsedNote);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("unzulaessige Note " + note);
        }
    }

    public int intValue() {
        return note;
    }

    public boolean isBestanden() {
        return note <= 40;
    }

    public String toString() {
        return Integer.toString(note / 10) + "," + Integer.toString(note % 10);
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Note)) {
            return false;
        }
        Note c = (Note) o;
        return note == c.note;
    }

    public int hashCode() {
        return note;
    }
}
