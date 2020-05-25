import java.util.Scanner;

public class Nombre_Parfait {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Donner un nombre :");
		int nombre = entree.nextInt();
		
		int somme = 0;
	
		for(int i=1;i<=(nombre/2);i++) {
			                     int reste = nombre%i;
			                    		 if(reste==0) {
			                    			 somme += i;
			                    		 }
			
		                      }
		if(somme==nombre) {
			           System.out.println(nombre + " est parfait ");
		                 }
		else {
			System.out.println(nombre + " n'est pas parfait ");
		     }
	}

}
