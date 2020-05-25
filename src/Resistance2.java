import java.util.Scanner;

public class Resistance2 {

	public static void main(String[] args) {
		 Scanner entree = new Scanner(System.in);
		    System.out.println("Entrer la valeur de R1 : ");
		    float R1 = entree.nextFloat();
		    System.out.println("Entrer la valeur de R2 : ");
		    float R2 = entree.nextFloat();
		    System.out.println("Entrer la valeur de R3 : ");
		    float R3 = entree.nextFloat();
		    System.out.println("Entrer le numero de choix(1 ou 2) : ");
		    int choix = entree.nextInt();
		    
		    if(choix==1) {

		                float R = R1+R2+R3;
		                System.out.println("la resistance est en serie, sa valeur est : " + R);
		                }
		    else if(choix==2) {
		    	        float R = (R1*R2*R3) / (R1*R2 + R2*R3 + R1*R3);
                        System.out.println("la resistance est en parallele, sa valeur est : " + R);
                           }

}
}