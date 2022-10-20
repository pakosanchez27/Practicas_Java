package Actividad_2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Metodos metodo = new Metodos();
        int valor, res2;
        do {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ingresa el valor " + i);
                valor = scan.nextInt();
                metodo.Asignar(valor);
                metodo.operacion();
            }
            System.out.println("El Numero mayor es: " + metodo.respuesta());


            System.out.println("¿Deseas realizar una nueva consulta?");
            System.out.println("1.Si");
            System.out.println("2.No");
            res2 = scan.nextInt();
        }while (res2 == 1);
        }




}
