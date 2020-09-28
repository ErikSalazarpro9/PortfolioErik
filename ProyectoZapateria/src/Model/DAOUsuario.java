package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



public class DAOUsuario {
	private Connection conn;
	
	public DAOUsuario(Connection conn) {
		this.conn = conn;
	}
	
	private static final String insertarUsuario = 
			"insert into usuario values (null,?,?,?,?)";

	public int insertarUsuario( UsuarioDTO usuarioDTO) 
			throws SQLException{
		
		PreparedStatement sentencia;
		ResultSet rs;
		int idPersona = 0;
		
		sentencia = conn.prepareStatement(insertarUsuario
				,PreparedStatement.RETURN_GENERATED_KEYS);
		
		sentencia.setString(1, usuarioDTO.getNombre() );
		sentencia.setString(2, usuarioDTO.getContrasena());
		sentencia.setString(3, usuarioDTO.getCorreo() );
		sentencia.setString(4, usuarioDTO.getTelefono());
		
		sentencia.executeUpdate();
		rs = sentencia.getGeneratedKeys();
		
		if(rs.next()){
			idPersona = rs.getInt(1);
		}
		
		rs.close();
		sentencia.close();
		

		return idPersona;
	}
	
}







