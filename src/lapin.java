
public class lapin {

	public static void main(String[] args) {
		
      int f_0 = 2;
      int f_1 = 2;
      int f = 0;
      
      for(int i = 2;i<=12;i++) {
    	  f = f_0 + f_1;
    	  f_0 = f_1;
    	  f_1 = f;
      }
      System.out.println("Au bout de 12 mois on aura " + f + " lapins");
	}

}
