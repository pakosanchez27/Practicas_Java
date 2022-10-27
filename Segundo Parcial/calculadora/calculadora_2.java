package Actividad_2;



public class calculadora_2 {
    double A, B, C;

    void Asignar(double a, double b) {
        A = a;
        B = b;

    }
    void sumar (){
        C = A + B;
    }
    void resta (){
        C = A - B;
    }
    void multiplicacion (){
        C = A * B;
    }
    void division (){
        C = A / B;
    }

    double respuesta (){
        return C;
    }

}
