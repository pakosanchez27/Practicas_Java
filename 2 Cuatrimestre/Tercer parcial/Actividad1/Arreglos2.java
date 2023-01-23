
import java.util.*;
public class Arreglos2{
	public static void main (String[] args) {
		Scanner wh = new Scanner(System.in);
		int val[] = new int [10];
		int res;
		for (int i = 0; i<10; i++){
		System.out.println ("usuario ingresa tu valor numero: "+i);
		val[i] = wh.nextInt();
	
		}
		
		for (int i = 0; i<10; i++){
		
		res=val[i]%2;
		if (res==0){
			System.out.println ("el numero par es:" +val[i]);
	
		}
		
		}7
		}
	
	
	
		
}
