package Ejercicio7;

public class Asignatura {

	private String nombreAsig;
	private int nota;
	
	public Asignatura(String nombreAsig, int nota) {
		this.nombreAsig=nombreAsig;
		this.nota=nota;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public String aprobado() {
		if (this.nota>=5) {
			return "Aprobado";
		}else {
			return "Suspenso";
		}
	}
	
	public String nombreAsig() {
		return "Nombre Asignatura: " + this.nombreAsig;
	} 
}
