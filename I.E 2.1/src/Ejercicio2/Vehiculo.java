package Ejercicio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vehiculo {
	
	private String modelo;
	private double potencia=45.0;
	private boolean cRuedas=true;
	
	Vehiculo (String m) {
		this.modelo=m;
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
	
	public void imprimirDatos() {
		System.out.println("Modelo: " + this.modelo +
							"\nPotencia: " + getPotencia() + 
							"\nTiene tracción a 4 ruedas " + iscRuedas());
											
	}
}
