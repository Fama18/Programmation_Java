import java.util.Scanner;

public class ppmc {
	
	
	public static int ppcm(int a, int b) {
		 
		int ppmcc;
		//int x,y;
		//x = a;
		//y = b;
		        while(a!=b) {
		        	if(a<b) {
		        		a += a;
		        	    }
		        	else {
		        		b += b;
		        	}
		        	
		        }
		        ppmcc = a;
		     return ppmcc;
	     }

	public static void main(String[] args) {
		
		Scanner entree = new Scanner(System.in);
		int c;
		  
		   System.out.println("Donner la valeur de a : ");
		   int a = entree.nextInt();
		   System.out.println("Donner la valeur de b : ");
		   int b = entree.nextInt();
		   
		   c=ppcm(a,b);
		   
		   System.out.println("le PPCM de (" + a +  " , " + b + ") est : " + c);

	}

}
