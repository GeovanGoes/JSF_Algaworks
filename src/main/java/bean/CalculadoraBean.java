package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraBean {
	private Double numero1;
	private Double numero2;
	private Double resultado;
	
	public void somar (){
		this.resultado = numero1+numero2;
	}
	
	public Double getNumero1() {
		return numero1;
	}
	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}
	public Double getNumero2() {
		return numero2;
	}
	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}
	public Double getResultado() {
		return resultado;
	}
	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
}
