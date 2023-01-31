package practica;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        metodo metodo = new metodo();
        int Arreglo[][] = new int[3][3];

        for (int f = 0; f < 3; f++){
            for (int c = 0; c < 3; c++ ){
                System.out.println("Ingresa el los numero para el arreglo");
                Arreglo[f][c] = scan.nextInt();
                metodo.llenarArreglo(Arreglo);
            }
        }
        metodo.mostrarArreglo();
        metodo.sumaFila();
        System.out.println();
        metodo.mostrarSumaFila();
        metodo.sumaColumna();
        System.out.println();
        metodo.mostrarSumaCol();
        System.out.println();
        metodo.sumaDiagona();
        metodo.mostrarSumaDiagonal();
    }
}
