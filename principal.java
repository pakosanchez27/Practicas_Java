package examen;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Primero uno = new Primero();
        Segundo dos = new Segundo();
        Tercero tres = new Tercero();

        int res, valor, res2;
        int Arreglo1[] = new int[10];
        do{
            System.out.println("Elige una opción del menú");
            System.out.println("1 Pedir 10 datos (edades).");
            System.out.println("2.Imprime tabla de multiplicar");
            System.out.println("3.Imprime todas las tablas de multiplicar");
            res = scan.nextInt();
            switch (res){
                case 1:
                    for (int i = 0; i < Arreglo1.length; i++){
                        System.out.println("Ingresa la edad: " + i);
                        valor = scan.nextInt();
                        Arreglo1[i] = valor;
                        uno.asignarEdad(Arreglo1);
                    }
                    uno.mostrarEdad();
                    uno.edadMayor();
                    break;
                case 2:
                    System.out.println("Imprime una tabla de multiplicar");
                    System.out.println("¿Que tabla de multiplicar deseas?");
                    valor = scan.nextInt();
                    dos.mostrarTabla(valor);
                    break;
                case 3:
                    System.out.println("Todas las tablas de multiplicar");
                    tres.mostrarTablas();
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;

            }

            System.out.println("Deseas Realizar una nueva opereación");
            System.out.println("1.SI");
            System.out.println("2.NO");
        }while (res == 1);
        

    }
}
