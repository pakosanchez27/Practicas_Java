import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc, contador = 1, opc2;
        double num1, num2, respuesta;
        do{
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

            switch (opc){
                case 1:
                    respuesta = num1 + num2;
                    System.out.println("Suma");

                    System.out.println("El resultado es: " + respuesta);
                    break;
                case 2:
                    respuesta = num1 - num2;
                    System.out.println("Resta");
                    System.out.println("El resultado es: " + respuesta);
                    break;
                case 3:
                    respuesta = num1 * num2;
                    System.out.println("Multiplicación");
                    System.out.println("El resultado es: " + respuesta);
                    break;
                case 4:
                    respuesta = num1 / num2;
                    System.out.println("División");
                    System.out.println("El resultado es: " + respuesta);
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


            System.out.println(contador);
        }while (opc2 != 1 && contador >= 7 && contador > 12);
      
    }
}
