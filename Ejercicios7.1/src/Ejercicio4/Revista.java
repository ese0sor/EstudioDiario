package Ejercicio4;

public class Revista extends Articulo{

	private int numTomo;
	
	Revista(int codigo, String titulo, int anio, int numTomo){
		super(codigo, titulo, anio);
		this.numTomo=numTomo;
	}

	public int getNumTomo() {
		return numTomo;
	}

	public void setNumTomo(int numTomo) {
		this.numTomo = numTomo;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public int getAnio() {
		return super.getAnio();
	}
	
	@Override
	public int getCodigo() {
		return super.getCodigo();
	}
}
