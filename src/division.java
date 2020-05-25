import java.util.Scanner;

public class division {
           
	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		System.out.println("Entrer la valeur de a : ");
	    int a = entree.nextInt();
	    System.out.println("Entrer la valeur de b : ");
	    int b = entree.nextInt();
	    int quotient = a/b;
	    int reste = a%b;
	    float ratio = (float)a/(float)b;
	    System.out.println("le quotient est " + quotient);
	    System.out.println("le reste est " + reste);
	    System.out.println("le quotient réel est " + ratio);
	}

}
