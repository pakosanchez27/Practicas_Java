package Actividad2;

public class Metodos {

    int Arreglo2[];

    void ArregloTamaño( int tam){
        Arreglo2 = new int[tam];
    }
    void llenarArreglo(int[] val){
        for (int j = 0; j < Arreglo2.length; j++ ){

            Arreglo2[j] = val[j];
        }
    }

    void mostarArreglo(){
        for (int p = 0; p < Arreglo2.length; p++){
            System.out.println("Valor : " + Arreglo2[p]);
        }
    }


}
