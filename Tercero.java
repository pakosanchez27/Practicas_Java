package examen;

public class Tercero {

    int Arreglo3[] = new int[5];

    void crearArreglo(int arr[]){
        for (int i = 0; i < Arreglo3.length; i++){
            Arreglo3[i] = arr[i];
        }
    }
    void mostrarTablas(){
        for (int i = 1; i<= Arreglo3.length; i++){
            System.out.println("----------------------------------");
            for (int j = 1; j <= Arreglo3.length; j++){

                System.out.println(i + " * " + j + " = " + i * j);

            }
        }
    }
}
