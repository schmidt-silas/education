// GroupedFormat.java
package format;

import java.text.NumberFormat;

/**
 * GroupedFormat ist eine Formatierer f&uuml;r ganze Zahlen.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * @author H.Drachenfels
 * @version 11.12.2019
 */
public final class GroupedFormat implements Formatter {
    private static final NumberFormat NF;

    static {
        NF = NumberFormat.getIntegerInstance();
        NF.setGroupingUsed(true);
    }

    /**
     * format formatiert ganze Zahlen dezimal mit Tausenderpunktierung.
     * @param n eine ganze Zahl.
     * @return eine String mit der dezimalen Darstellung von n.
     */
    @Override
    public String format(int n) {
        return NF.format(n);
    }
}

