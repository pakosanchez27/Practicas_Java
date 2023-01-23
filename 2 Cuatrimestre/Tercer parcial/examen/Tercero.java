package examen;

public class Tercero {

    int Arreglo3[] = new int[5];

    void crearArreglo(int arr[]){
        for (int i = 0; i < Arreglo3.length; i++){
            Arreglo3[i] = arr[i];
        }
    }
    void mostrarTablas(){
        for (int p= 0; p< Arreglo3.length; p++){
            System.out.println("----------------------------");
            for (int i = Arreglo3[p]; i<= Arreglo3[p]; i++){
                for (int j = 1; j <= 10; j++){

                    System.out.println(i + " * " +   " = " + Arreglo3[p] * j);
                }
            }
        }

    }
}
