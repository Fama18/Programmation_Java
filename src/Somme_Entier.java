import java.util.Scanner;

public class Somme_Entier {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
		int somme = 0;
		for(int i=1;i<=5;i++) {
			     System.out.println("Donner le " + i + "éme nombre");
			     int nombre = entree.nextInt();
			     somme += nombre;
	   }
	   System.out.println("la somme des 5 nombres est : " + somme);

}
}
