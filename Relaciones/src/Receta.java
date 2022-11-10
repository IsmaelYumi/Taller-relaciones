

import java.util.ArrayList;
import java.util.Date;

public  class Receta {
	protected Date fecha;
	protected PlanNutricional pl;
	protected ArrayList<Medicamento> medicamentos;
	protected Doctor doc;
	
	public Receta(){
		pl=new PlanNutricional();
		medicamentos=new ArrayList<Medicamento>();
		
		
		
		
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public PlanNutricional getPl() {
		return pl;
	}

	public void setPl(PlanNutricional pl) {
		this.pl = pl;
	}

	public ArrayList<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Doctor getDoc() {
		return doc;
	}

	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	
	

}
