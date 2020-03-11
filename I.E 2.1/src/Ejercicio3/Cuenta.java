package Ejercicio3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cuenta {

	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	private static long nCuenta=100001;
	private long dni;
	private double sueldo, interes;
	
	Cuenta () {
		
	}
	
	Cuenta(long dni, double sueldo, double interes) {
		this.dni=dni;
		this.sueldo=sueldo;
		this.interes=interes;
		nCuenta = nCuenta+1;
	}

	public long getnCuenta() {
		return nCuenta;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	public void actualizarSaldo() {
		this.sueldo = sueldo + ((interes/100)*365); 
	}
	
	public void ingresar(double cant) {
		this.sueldo = sueldo + cant;
	}
	
	public void retirar(double cant) {
		if (cant>sueldo) {
			System.out.println("No se puede retirar tanto dinero, el saldo de su cuenta es " + getSueldo() + " €");
		}else {
			this.sueldo = sueldo - cant;
		}
	}
	
	public void mostrar() {
		System.out.println("****************************" +
						   "\nCuenta: " + getnCuenta() + 
						   "\nDni Titular: " + getDni() + 
						   "\nSueldo: " + getSueldo() +
						   " €. \nInteres: " + getInteres() +
						   "%." + 
						   "\n****************************");
			
	}
	
}
