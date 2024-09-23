// DecimalFormat.java
package format;

/**
 * DecimalFormat ist eine Formatierer f&uuml;r ganze Zahlen.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * 
 * @author H.Drachenfels
 * @version 5.8.2016
 */
public final class DecimalFormat implements Formatter {
    /**
     * format formatiert ganze Zahlen dezimal.
     * 
     * @param n eine ganze Zahl.
     * @return ein String mit der dezimalen Darstellung von n.
     */
    @Override
    public String format(int n) {
        return Integer.toString(n);
    }
}
