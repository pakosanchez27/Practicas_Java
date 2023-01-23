public class Metodos {
	int aa[] = new int [10]; 
    int B [] = new int [10];
    int I [] = new int [10];
    //Arreglo al cuadrado
    int C[] = new int [5]; 
	void llenarr (int valor, int i) {
		aa[i] = valor;
	}
	void imprimirr () {
		for (int i = 0; i<10; i++){
			System.out.print ("\t" + aa[i]);
		}
	}
	void inverso () {
		for (int i = 10 - 1; i >= 0 ; i--){
		   System.out.print("\t"+ aa[i]);	
		}
	}
		void par_impar () {
		int conteo_pares=0, conteo_impares=0;
		for (int i = 0; i<10; i++){
			if (aa[i] %2==0) {
				conteo_pares++;
		 	} else {
		 		conteo_impares++;
		 	}
		}
		conteo_pares=0; 
		conteo_impares=0;
		for (int i = 0; i<10; i++) {
			if (aa[i] % 2==0) {
				B[conteo_pares] = aa[i];
				conteo_pares++;
			} else { I[conteo_impares] = aa[i];
				conteo_impares++;
		    }
		}
		System.out.println ("Arreglo de numeros pares ingresados");
		for (int i = 0; i<conteo_pares; i++) {
			System.out.print ("\t"+B[i]);
		}
		System.out.println ("");
		
		System.out.println ("Arreglo de numeros impares ingresados");
		for (int i = 0; i<conteo_impares; i++) {
			System.out.print ("\t"+I[i]);
		}
	}
	void impriC () {
		for (int i = 0; i<5; i++){
			System.out.print ("\t" + aa[i]);
		}
	}
	void impric () {
		for (int i = 0; i<5; i++) {
			for (int b = 1; b<=5; b++) {
				
			}
			System.out.print ("\t" + (aa[i]*aa[i]));
				
		}
	}
	
}