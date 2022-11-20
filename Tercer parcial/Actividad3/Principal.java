package Actividad3;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Metodos metodo =  new Metodos();

        int  ele, res;
        int Arreglo[] = new int[5];
        do {

            for (int i = 0; i < Arreglo.length; i++){
                System.out.println("Ingresa el valor " + i);
                ele = scan.nextInt();
                Arreglo[i] = ele;
                metodo.llenarArreglo(Arreglo);


            }

            metodo.mostrarArreglo();


            System.out.println("¿Desea realizar otra operación?");
            System.out.println("1. Si");
            System.out.println("2. No");
            res = scan.nextInt();

        }while (res == 1);









    }
}
