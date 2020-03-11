package Ejercicio4;

public class Triangulo {

	private Punto p1;
	private Punto p2;
	private Punto p3;
	
	Triangulo(Punto a, Punto b, Punto c) {
		this.p1=a;
		this.p2=b;
		this.p3=c;
	}
	
	Triangulo(){
		Punto a = new Punto(0,0);
		this.p1=a;
		Punto b = new Punto(0,5);
		this.p2=b;
		Punto c = new Punto(5,0);
		this.p3=c;
	}
	
	Triangulo(double a, double b, double c, double d, double e, double f){
		Punto punto1 = new Punto(a,b);
		this.p1=punto1;
		Punto punto2 = new Punto(c,d);
		this.p2=punto2;
		Punto punto3 = new Punto(e,f);
		this.p3=punto3;
		}

	public Punto getP1() {
		return p1;
	}

	public Punto getP2() {
		return p2;
	}

	public Punto getP3() {
		return p3;
	}
	
	public double calcularDistanciaDesde(Punto n) {
		return Math.sqrt( Math.pow(n.getX()-this.p1.getX(), 2)  +  
				 Math.pow(n.getY()-this.p1.getY(), 2));
	}
	
	public double calcularArea() {
		return (this.p1.getX()-this.p2.getX());
	}
}
