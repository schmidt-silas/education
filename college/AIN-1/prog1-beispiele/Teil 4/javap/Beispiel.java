package javap;

public final class Beispiel {
    private Beispiel() { }

    private static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int x = 123;
        int y = 456;
        int z = add(x, y);
    }
}

