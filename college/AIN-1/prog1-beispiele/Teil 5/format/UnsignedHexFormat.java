// UnsignedHexFormat.java
package format;

/**
 * UnsignedHexFormat ist eine Formatierer f&uuml;r ganze Zahlen.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * @author H.Drachenfels
 * @version 5.8.2016
 */
public final class UnsignedHexFormat implements Formatter {
    /**
     * format formatiert ganze Zahlen hexadezimal ohne Vorzeichen.
     * @param n eine ganze Zahl.
     * @return ein String mit der hexadezimalen Darstellung von n.
     */
    @Override
    public String format(int n) {
        return Integer.toHexString(n);
    }
}

