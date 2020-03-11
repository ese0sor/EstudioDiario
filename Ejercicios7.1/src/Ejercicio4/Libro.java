package Ejercicio4;

public class Libro extends Articulo implements Prestable{

	boolean prestado;
	
	Libro(int codigo, String titulo, int anio){
		super(codigo, titulo, anio);
		this.prestado=false;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	@Override
	public int getAnio() {
		return super.getAnio();
	}
	
	@Override
	public int getCodigo() {
		return super.getCodigo();
	}

	@Override
	public void prestar() {
		
	}

	@Override
	public void devolver() {
		
	}

	@Override
	public void prestado() {
		if (prestado==true) {
			System.out.print("Si");
		}else {
			System.out.print("No");
		}
	}
	
	public void imprimir() {
		System.out.print("Codigo: " + getCodigo()
				+"\nTitulo: " + getTitulo()
				+"\nAnio: " + getAnio()
				+"\nPrestado: ");
		prestado();
	}
}
