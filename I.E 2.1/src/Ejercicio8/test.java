package Ejercicio8;

import Ejercicio7.Asignatura;

public class test {

	public static void main(String[] args) {
		
		Asignatura a1 = new Asignatura("Matematicas", 8);
		Asignatura a2 = new Asignatura("Lengua", 4);
		
		
		Alumno a = new Alumno("Paco", 22, a1);
		Alumno b = new Alumno("Ricardo", 23, a2);
		Alumno c = new Alumno("Maria", 21, a1);

		a.imprimir();
		b.imprimir();
		c.imprimir();
	}

}
