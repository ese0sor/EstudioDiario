package Ejercicio1;

public class Cliente {

	/*
	 * Atributos
	 */
	String nombre;
	String apellidos;
	String nif;
	
	/*
	 * Constructor vacio.
	 * 
	 * Constructor con parametros.
	 */
	Cliente(){
		
	}
	
	Cliente(String nombre, String apellidos, String nif){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nif=nif;
	}
	
	/*
	 * Getters/Setters.
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}
}
