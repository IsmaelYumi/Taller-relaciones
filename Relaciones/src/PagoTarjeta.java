import java.util.Date;

import Interfaces.Pago;

public class PagoTarjeta implements  Pago {
protected float monto;
protected String numero;
protected Date expira;
protected String propietario;
protected String Banco;
public float getMonto() {
	return monto;
}
public void setMonto(float monto) {
	this.monto = monto;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public Date getExpira() {
	return expira;
}
public void setExpira(Date expira) {
	this.expira = expira;
}
public String getPropietario() {
	return propietario;
}
public void setPropietario(String propietario) {
	this.propietario = propietario;
}
public String getBanco() {
	return Banco;
}
public void setBanco(String banco) {
	Banco = banco;
}


}
