package practica_4;

public class Avion extends Volador implements Aterrizable {

	private Integer CantAsientos;
	private String Modelo;
	
	public Avion (String Nombre,
				Integer CantAsientos,
				String Modelo) {
	super(Nombre);
	
	this.CantAsientos = CantAsientos;
	this.Modelo = Modelo;
	
	
	}

	public Integer getCantAsientos() {
		return CantAsientos;
	}

	public void setCantAsientos(Integer cantAsientos) {
		CantAsientos = cantAsientos;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public void aterriza() {
		System.out.println("El avion puede aterrizar en la pista");
		
	}

	public void no_aterriza() {
		
		
	}
}
