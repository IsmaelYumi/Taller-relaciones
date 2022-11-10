import java.util.Date;

import Interfaces.Pago;

public class Cita implements Pago {
	protected Date fecha;
	protected boolean pagada;
	protected String resgistrada;
	protected Doctor doc;

	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean isPagada() {
		return pagada;
	}
	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}
	public String getResgistrada() {
		return resgistrada;
	}
	public void setResgistrada(String resgistrada) {
		this.resgistrada = resgistrada;
	}
	
	public boolean RealizarPago(float monto) {
		return Pago.super.RealizarPago(monto);
	}
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	
	
	

}
