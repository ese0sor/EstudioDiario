package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuentaCorriente extends Cuenta{
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	CuentaCorriente(Cliente cliente, long numerocuenta) {
		super(cliente, numerocuenta);
		this.cliente=cliente;
		this.numerocuenta=numerocuenta;
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
		return "Cuenta Corriente Nº " + this.numerocuenta
			+ "\nCliente: " + cliente.getNombre()
			+ "\nInteres Fijo del 1,5%"
			+ "\nSaldo: " + this.saldo;
	}
	
	@Override
	public void actualizarSaldo() {
		System.out.print("Modificación del sueldo: " + saldo);
		this.saldo=saldo + (saldo*0.015);
		System.out.println(" -> " + saldo);
	}
}
