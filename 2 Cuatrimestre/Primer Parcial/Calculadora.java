import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables de preguntas
        int opc, opc2;
        //contador principal
        int  contador = 0;
        //Variables de las operaciones
        double num1, num2, respuesta;
        // variables para los porsentajes
        float pSuma, pRes, pMul, pDiv, contaSuma = 0, contaRes = 0, contaMul = 0, contaDiv = 0;
        do{
            //Programa principal- Solicitud de datos 
            System.out.println("ingresa el primer numero");
            num1 = scan.nextDouble();
            System.out.println("ingresa el segundo numero");
            num2 = scan.nextDouble();

            System.out.println("Eligue una opcion del menu");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Muliplicacion");
            System.out.println("4.Divicion");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    respuesta = num1 + num2;
                    System.out.println("Suma");

                    System.out.println("El resultado es: " + respuesta);
                    contaSuma++;
                    break;
                case 2:
                    respuesta = num1 - num2;
                    System.out.println("Resta");
                    System.out.println("El resultado es: " + respuesta);
                    contaRes++;
                    break;
                case 3:
                    respuesta = num1 * num2;
                    System.out.println("Multiplicación");
                    System.out.println("El resultado es: " + respuesta);
                    contaMul++;
                    break;
                case 4:
                    respuesta = num1 / num2;
                    System.out.println("División");
                    System.out.println("El resultado es: " + respuesta);
                    contaDiv++;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }
            contador++;
            System.out.println("¿Quieres iniciar de nuevo?");
            System.out.println("1.SI");
            System.out.println("2.NO");
            opc2 = scan.nextInt();
            // Validacion para verificar si es posible terminar o no 
            if (opc2 == 1){
                contador++;
            }else {
                if (contador < 7){
                    System.out.println("Minimo tienes que realizar 7 operaciones, Maximo 12 ");
                }else {
                    break;
                }
            }


        }while (contador < 7 || contador < 12);
        //operaciones de para los porsentajes 
        pSuma = (contaSuma / contador) * 100;
        pRes = (contaRes / contador) * 100;
        pMul = (contaMul / contador) * 100;
        pDiv = (contaDiv / contador) * 100;

        System.out.println("El Porsentaje de uso de cada opcion es: ");
        System.out.println("Suma: " +  pSuma + "%");
        System.out.println("Resta: " + pRes + "%");
        System.out.println("Multiplicacion: " +  pMul + "%");
        System.out.println("Divicion: " +  pDiv + "%");




    }
}
