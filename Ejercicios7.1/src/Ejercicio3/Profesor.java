package Ejercicio3;

public class Profesor extends Persona{

	int despacho;
	
	Profesor(){
		
	}
	
	Profesor(String nombre, String apellidos, String nif, Direccion direccion, int despacho){
		super(nombre, apellidos, nif, direccion);
		this.despacho=despacho;
	}

	public int getDespacho() {
		return despacho;
	}

	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
