package Ejercicio3;

import java.io.InputStreamReader;
import java.util.ArrayList;

public class Direccion {
	
	private String calle;
	private String ciudad;
	private int codPostal;
	private String pais;
	
	Direccion(String calle, String ciudad, int codPostal, String pais){
		this.calle=calle;
		this.ciudad=ciudad;
		this.codPostal=codPostal;
		this.pais=pais;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
