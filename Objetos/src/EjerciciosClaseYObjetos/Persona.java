package EjerciciosClaseYObjetos;

public class Persona {

	private String nombre;
	private String apellidos;
	private String nif;
	
	Persona() {
		
	}
	
	Persona(String nom, String ape, String nif){
		this.nombre=nom;
		this.apellidos=ape;
		this.nif=nif;
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
	
}
