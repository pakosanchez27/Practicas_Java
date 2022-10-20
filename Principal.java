package Actividad3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Metodos metodo = new Metodos();
        int res,res2,res3;
        do {


        double producto;
        for (int i  = 1;  i <= 4; i++){
            System.out.println("Ingresa el precio del producto " + i);
            producto = scan.nextDouble();
            metodo.Asignar(producto);
        }
        System.out.println("Tu total es: " + metodo.mostrar());
        System.out.println("Escoje tu Metodo de pago");
        System.out.println("1. Paga en efectivo");
        System.out.println("2. Paga con TDC");
        System.out.println("3. Pago con tarjeta departamental");
        res = scan.nextInt();
        switch (res){
            case 1:
                System.out.println("Pago en Efectivo ");
                System.out.println("Tu Total es : " + metodo.ValidacioEfectivo());
                break;
            case 2:

                System.out.println("Pago con TDC");
                System.out.println("Elige los meses a Diferir");
                System.out.println("1. 6 meses sin intereses");
                System.out.println("2. 12 meses sin intereses");
                res2 = scan.nextInt();
                metodo.mesesTDC(res2);
                System.out.println("tu pago mensual sera de: " + metodo.mostrarMeses());
                System.out.println("Tienes un 25% de descuento en dinero electronico");
                System.out.println("Tu total es de : " +metodo.mostrar());
                System.out.println("Tu nuevo saldo en dinero electronico es: " + metodo.ValidarTDC());
                break;
            case 3:
                System.out.println("Pago con TDC");
                System.out.println("Elige los meses a Diferir");
                System.out.println("1. 12 meses sin intereses");
                System.out.println("2. 18 meses sin intereses");
                res2 = scan.nextInt();
                metodo.mesesDep(res2);
                System.out.println("tu pago mensual sera de: " + metodo.mostrarMeses());
                System.out.println("Tienes un 30% de descuento en dinero electronico");
                System.out.println("Tu total es de : " +metodo.mostrar());
                System.out.println("Tu nuevo saldo en dinero electronico es: " + metodo.ValidarDep());
                break;
        }
            System.out.println("¿quieres registrar mas productos");
            System.out.println("1. si");
            System.out.println("2. no");
            res3=scan.nextInt();
    }while (res3 == 1);
}
}
