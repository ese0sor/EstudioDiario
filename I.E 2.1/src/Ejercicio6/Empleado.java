package Ejercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Empleado extends Persona {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	private double sueldo;
	
	Empleado(String nombre, int edad, double sueldo) {
		super(nombre, edad);
		this.sueldo=sueldo;
		
	}
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void cargarSueldo() throws NumberFormatException, IOException {
		System.out.println("¿Que sueldo tienes?");
		this.sueldo=Double.parseDouble(teclado.readLine());
	}
	
	public void imprimirSueldo() {
		System.out.println("Sueldo: " + this.sueldo);
	}
	
}
