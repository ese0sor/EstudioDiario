package TeoricoPractico;

public class Clase1 {
	private int atr1;
	private String atr2;
	public Clase1 (int a, String b){
		atr1=a;
		atr2=b;
		}

	public Clase1(){
		this(-1,"vacío");
		}

	public int getAtr1(){return atr1;} 
	
	public String getAtr2(){return atr2;}

}
