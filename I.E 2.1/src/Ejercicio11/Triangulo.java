package Ejercicio11;

public class Triangulo {

	private double long_lado1;
	private double long_lado2;
	private double long_lado3;
	
	Triangulo(){
		
	}
	
	Triangulo(double long_lado1, double long_lado2, double long_lado3) {
		this.long_lado1=long_lado1;
		this.long_lado2=long_lado2;
		this.long_lado3=long_lado3;
	}
	
	public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		if (a.long_lado1==b.long_lado1 || a.long_lado1==b.long_lado2 || a.long_lado1==b.long_lado3) {
			return true;
		}else {
			return false;
		}
	}
}
