import java.util.Scanner;
public class Principal_p {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        Metodos zz = new Metodos();
		int a[]= new int[10];
        int res, res2;
        do { 
            System.out.println("Ingresa la opción que deseas");
            System.out.println("1.Ingresar 10 elementos al ARREGLO e imprimirlo al revés");
            System.out.println("2.Ingresar 10 elementos al ARREGLO e imprimir cuales son pares y cuales impares");
            System.out.println("3.Ingresar 5 elementos al ARREGLO para elevarlos al cuadrado");
            res = in.nextInt();
            switch (res) {
                case 1: System.out.println("1.Usted ha elegido la opcion  1");
					for (int i = 0; i<10; i++){
						System.out.println ("Ingrese algún valor: "+i);
						a[i]=in.nextInt();
						zz.llenarr(a[i],i);
						}
						System.out.println ("Tus valores son");
		                zz.imprimirr();
		                System.out.println (" ");
                        System.out.println ("Tus valores en forma inversa son");
                        zz.inverso();
                    break;
                case 2: System.out.println("2.Usted elegio la opcion 2"); 
					for (int i = 0; i<10; i++){
						System.out.println ("Ingrese algún valor: "+i);
						a[i]=in.nextInt();
						zz.llenarr(a[i],i);
						}
						System.out.println ("Tus valores son:");
		                zz.imprimirr();
		                System.out.println (" ");
                        zz.par_impar(); 
                        break;
                case 3: System.out.println("3.Usted ha elegido la opcion  3");
					for (int i = 0; i<5; i++){
						System.out.println ("Ingrese algún valor: "+ i);
						a[i]=in.nextInt();
						zz.llenarr(a[i],i);
						} 
						System.out.println ("Tus valores son");
		                zz.impriC();
		                System.out.println ("");
                        System.out.println ("Tus valores al cuadrado son");
                        zz.impric();
                    break;
                     default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            System.out.println (" ");
            System.out.println("¿Quieres hacer otra operacion?");
            System.out.println("1.si");
            System.out.println("2.no");
            res2 = in.nextInt();
        }while (res2 == 1);
    }
}