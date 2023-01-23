package examen;

public class Primero {
    int Arreglo1[] = new int[10];
    int Mayor;
    int contadorMayor = 0;
    int contadorMenor = 0;

    void asignarEdad(int arr[]){
        for (int i = 0; i < Arreglo1.length; i++){
            Arreglo1[i] = arr[i];
        }
    }
    void mostrarEdad(){

        for (int j = 0; j < Arreglo1.length; j++){
            if (Arreglo1[j] >= 18){
                contadorMayor++;
            }else {
                contadorMenor++;
            }
        }

        System.out.println("La cantidad de personas mayores es: " + contadorMayor);
        System.out.println("La cantidad de personas menores es: " + contadorMenor);

    }

     void edadMayor(){
         for (int j = 0; j < Arreglo1.length; j++){
             if (Arreglo1[j] > Mayor){
                 Mayor = Arreglo1[j];
             }
         }
         System.out.println("la edad mayor es: " + Mayor);
     }
}
