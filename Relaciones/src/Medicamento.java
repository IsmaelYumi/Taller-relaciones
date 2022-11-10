

public  class Medicamento {
	protected String Medicina;
	protected String dosis;
	protected String Observaciones;
	protected int CantidadTotal;
	protected String Unidad;
	public String getMedicina() {
		return Medicina;
	}
	public void setMedicina(String medicina) {
		Medicina = medicina;
	}
	public String getDosis() {
		return dosis;
	}
	public void setDosis(String dosis) {
		this.dosis = dosis;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	public int getCantidadTotal() {
		return CantidadTotal;
	}
	public void setCantidadTotal(int cantidadTotal) {
		CantidadTotal = cantidadTotal;
	}
	public String getUnidad() {
		return Unidad;
	}
	public void setUnidad(String unidad) {
		Unidad = unidad;
	}
	

}
