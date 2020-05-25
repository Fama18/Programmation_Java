import java.util.Scanner;

public class SecondDegre {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Donner la valeur de a : ");
		int a = entree.nextInt();
		System.out.println("Donner la valeur de b : ");
		int b = entree.nextInt();
		System.out.println("Donner la valeur de c : ");
		int c = entree.nextInt();
		
		if(a==0) {
			     if(b!=0) {
			    	      System.out.println("l'equation est du premier de degre");
			    	      System.out.println("la solution est : " + (-c/b));
			              }
			     else {
			    	    System.out.println("Pas de solution");
			              }
		         }
		else {
			  float delta = (b*b) - 4*a*c;
			      if(delta>0) {
			    	          float x1 = (float) ((-b - Math.sqrt(delta))/(2*a));
			    	          float x2 = (float) ((-b + Math.sqrt(delta))/(2*a));
			    	          System.out.println("les solutions de l'equation sont : " + x1 + " et " + x2);
			                  }
			      else if(delta==0) {
			    	                System.out.println("la solution est " + (-b/(2*a)));
			                        }
			      else {
			    	  System.out.println("Pas de solution reel");
			           }
		     }
	}

}
