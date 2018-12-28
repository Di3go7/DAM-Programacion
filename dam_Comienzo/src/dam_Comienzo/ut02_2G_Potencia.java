package dam_Comienzo;
import java.util.Scanner;

public class ut02_2G_Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	Scanner entrada=new Scanner(System.in);
	int  base=entrada.nextInt();
	int  exponente=entrada.nextInt();
	double resultado=Math.pow(base, exponente);
	
	
	System.out.println("La base " + base + " elevado a " + exponente + " es: " + (int)resultado );
		
		
		
		
		
	}
	
}
