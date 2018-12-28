package dam_Comienzo;

public class ut02_2G_Planetas {
	
	public enum planetas  { Mercurio,
		Venus, 
		Tierra, 
		Marte, 
		Júpiter, 
		Saturno, 
		Urano, 
		Neptuno };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println ("El numero de planetas del sistema solar son " + planetas.values().length);
		System.out.print("Que son: ");
		
		 for (planetas forplanetas : planetas.values()){

			 System.out.print(forplanetas + ", ");
			 
		 }
		 System.out.println();
		 
		 for (planetas forplanetas : planetas.values()){
			 
			 System.out.println("En " + (forplanetas.ordinal()+1) + " posición: " + forplanetas);
			 
		 }
		 
//
		
		
		
	}

}
