import java.util.Scanner;

public class Div_Soustrac_Successif {

	public static void main(String[] args) {
       Scanner entree = new Scanner(System.in);
		int quotient = 0;
		System.out.println("Donner le dividende : ");
		int a = entree.nextInt();
		System.out.println("Donner le diviseur : ");
		int b = entree.nextInt();
		
		while(a>=b) {
			a -=b;
			quotient += 1;
		}
		System.out.println("la division de a par b est : " + quotient);

	}

}
