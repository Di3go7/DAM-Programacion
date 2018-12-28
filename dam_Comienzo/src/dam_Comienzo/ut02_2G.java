package dam_Comienzo;
import java.util.Scanner; 

public class ut02_2G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float coste_hora=8.25F;
		int coste_horaextra=12;
		
		System.out.print("Introduce el número de horas realizadas por el trabajador: ");
		Scanner scan_entrada_horas=new Scanner(System.in);
		int numero_horas=scan_entrada_horas.nextInt();
		
		if (numero_horas <= 0) System.out.println("El trabajador no ha trabajado o se ha dado una cifra erronea");
		else if (numero_horas <= 40) {
			
			System.out.println("El trabajador debe cobrar: " + (numero_horas*coste_hora) + "€");	
		} else {
			int numero_horasextra=numero_horas-40;
			int total=(int)((40*coste_hora)+(numero_horasextra*coste_horaextra));
			
			System.out.println("El trabajador debe cobrar: ");
			System.out.println("·Por horas convencionales: " + (40*coste_hora) + "€");
			System.out.println("·Por horas extraordinarias: " + (numero_horasextra*coste_horaextra) + "€");
			System.out.println("TOTAL: " + total + "€");
		}		
		scan_entrada_horas.close();
		

		
		
		
	}

}
