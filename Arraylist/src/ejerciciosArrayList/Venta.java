package ejerciciosArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum Meses {
	Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre
}

public class Venta {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	Meses m;
	int nVentas;
	
	Venta(){
		
	}
	
	Venta(Meses m, int nVentas){
		this.m=m;
		this.nVentas=nVentas;
	}
	
	public Meses getM() {
		return m;
	}
	public void setM(Meses m) {
		this.m = m;
	}
	public int getnVentas() {
		return nVentas;
	}
	public void setnVentas(int nVentas) {
		this.nVentas = nVentas;
	}
	public void imprimirMeses() {
		for (Meses m : Meses.values()) {
			System.out.println(m + " ");
		}
	}
	public void añadirNVentas() throws NumberFormatException, IOException {
		for (Meses m : Meses.values()) {
			System.out.println("Número de venas del mes de " + m);
			int num = Integer.parseInt(teclado.readLine());
		}
	}
	
}
