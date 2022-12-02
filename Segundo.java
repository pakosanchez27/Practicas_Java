package examen;

public class Segundo {
    int Arreglo2[] = new int[5];
    void crearNuevoArreglo(int arr[]){

        for (int i = 0; i < Arreglo2.length; i++){
            Arreglo2[i] = arr[i];
        }
    }
    void mostrarTabla(int val){
        System.out.println(" tabla del " + Arreglo2[val]);
        for (int i = Arreglo2[val]; i<= Arreglo2[val]; i++){
            for (int j = 1; j <= 10; j++){

                System.out.println(i + " * " + j +  " = " + Arreglo2[val] * j);
            }
        }
        }
    }

