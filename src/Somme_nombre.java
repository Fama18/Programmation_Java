import java.util.Scanner;

public class Somme_nombre {

	public static void main(String[] args) {
	     Scanner entree = new Scanner(System.in);
	     
	        int somme = 0;
			
			System.out.println("Donner un nombre : ");
			int nombre = entree.nextInt();
			
			for(int i=1;i<=nombre;i++) {
				somme += i;
			}
			System.out.println("la somme des entiers de 1 à " + nombre + " est " + somme);

	}

}
