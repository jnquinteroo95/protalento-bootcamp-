package clase3;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese una opcion:"
				+ "1 - alta"
				+ "2 - baja "
				+ "3 - modif");
		int opcion = teclado.nextInt();
	
		
		switch (opcion) {
		case 1:
			System.out.println("Alta");
			break;
		case 2:
			System.out.println("Baja");
			break;
		case 3:
			System.out.println("Modif");
			break;
		default:
			System.out.println("Ninguna");	
			break;
		}
		
		teclado.close();
		
	}
}
