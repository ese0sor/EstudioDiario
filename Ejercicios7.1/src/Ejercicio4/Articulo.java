package Ejercicio4;

public class Articulo {

	private int codigo;
	private String titulo;
	private int anio;
	
	Articulo(int codigo, String titulo, int anio){
		this.codigo=codigo;
		this.titulo=titulo;
		this.anio=anio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
}
