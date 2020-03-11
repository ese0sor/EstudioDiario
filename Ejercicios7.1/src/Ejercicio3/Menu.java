package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Menu {
		
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	ArrayList<Persona> ListaPersona;
	ArrayList<Direccion> ListaDireccion;
	
	Menu(){
		ListaPersona = new ArrayList<Persona>();
		ListaDireccion = new ArrayList<>();
		Direccion d1 = new Direccion("San Jose", "Sevilla", 11223, "España");
		Direccion d2 = new Direccion("Monte Rey", "Madrid", 22334, "España");
		ListaDireccion.add(d1);
		ListaDireccion.add(d2);
	}
	
	public void incio() throws IOException {
		crearEstudiante();
		crearProfesor();
		queClaseSoy();
	}
	
	public void crearEstudiante() throws IOException {
		System.out.println("CREACION DE ESTUDIANTE:");
		System.out.println("Nombre:");
		String nombre=teclado.readLine();
		System.out.println("Apellidos:");
		String apellidos=teclado.readLine();
		System.out.println("Nif:");
		String nif = teclado.readLine();
		System.out.println("ID Alumno:");
		int id = Integer.parseInt(teclado.readLine());
		System.out.println("Direccion (calle):");
		String nombreCalle=teclado.readLine();
		for (Direccion iter : ListaDireccion) {
			if (nombreCalle.equals(iter.getCalle())) {
				Persona p = new Estudiante(nombre, apellidos, nif, iter, id);
				ListaPersona.add(p);
				System.out.println("Usuario Creado.");
			}
		}
	}
	
	public void crearProfesor() throws IOException {
		System.out.println("CREACION DE PROFESOR:");
		System.out.println("Nombre:");
		String nombre=teclado.readLine();
		System.out.println("Apellidos:");
		String apellidos=teclado.readLine();
		System.out.println("Nif:");
		String nif = teclado.readLine();
		System.out.println("Nº Despacho:");
		int despacho = Integer.parseInt(teclado.readLine());
		System.out.println("Direccion (calle):");
		String nombreCalle=teclado.readLine();
		for (Direccion iter : ListaDireccion) {
			if (nombreCalle.equals(iter.getCalle())) {
				Persona p = new Profesor(nombre, apellidos, nif, iter, despacho);
				ListaPersona.add(p);
				System.out.println("Profesor Creado");
			}
		}
	}
	
	public void queClaseSoy() {
		for (Persona iter : ListaPersona) {
			iter.identificate();
		}
	}
}
