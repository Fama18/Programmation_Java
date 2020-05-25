import java.util.Scanner;

public class Echang_Succes_Croiss {

	public static void main(String[] args) {
Scanner entree = new Scanner(System.in);
		
		System.out.println("Donner le premier nombre : ");
		int A = entree.nextInt();
		System.out.println("Donner le deuxieme nombre : ");
		int B = entree.nextInt();
		System.out.println("Donner le troisieme nombre : ");
		int C = entree.nextInt();
		
		if(A>B) {
			     int nombre = A;
			     A = B;
			     B = nombre;
		        }
		if(A>C) {
			        int nombre = A;
			        A = C;
			        C = nombre;
		            }
		if(B>C) {
					int nombre = B;
			        B = C;
			        C = nombre;
		       }
		System.out.println("A : " + A + " B : " + B + " C : " + C);
       
	}

}
