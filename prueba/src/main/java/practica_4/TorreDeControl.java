package practica_4;

public class TorreDeControl {

	public static void main(String[] args){
	
Avion avion = new Avion("Avion",180,"A320");
Helicoptero helicoptero = new Helicoptero("Helicoptero",3,"Apache","Vinotinto");
Superman superman = new Superman("Superman","Negro","Azul");
Ovni ovni = new Ovni("Ovni","Saturno",2);

avion.aterriza();
helicoptero.aterriza();
ovni.no_aterriza();
superman.no_aterriza();
}
}
