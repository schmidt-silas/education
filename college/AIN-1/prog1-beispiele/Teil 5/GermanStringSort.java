// GermanStringSort.java
import java.text.Collator;
import java.util.Locale;

/**
 * GermanStringSort gibt seine Komandozeilenargumente aufsteigend sortiert aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * @author H.Drachenfels
 * @version 7.8.2016
 */
public final class GermanStringSort {
    private GermanStringSort() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        java.util.Arrays.sort(args, Collator.getInstance(Locale.GERMAN));

        for (String s : args) {
            System.out.println(s);
        }
    }
}

