package Ejercicio3;

public class Persona implements Humano{

	private String nombre;
	private String apellidos;
	private String nif;
	private Direccion direccion;
	
	Persona(){
		
	}
	
	Persona(String nombre, String apellidos, String nif, Direccion direccion){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nif=nif;
		this.direccion=direccion;
	}

	@Override
	public String identificate() {
		return "Soy de la clase " + getClass();
	}

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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}	
}
