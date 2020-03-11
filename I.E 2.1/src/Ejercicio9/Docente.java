package Ejercicio9;

public class Docente extends Persona {

	private int codigo;
	private String categoria;
	private String estudios;
	private int horasClase;
	private int pagoHora;
	
	Docente(String nombre, String apellidos, long dni, boolean sexo, int codigo, String categoria, String estudios, int horasClase, int pagoHora) {
		super(nombre, apellidos, dni, sexo);
		this.codigo=codigo;
		this.categoria=categoria;
		this.estudios=estudios;
		this.horasClase=horasClase;
		this.pagoHora=pagoHora;
	}
	
	public void calPagoParcial() {
		System.out.println("Pago Parcial:" + (this.horasClase * this.horasClase));
	}
}
