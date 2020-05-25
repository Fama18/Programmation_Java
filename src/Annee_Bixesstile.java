import java.util.Scanner;

public class Annee_Bixesstile {

	public static void main(String[] args) {
Scanner entree = new Scanner(System.in);
		
		System.out.println("Donner le jour : ");
		int jour = entree.nextInt();
		System.out.println("Donner le mois : ");
		int mois = entree.nextInt();
		System.out.println("Donner l'annee : ");
		int annee = entree.nextInt();
		
		if((annee%4==0)&&((annee%100!=0)||(annee%400==0))) {
			System.out.println("l'annee est bissextile");
			
		   }
		else {
			System.out.println("l'annee n'est pas bissextile");
		}

	}

}
