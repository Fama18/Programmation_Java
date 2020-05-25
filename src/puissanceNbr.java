import java.util.Scanner;

public class puissanceNbr {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Donner la valeur de x : ");
		float x = entree.nextFloat();
		System.out.println("Donner la valeur de n : ");
		int n = entree.nextInt();
		float puissance_x = (float) Math.pow(x, n);
		System.out.println("x puissance n egal " + puissance_x);
		

	}

}
