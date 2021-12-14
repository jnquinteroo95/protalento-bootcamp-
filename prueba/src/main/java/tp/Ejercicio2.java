package tp;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		String nombre = new String();
		String apellido = new String();
		String NumExamen = new String();
		double cantidad, nota, promedio;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de estudiantes: ");
		
		int TotEst = teclado.nextInt();
		while (TotEst<0) {
			System.out.println("La cantidad no es válida.");
			System.out.println("Ingrese la cantidad de estudiantes: ");
				TotEst = teclado.nextInt();
		}
		System.out.println("Ingresó "+TotEst+" estudiantes.");
				
		String[] nombres = new String[TotEst];
		String[] apellidos = new String[TotEst];
		
		
		for(int i=0;i < nombres.length ; i++) {
			System.out.println("Ingrese nombre del estudiante número "+(i+1));
			nombres[i] = teclado.next();
			System.out.println("Ingrese apellido del estudiante número "+(i+1));
			apellidos[i] = teclado.next(); 
			
		}
		
		
	
		System.out.println("Ingrese la cantidad de examenes: ");
		int TotExm=teclado.nextInt();
		
		while (TotExm<0) {
			System.out.println("La cantidad no es válida.");
			System.out.println("Ingrese la cantidad de examenes: ");
				TotExm = teclado.nextInt();
		}
			
			double[] notas = new double[TotExm];
						
	
			for (int i=0;i <TotExm; i++) {
				System.out.println("Ingrese la calificacion del examen " +(i+1) +" del estudiante "+nombres[i]+" "+apellidos[i]);
				notas[i]=teclado.nextDouble();
				}
			}

	}


		

