import java.util.Scanner;

public class Resistance {

	public static void main(String[] args) {
		    Scanner entree = new Scanner(System.in);
		    System.out.println("Entrer la valeur de R1 : ");
		    float R1 = entree.nextFloat();
		    System.out.println("Entrer la valeur de R2 : ");
		    float R2 = entree.nextFloat();
		    System.out.println("Entrer la valeur de R3 : ");
		    float R3 = entree.nextFloat();
 
		    float Rserie = R1+R2+R3;
		    float Rparallele = (R1*R2*R3) / (R1*R2 + R2*R3 + R1*R3);
		    
		    System.out.println("la resistance en serie est : " + Rserie);
		    System.out.println("la resistance en parallele est : " + Rparallele);
	}

}
