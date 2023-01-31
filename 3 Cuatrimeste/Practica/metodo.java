package practica;

public class metodo {

    int Arreglo2[][] = new int[3][3];
    int fila[] = new int[3];
    int col[] = new  int[3];
    int diagonal[] = new int[2];


    void llenarArreglo(int arre[][]){
        for (int f = 0; f < 3; f++){
            for (int c = 0; c < 3; c++ ){
                Arreglo2[f][c] = arre[f][c];
            }
        }
    }
    int[] sumaFila(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fila[i] += Arreglo2[i][j];
            }
        }

        return fila;
    }

    int[] sumaColumna(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                col[i] += Arreglo2[j][i];
            }
        }

        return col;
    }
    int[] sumaDiagona(){
        for (int i = 0; i < 3; i++) {
            diagonal[0] += Arreglo2[i][i];
            diagonal[1] += Arreglo2[i][2 - i];
        }
        return diagonal;
    }

    void mostrarArreglo(){
        for (int f = 0; f < 3; f++){
            for (int c = 0; c < 3; c++ ){
                System.out.print("\t" +Arreglo2[f][c]);
            }
            System.out.println();
        }
    }

    void mostrarSumaFila(){
        for (int i = 0; i<3; i++){
            System.out.print(fila[i]);
        }
    }
    void mostrarSumaCol(){
        for (int i = 0; i<3; i++){
            System.out.print(col[i]);
        }
    }
    void mostrarSumaDiagonal(){
        for (int i = 0; i<2; i++){
            System.out.print(diagonal[i]);
        }
    }

}
