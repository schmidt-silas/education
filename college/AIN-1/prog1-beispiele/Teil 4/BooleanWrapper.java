// Booleankirapper. java

/**
 * Booleanlirapper zeigt den Umgang mit der Wrapperklasse Boolean.
 * Beispielprogramm zur Programmiertechnik 1, Teil 4.
 * 
 * @author H.Drachenfels
 * @version 4.8.2816
 */
public final class BooleanWrapper {
    private BooleanWrapper() {
    }

    /**
     * main ist der Startpunkt des Programms.
     * 
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        Boolean reference;
        reference = new Boolean(true);
        System.out.println(reference);
        reference = new Boolean("true");
        System.out.println(reference);
        reference = Boolean.TRUE;
        System.out.println(reference);
        reference = true; // Autobexing mit Boolean.valueof(true)
        System.out.println(reference);
        reference = Boolean.valueOf(true);
        System.out.println(reference);
        reference = Boolean.valueOf("true");
        System.out.println(reference);

        boolean value;
        value = reference; // Autounboxing mit reference.booleanvalue()
        System.out.println(value);
        value = reference.booleanValue();
        System.out.println(value);
        value = Boolean.parseBoolean("true");
        System.out.println(value);
        value = reference.equals(Boolean.TRUE);
        System.out.println(value);
        value = reference.compareTo(Boolean.TRUE) == 0;
        System.out.println(value);

        String s;
        s = Boolean.toString(true);
        System.out.println(s);
        s = reference.toString();
        System.out.println(s);
    }
}