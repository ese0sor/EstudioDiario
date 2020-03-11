package EjerciciosClaseYObjetos;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Persona p = new Persona("Antonio", "Jimenez", "48152346T");
		Vehiculo v = new Vehiculo("Seat Panda");
		Numero n = new Numero(5);
		Conversion c = new Conversion();
		//Rectangulo r = new Rectangulo();
		
		
		System.out.println("---------CLASE PERSONA-----------");
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Apellidos: " + p.getApellidos());
		System.out.println("NIF: " + p.getNif());
		System.out.println("---------CLASE VEHICULO----------");
		v.modificarDatos();
		v.imprimir();
		System.out.println("---------CLASE NUMERICO----------");
		System.out.println("Numero interno = " + n.getValorInterno());
		System.out.println("Doble " + n.getDouble());
		System.out.println("Triple " + n.getTriple());
		n.sumarValor(8);
		n.restarValor(4);
		n.setValorInterno(10);
		System.out.println("---------CLASE CONVERSION--------");
		c.millasAMetros();
		c.millasAKilometros();
		
	}

}
