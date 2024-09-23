// StringSwitch.java

/**
 * Testprogramm zur Java 7 String-switch-Anweisung.
 * @author H.Drachenfels
 * @version 20.11.2019
 */
public final class StringSwitch {
    private StringSwitch() { }

    /**
     * Startpunkt des Programms.
     * @param args Test-Strings
     */
    public static void main(String[] args) {
        for (String s : args) {
            System.out.printf("\"%s\".hashCode() = %d%n", s, s.hashCode());

            // String-Vergleich mit if-else: maximal 5 String-Vergleiche
            if (s.equals("A?")) {
                System.out.println("case \"A?\"");
            } else if (s.equals("B ")) {
                System.out.println("case \"B \"");
            } else if (s.equals("C@") || s.equals("D!") || s.equals("EF")) {
                System.out.println("case \"C@\" und \"D!\" und \"EF\"");
            } else {
                System.out.println("default");
            }

            // String-Vergleich mit Java 7 String switch
            switch (s) {
            case "A?":
                System.out.println("case \"A?\"");
                break;
            case "B ":
                System.out.println("case \"B \"");
                break;
            case "C@":
            case "D!":
            case "EF":
                System.out.println("case \"C@\" und \"D!\" und \"EF\"");
                break;
            default:
                System.out.println("default");
            }

            // Implementierungstechnik fuer Java 7 String switch:
            // maximal 2 String-Vergleiche und eine Hashcode-Berechnung
            {
                int ordinal = -1;
                switch (s.hashCode()) {
                // case 'A' * 31 + '?':
                // case 'B' * 31 + ' ':
                case 2078:
                    if (s.equals("A?")) {
                        ordinal = 0;
                    } else if (s.equals("B ")) {
                        ordinal = 1;
                    }
                    break;
                // case 'C' * 31 + '@':
                // case 'D' * 31 + '!':
                case 2141:
                    if (s.equals("C@")) {
                        ordinal = 2;
                    } else if (s.equals("D!")) {
                        ordinal = 3;
                    }
                    break;
                // case 'E' * 31 + 'F':
                case 2209:
                    if (s.equals("EF")) {
                        ordinal = 4;
                    }
                    break;
                default:
                }

                switch (ordinal) {
                case 0:
                    System.out.println("case \"A?\"");
                    break;
                case 1:
                    System.out.println("case \"B \"");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("case \"C@\" und \"D@\" und \"EF\"");
                    break;
                default:
                    System.out.println("default");
                }
            }
        }
    }
}

