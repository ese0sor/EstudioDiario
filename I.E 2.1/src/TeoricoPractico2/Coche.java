package TeoricoPractico2;

public class Coche {

	private Object Motor;
	private String marca;
	private String modelo;
	private double precioAv;
	
	Coche(String marca, String modelo){
		this.marca=marca;
		this.modelo=modelo;
	}

	public Object getMotor() {
		return Motor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPrecioAv() {
		return precioAv;
	}
	
	public double acumularAverias(double a) {
		this.precioAv=precioAv+a;
		return this.precioAv;
	}
}
