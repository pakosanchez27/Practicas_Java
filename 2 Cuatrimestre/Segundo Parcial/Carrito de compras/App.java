package Actividad6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Funciones metodo = new Funciones();
        String user, pass;

        int intentos = 1, res, res3;
        char res2;
        double valor;
        do{
            System.out.println("Bienvenido a CleanKode Shop");
            System.out.println("Ingresa tu nombre de usuario");
            user = scan.nextLine();
            System.out.println("Ingresa a tu Contraseña ");
            pass = scan.nextLine();
            metodo.validaUsuario(user, pass);
            if (metodo.resValidacion()){
                do{
                    for (int i = 1; i <= 3; i++){
                        System.out.println("Ingresa el valor del producto " + i);
                        valor = scan.nextDouble();
                        metodo.suma(valor);
                    }
                    System.out.println("El Subtotal de tu cuenta es: " + metodo.mostrarTotal());
                    System.out.println("Elije el metodo de pago");
                    System.out.println("1.Meses Sin intereses");
                    System.out.println("2.Pago de contado");
                    System.out.println("3.Pago con tarjeta de credito");
                    res = scan.nextInt();

                    switch (res){
                        case 1:
                            System.out.println("Meses sin intereses");
                            System.out.println("Elije los meses a diferir");
                            System.out.println("a.3 Meses sin intereses");
                            System.out.println("b.6 Meses sin intereses");
                            System.out.println("c.12 Meses sin intereses");
                            System.out.println("d.18 Meses sin intereses");
                            res2 = scan.next().charAt(0);
                            metodo.operacionMeses(res2);
                            System.out.println("El Total a pagar es de:  $" + metodo.mostrarTotal());
                            System.out.println("Tu mensualidad es de: " + metodo.mostarMensualidad());

                            break;
                        case 2:
                            System.out.println("Pago de contado");
                            System.out.println("Tu subtotal es de : $" + metodo.mostrarTotal());
                            System.out.println("Tu descuento del 20 % es: $" + metodo.mostarDescuento() );
                            System.out.println("Tu total a pagar es de: $" + metodo.mostarTotalDes());
                            break;
                        case 3:
                            System.out.println("Pago con TDC");
                            System.out.println("Elije la opcion de pago");
                            System.out.println("a. Con puntos (8% de descuento)");
                            System.out.println("b. A 3 meses + el 10%");
                            System.out.println("c. A 6 meses + el 15%");
                            res2 = scan.next().charAt(0);
                            metodo.operacionTDC(res2);

                            break;
                        default:
                            System.out.println("opcion incorrecta");
                            break;
                    }

                    System.out.println("¿Deseas calcular otros productos?");
                    System.out.println("1. Si");
                    System.out.println("2. NO");
                    res3 = scan.nextInt();
                }while (res3 == 1);
            break;
            }else{
                if (intentos <= 2) {
                    System.out.println("Intenta nuevamente");
                }
                intentos++;
            }
        }while (intentos <= 3);

        System.out.println("Adios, Vuelve pronto");






    }
}
