import java.util.*;

public class tablas2 {
    public static void main(String[] args) {
        char opc;
        int fin, inicio;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Ingresa la tabla de inicio");
            inicio= scan.nextInt();
            System.out.println("Ingresa la tabla de Final");
            fin= scan.nextInt();

            for(int a = inicio; a <=fin; a++){
                for(int i = 1; i <=10; i++){
                    System.out.println(a + " * "  + i +" = " + a*i);
                }
                System.out.println(" ");
            }


            System.out.println("Deseas repetir el programa");
            System.out.println("S.si");
            System.out.println("N.No");
            opc = scan.next().charAt(0);
        }while (opc == 's' || opc == 'S');

    }
}
