package Ejercicio9;

import java.io.IOException;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Estudiante e = new Estudiante("Julia", "Jimenez Marquez", 15264879, false, 15846, "infantil", 823, "Salesianas");
		Docente d = new Docente("Antonio", "Romero Fernandez", 45782135, true, 158, "Tutor", "Carrera Universitaria", 24, 50);
		
		e.imprimirPersona();
		e.calculoDescuentoParcial();
		System.out.println("*******************************************************************");
		d.imprimirPersona();
		d.calPagoParcial();
	}

}
