package Inicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Satelite {

	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	Satelite (double m, double p, double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	
	Satelite(){
		meridiano=5.4;
		paralelo=4.28;
		distancia_tierra=18.4;
	}

	public double getMeridiano() {
		return meridiano;
	}

	public void setMeridiano(double m) {
		this.meridiano = m;
	}

	public double getParalelo() {
		return paralelo;
	}

	public void setParalelo(double p) {
		this.paralelo = p;
	}

	public double getDistancia_tierra() {
		return distancia_tierra;
	}

	public void setDistancia_tierra(double d) {
		this.distancia_tierra = d;
	}
	
	public void asignarValores() throws NumberFormatException, IOException {
		
		System.out.println("Asignar valor Meridiano:");
		meridiano =Double.parseDouble(entrada.readLine());
		System.out.println("Asignar valor Paralelo:");
		paralelo = Double.parseDouble(entrada.readLine());
		System.out.println("Asignar valor Distancia Tierra:");
		distancia_tierra = Double.parseDouble(entrada.readLine());
	}
	
	public void imprimirValores() {
		System.out.println("Meridiano: " + getMeridiano());
		System.out.println("Paralelo: " + getParalelo());
		System.out.println("Distancia Tierra: " + getDistancia_tierra());
	}
	
}
