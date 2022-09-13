import java.util.*;

public class tablas {
    public static void main(String[] args) {
        char opc;
        Scanner scan = new Scanner(System.in);
        do{
            for(int a = 1; a <=10; a++){
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
