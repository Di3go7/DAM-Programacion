package dam_Comienzo;

import java.util.Scanner;

public class ut02_2G4_AnnoBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entradaanno=new Scanner(System.in);
		System.out.println("Introduce el a�o que quiera para ver si es bisiesto: ");
		
		int annointroducido=entradaanno.nextInt();
		
		int restocuatro=annointroducido%4;
		int restocien=annointroducido%100;
		
		//System.out.println(restocuatro);
		//System.out.println(restocien);
		
		if ( restocuatro==0 ) {
			if (restocien!=0) {
				System.out.println("El a�o es bisiesto");
				
			}
			
		} else {
			
			System.out.println("El a�o no es bisiesto");
		}
		
		
		

	}

}
