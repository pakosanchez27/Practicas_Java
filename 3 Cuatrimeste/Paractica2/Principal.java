package PrimerParcial.Paractica2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int res, res2;
        Metodos metodo = new Metodos();
        do {

            System.out.println("¿Que opción deseas?");
            System.out.println("1: Problematica 1");
            System.out.println("2: Problematica 2");
            System.out.println("3: Problematica 3");
            res = scan.nextInt();

            switch (res){
                case 1:
                    int[][] original = new int[4][2];
                    System.out.println("ingresa los datos de la tabla 4x2");
                    for (int fil = 0; fil < 4; fil++){
                        for (int col = 0; col < 2; col++){
                            original[fil][col] = scan.nextInt();
                        }
                    }
                    metodo.copiar(original);

                    System.out.println("Datos de la tabla original: ");
                    for (int fil = 0; fil < 4; fil++){
                        for (int col = 0; col < 2; col++){
                            System.out.print("\t" + original[fil][col]);
                        }
                        System.out.println();
                    }
                    metodo.mostrarCopia();



                    break;
                case 2:
                    int[][] arre = new int[10][10];
                    //Llenar el arreglo con MATh
                    for (int i = 0; i < arre.length; i++) {
                        for (int j = 0; j < arre[i].length; j++) {
                            arre[i][j] = (int)(Math.random()*100);
                        }
                    }
                    metodo.llenarMatriz(arre);
                    metodo.mostrarCopia();
                    break;
                case 3:
                    char letras[] = new char[5];
                    System.out.println("ingresa las letras");
                    for (int p = 0; p < letras.length; p++){
                        letras[p] = scan.next().charAt(0);
                    }
                    metodo.llenarLetras(letras);
                    metodo.mostarLetras();
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }

            System.out.println("Deseas repetir el menú");
            System.out.println("1. Si");
            System.out.println("2. No");
            res2 = scan.nextInt();
        }while (res2 == 1);


    }
}
