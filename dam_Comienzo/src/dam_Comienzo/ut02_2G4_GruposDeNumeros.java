package dam_Comienzo;

public class ut02_2G4_GruposDeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr_grpnumeros[]=new int[10];
		
		arr_grpnumeros[0]=55;
		arr_grpnumeros[1]=12;
		arr_grpnumeros[2]=34;
		arr_grpnumeros[3]=27;
		arr_grpnumeros[4]=78;
		arr_grpnumeros[5]=99;
		arr_grpnumeros[6]=98;
		arr_grpnumeros[7]=1;
		arr_grpnumeros[9]=54;
		
		
		System.out.print("Los numero de la array arr_grpnumeros con valores menores a 18 son: ");
		for (int i=0; i < arr_grpnumeros.length; i++  ) {
			if ( arr_grpnumeros[i] <= 18 ) {
				System.out.print(arr_grpnumeros[i] + ", ");			
			}
	
		}
		System.out.println();
		System.out.print("Los numero de la array arr_grpnumeros con valores entre 15 y 65 son: ");
		for (int i=0; i < arr_grpnumeros.length; i++  ) {
			if ( arr_grpnumeros[i] >= 14 ) {
				if (arr_grpnumeros[i] <65) {
					System.out.print(arr_grpnumeros[i] + ", ");	
				}	
			}
	
		}
		System.out.println();
		System.out.print("Los numero de la array arr_grpnumeros con valores mayores a 65 son: ");
		for (int i=0; i < arr_grpnumeros.length; i++  ) {
			if ( arr_grpnumeros[i] >65  ) {
				System.out.print(arr_grpnumeros[i] + ", ");			
			}
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
