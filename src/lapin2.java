
public class lapin2 {

	public static void main(String[] args) {
		   
		  int f_0 = 2;
	      int f_1 = 2;
	      int f = 0;
	      int i = 0;
	      do {
	    	  f = f_0 + f_1;
	    	  f_0 = f_1;
	    	  f_1 = f;
	    	  i += 1;
	    	  
	      }while(f!=1000000000);
	      
	      System.out.println("on aura 1000000000 de lapins au " + i + " eme mois");

	}

}
