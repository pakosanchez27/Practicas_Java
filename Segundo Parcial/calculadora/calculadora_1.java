package Actividad_2;

import java.util.Scanner;

public class calculadora_1 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        calculadora_2 obj = new calculadora_2();
        int res, res2;
        double num1 ,num2;

        do {
            System.out.println("Ingresa la opción que deseas");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicación");
            System.out.println("4.División");
            res = scan.nextInt();

            switch (res) {

                case 1:

                    System.out.println("ingresa el primer valor");
                    num1 = scan.nextDouble();
                    System.out.println("Ingresa el segundo Valor");
                    num2 = scan.nextDouble();
                    obj.Asignar(num1, num2);
                    obj.sumar();
                    System.out.println("El resultado es: " + obj.respuesta());

                    break;

                case 2:
                    System.out.println("ingresa el primer valor");
                    num1 = scan.nextDouble();
                    System.out.println("Ingresa el segundo Valor");
                    num2 = scan.nextDouble();
                    obj.Asignar(num1, num2);
                    obj.resta();
                    System.out.println("El resultado es: " + obj.respuesta());
                    break;


                case 3:
                    System.out.println("ingresa el primer valor");
                    num1 = scan.nextDouble();
                    System.out.println("Ingresa el segundo Valor");
                    num2 = scan.nextDouble();
                    obj.Asignar(num1, num2);
                    obj.multiplicacion();
                    System.out.println("El resultado es: " + obj.respuesta());
                    break;

                case 4:
                    System.out.println("ingresa el primer valor");
                    num1 = scan.nextDouble();
                    System.out.println("Ingresa el segundo Valor");
                    num2 = scan.nextDouble();
                    obj.Asignar(num1, num2);
                    obj.division();
                    System.out.println("El resultado es: " + obj.respuesta());
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    break;


            }
            System.out.println("¿Quieres hacer otra operacion?");
            System.out.println("1.si");
            System.out.println("2.no");
            res2 = scan.nextInt();
        }while (res2 == 1);

    }
}
