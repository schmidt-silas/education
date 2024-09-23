// ListVar.java
package newlocal;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * ListVar legt eine Liste ganzer Zahlen an und gibt sie aus.
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * @author H.Drachenfels
 * @version 9.12.2016
 */
public final class ListVar {
    private ListVar() { }

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        //------------------------------------------------- Liste anlegen
        IntList anIntList = new IntList()
                            .insert(3814)
                            .insert(3635)
                            .insert(3442)
                            .insert(3421);

        //------------------------------------------------ Liste ausgeben
        System.out.println("Java 5 style iteration:");
        for (int n : anIntList) {
            System.out.println(n);
        }

        System.out.println("Java 5 style iteration explicitly:");
        Iterator<Integer> i = anIntList.iterator();
        while (i.hasNext()) {
            int n = i.next();
            System.out.println(n);
        }

        System.out.println("Java 8 style iteration:");
        anIntList.forEach(System.out::println);

        System.out.println("Java 8 style iteration explicitly:");
        anIntList.forEach(
            new Consumer<Integer>() {
                @Override
                public void accept(Integer n) {
                    System.out.println(n);
                }
            }
        );
    }
}

