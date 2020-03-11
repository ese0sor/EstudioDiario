package Ejercicio9;

public class Persona {

	private String apellidos;
	private String nombre;
	private boolean sexo;
	private long dni;
	
	Persona() {
		
	}
	
	Persona(String nombre, String apellidos, long dni, boolean sexo) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.sexo=sexo;
	}
	
	public void imprimirPersona() {
		System.out.println("Nombre: " + this.nombre +
				"\nApellidos: " + this.apellidos + 
				"\nDNI: " + this.dni +
				"\nSexo: " + this.sexo()); 
	}
	
	public String sexo() {
		if (sexo==true) {
			return "Masculino";
		}else {
			return "Femenino";
		}
	}
}
