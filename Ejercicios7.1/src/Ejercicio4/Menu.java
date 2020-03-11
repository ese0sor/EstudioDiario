package Ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Menu {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	static ArrayList<Articulo> Publicaciones;
	
	
	Menu(){
		//ListaLibro = new ArrayList<Libro>();
		//ListaRevista = new ArrayList<Revista>();
		Publicaciones = new ArrayList<Articulo>();
		Articulo a = new Libro(45, "Señor de los Anillos", 2010);
		Articulo b = new Revista(30, "Hola", 2005, 150);
		Publicaciones.add(a);
		Publicaciones.add(b);
	}
	
	/*public void cuentaPrestados(ArrayList<Articulo> Publicaciones) {
		int cont=0;
		for (Articulo iter : Publicaciones) {
			if (iter.) {
				cont++;
			}
		}
		System.out.println("Prestados: " + cont);
	}*/
	
	public void publicacionesAnterioresA(ArrayList<Revista> ListaRevista, int num) throws NumberFormatException, IOException {
		int cont=0;
		for (Revista iter : ListaRevista) {
			if (iter.getAnio()<num) {
				cont++;
			}
		}
		System.out.println("Anteriores al año " + num + " hay " + cont + " publicaciones anteriores.");
	}
	
	public void imprimir() {
		for (Articulo iter : Publicaciones) {
			iter.toString();
		}
	}
}
