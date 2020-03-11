package Ejercicio4;

public class main {

	public static void main(String[] args) {
		
		Cafetera c1 = new Cafetera();
		Cafetera c2 = new Cafetera(1500);
		Cafetera c3 = new Cafetera(1200, 1500);
		
		c1.mostrarCafetera();
		c2.mostrarCafetera();
		c3.mostrarCafetera();
		
		c1.agregarCafe(1300);
		c1.servirTaza(50);
		c1.vaciarCafetera();
		c1.llenarCafetera();
	}

}
