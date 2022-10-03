package PrimerParcial;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Examen3 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String user , pass ;
        int opc, opc2;

        System.out.println("Ingresa el nombre de Usuario");
        user = scan.nextLine();
        System.out.println("Ingresa el nombre de Password");
        pass = scan.nextLine();

        if (user.equals("Admin") && pass.equals("Admin") ) {

            do{
                System.out.println("bienvenido al Menú");
                System.out.println("Escoge la opción correcta");
                System.out.println("1.Tablas de multiplicar");
                System.out.println("2.Pares o Nones");
                System.out.println("3.Vocales o Consonantes");
                opc = scan.nextInt();
                switch (opc) {
                    case 1:
                        int tabla;
                        System.out.println("Elige la tabla que deseas imprimir");
                        tabla = scan.nextInt();
                        for (int i = tabla; i <= tabla; i++) {
                            for (int a = 1; a <= 10; a++) {
                                System.out.println(a + " * " + i + " = " + a * i);
                            }
                        }

                        break;
                    case 2:
                        int valor, num, contadorPar = 0, contadorNon = 0;
                        System.out.println("ingresa cuantos valores quieres evaluar");
                        valor = scan.nextInt();
                        for (int i = 1; i <= valor; i++) {
                            System.out.println("Ingresa el valor " + i);
                            num = scan.nextInt();
                            if (num % 2 == 0) {
                                contadorPar++;
                            } else {
                                contadorNon++;
                            }
                        }
                        System.out.println("Total de pares: " + contadorPar);
                        System.out.println("Total de Nones: " + contadorNon);
                        break;

                    case 3:
                        int contadorvocal = 0, contadorcons = 0;
                        char letra;
                        System.out.println("Ingresa 8 letras");
                        for (int i = 1; i <= 8; i++) {
                            System.out.println("Ingresa la letra " + i);
                            letra = scan.next().charAt(0);
                            if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I' || letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U') {
                                contadorvocal++;
                            } else {
                                contadorcons++;
                            }
                        }
                        System.out.println("Total de Vocales: " + contadorvocal);
                        System.out.println("Total de Consonantes: " + contadorcons);
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;

                }
                System.out.println("Deseas regresar al menu");
                System.out.println("1.Si");
                System.out.println("2.No");
                opc2 = scan.nextInt();
            }while (opc2 == 1);
            System.out.println("Adios");
        }else{
            System.out.println("el usuario  o el Password es  incorrecto");
        }

    }
}
