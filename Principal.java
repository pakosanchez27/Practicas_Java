package Actividad_4;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Metodos metodo = new Metodos();

        int res, res2, nip,  contador = 1;
        do {
            System.out.println("Bienvenido a BBVA");
            System.out.println("Ingresa tu nip");
            nip = scan.nextInt();
            metodo.ValidacionNip(nip);

            contador++;
        }while (contador <= 3 && metodo.ValidacionNip(nip) == false);

        if (metodo.ValidacionNip(nip) == true){
            do {
                System.out.println("Bienvenido a tu cuenta");
                System.out.println("¿Que deseas hacer?");
                System.out.println("1.Abono");
                System.out.println("2.Consulta");
                System.out.println("3.Retiro");
                System.out.println("4.Tranferecia");
                res = scan.nextInt();
                metodo.ValidacionMenu(res);
                System.out.println("¿Quieres realizar otra operación?");
                System.out.println("1.Si");
                System.out.println("2.NO");
                res2 = scan.nextInt();
            } while ( res2 == 1);

        }else{
            System.out.println("Adios");
        }
    }

}
