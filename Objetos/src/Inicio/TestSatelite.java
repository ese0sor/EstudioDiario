package Inicio;

import java.io.IOException;

public class TestSatelite {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Satelite sa1 = new Satelite();
		Satelite sa2 = new Satelite(2.78, 89.4, 45.20);
		
		System.out.println("Asignamos valores al satelite 1");
		sa1.asignarValores();
		sa1.imprimirValores();
		System.out.println("Asignamos valores al satelite 2");
		sa2.asignarValores();
		sa2.imprimirValores();

	}

}
