package Ejercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Persona {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	private String nombre;
	private int edad;
	
	Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
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

	public void cargarDatos() throws IOException {
		System.out.println("¿Nombre?");
		this.nombre=teclado.readLine();
		System.out.println("¿Edad?");
		this.edad=Integer.parseInt(teclado.readLine());
	}
	
	public void imprimirDatos() {
		System.out.println("Nombre: " + this.nombre + 
							"\nEdad: " + this.edad);
	}
}
