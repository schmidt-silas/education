// StringBuildervar.java

/**
 * String8uilderVar zeigt den Umgang mit der Klasse String8uilder.
 * Beispielprogramm zur Programmiertechnik 1, Teil 4.
 * 
 * @author H.Drachenfels
 * @version 4.8.2816
 */
public final class StringBuilderVar {
    private StringBuilderVar() {
    }

    /**
     * main ist der Startpunkt des Programms.
     * 
     * @param args darf beliebige Zeichenketten enthalten.
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < args.length; ++i) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(i).append(":\"").append(args[i]).append('\"');
        }

        System.out.println(sb.toString());
    }
}