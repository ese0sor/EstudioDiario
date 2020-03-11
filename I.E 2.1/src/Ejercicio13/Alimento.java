package Ejercicio13;

public class Alimento {

	boolean aux;
	String nombre;
	int lipidos;
	int proteinas;
	boolean origen;
	String vitaminas;
	String minerales;
	
	Alimento(String nombre){
		this.nombre=nombre;
	}

	Alimento (String nombre, int lipidos, int proteinas, boolean origen, String vitaminas, String minerales){
		this.nombre=nombre;
		this.lipidos=lipidos;
		this.proteinas=proteinas;
		this.origen=origen;
		this.vitaminas=vitaminas;
		this.minerales=minerales;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLipidos() {
		return lipidos;
	}

	public void setLipidos(int lipidos) {
		this.lipidos = lipidos;
	}

	public int getProteinas() {
		return proteinas;
	}

	public void setProteinas(int proteinas) {
		this.proteinas = proteinas;
	}

	public boolean isOrigen() {
		return origen;
	}

	public void setOrigen(boolean origen) {
		this.origen = origen;
	}

	public String getVitaminas() {
		return vitaminas;
	}

	public void setVitaminas(String vitaminas) {
		this.vitaminas=vitaminas;
			 if(vitaminas.equalsIgnoreCase("A")) {
				  System.out.println("Tu contenido es alto");
			 
			  }else if(vitaminas.equalsIgnoreCase("B")) {
				  
				  System.out.println("Tu contenido es bajo");
				  
			  }else if(vitaminas.equalsIgnoreCase("M")){
				  System.out.println("Tu contenido es medio");
			  }else {
				  System.out.println("tienes que introducir una de las letras A, M o B");
			  }
		
	}

	public void setMinerales(String minerales) {
		this.minerales=minerales;
		 if(minerales.equalsIgnoreCase("A")) {
			  System.out.println("Tu contenido es alto");
		 
		  }else if(minerales.equalsIgnoreCase("B")) {
			  
			  System.out.println("Tu contenido es bajo");
			  
		  }else if(minerales.equalsIgnoreCase("M")){
			  System.out.println("Tu contenido es medio");
		  }else {
			  System.out.println("tienes que introducir una de las letras A, M o B");
		  }
		 
	}
	
	public String getMinerales() {
		return minerales;
	}

	public void esDietetico() {
		if(this.lipidos<20 && this.vitaminas!="B") {
			aux=true;
		}else if(this.lipidos>20 && this.vitaminas=="B") {
			aux=false;
		}
			
		System.out.println(aux);
	}
	
	public void muestraalimento() {
		System.out.println("Lípidos: "+lipidos
				+"\n"
				+"Hidratos: "+proteinas
				+"\n"
				+"Origen animal: "+origen
				+"\n"
				+"Vitaminas: "+vitaminas
				+"\n"
				+"Minerales "+minerales
				+"\n"
				+"Es dietetico: "+aux);
	}
}
