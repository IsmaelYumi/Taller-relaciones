import java.util.Date;

public class Persona {
	protected String usuario;
	protected String clave;
	protected String nombre;
	protected String Apellido;
	protected String Cedula;
	protected String direccion;
	protected Date fecha_nacimiento;
	
	
	public boolean login() {
		return true;
	}
	public boolean logOut() {
		return true;
	}
	public String getUsuario() {
		return this.usuario;
	}


}
