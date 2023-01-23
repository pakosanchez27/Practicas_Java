package PrimerParcial;

public class Actividad1 {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 4) {
            int b = 1;
            while (b <= a) {
                System.out.print('*');
                b++;
            }
            System.out.println(" ");
            a++;
        };
        int c = 1;
        while (c <= 4) {
            int b = 4;
            while (b >= c) {
                System.out.print('*');
                b--;
            }
            System.out.println(" ");
            c++;
        };

    }
}