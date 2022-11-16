7

import java.util.*;
public class Arreglos{
	static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
		int val [] = new int [5];
		int a;
		for(int x=0;x<=4;x++){
			System.out.println ("Ingresa el valor "+x);
			val[x]=in.nextInt();
			
		} 
		for(int y=0;y<5;y++){
			System.out.println ("");
			for(int q=1;q<=10;q++){
				System.out.println (val[y]+" x "+ q +" = "+ (val[y]*q));
			}
		}
}
}