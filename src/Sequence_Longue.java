import java.util.Scanner;

public class Sequence_Longue {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
	
		System.out.println("Donner le nombre d'elements du tableau : ");
        int N = entree.nextInt();
	
        
		   int t[] = new int[N];
		   int indice_seq_courant = 0;
		   int longueur_seq ;
		   int indice_seq_long;
		        
		        for(int i=0;i<=N-1;i++) {
		        	
		        	
		        	  System.out.println("Donner le " + (i + 1) + " eme entier : ");
		        	  t[i] = entree.nextInt();
		        	
		        }
		        int j = 0;
		        for(int i=0;i<=N-1;i++) {
		        	  if(t[i+1]>t[i]) {
		        		  
		        		  indice_seq_courant = i;
		        		   while((i<N)&&(t[i+1]>t[i])) {
		        			   i += 1;
		        			   j += 1;
		        		   }
		        		  
		        	  }
		        	  longueur_seq = j;
		        	  indice_seq_courant = i;
		        	  indice_seq_long = indice_seq_courant;
		        	  
		      System.out.println("La plus longue sequence est " +  t[indice_seq_long] + " à " + t[longueur_seq] +  " qui debute à la position " + 
			  indice_seq_long +  " et sa longueur est " +  longueur_seq);
		        	  
		        }
		        
		   
        
	}

}
