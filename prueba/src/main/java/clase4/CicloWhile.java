package clase4;

public class CicloWhile {

	public static void main(String[] args) {
		
		short[] edades = new short[] {5,10,25};
		int i = 0;
		
		while(i<edades.length) {
			System.out.println("Posición: " + i + ", Valor: " + edades[i]);
			i++; 
		}
		System.out.println("---------------------------------------");
		
		i=edades.length-1; 
		while(i>=0) {
			System.out.println("Posición: " + i + ", Valor: " + edades[i]);
			i--;
		}
		}
	
	}
