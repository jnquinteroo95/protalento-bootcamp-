package practica_4;

public class Superman extends Volador implements Aterrizable{

	private String ColorPelo;
	private String ColorTraje;
	
	
	public Superman (String Nombre,
					String ColorPelo,
					String ColorTraje) {
		
		super(Nombre);
		
		this.ColorPelo = ColorPelo;
		this.ColorTraje = ColorTraje;
	}

	public String getColorPelo() {
		return ColorPelo;
	}

	public void setColorPelo(String colorPelo) {
		ColorPelo = colorPelo;
	}

	public String getColorTraje() {
		return ColorTraje;
	}

	public void setColorTraje(String colorTraje) {
		ColorTraje = colorTraje;
	}

	public void aterriza() {
		
		
	}

	public void no_aterriza() {
		System.out.println("Superman no puede aterrizar en la pista");
		
	}
	
	
}
