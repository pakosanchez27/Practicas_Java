package Actividad_2;

public class Metodos {
    int A,B, mayor = 0;
    void Asignar (int a){
        A = a;
    }

    void operacion(){
        if (A > mayor){
            mayor = A;
        }
    }

    int respuesta (){
        return mayor;
    }
}
