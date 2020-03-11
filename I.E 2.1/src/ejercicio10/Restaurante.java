package ejercicio10;

public class Restaurante {

	private int comensales;
	private int chocos;
	private int patata;
	int Kpatata;
	int Kchoco;

	Restaurante(){
		
	}

	public void setKpatata (int Kpatata) {
		this.Kpatata=Kpatata;
	}

	public int getKpatata () {
		return this.Kpatata;
	}

	public int getKchoco() {
		return Kchoco;
	}

	public void setKchoco(int Kchoco) {
		this.Kchoco = Kchoco;
	}
	
	
	public void addChoco(int Kchoco) {
		this.Kchoco=this.Kchoco+Kchoco;
		System.out.println("Se han añadido " + Kchoco);
	}
	
	
	public void addPatata(int Kpatata){
		this.Kpatata=this.Kpatata+Kpatata;
		System.out.println("Se han añadido " + Kpatata);
	}
	
	
	public void getComensales() { 
		this.Kchoco=Kchoco*6; 
		this.Kpatata=Kpatata*3; 
		
		if(Kpatata>Kchoco) {
			System.out.println("Comensales x Kilo de patata: " + Kpatata);
		}else if(Kpatata<Kchoco) {
			System.out.println("Comensales x Kilo de patata: " + Kpatata);
		}else if(Kpatata==Kchoco) {
			System.out.println("Comensales x Kilo de patata: " + Kpatata);
		}
		System.out.println("Comensales totales: " + Kchoco);
				
	}

	public void showChocos() {
		System.out.println(this.Kchoco);
	}
	public void showPatatas() {
		System.out.println(this.Kpatata);
	}	
	
}

