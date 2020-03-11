package Ejercicio3;

public class Estudiante extends Persona{

	private int id=0;
	
	Estudiante(){
		
	}
	
	Estudiante(String nombre, String apellidos, String nif, Direccion direccion, int id){
		super(nombre, apellidos, nif, direccion);
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
