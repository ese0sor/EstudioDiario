package Ejercicio4;

public class Cafetera {

	private int CM, CA;
	
	Cafetera() {
		this.CM=1000;
		this.CA=0;
	}
	
	Cafetera(int CM) {
		this.CM=CM;
		this.CA=CM;
	}
	
	Cafetera(int CM, int CA) {
		this.CM=CM;
		if (CA>CM) {
			this.CA=CM;
		}else {
			this.CA=CA;
		}
	}

	public int getCM() {
		return CM;
	}

	public void setCM(int cM) {
		CM = cM;
	}

	public int getCA() {
		return CA;
	}

	public void setCA(int cA) {
		CA = cA;
	}
	
	public void llenarCafetera() {
		this.CA = CM;
		System.out.println("Cap.Actual: " + CA + "\n");
	}
	
	public void servirTaza(int taza) {
		if (taza>CA) {
			System.out.println("Taza servida: " + CA + "\n");
			this.CA=0;
			System.out.println("Cap.Actual: " + CA + "\n");
		}else {
			System.out.println("Taza servida: " + taza + "\n");
			this.CA=CA-taza;
			System.out.println("Cap.Actual: " + CA + "\n");
		}
	}
	
	public void vaciarCafetera() {
		this.CA=0;
		System.out.println("Cap.Actual: " + CA + "\n");
	}
	
	public void agregarCafe(int cant) {
		if (cant>CM || cant+CA>CM) {
			this.CA=CM;
		}else {
			this.CA=CA+cant;
		}
		System.out.println("Agregado: " + cant +
				"\nCap.Actual: " + CA + "\n");
	}
	
	public void mostrarCafetera() {
		System.out.println("Cap.Max: " + CM + 
				"\nCap.Actual: " + CA + "\n");
	}
}
