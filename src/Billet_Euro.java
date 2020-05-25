import java.util.Scanner;

public class Billet_Euro {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Entrer un montant : ");
		int montant = entree.nextInt();
		
		int billet_20 = montant/20;
		int reste = montant%20;
		
		int billet_10 = reste/10;
		reste = reste%10;
		
		int billet_5 = reste/5;
		reste = reste%5;
		
		int piece_2 = reste/2;
		reste = reste%2;
		
		int piece_1 = reste;
		
		System.out.println(montant + " décomposé en euros donne : ");
		System.out.println(billet_20 + " billets de 20");
		System.out.println(billet_10 + " billets de 10");
		System.out.println(billet_5 + " billets de 5");
		System.out.println(piece_2 + " pieces de 2");
		System.out.println(piece_1 + " pieces de 1" );

	}

}
