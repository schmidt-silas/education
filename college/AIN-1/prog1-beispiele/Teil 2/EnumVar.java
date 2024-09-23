// EnumVar.java

/**
 * EnumVar zeigt den Umgang mit Variablen vom Typ Enum.
 * Beispielprogramm zur Programmiertechnik 1, Teil 2.
 * @author H.Drachenfels
 * @version 7.1.2019
 */
public final class EnumVar {
    private EnumVar() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        Jahreszeit fruehling = Jahreszeit.FRUEHLING;
        Jahreszeit sommer = Jahreszeit.valueOf("SOMMER");
        System.out.printf("%s%n%s%n",
                          String.valueOf(fruehling), sommer.toString());

        Jahreszeit[] jahreszeiten = Jahreszeit.values();
        for (int i = 0; i < jahreszeiten.length; ++i) {
            if (jahreszeiten[i] != fruehling && jahreszeiten[i] != sommer) {
                System.out.println(jahreszeiten[i]);
            }
        }
    }
}