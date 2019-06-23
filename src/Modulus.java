public class Modulus {
    public static void main(String[] args) {
        modulo(233, 13);
        modul(-22);

    }
    public static int modulo(int w, int z){
        int y = 0;
        y = w % z;
        if (w < z){
            throw new IllegalArgumentException("This is not good!");
        }
        System.out.println("w modulo z = " +y);
        return y;
    }
    public static int modul(int k){
        int i;
        i = k < 0 ? -k : k;
        System.out.println("Wartość bezwzględna z liczby k wynosi: " +k);
        return k;
    }
}
