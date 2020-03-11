package Ejercicio5;

public class Vehiculo {

	protected String matricula;
	protected String colorV;
	protected int ruedas;
	protected int cv;
	protected int potencia;
	
	Vehiculo(String matricula, String colorV, int ruedas){
		this.matricula=matricula;
		this.colorV=colorV;
		this.ruedas=ruedas;
	}
	
	Vehiculo(String matricula, String colorV, int ruedas, int cv){
		this.matricula=matricula;
		this.colorV=colorV;
		this.ruedas=ruedas;
		this.cv=cv;
	}
	
	Vehiculo(String matricula, String colorV, int ruedas, int cv, int potencia){
		this.matricula=matricula;
		this.colorV=colorV;
		this.ruedas=ruedas;
		this.cv=cv;
		this.potencia=potencia;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getColorV() {
		return colorV;
	}

	public int getRuedas() {
		return ruedas;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
}


















