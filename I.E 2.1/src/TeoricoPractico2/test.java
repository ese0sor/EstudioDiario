package TeoricoPractico2;

public class test {

	public static void main(String[] args) {
		
		Garaje g = new Garaje();
		Coche c1 = new Coche("Nissan", "Cascai");
		Coche c2 = new Coche("Seat", "Panda");
		g.aceptarCoche(c1, "aceite");
		c1.acumularAverias(Math.random());
		g.devolverCoche();
		g.aceptarCoche(c1, "ruedas");
		c1.acumularAverias(Math.random());
		g.devolverCoche();
		//Meter motor en el constructor de coche
		

	}

}
