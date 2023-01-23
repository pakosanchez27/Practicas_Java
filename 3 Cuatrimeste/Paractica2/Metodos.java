package PrimerParcial.Paractica2;

public class Metodos{
    int[][]copia;
    char [] letras = new char[5];

     int [][] copiar(int[][] original){
         copia = new int[4][2];
        for (int fil = 0; fil < 4; fil++){
            for (int col = 0; col < 2; col++){
                copia[fil][col] = original[fil][col];
            }
        }
        return copia;
    }
    int [][] llenarMatriz(int[][] arre){
        copia = new int[10][10];
        for (int fil = 0; fil < 10; fil++){
            for (int col = 0; col < 10; col++){
                copia[fil][col] = arre[fil][col];
            }
        }
        return copia;
    }
    char[] llenarLetras(char[] let){
        for (int p = 0; p < letras.length; p++){
             letras[p] = let[p] ;
        }
        return letras;
    }
    void mostrarCopia(){
        System.out.println("Datos de la tabla Copia: ");
        for (int fil = 0; fil < copia.length; fil++){
            for (int col = 0; col < copia[fil].length; col++){
                System.out.print("\t" + copia[fil][col]);
            }
            System.out.println();
        }
    }
    void mostarLetras(){
        System.out.println("Letras del arreglo al reves");
        for (int i = letras.length - 1; i >= 0; i--) {
            System.out.print(letras[i] + " ");
        }
        System.out.println();

    }
}