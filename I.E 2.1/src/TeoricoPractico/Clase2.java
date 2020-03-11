package TeoricoPractico;

public class Clase2 extends Clase1{
	boolean atr3;

	public Clase2(int a, String b, boolean c){
		super(a, b);
		atr3=c;
		}
	
	@Override
	public String toString() {
		return "Atributo 1 = " + super.getAtr1() +
			"\nAtributo 2 = " + super.getAtr2() +
			"\nAtributo 3 = " + atr3;
		}
}
