import java.util.Scanner;

public class Somme_Prix_Article {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
	     
	     System.out.println("Entrer le prix du premier article : ");
	     int prix = entree.nextInt();
	     
	     int somme = 0;
	     
	     while(prix!=0) {
	    	 somme += prix;
	    	 System.out.println("Entrer le prix de l'article suivant (0 si Fin) : ");
	         prix = entree.nextInt();
	     }
	     
     System.out.println("la somme des prix des articles est " + somme);
	}

}
