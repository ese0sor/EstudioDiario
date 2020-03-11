package Ejercicio8;

import Ejercicio7.Asignatura;

public class Alumno {

	private String nombre;
	private int edad;
	public Asignatura asignatura;

	Alumno(String nombre, int edad, Asignatura asignatura) {
		this.nombre=nombre;
		this.edad=edad;
		this.asignatura=asignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void imprimir() {
		System.out.println( "*********************************************************************\n" + 
							"Nombre Alumno: " + this.nombre + 
							"\nEdad: " + this.edad + 
							"\nAsignatura que cursó:\n"+
							"	-" + asignatura.nombreAsig() + 
							"\n	-Nota obtenida: " + asignatura.getNota() +
							"\n	-" + asignatura.aprobado() + 
							"\n*********************************************************************\n");
	}
}
