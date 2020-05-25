import java.util.Scanner;

public class Duree_Vol {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Donner l'heure de depart : ");
		int h_depart = entree.nextInt();
		System.out.println("Donner les minutes de depart : ");
		int min_depart = entree.nextInt();
		System.out.println("Donner l'heure d'arrive : ");
		int h_arrive = entree.nextInt();
		System.out.println("Donner les minutes de d'arrive : ");
		int min_arrive = entree.nextInt();
		
		if(h_arrive>h_depart) {
			                   if(min_arrive>min_depart) {
			                	                     int h_duree = h_arrive - h_depart;
			                	                     int min_duree = min_arrive - min_depart;
			                	                     System.out.println("la duree du vol est  " + h_duree + " : " + min_duree);
			                                        }
			                   else {
			                	     int h_duree = h_arrive - h_depart - 1;
			                	     int min_duree = min_arrive + 60 - min_depart;
			                	     System.out.println("la duree du vol est  " + h_duree + " : " + min_duree);
			                        }
			                   
		                      }
		else {
					if(min_arrive>min_depart) {
		                int h_duree = h_arrive - h_depart + 24;
		                int min_duree = min_arrive - min_depart;
		                System.out.printf("la duree du vol est  " + h_duree + " : " + min_duree);
		               }
					else {
						int h_duree = h_arrive - h_depart +24 - 1;
						int min_duree = min_arrive + 60 - min_depart;
						System.out.println("la duree du vol est  " + h_duree + " : " + min_duree);
                         }
		     }

	}

}
