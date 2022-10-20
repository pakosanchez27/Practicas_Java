package Actividad3;

public class Metodos {

    double suma = 0, total, descuento,mensualidad=0;
    void Asignar (double a){
        suma = suma + a;
    }

    double mostrar() {
        return suma;
    }

    double ValidacioEfectivo() {
        if (suma <= 2000 || suma <= 4000) {
            descuento = suma * .10;
            total = suma - descuento;
        } else if (suma > 4000 || suma <= 6000 ) {
            descuento = suma * .20;
            total = suma - descuento;
        } else if (suma > 6000 ) {
            descuento = suma * .30;
            total = suma - descuento;
        }
        return total;
    }
    double ValidarTDC(){
        descuento = suma * .25;
        return descuento;
    }
    double ValidarDep(){
        descuento = suma * .30;
        return descuento;
    }
    void mesesTDC(int b){

        if(b == 1){
            mensualidad = suma / 6;
        }else if(b == 2) {
            mensualidad = suma / 12;
        }

    }

    void mesesDep(int b){

        if(b == 1){
            mensualidad = suma / 12;
        }else if(b == 2) {
            mensualidad = suma / 18;
        }

    }
    double mostrarMeses(){
        return mensualidad;
    }
}




