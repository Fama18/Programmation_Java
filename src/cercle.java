import java.util.Scanner;

public class cercle {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		System.out.println("Entrez le rayon : ");  //pour afficher
		float r = entree.nextFloat();
		float PI = (float) (4*Math.atan(1));
		float surface = (float) (Math.PI*r*r);
		float perimetre= (float) (2*PI*r);
		
		System.out.println("le cercle dont le rayon est " + r + " a pour surface " + surface);
		System.out.println("Son perimetre est : " + perimetre);

	}

	

}
