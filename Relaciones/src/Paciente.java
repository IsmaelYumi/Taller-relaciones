import java.util.ArrayList;

public class Paciente extends Persona  {
	protected String email;
	protected HistoriaClinica historia;
	protected ArrayList<Receta> recetas;
	protected ArrayList<Cita> Citas;
	public ArrayList<Receta> getRecetas() {
		return recetas;
	}
	public void setRecetas(ArrayList<Receta> recetas) {
		this.recetas = recetas;
	}
	public ArrayList<Cita> getCitas() {
		return Citas;
	}
	public void setCitas(ArrayList<Cita> citas) {
		Citas = citas;
	}
	public boolean SolicitarCita() {
		
		return true;
	}
	public Paciente() {
		historia=new HistoriaClinica();
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public HistoriaClinica getHistoria() {
		return historia;
	}
	public void setHistoria(HistoriaClinica historia) {
		this.historia = historia;
	}
	public ArrayList<Receta> getReceta() {
		return recetas;
	}
	public void setReceta(ArrayList<Receta> receta) {
		this.recetas = receta;
	}
	

}
