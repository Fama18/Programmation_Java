import java.util.Scanner;

public class Pgdc {	
	
	public static int pgcdc(int a, int b) {
		 
		int pgdc;
		
		        while(a!=b) {
		        	if(a>b) {
		        		a -= b;
		        	    }
		        	else {
		        		b -= a;
		        	}
		        	
		        }
		        pgdc = a;
		     return pgdc;
	     }

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		int c;
		  
		   System.out.println("Donner la valeur de a : ");
		   int a = entree.nextInt();
		   System.out.println("Donner la valeur de b : ");
		   int b = entree.nextInt();
		   
		   c=pgcdc(a,b);
		   
		   System.out.println("le PGCD de (" + a +  " , " + b + ") est : " + c);

	}

}
