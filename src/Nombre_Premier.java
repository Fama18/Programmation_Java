import java.util.Scanner;

public class Nombre_Premier {
	
	public static void Premier(int a) {
		
		int b = 0;
		for(int i=2;i<=a;i++) {
			if(a%i==0) {
				b += 1;
			}
			
		}
		if(b==1) {
			System.out.println(a + " est premier");
		}
		else {
			System.out.println(a + " n'est pas premier");
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Entrer un nombre : ");
		int a = entree.nextInt();
		
		Premier(a);

	}

}
