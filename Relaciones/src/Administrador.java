import java.util.ArrayList;

public class Administrador extends Persona {
	private ArrayList<String> usuarios;
	public void registrar_usuario(Persona p) {
	usuarios.add(p.getUsuario());
	
		
		
	}
	public ArrayList<String> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<String> usuarios) {
		this.usuarios = usuarios;
	}
	public void AsignarRol(Persona p) {
		
	}
	
}
