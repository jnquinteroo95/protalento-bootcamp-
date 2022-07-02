package JDBC;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exceptions.DuplicatedException;
import exceptions.GenericException;

public abstract class JDBCBaseDao<T> {
		
protected String tabla;
	
	public JDBCBaseDao(String tabla) {
		if(tabla == null) {
			throw new IllegalArgumentException("Debe indicar la tabla del DAO");
		}
		this.tabla = tabla;
	}
	

	public abstract String getSaveSQL();
	public abstract void saveData(T entity,PreparedStatement pst) throws SQLException;
	
	public abstract String getUpdateSQL(T entity);
	public abstract void updateData(T entity, PreparedStatement st) throws SQLException;

	public void update(T entity) throws GenericException {
		
		String sql = "UPDATE " + this.tabla + " SET " +this.getUpdateSQL(entity) + " where id=?";
		
	
		int idx = getWhereIndex(sql);

		try (Connection con2 = AminConexion.obtenerConexion()) {

			try (PreparedStatement st = con2.prepareStatement(sql.toString())) {

				
				
				this.updateData(entity, st);

				

				st.execute();
			}
		} catch (GenericException ge) {
			throw new GenericException(ge.getMessage(), ge);
		} catch (SQLException se) {
			throw new GenericException(se.getMessage(), se);
		}
	}

	
	private int getWhereIndex(String sql) {
		int idx = 0;
		for(char c : sql.toString().toCharArray()) {
			if(c == '?') {
				idx ++;
			}
		}
		return idx;
	}
	
	public void save(T entity) throws DuplicatedException, GenericException {
		
		try(Connection con2 = AminConexion.obtenerConexion()) {
			
			StringBuffer sql = new StringBuffer("INSERT INTO ").append(this.tabla).append(this.getSaveSQL());
			StringBuffer sql2 = new StringBuffer("INSERT INTO ").append(this.tabla).append(this.getSaveSQL2(entity));
			
			try(PreparedStatement st = con2.prepareStatement(sql.toString(),PreparedStatement.RETURN_GENERATED_KEYS)) {
				
				this.saveData(entity, st);
				
				st.execute();
				
				try(ResultSet rs = st.getGeneratedKeys()){
					
					if(rs.next()) {
						
						Long id = rs.getLong(1);
					
					}
				}
			}			
		}catch(SQLException se) {
			if(se instanceof SQLIntegrityConstraintViolationException) {
				throw new DuplicatedException("No se ha podido insertar el articulo, integridad de datos violada",se);
			}
			throw new GenericException(se.getMessage(), se);
		}catch(GenericException ge) {
			throw new GenericException(ge.getMessage(), ge);
		}
	}
	
	public String getSaveSQL2(T entity) throws GenericException {
		StringBuilder sb = new StringBuilder();
		try {
			Field[] campos = entity.getClass().getDeclaredFields();
			sb.append("( ");
			for (int i = 0; i < campos.length; i++) { 
				campos[i].setAccessible(true);
				String fName = campos[i].getName();
				if(fName.toLowerCase().equals("id")) {
					continue;
				}
				fName = fName.replaceAll("(.)(\\p{Lu})", "$1_$2");
				
				sb.append(fName.toUpperCase() + ",");
			}
			sb.deleteCharAt(sb.length() - 1); 
			sb.append(") VALUES ("); 
			for (int i = 1; i < campos.length; i++) { 
				sb.append("?,");
			}
			sb.deleteCharAt(sb.length() - 1); 
		} catch (Exception e) {
			System.err.println(sb);
			throw new GenericException(tabla, e);
		}

		return sb.toString();
	}


	public T getByPK(Long id) throws GenericException {
		try(Connection con2 = AminConexion.obtenerConexion()) {
			try (Statement st = con2.createStatement()) {
				
				String sql = "SELECT * FROM " + this.tabla + " WHERE ID = " + id; 
				
				try(ResultSet rs = st.executeQuery(sql)) { 
					T entity = null;
					if(rs.next()) {
						entity = this.fromResultSetToEntity(rs);
					}
					return entity;
				}
			} catch (SQLException e) {
				throw new GenericException("No se pudo obtener el entity "+this.tabla+"id:"+id, e);
			}
		} catch (SQLException e) {
			throw new GenericException("No se pudo obtener el entity "+ this.tabla+" id:"+id, e);
		}
	}
	
	public List<T> findAll() throws GenericException {
		List<T> registros = new ArrayList<>();
		String sql = "SELECT * FROM " + this.tabla;
		try(
				Connection con2 = AminConexion.obtenerConexion();
				Statement st = con2.createStatement();
				ResultSet rs = st.executeQuery(sql);
			) {
			while(rs.next()) {
				T entity = this.fromResultSetToEntity(rs);
				registros.add(entity);
			}					
		} catch (SQLException e) {
			throw new GenericException("Error ejecutando: " +sql, e);
		}
		return registros;
	}
	
	
	public void delete(Long id) throws GenericException {
		String sql = "DELETE FROM " +this.tabla+ " WHERE ID = " + id;
		
		try (
				Connection con2 = AminConexion.obtenerConexion();
				Statement st = con2.createStatement();
		) {
			st.executeUpdate(sql);
		}catch(GenericException ge) {
			throw new GenericException(sql, ge);
		}catch(SQLException se) {
			throw new GenericException(sql, se);
		}
	}
	

	public abstract T fromResultSetToEntity(ResultSet rs) throws SQLException;
	
	
}
