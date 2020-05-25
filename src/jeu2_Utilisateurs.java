import java.util.Scanner;

public class jeu2_Utilisateurs {

	public static void main(String[] args) {
		 Scanner entree = new Scanner(System.in);
		 
		 System.out.println("Entrer la valeur saisie par le premier utilisateur : ");
		 int a = entree.nextInt();
		 
		 System.out.println("Entrer la valeur saisie par le second utilisateur : ");
		 int b = entree.nextInt();
		 int i = 1;
		 
		 while(a!=b) {
			 if(b > a) {
				 System.out.println("plus grand que le nombre recherché");
				 
			   }
			 else {
				 System.out.println("plus petit que le nombre recherché");
			   }
			 i += 1;
			 System.out.println("Entrer un autre nombre : ");
			 b = entree.nextInt();
		 }
		 
		 System.out.println("Vous avez trouvé le nombre apres " + i + " tentatives");

	}

}
