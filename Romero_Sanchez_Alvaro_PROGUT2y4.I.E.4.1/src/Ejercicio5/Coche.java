package Ejercicio5;

public class Coche extends Vehiculo{

	private int numPuerta;
	
	Coche(String matricula, String colorV, int ruedas){
		super(matricula, colorV, ruedas);
		this.matricula=matricula;
		this.colorV=colorV;
		this.ruedas=4;
	}
	
	Coche(String matricula, String colorV, int cv, int ruedas){
		super(matricula, colorV, ruedas);
		this.matricula=matricula;
		this.colorV=colorV;
		this.cv=cv;
		this.ruedas=4;
	}
	
	Coche(String matricula, String colorV, int cv, int potencia, int ruedas){
		super(matricula, colorV, ruedas);
		this.matricula=matricula;
		this.colorV=colorV;
		this.cv=cv;
		this.potencia=potencia;
		this.ruedas=4;
	}
	
	Coche(String matricula, String colorV, int cv, int potencia, int ruedas, int numPuerta){
		super(matricula, colorV, ruedas);
		this.matricula=matricula;
		this.colorV=colorV;
		this.cv=cv;
		this.potencia=potencia;
		this.ruedas=4;
		this.numPuerta=numPuerta;
	}

	public int getNumPuerta() {
		return numPuerta;
	}

	public void setNumPuerta(int numPuerta) {
		this.numPuerta = numPuerta;
	}

	public void datosCoche() {
		System.out.println(
				"Datos Coche:" + 
				"\nMatricula: " + getMatricula() +
				"\nColor: " + getColorV() + 
				"\nCV: " + getCv() + 
				"\nPotencia: " + getPotencia() +
				"\nRuedas: " + getRuedas() + 
				"\nNumero de Puertas: " + this.numPuerta);
		System.out.println();
				}
}
