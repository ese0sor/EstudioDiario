package EjerciciosClaseYObjetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vehiculo {
	
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	private String modelo;
	private double potencia;
	private boolean cRuedas;
	
	Vehiculo(String mod) {
		this.modelo=mod;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public boolean iscRuedas() {
		return cRuedas;
	}

	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
	
	public void modificarDatos() throws NumberFormatException, IOException {
		System.out.println("*********MODIFICAR DATOS DEL VEHICULO*********");
		System.out.println("¿Qué potencia tiene?");
		potencia = Double.parseDouble(entrada.readLine());
		System.out.println("¿Tiene tracción a las 4 ruedas? (true/false)");
		cRuedas = Boolean.parseBoolean(entrada.readLine());
		System.out.println("**********************************************");
	}
	
	public void imprimir() {
		System.out.println("**************DATOS DEL VEHICULO**************");
		System.out.println("Modelo Vehiculo: " + modelo);
		System.out.println("Potencia: " + getPotencia());
		System.out.println("Tracción 4 Ruedas: " + iscRuedas());
		System.out.println("**********************************************");
	}
}
