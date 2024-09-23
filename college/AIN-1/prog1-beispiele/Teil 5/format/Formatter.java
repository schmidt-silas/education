// Formatter.java
package format;

/**
 * Formatter ist eine Formatierurngsschnittstelle f&uuml;r ganze Zahlen.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * 
 * @author H.Drachenfels
 * @version 5.8.2016
 */
public interface Formatter {
    /**
     * format liefert eine String-Darstellung f&uuml;r eine ganze Zahlen.
     * 
     * @param n eine ganze Zahl.
     * @return die String-Darstellung von n.
     */
    String format(int n);
}
