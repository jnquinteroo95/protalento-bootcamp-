package clase3;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {


		// SOLICITANDO LA CANTIDAD DE ALUMNOS A PROCESAR

		//Abrimos el teclado
		Scanner teclado = new Scanner(System.in);

		// pedimos la cantidad de alumnos y la guardamos en la variable cantidadAlumnos
		System.out.println("Por favor ingrese la cantidad de alumnos a procesar: ");

		int cantidadAlumnos = teclado.nextInt();

		// PARA CADA ALUMNO SE DEBERAN INGRESAR NOMBRE, APELLIDO, NUMERO DE EXAMEN Y NOTA

		// declaramos el vector para los estudiantes y los datos, donde cada fila es un estudiante
		// pos 0: estudiante 1, pos 1: estudiante 2,...
		// y las columnas pos 0: numbre, pos 1: apellido, pos 2: numero de examen, pos3: nota, pos 4: nota 2...

		// primero preguntamos cuantos examenes hubo en el periodo
		System.out.println("Por favor ingrese el número de exámenes hechos durante el periodo: ");
		int numExamenes = teclado.nextInt();

		// luego obtenemos el numero de columnas
		int cantidadColumnas = (numExamenes*2)+2;

		Object [][] datosAlumnos = new Object [cantidadAlumnos][cantidadColumnas];

		// Pedimos los datos y llenamos el vector con estos
		for (int i = 0; i<cantidadAlumnos; i++) {
		for (int j = 0; j < cantidadColumnas; j++) {
		if (j == 0) {
		System.out.println("Por favor ingrese el nombre del estudiante: ");
		datosAlumnos[i][j] = teclado.next();
		}
		if (j == 1) {
		System.out.println("Por favor ingrese el apellido del estudiante: ");
		datosAlumnos[i][j] = teclado.next();
		}
		if (j % 2 == 0 && j != 0) {
		System.out.println("Por favor ingrese el numero del examen: ");
		
		
		datosAlumnos[i][j] = teclado.nextInt();
		}
		if (j % 2 != 0 && j != 1) {
		System.out.println("Por favor ingrese la nota del examen (entre 0 y 10 inclusive)");
		datosAlumnos[i][j] = teclado.nextDouble();
		}
		}
		}

		// cerramos el teclado
		teclado.close();
		
	}
}