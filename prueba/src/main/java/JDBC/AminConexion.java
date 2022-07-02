package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import exceptions.GenericException;

public class AminConexion {
	
	public static Connection obtenerConexion() throws GenericException {
		String host = "localhost";
		String user = "root";
		String password = "root";
		String dbName = "prueba_tecnica_itsense";
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://"+host+"/"+dbName+"?serverTimeZone=UTC&userSSL=false";
		
	
		
		try {
			Class.forName(driverName);
			
			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
			
		}catch (SQLException sqe) {
			throw new GenericException("No se ha podido conectar a: " + url, sqe);
		}catch(ClassNotFoundException cnfe) {
			throw new GenericException("No se ha encontrado el driver:" + driverName,cnfe);
		}
	}
	
	public static void main(String[] args) throws GenericException {
		obtenerConexion();
	}
	
	
}
