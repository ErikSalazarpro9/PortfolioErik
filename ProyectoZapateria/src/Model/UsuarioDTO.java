package Model;

public class UsuarioDTO {
	private int IdUsuario;
	private String Nombre;
	private String Telefono;
	private String Correo;
	private String Contrasena;

	
	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int IdUsuario) {
		this.IdUsuario = IdUsuario;
	}


	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}



	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		this.Telefono = telefono;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		this.Correo = correo;
	}

	

	public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String contrasena) {
		this.Contrasena = contrasena;
	}
}
