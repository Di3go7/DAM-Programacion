package dam_Comienzo;

public class ut02_2G4_NotasAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
double arr_notasalum[]=new double[15];
		
		arr_notasalum[0]=4.6;
		arr_notasalum[1]=5.9;
		arr_notasalum[2]=5;
		arr_notasalum[3]=9.3;
		arr_notasalum[4]=1.2;
		arr_notasalum[5]=6;
		arr_notasalum[6]=9.8;
		arr_notasalum[7]=1;
		arr_notasalum[8]=5.4;
		arr_notasalum[9]=5.4;
		arr_notasalum[10]=3.4;
		arr_notasalum[11]=5.2;
		arr_notasalum[12]=8.5;
		arr_notasalum[13]=7.4;
		arr_notasalum[14]=2.4;
		
		
		
		double notabaja=-100;
		double notaalta=100;
		
		System.out.print("La nota mas alta de la clase es: ");
			for (int n=0 ; n<arr_notasalum.length; n++) {
				if (notabaja<arr_notasalum[n]) {
					notabaja=arr_notasalum[n];
				}
			}
			System.out.print(notabaja);
			
			System.out.println();
			System.out.print("La nota mas alta de la clase es: ");
			for (int n=0 ; n<arr_notasalum.length; n++) {
				if (notaalta>arr_notasalum[n]) {
					notaalta=arr_notasalum[n];
				}
			}
			System.out.print(notaalta);
			
	
	}
	
	

}
