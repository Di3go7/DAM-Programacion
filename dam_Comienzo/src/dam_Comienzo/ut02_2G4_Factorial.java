package dam_Comienzo;
import java.util.Scanner;

public class ut02_2G4_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner entradanum=new Scanner(System.in);
		
		System.out.println("Introduce el numero a factorizar: ");
		
		int facnum=entradanum.nextInt();
		int factorial=1;
		
		for (int i=2; i<facnum+1 ; ++i) {
		
			factorial=i*factorial;
			
			
		}
		
		
		System.out.println("El factorial de " + facnum + " es " + factorial);
		
		
	}

}
