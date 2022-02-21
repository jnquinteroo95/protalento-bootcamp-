package practica_4;

public class Helicoptero extends Volador implements Aterrizable{
	
	private Integer CantPasajeros;
	private String Modelo;
	private String Color;
	
	public Helicoptero (String Nombre,
					Integer CantPasajeros,
					String Modelo,
					String Color) {
		super(Nombre);
		
		this.CantPasajeros = CantPasajeros;
		this.Modelo = Modelo;
		this.Color = Color;
	}

	public Integer getCantPasajeros() {
		return CantPasajeros;
	}

	public void setCantPasajeros(Integer cantPasajeros) {
		CantPasajeros = cantPasajeros;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public void aterriza() {
		System.out.println("El Helicoptero puede aterrizar en la pista");
		
	}

	public void no_aterriza() {
		
	}

	
}
