public class BasicMath {
    public static void main(String[] args) {
        int a = 1+1;
        int b = 4+a*2;
        int c = b+a - 1;
        int d = c % b;

        System.out.println("Podane liczby wynoszą:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        dodaj(5, 12);

    }
    public static int dodaj(int e, int f) {
        int g = 0;
        g = e + f;
        System.out.println("Wynik dodawania to: " + g);
        return g;
}
}

