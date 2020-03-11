package Ejercicio5;

public class Moto extends Vehiculo{

	private int numPlaza;
	
	Moto(String matricula, String colorV, int ruedas) {
		super(matricula, colorV, ruedas);
		this.matricula=matricula;
		this.colorV=colorV;
		this.ruedas=2;
	}

	Moto(String matricula, String colorV, int cv, int ruedas) {
		super(matricula, colorV, ruedas);
		this.matricula=matricula;
		this.colorV=colorV;
		this.cv=cv;
		this.ruedas=2;
	}
	
	Moto(String matricula, String colorV, int cv, int potencia, int ruedas) {
		super(matricula, colorV, ruedas);
		this.matricula=matricula;
		this.colorV=colorV;
		this.cv=cv;
		this.potencia=potencia;
		this.ruedas=2;
	}
	
	Moto(String matricula, String colorV, int cv, int potencia, int ruedas, int numPlaza) {
		super(matricula, colorV, ruedas);
		this.matricula=matricula;
		this.colorV=colorV;
		this.cv=cv;
		this.potencia=potencia;
		this.ruedas=2;
		this.numPlaza=numPlaza;
	}
	
	public void datosMoto() {
		System.out.println(
				"Datos Moto:" + 
				"\nMatricula: " + getMatricula() +
				"\nColor: " + getColorV() + 
				"\nCV: " + getCv() + 
				"\nPotencia: " + getPotencia() +
				"\nRuedas: " + getRuedas() + 
				"\nNumero de Plazas: " + this.numPlaza);
		System.out.println();
				}
}
