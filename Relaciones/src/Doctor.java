import java.util.ArrayList;

public class Doctor extends Persona {
	protected int registro;
	protected String especialidad;
	protected Secretaria secretaria;
	protected AreaMedica Area;
	protected ArrayList<Cita> CitasPendientes ;
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public void recetar() {
		
	}
	public void agregarPlanNut() {
		
	} 
	public void ImprimirReceta() {
		
	}
	public void registraSecretaria(Secretaria secretaria) {
		this.secretaria=secretaria;
		
		
	}
	public Secretaria getSecretaria() {
		return secretaria;
	}
	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}
	public AreaMedica getArea() {
		return Area;
	}
	public void setArea(AreaMedica area) {
		Area = area;
	}

}
