package PrimerParcial;

import java.util.Scanner;

public class Bidimencional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Arre[][] = new int[3][4];

        for (int fil = 0; fil <3; fil++){
            for (int col = 0; col < 4; col++){
                System.out.println("Ingresa Datos");
                Arre[fil][col] = scan.nextInt();
            }
        }
        for (int fil = 0; fil < 3; fil++){
            for (int col = 0; col < 4; col++){
                System.out.print("\t" + Arre[fil][col]);
            }
            System.out.println("");
        }
    }
}
