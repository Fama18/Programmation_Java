import java.util.Scanner;

public class Date_valide {

	public static void main(String[] args) {
		
        Scanner entree = new Scanner(System.in);
		
		System.out.println("Donner le jour : ");
		int jour = entree.nextInt();
		System.out.println("Donner le mois : ");
		int mois = entree.nextInt();
		System.out.println("Donner l'annee : ");
		int annee = entree.nextInt();
		
		boolean temp = true;
		int max = 31;
		
		if((annee>=1000)&&(annee<=2020)) {
			                              switch(mois) {
						                              case 1 : 
						                              case 3 : 
						                              case 5 : 
						                              case 7 :
						                              case 8 :
						                              case 10 :
						                              case 12 : max = 31;
						                              break;
						                              
						                              case 4:
						                              case 6:
						                              case 9:
						                              case 11: max = 30;
						                              break;
						                              
						                              case 2: max = 28;
						                              break;
						                              
						                              default: temp = false;
			                            	  
			                                           }
			    if(temp && ((jour >= 1) && (jour <= max))) {
			                                        System.out.println("la date est valide");
			                                      }
			    else {
			    System.out.println("la date est invalide");
			    }                      	  
		       }
		else {
			System.out.println("Donner une annee valide");
		}

	}

}
