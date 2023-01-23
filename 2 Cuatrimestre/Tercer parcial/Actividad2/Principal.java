package Actividad2;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Metodos metodo =  new Metodos();

        int valor, ele, Arreglo[], res;
        do {

            System.out.println("¿De cuantos elementos sera el arreglo?");
            valor = scan.nextInt();
            Arreglo = new int[valor];
            metodo.ArregloTamaño(valor);

            for (int i = 0; i < Arreglo.length; i++){
                System.out.println("Ingresa el valor " + i);
                ele = scan.nextInt();
                Arreglo[i] = ele;
                metodo.llenarArreglo(Arreglo);

            }

            metodo.mostarArreglo();

            System.out.println("¿Desea realizar otra operación?");
            System.out.println("1. Si");
            System.out.println("2. No");
            res = scan.nextInt();

        }while (res == 1);









    }
}
