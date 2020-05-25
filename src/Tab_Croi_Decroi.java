import java.util.Scanner;

public class Tab_Croi_Decroi {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
		boolean croissant = true;
		boolean decroissant = true;
       
		System.out.println("Donner le nombre d'élements : ");
		int nbr = entree.nextInt();
		
		int t[] = new int[nbr];
		
		for(int i=0;i<=nbr-1;i++) {
			System.out.println("Entrer le nombre n° " + (i+1));
			t[i] = entree.nextInt();
		}
		for(int i=0;i<=nbr-1;i++) {
			if(t[i]>t[i+1]) {
				croissant = false;
			 }
			else if(t[i]<t[i+1]) {
				decroissant = false;
			 }
		}
		if((croissant)&&(!decroissant)) {
			System.out.println("le tableau est croissant ");
		}
		else if((!croissant)&&(decroissant)) {
			System.out.println("le tableau est decroissant ");
		}
		else {
			System.out.println("le tableau est quelconque ");
		}
	}

}
