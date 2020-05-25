import java.util.Scanner;

public class PuissanceVersion2 {

	public static void main(String[] args) {
	Scanner entree = new Scanner(System.in);
		
		System.out.println("Donner la valeur de x : ");
		float x = entree.nextFloat();
		System.out.println("Donner la valeur de n : ");
		int n = entree.nextInt();
		float puissance_x = 1;
		   for(int i=1;i<=n;i++) {
			        puissance_x = puissance_x * x;
		   }
		 
		System.out.println("x puissance n egal " + puissance_x);

	
	  }
}
