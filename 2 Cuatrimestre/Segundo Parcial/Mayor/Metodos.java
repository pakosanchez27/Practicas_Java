package Actividad_4;

import java.util.Scanner;

public class Metodos {

    int NIP = 1234, cuenta;
    double Total = 10000, retiro;
    Scanner scan = new Scanner(System.in);
    boolean ValidacionNip(int nip){
        if (nip == NIP){

            return true;


        }else {

            return false;

        }
    }
    void ValidacionMenu(int respuesta){

        switch (respuesta){
            case 1:
                double ingreso;
                System.out.println("Abono");
                System.out.println("¿Cuanto deseas abonar?");
                ingreso = scan.nextDouble();
                sumar(ingreso);
                System.out.println("Tu nuevo Saldo es: " + mostrarTotal());
                break;

            case 2:
                System.out.println("Consulta");
                System.out.println("Tu saldo total es: " + mostrarTotal());
                break;
            case 3:

                System.out.println("Retiro");
                System.out.println("¿Cuanto deseas retirar?");
                retiro = scan.nextDouble();
                retirar(retiro);
                System.out.println("Retirando...");
                System.out.println("Gracias por tirar");
                break;

            case 4:

                System.out.println("Transeferencia");
                System.out.println("Cunato deseas Transferir");
                retiro = scan.nextDouble();
                retirar(retiro);
                System.out.println("Ingresa la cuneta Destino");
                cuenta = scan.nextInt();
                System.out.println("Transferencia Exitos a cuenta");
                System.out.println(cuenta);
                break;

            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }

    void sumar (double ing){

        Total = Total + ing;
    }
     double mostrarTotal(){
        return Total;
     }

     void retirar(double ret){
        Total = Total - ret;
     }

}
