package Ejercicio1;

import java.io.IOException;

public abstract class Cuenta {

	/*
	 * Atributos:
	 */
	long numerocuenta;
	double saldo;
	Cliente cliente;
	
	/*
	 * Constructor con parametro de tipo cliente y de tipo long.
	 */
	Cuenta(Cliente cliente, long numerocuenta){
		this.cliente=cliente;
		this.numerocuenta=numerocuenta;
	}

	/*
	 * Getters/Setters.
	 */
	public long getNumerocuenta() {
		return numerocuenta;
	}

	public void setNumerocuenta(long numerocuenta) {
		this.numerocuenta = numerocuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	/*
	 * Método Público:
	 * Ingresa en la cuenta la cantidad introducida por parametro.
	 */
	public void ingresar(double num) {
		saldo=saldo+num;
		System.out.println("Saldo: " + saldo);
	}
	
	/*
	 * Método Abstracto:
	 * Retira la cantidad deseada siempre y cuando se pueda (depende del tipo de objeto que lo use).
	 */
	abstract void retirar() throws NumberFormatException, IOException;
	
	/*
	 * Método Público:
	 * Actualiza el saldo de la cuenta dependiendo del tipo de objeto que lo use (Este método se sobreescribira en las
	 * herencias de los diferentes tipos de cuentas).
	 */
	public void actualizarSaldo() {
		
	}
}
