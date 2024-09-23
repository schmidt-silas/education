// FormatterTest.java
package format;

/**
 * FormatterTest zeigt den Umgang mit der Schnittstelle Formatter.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * 
 * @author H.Drachenfels
 * @version 5.8.2016
 */
public final class FormatterTest {
    private FormatterTest() {
    }

    /**
     * main ist der Startpunkt des Programms.
     * 
     * @param args soll zwei ganze Zahlen enthalten
     */
    public static void main(String[] args) {
        int radix = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        Formatter[] alle = {
                new DecimalFormat(),
                new GroupedFormat(),
                new RadixFormat(radix),
                new UnsignedHexFormat()
        };

        for (Formatter f : alle) {
            String s = f.format(n);
            System.out.println(s);
        }
    }
}