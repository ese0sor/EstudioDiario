package EjerciciosClaseYObjetos;

public class Numero {

	private int num;
	
	Numero () {
		num=0;
	}
	
	Numero(int n) {
		this.num=n;
	}
	
	public void sumarValor(int valor) {
		num=num+valor;
		System.out.println("sumamos " + valor + " y obtenemos " + num);
	}
	
	public void restarValor(int valor) {
		num=num-valor;
		System.out.println("restamos " + valor + " y obtenemos " + num);
	}
	
	public int getValorInterno() {
		return num;
	}
	
	public int getDouble() {
		return num*2;
	}
	
	public int getTriple() {
		return num*3;
	}
	
	public void setValorInterno(int n) {
		this.num=n;
		System.out.println("Nuevo valor interno " + num);
	}
}
