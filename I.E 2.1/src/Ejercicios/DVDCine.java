package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DVDCine {

	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	private String titulo, autor, actores, genero, resumen;
	private int min;
	private boolean bu;
	
	DVDCine() {
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getActores() {
		return actores;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	public void pedirDatos() throws IOException {
		System.out.println("Titulo:");
		titulo=entrada.readLine();
		System.out.println("Autor:");
		autor=entrada.readLine();
		System.out.println("Actores:");
		actores=entrada.readLine();
		System.out.println("Genero:");
		genero=entrada.readLine();
		System.out.println("Minutos:");
		min=Integer.parseInt(entrada.readLine());
		System.out.println("Resumen:");
		resumen=entrada.readLine();
	}
	
	public void esThriller() {
		if ("thriller".equalsIgnoreCase(genero)) {
			setBu(true);
			System.out.println("¿Es thriller?" + "(" + bu + ")");
		}else {
			setBu(false);
			System.out.println("¿Es thriller?" + "(" + bu + ")");
		}
	}
	
	public void tieneResumen() {
		if (resumen!="") {
			setBu(true);
			System.out.println("Tiene resumen (" + isBu() + ")");
		}else {
			setBu(false);
			System.out.println("No tiene resumen (" + isBu() + ")");
		}
	}
	
	public void muestraDuracion() {
		System.out.println("Duración de la película: " + getMin());
	}

	public boolean isBu() {
		return bu;
	}

	public void setBu(boolean bu) {
		this.bu = bu;
	}

}
