package tp;

import java.util.Scanner;


public class Ejercicio2 {

	public static void main(String[] args) {
	

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de estudiantes: ");
		int TotEst = teclado.nextInt();	
		while (TotEst<0) {

			System.out.println("La cantidad no es válida.");
			System.out.println("Ingrese la cantidad de estudiantes: ");
			TotEst = teclado.nextInt();
		}

		System.out.println("Ingrese la cantidad de exámenes realizados: ");
		int TotExm = teclado.nextInt();
		while (TotExm<0) {

			System.out.println("La cantidad no es válida.");
			System.out.println("Ingrese la cantidad de exámenes realizados: ");
			TotExm = teclado.nextInt();
		}


		int CantCol = (TotExm+3);


		Object [][] DatosEst = new Object [TotEst][CantCol];

		for (int i = 0; i<TotEst; i++) {
			for (int j = 0; j < CantCol-1; j++) {
				if (j == 0) {
					System.out.println("Ingrese el nombre del estudiante número "+(i+1)+": ");
					DatosEst[i][j] = teclado.next();
				}
				if (j == 1) {
					System.out.println("Ingrese el apellido del estudiante número "+(i+1)+": ");
					DatosEst[i][j] = teclado.next();
				}
				if (j >= 2) {
					System.out.println("Ingrese las notas de los exámenes realizados: ");
					DatosEst[i][j] = teclado.nextDouble();
				}
			}
		}

		teclado.close();

		double SumNotas=0;

		// Double NotaMayor=0.0;
		for (int i=0;i<DatosEst.length;i++) {
			for ( int j=0;j<CantCol;j++) {
				//System.out.println(DatosEst[i][j]);

				if (j>=2 && j<CantCol-1) {
					SumNotas=SumNotas+Double.parseDouble(DatosEst[i][j].toString());
				}else if (j == CantCol-1) {
					DatosEst[i][j]=SumNotas/TotExm;
					SumNotas=0;
				}
				

			}


		}

		int j = CantCol-1;
		double auxiliar = 0;
		String auxiliarNombre = "";
		String auxiliarApellido = "";

		for (int k = 1; k < DatosEst.length; k++) {

			for (int i = 0; i < DatosEst.length-k; i++) {

				if(Double.parseDouble(DatosEst[i][j].toString()) > Double.parseDouble(DatosEst[i+1][j].toString()) ) {
					auxiliar = Double.parseDouble(DatosEst[i][j].toString());
					auxiliarNombre = DatosEst[i][0].toString();
					auxiliarApellido = DatosEst[i][1].toString();
					DatosEst[i][j] = DatosEst[i+1][j];
					DatosEst[i][0] = DatosEst[i+1][0];
					DatosEst[i][1] = DatosEst[i+1][1];					
					DatosEst[i+1][j] = auxiliar;
					DatosEst[i+1][0] = auxiliarNombre;
					DatosEst[i+1][1] = auxiliarApellido;





				}

			}
		}

		System.out.println("Mejor calificación: \nNombre: "+ DatosEst[TotEst-1][0]+ " \nApellido: "+ DatosEst[TotEst-1][1]+" \nPromedio Definitivo: "+DatosEst[TotEst-1][CantCol-1]);
		System.out.println("==========================================");
		System.out.println("Peor calificación: \nNombre: "+ DatosEst[0][0]+ " \nApellido: "+ DatosEst[0][1]+" \nPromedio Definitivo: "+DatosEst[0][CantCol-1]);
		
		
		
		System.out.println("==========================================");
		System.out.println("GENERAL");
		System.out.println("==========================================");
		for (int i=0;i<DatosEst.length;i++) {
			for ( int m=0;m<CantCol;m++) {
					
				
			}
			if (Double.parseDouble(DatosEst[i][CantCol-1].toString()) >= 7) {
				System.out.print(DatosEst[i][0] + " " + DatosEst[i][1] + " ==> PROMOCIONADO " + " \nPromedio Definitivo: " + DatosEst[i][CantCol-1]);
				System.out.println("\n==========================================");
			}else {
				System.out.print(DatosEst[i][0] + " " + DatosEst[i][1] + " ==> NO PROMOCIONADO " + " \nPromedio Definitivo" + DatosEst[i][CantCol-1]);
				System.out.println("\n==========================================");
			}
			System.out.println("");
		}



	}

}
