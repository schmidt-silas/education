// IntVar.java

package aufgabe1;

import java.util.Scanner;

/**
 * IntVar zeigt den Umgang mit Variablen vom Typ int.
 * &Uuml;bungsaufgabe 1 zur Programmiertechnik 1.
 * @author Silas Schmidt
 * @version 23.10.2022
 */
public final class IntVar {
    private static String nextLine;

    private IntVar() {
    }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        final int max = Integer.MAX_VALUE;
        final int min = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("%s%d%s%d%s%n", "Zwei ganze Zahlen zwischen ",
                min, " und ", max, " eingeben:");

        int zahl1;
        while (!scanner.hasNextInt()) {
            System.out.println("1te Zahl ist nicht im angegebenen Bereich!");
            System.out.printf("%s%d%s%d%s%n", "1te Zahle zwischen ",
                    min, " und ", max, " bitte erneut eingeben:");
            scanner.next(); // this is important!
        }
        zahl1 = scanner.nextInt();

        int zahl2;
        while (!scanner.hasNextInt()) {
            System.out.println("2te Zahl ist nicht im angegebenen Bereich!");
            System.out.printf("%s%d%s%d%s%n", "2te Zahle zwischen ",
                    min, " und ", max, " bitte erneu eingeben:");
            scanner.next(); // this is important!
        }
        zahl2 = scanner.nextInt();

        System.out.printf("%d%s%o%s%x%n", zahl1, " ist oktal ", zahl1,
                " und hexadezimal ", zahl1);
        System.out.printf("%d%s%o%s%x%n", zahl2, " ist oktal ", zahl2,
                " und hexadezimal ", zahl2);

        System.out.println("Operator eingeben:");

        boolean kontrolle = false;

        String op;
        while (kontrolle == false && scanner.hasNextLine()) {
            op = scanner.next();
            if (op.equals("+")) {
                kontrolle = true;
                System.out.printf("%d%s%d%s%d", zahl1,
                        " + ", zahl2, " = ", zahl1 + zahl2);
            } else if (op.equals("-")) {
                kontrolle = true;
                System.out.printf("%d%s%d%s%d", zahl1,
                        " - ", zahl2, " = ", zahl1 - zahl2);
            } else if (op.equals("*")) {
                kontrolle = true;
                System.out.printf("%d%s%d%s%d", zahl1,
                        " * ", zahl2, " = ", zahl1 * zahl2);
            } else if (op.equals("/")) {
                kontrolle = true;
                System.out.printf("%d%s%d%s%d", zahl1,
                        " / ", zahl2, " = ", zahl1 / zahl2);
            } else if (op.equals("%")) {
                kontrolle = true;
                System.out.printf("%d%s%d%s%d", zahl1,
                        " % ", zahl2, " = ", zahl1 % zahl2);
            } else if (op.equals("==")) {
                kontrolle = true;
                System.out.printf("%d%s%d%s%d", zahl1,
                        " == ", zahl2, " = ", zahl1 == zahl2);
            } else if (op.equals("!=")) {
                kontrolle = true;
                System.out.printf("%d%s%d%s%d", zahl1,
                        " != ", zahl2, " = ", zahl1 != zahl2);
            } else if (op.equals("<")) {
                kontrolle = true;
                System.out.printf("%d%s%d%s%d", zahl1,
                        " < ", zahl2, " = ", zahl1 < zahl2);
            } else if (op.equals("<=")) {
                kontrolle = true;
                System.out.printf("%d%s%d%s%d", zahl1,
                        " <= ", zahl2, " = ", zahl1 <= zahl2);
            } else if (op.equals(">")) {
                kontrolle = true;
                System.out.printf("%d%s%d%s%d", zahl1,
                        " > ", zahl2, " = ", zahl1 > zahl2);
            } else if (op.equals(">=")) {
                kontrolle = true;
                System.out.printf("%d%s%d%s%d", zahl1,
                        " >= ", zahl2, " = ", zahl1 >= zahl2);
            } else {
                System.out.println("Das ist kein Operator");
                System.out.println("Operator eingeben:");
            }
            scanner.next(); // this is important!
        }

        scanner.close();
        /**
         * System.out.printf("%d%s%d%s%d%n", zahl1, " + ", zahl2,
         * " ist ", zahl1 + zahl2);
         * System.out.printf("%d%s%d%s%d%n", zahl1, " - ", zahl2,
         * " ist ", zahl1 - zahl2);
         * System.out.printf("%d%s%d%s%d%n", zahl1, " * ", zahl2,
         * " ist ", zahl1 * zahl2);
         * System.out.printf("%d%s%d%s%d%n", zahl1, " / ", zahl2,
         * " ist ", zahl1 / zahl2);
         * System.out.printf("%d%s%d%s%d%n", zahl1, " % ", zahl2,
         * " ist ", zahl1 % zahl2);
         * System.out.printf("%d%s%d%s%b%n", zahl1, " == ", zahl2,
         * " ist ", zahl1 == zahl2);
         * System.out.printf("%d%s%d%s%b%n", zahl1, " != ", zahl2,
         * " ist ", zahl1 != zahl2);
         * System.out.printf("%d%s%d%s%b%n", zahl1, " < ", zahl2,
         * " ist ", zahl1 < zahl2);
         * System.out.printf("%d%s%d%s%b%n", zahl1, " <= ", zahl2,
         * " ist ", zahl1 <= zahl2);
         * System.out.printf("%d%s%d%s%b%n", zahl1, " > ", zahl2,
         * " ist ", zahl1 > zahl2);
         * System.out.printf("%d%s%d%s%b%n", zahl1, " >= ", zahl2,
         * " ist ", zahl1 >= zahl2);
         */
    }
}
