package clase4;

import java.util.Scanner;

public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double horas, semanas, dias, minutos;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de horas: ");
		horas = teclado.nextDouble();
		
		semanas = horas/168;
		dias = horas/24;
		minutos = horas * 60;
		
		teclado.close();
	
		System.out.println("La cantidad de horas totales es: "+ horas);
		System.out.println("Semanas: "+ semanas);
		System.out.println("Días: "+ dias);
		System.out.println("Minutos: "+ minutos);
		
		
		 

	}

}
