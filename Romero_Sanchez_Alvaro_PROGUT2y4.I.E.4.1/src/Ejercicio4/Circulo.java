package Ejercicio4;

public class Circulo {

	private Punto p;
	private double radio;
	
	Circulo(Punto a, double b){
		this.p=a;
		this.radio=b;
	}
	
	Circulo(){
		Punto puntoCirculo = new Punto(0,0);
		this.p=puntoCirculo;
		radio=0;
	}
	
	Circulo(double x, double y, double r){
		Punto puntoCirculo = new Punto(x, y);
		this.p = puntoCirculo;
		this.radio=r;
	}

	public Punto getP() {
		return p;
	}

	public double getRadio() {
		return radio;
	}
	
	public double calcularDistanciaDesde(Punto puntoCirculo, double r) {
		return Math.sqrt( Math.pow((puntoCirculo.getX()-this.p.getX()), 2) + 
						  Math.pow((puntoCirculo.getY()-this.p.getY()), 2)-r);
	}
	
	public double areaCirculo() {
		return Math.PI * Math.pow(this.radio, 2);
	}
	
	public double perimetroCirculo() {
		return 2 * Math.PI * this.radio;
	}
	
}
