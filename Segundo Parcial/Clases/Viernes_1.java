package Clases;

import java.util.Scanner;

public class Viernes_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Viernes_2 xxx = new Viernes_2();
        int valor;

        for (int i = 1; i <= 5; i++){
            System.out.println("Ingresa el valor " + i);
            valor = scan.nextInt();
            xxx.Asignar(valor);
            xxx.operacion();
            System.out.println("El valor al cuadrado es " + xxx.respuesta());
        }

    }
}
