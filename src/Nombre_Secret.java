import java.util.Scanner;

public class Nombre_Secret {
	
	public static  void test(int a, int b) {
		Scanner entree = new Scanner(System.in);
		
		int i = 1;
		while(a!=b) {
			 if(b > a) {
				 System.out.println("Trop grand");
				 
			   }
			 else {
				 System.out.println("Trop petit");
			   }
			 i += 1;
			 System.out.println("Entrer un autre nombre : ");
			 b = entree.nextInt();
		 }
		System.out.println("Vous avez trouvé le nombres apres " + i + " tentatives");
		
	    }

	public static void main(String[] args) {
		
		Scanner entree = new Scanner(System.in);
		 
		 System.out.println("Entrer la valeur saisie par le premier utilisateur : ");
		 int a = entree.nextInt();
		 
		 System.out.println("Entrer le nombre déviné par le second utilisateur : ");
		 int b = entree.nextInt();
		 
		 test(a,b);

	}

}
