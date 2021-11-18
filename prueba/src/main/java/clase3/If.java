package clase3;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
	String usuario;
	String contrasenia; 
	
	usuario = "jose";
	contrasenia = "12345";
	
	if (usuario == "admin" && contrasenia == "1234") {
		System.out.println("ok");
	
		} else {
			System.out.println("fail");
		}
	
	}
}

