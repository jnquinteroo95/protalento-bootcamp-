package tp;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		
	
		String nombre = new String();
		String apellido = new String();
		String NumExamen = new String();
		double cantidad, nota, promedio;
		int totalest;
	
		Scanner teclado = new Scanner(System.in);
		totalest = teclado.nextInt();
		System.out.println("Ingrese la cantidad de estudiantes: ");
		
		teclado.close();
		

		System.out.println("Ingresó "+totalest+" estudiantes.");
		
		
	}

}
