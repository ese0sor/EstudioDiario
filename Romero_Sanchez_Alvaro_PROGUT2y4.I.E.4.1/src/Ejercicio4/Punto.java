package Ejercicio4;

public class Punto {

	private double x;
	private double y;
	
	public Punto(double a, double b) {
		this.x=a;
		this.y=b;
	}
	
	public Punto() {
		this.x=0;
		this.y=0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double calcularDistanciaDesde(Punto p) {
		return Math.sqrt( Math.pow(p.getX()-this.getX(), 2)  +  
							 Math.pow(p.getY()-this.getY(), 2));
	}
}
