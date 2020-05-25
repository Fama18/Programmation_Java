import java.util.Scanner;

public class Plus_Grand_Nombre {

	public static void main(String[] args) {
		
     int nbr = 10;
     
     Scanner entree = new Scanner(System.in);
     
     System.out.println("Entrer le premier nombre : ");
     int val = entree.nextInt();
     
     int indice_Plus_Grand = 1;
     
     int max = val;
     int i = 2;
     
     for(i=2;i<=nbr;i++) {
    	 System.out.println("Entrer le nombre numero " + i);
    	 int nb = entree.nextInt();
    	 if(nb>max) {
    		 indice_Plus_Grand = i;
    		 max = nb;
    	    }
         }
     System.out.println("le plus grand nombre est : " + max);
     System.out.println("c'est le numero : " + indice_Plus_Grand);
      
	}

}
