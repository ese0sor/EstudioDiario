package TeoricoPractico2;

public class Garaje {

	private Object Coche;
	private String nombreAveria;
	private int nCoches=0;
	private boolean atender;
	
	Garaje(){
		this.atender=true;
	}
	
	public void aceptarCoche(Object Coche, String nombreAveria) {
		if (atender==false) {
			System.out.println("Ya esta atendiendo un coche, vuelva mas tarde.");
		}else {
			this.Coche=Coche;
			this.nombreAveria=nombreAveria;
			if (nombreAveria=="aceite") {
				
			}
			this.atender=false;
			this.nCoches=nCoches++;
		}
	}
	
	public void devolverCoche() {
		if (atender==true) {
			this.Coche=null;
			this.nombreAveria="";
			this.atender=false;
			System.out.println("Garaje vacio");
		}else {
			System.out.println("El garaje ya esta vacio");
		}
	}
}
