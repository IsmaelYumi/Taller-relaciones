import java.util.ArrayList;

public class AreaMedica {
	protected String especialidad;
	protected float Costo;
	protected ArrayList<Doctor>doctores;
	
	public AreaMedica(Doctor doc) {
	doctores.add(doc);	
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public float getCosto() {
		return Costo;
	}

	public void setCosto(float costo) {
		Costo = costo;
	}

	public ArrayList<Doctor> getDoctores() {
		return doctores;
	}

	public void setDoctores(ArrayList<Doctor> doctores) {
		this.doctores = doctores;
	}

}
