import java.util.Scanner;

public class Distance2Points {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Donner l'abscisse du point A : ");
		float x1 = entree.nextFloat();
		System.out.println("Donner l'ordonne du point A : ");
		float y1 = entree.nextFloat();
		System.out.println("Donner l'abscisse du point B : ");
		float x2 = entree.nextFloat();
		System.out.println("Donner l'ordonne du point B : ");
		float y2 = entree.nextFloat();
		
		float distance = (float) Math.sqrt((x1-x2)*2 + (y1-y2)*2);
        System.out.println("la distance entre le point A et le point B est " + distance);
	}

}
