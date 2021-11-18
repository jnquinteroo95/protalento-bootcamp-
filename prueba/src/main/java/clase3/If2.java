package clase3;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese edad");
		
		int edad = teclado.nextInt();
		
		if (edad >= 18) {
			
			System.out.println("Mayor de edad");
			
		}else {
			System.err.println("Menor de edad");
			
		}
		teclado.close();
	}
}
