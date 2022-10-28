package Actividad6;

public class Funciones {

    //Variables globales
    String usuario = "Admin", contra = "root";
    boolean validacion;
    double suma = 0, operacion, contado, total;


    // Metodos para validar usuario
    void validaUsuario(String user, String pass){
        if (user.equals(usuario) && pass.equals(contra)){
            validacion = true;
        }else {
            validacion = false;
        }
    }
    boolean resValidacion(){
        return validacion;
    }
    //Metodo para la suma

    void suma (double a){
        suma = suma + a;
    }

    double mostrarTotal(){
        return suma;
    }

    //metodos para Pago a meses

    void operacionMeses(char opc){

        switch (opc){
            case 'a':
            case 'A':
                operacion = suma / 3;
                break;
            case 'b':
            case 'B':
                operacion = suma / 6;
                break;
            case 'c':
            case 'C':
                operacion = suma / 12;
                break;
            case 'd':
            case 'D':
                operacion = suma / 18;
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }

    }
    double mostarMensualidad (){
        return operacion;
    }

    //Metodos para pago de contado


    double mostarDescuento(){
        operacion = suma * .20;
        return operacion;
    }
    double mostarTotalDes(){
        contado = suma - operacion;
        return contado;
    }

    //Metodos para Pago con tarjeta
     void operacionTDC( char opc){

         switch (opc){

             case 'a':
             case 'A':
                 System.out.println("Pago con Puntos");
                 operacion = suma - (suma * .08) ;
                 System.out.println("El total a pagar es: " + mostarTotalTDC());

                 break;
             case 'b':
             case 'B':

                 System.out.println("Pago a 3 meses ");
                 operacion = ((suma * .10) + suma)/3;
                 total = suma + (suma * .10);
                 System.out.println("Tu Mensualidad sera de: $" + mostarTotalTDC());
                 System.out.println("Tu total a pagar es de: $" + total);

                 break;
             case 'c':
             case 'C':
                 System.out.println("Pago a 6 meses ");
                 operacion = ((suma * .15) + suma)/3;
                 total = suma + (suma * .15);
                 System.out.println("Tu Mensualidad sera de: $" + mostarTotalTDC());
                 System.out.println("Tu total a pagar es de: $" + total);
                 break;
             case 'd':
             case 'D':
                 operacion = suma / 18;
                 break;
             default:
                 System.out.println("Opcion incorrecta");
                 break;
         }

     }
     double mostarTotalTDC(){
        return operacion;
     }



}
