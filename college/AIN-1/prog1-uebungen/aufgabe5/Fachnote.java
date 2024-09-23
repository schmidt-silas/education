package aufgabe5;

public class FN {
    public class Fachnote {
        public final String fach;
        public final FN note;

        public Fachnote(String fach, FN note) {
            if (fach == null || fach.length() == 0) {
                throw new IllegalArgumentException("Fachname darf nicht null oder leer sein");
            }
            if (note == null) {
                throw new IllegalArgumentException("Note darf nicht null sein");
            }
            this.fach = fach;
            this.note = note;
        }
    }
}
