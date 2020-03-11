package Ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Estudiante extends Persona {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	private int codigo;
	private String categoria;
	private double pagoPensiones;
	private String colegio;
	
	Estudiante(String nombre, String apellidos, 
				long dni, boolean sexo, int codigo, 
				String categoria, double pagoPensiones,
				String colegio) {
		super(nombre, apellidos, dni, sexo);
		this.codigo=codigo;
		this.categoria=categoria;
		this.pagoPensiones=pagoPensiones;
		this.colegio=colegio;
	}
	
	public void calculoDescuentoParcial() throws NumberFormatException, IOException {
		
		System.out.println("¿Qué edad tiene?");
		int edad = Integer.parseInt(teclado.readLine());
		
		if (edad<13) {
			System.out.println("No se le aplica un descuento");
		}else if (edad<=16) {
			System.out.println("Descuento del 8%\n" + 
								pagoPensiones + " -> " + pagoPensiones*0.08);
		}else {
			System.out.println("Descuento del 15%\n" + 
								pagoPensiones + " -> " + pagoPensiones*0.15);
		}
	}
}
