package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuentaAhorro extends Cuenta {
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	double interesVariable;
	double saldoMinimo;

	CuentaAhorro(Cliente cliente, long numerocuenta, double interesVariable, double saldoMinimo) {
		super(cliente, numerocuenta);
		this.cliente=cliente;
		this.numerocuenta=numerocuenta;
		this.saldoMinimo=saldoMinimo;
		this.interesVariable=interesVariable;
	}

	@Override
	void retirar() throws NumberFormatException, IOException {
		System.out.println("Cantidad a retirar.");
		double aux=Double.parseDouble(teclado.readLine());
		if (aux>saldo||aux<=0) {
			System.out.println("No puede retirar esa cantidad");
		}else {
			this.saldo=saldo-aux;
		}
		System.out.println("Saldo: " + saldo);
	}
	
	@Override
	public String toString() {
		return "Cuenta de Ahorros Nº " + this.numerocuenta
				+ "\nCliente: " + cliente.getNombre()
				+ "\nInteres Variable: " + this.interesVariable
				+ "%\nSaldo: " + this.saldo 
				+ "\nSaldo Minimo: " + this.saldoMinimo;
	}
	
	@Override
	public void actualizarSaldo() {
		System.out.print("Modificación del sueldo: " + saldo);
		this.saldo=saldo + (saldo*this.interesVariable);
		System.out.println(" -> " + saldo);
	}
	
	public void cambiarInteres() throws NumberFormatException, IOException {
		System.out.println("Introduzca el nuevo interes.");
		this.interesVariable=Double.parseDouble(teclado.readLine());
	}
}
