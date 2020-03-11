package EjerciciosClaseYObjetos;

public class Conversion {

	private double milla;
	
	Conversion() {
		milla=5;
	}
	
	public void millasAMetros() {
		System.out.println((int)milla + " millas son " + milla*1852 + " metros");
	}
	
	public void millasAKilometros() {
		System.out.println((int)milla + " millas son " + (milla*1852)/1000 + "Km");
	}
}
