package practica_4;

public class Ovni extends Volador implements Aterrizable{
	
	private String PlanetaOrigen;
	private Integer CantAsientos;
	
	
	public Ovni (String Nombre,
				String PlanetaOrigen,
				Integer CantAsientos) {
		
		super(Nombre);
		
		this.PlanetaOrigen = PlanetaOrigen;
		this.CantAsientos = CantAsientos;
	}

	public String getPlanetaOrigen() {
		return PlanetaOrigen;
	}

	public void setPlanetaOrigen(String planetaOrigen) {
		PlanetaOrigen = planetaOrigen;
	}

	public Integer getCantAsientos() {
		return CantAsientos;
	}

	public void setCantAsientos(Integer cantAsientos) {
		CantAsientos = cantAsientos;
	}

	public void aterriza() {
		
		
	}

	public void no_aterriza() {
		System.out.println("El Ovni no puede aterrizar en la pista");
		
	}

	
	
}
