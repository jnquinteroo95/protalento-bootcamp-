package fechas;

import java.util.Scanner;

public class Semana2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese una fecha formato dd/mm/aaaa");
		System.out.println("************************************************");
		System.out.println("Ingrese el día: ");
		int d = teclado.nextInt();
		System.out.println("Ingrese el mes: ");
		int m = teclado.nextInt();
		System.out.println("Ingrese el año: ");
		int a = teclado.nextInt();

		if (a >= 1990 && a <= 2099) {
			if (m >= 1 && m <= 12) {
				if (m == 2) {
					if (d >= 1 && d <= 28) {
						System.out.println("La fecha ingresada es: " + d + " / " + m + " / " + a);
					} else {
						System.out.println("Día no válido");
					}
				} else {
					if (d >= 1 && d <= 30) {
						System.out.println("La fecha ingresada es: " + d + " / " + m + " / " + a);
					} else {
						System.out.println("Día no válido");
					}
				}

			} else {
				System.out.println("Mes no válido");
			}

		} else {
			System.out.println("Año no válido");

		}
		teclado.close();
	}
}
