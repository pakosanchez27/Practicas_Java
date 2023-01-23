package Actividad3;

import java.sql.SQLOutput;

public class Metodos {

    int Arreglo2[] = new int[5];
    int contador[] = new int[5];




    void llenarArreglo(int[] val){
        for (int j = 0; j < Arreglo2.length; j++ ){

            Arreglo2[j] = val[j];
        }
    }

    void mostrarArreglo(){
        for (int i = 0; i < Arreglo2.length; i++){
            if (Arreglo2[0] == Arreglo2[i]){
                contador[0] +=1;
            }else if(Arreglo2[1] == Arreglo2[i]){
                contador[1] +=1;
            }else if(Arreglo2[2] == Arreglo2[i]){
                contador[2] +=1;
            }
            else if(Arreglo2[3] == Arreglo2[i]){
                contador[3] +=1;
            }else if(Arreglo2[4] == Arreglo2[i]){
                contador[4] +=1;
            }
        }
        for (int h = 0; h < Arreglo2.length; h++ ){

            System.out.println("Valor " + h + " = " + Arreglo2[h]);
        }

        for (int p = 0; p < Arreglo2.length; p++ ){

            if (contador[p] <= 1){
                System.out.println("");
            }else{
                System.out.println("el valor " + Arreglo2[p] + " Se repite " + contador[p]);
            }


        }

    }



    }




