package Ejercicio6;

public class main {

	public static void main(String[] args) {
		
		Persona p = new Persona("Alvaro", 23);
		Empleado e = new Empleado("Antonio", 28, 780);
		
		p.imprimirDatos();
		
		e.imprimirDatos();
		e.imprimirSueldo();
	}

}
