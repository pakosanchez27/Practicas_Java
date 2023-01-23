import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc, opc2, opc3;
        System.out.println("cuantos astericos deseas en la torre");
        opc = scan.nextInt();

        System.out.println("escoge la opcion que deseas");
        System.out.println("1. Acendente");
        System.out.println("2. Desendente");
        opc2 = scan.nextInt();

        System.out.println("Escoge la opcion que deseas");
        System.out.println("1. Metodo for");
        System.out.println("2. Metodo while");
        opc3 = scan.nextInt();

        if (opc2 == 1 && opc3==1){
            for (int i=1; i <= opc; i++){
                for (int b = 1; b <= i; b++){
                    System.out.print('*');
                }
                System.out.println(" ");
            }
        } else if (opc2 == 1 && opc3 == 2) {
            int a = 1;
            while (a <= opc) {
                int b = 1;
                while (b <= a) {
                    System.out.print('*');
                    b++;
                }
                System.out.println(" ");
                a++;
            };
        } else if (opc2 == 2 && opc3 == 1) {
            for (int i=1; i <= opc; i++){
                for (int b = opc; b >= i; b--){
                    System.out.print('*');
                }
                System.out.println(" ");
            }
        }else if (opc2 == 2 && opc3 == 2){
            int c = 1;
            while (c <= opc) {
                int b = opc;
                while (b >= c) {
                    System.out.print('*');
                    b--;
                }
                System.out.println(" ");
                c++;
            };
        }

    }
}
