import java.util.Scanner;

public class Operation_Arithmetic {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
		
        String str = entree.nextLine();
		System.out.println("Donner le premier nombre : ");
		int a = entree.nextInt();
		System.out.println("Donner l'operateur : ");
		char op = str.charAt(0);
		System.out.println("Donner le deuxieme nombre : ");
		int b = entree.nextInt();
		
		switch(op) {
		case '+' : System.out.println("l'addition de a par b est : " + (a + b));
		case '-' : System.out.println("la soustraction de a par b est : " + (a - b));
		case '*' : System.out.println("la multiplication de a par b est : " + (a * b));
		case '/' : if(b==0) {
			                System.out.println("division impossible");
		                    }
		           else {
		        	   System.out.println("la division de a par b est : " + (a / b));
		                 }
		default : 
			     System.out.println("operation impossible");
		           }

	}

}
