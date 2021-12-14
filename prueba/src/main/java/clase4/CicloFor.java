package clase4;

public class CicloFor {

	public static void main(String[] args) {
		
		float[] alturas = new float[] {1,2};
		float aux = alturas[0];
		
		for(int i=0;i< alturas.length;i++) {
			aux=alturas[i];
			System.out.println("Posición: "+i+ ", Valor: "+aux);
			
		}
	}
}