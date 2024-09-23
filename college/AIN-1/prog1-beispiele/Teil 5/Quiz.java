// Quizz.java

/**
 * Quiz zu statischer und dynamischer Bindung.
 * - In welchen Zeilen werden welche Methoden der Klassen A und B aufgerufen?
 * - Wo werden die Methodenaufrufe statische gebunden und wo dynamisch?
 * Beispielprogramm zur Programmiertechnik 1, Teil 5.
 * 
 * @author H.Drachenfels
 * @version 29.6.2020
 */
public final class Quiz {
    private Quiz() {
    }

    // Aufrufe der Methoden von A und B
    public static void main(String[] args) {
        // Aufrufe mit Klassenname A (siehe class A ab Zeile 46):
        A.f();
        A.g();
        A.h();
        A.i();

        // Aufrufe mit Variabler vom Typ A und Objekt der Klasse A:
        A a = new A();
        a.f();
        a.g();
        a.h();
        a.i();

        // Aufrufe mit Variabler vom Typ A und Objekt der Klasse B (siehe class B ab
        // Zeile 57):
        a = new B();
        a.f();
        a.g();
        a.h();
        a.i();

        // Aufrufe mit Variabler vom Typ B und Objekt der Klasse B:
        B b = new B();
        b.f();
        b.g();
        b.h();
        b.i();
    }
}

// Oberklasse A
class A {
    public A() {
    }

    public static void f() {
    }

    public final void g() {
    }

    public void h() {
        this.i();
    }

    private void i() {
    }
}

// Unterklasse B von A
class B extends A {
    public B() {
    }

    public static void f() {
    }

    // public void g() { }
    public void h() {
        this.i();
        super.h();
    }

    public void i() {
    }
}