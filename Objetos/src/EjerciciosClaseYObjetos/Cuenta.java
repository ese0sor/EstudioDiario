package EjerciciosClaseYObjetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cuenta {

	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	private static long incrementoCuenta;
	private long nCuenta, dni;
	private double saldo, interes, aux;
	
	Cuenta() {
		incrementoCuenta++;
		nCuenta=incrementoCuenta;
	}
	
	Cuenta(long dni, double saldo,  double interes) {
		this.dni=dni;
		this.saldo=saldo;
		this.interes=interes;
		nCuenta=incrementoCuenta;
	}

	public static long incrementoCuenta() {
		return incrementoCuenta;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	public void actualizarSaldo() {
		saldo = saldo + ((interes/365)*saldo);
		System.out.println("Saldo actualizado: " + saldo);
	}
	
	public void ingresar() throws NumberFormatException, IOException {
		System.out.println("¿Cuanto quiere ingresar?");
		aux = Double.parseDouble(entrada.readLine());
		saldo = saldo + aux;
	}
	
	public void retirar() throws NumberFormatException, IOException {
		System.out.println("¿Cuanto quiere retirar?");
		aux = Double.parseDouble(entrada.readLine());
		saldo = saldo - aux;
	}
	
	public void mostrarCuenta() {
		System.out.println("Número de Cuenta: " + getnCuenta());
		System.out.println("Dni del titular: " + getDni());
		System.out.println("Saldo de la cuenta: " + getSaldo());
		System.out.println("Interes usado: " + getInteres()*100 + "%");
	}
}
