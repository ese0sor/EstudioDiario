package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Menu {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	static CuentaAhorro CA;
	static CuentaCorriente CC;
	static Cliente cliente;
	
	ArrayList<Cliente> ListaCliente;
	ArrayList<CuentaAhorro> CAhorro;
	ArrayList<CuentaCorriente> CCorriente;
	int option;
	
	Menu(){
		ListaCliente = new ArrayList<>();
		CAhorro = new ArrayList<>();
		CCorriente = new ArrayList<>();
		Cliente cliente = new Cliente("Antonio", "Ramirez", "789456123H");
		ListaCliente.add(cliente);	
		Cliente c1 = new Cliente("Manuel", "Gonzalez", "123456789H");
		ListaCliente.add(c1);
	}
	

	public void inicio() throws NumberFormatException, IOException {
		do {
			System.out.println("Menu Banco"
					+ "\n1.Crear Cuenta Ahorro."
					+ "\n2.Crear Cuenta Corriente."
					+ "\n3.Ingresar Cuenta Ahorro."
					+ "\n4.Ingresar Cuenta Corriente."
					+ "\n5.Retirar Cuenta Ahorro."
					+ "\n6.Retirar Cuenta Corriente."
					+ "\n7.Actualizar Cuenta Ahorro."
					+ "\n8.Actualizar Cuenta Corriente."
					+ "\n9.Cambiar Interes Cuenta Ahorro."
					+ "\n10.Salir.");
			option=Integer.parseInt(teclado.readLine());
			switch (option) {
			case 1:
				crearCA();
				break;
			case 2:
				crearCC();
				break;
			case 3:
				ingresarCuentaAhorro();
				break;
			case 4:
				ingresarCuentaCorriente();
				break;
			case 5:
				retirarCuentaAhorro();
				break;
			case 6:
				retirarCuentaCorriente();
				break;
			case 7:
				actualizarCuentaAhorro();
				break;
			case 8:
				actualizarCuentaCorriente();
				break;
			case 9:
				cambiarInteresCuentaAhorro();
				break;
			case 10:
				System.out.println("Aplicación Cerrada.");
				break;
			}
		} while (option!=10);
	}
	
	public void crearCA() throws IOException {
		boolean aux=false;
		do {
			System.out.println("Nombre titular de la cuenta.");
			String nombre = teclado.readLine();
			for (Cliente iter : ListaCliente) {
				if (nombre.equals(iter.getNombre())) {
					System.out.println("Número Cuenta");
					long numerocuentas=Long.parseLong(teclado.readLine());
					System.out.println("Inters Vairable");
					double interesVariable=Double.parseDouble(teclado.readLine());
					System.out.println("Saldo Minimo");
					double saldoMinimo=Double.parseDouble(teclado.readLine());
					CA = new CuentaAhorro(iter, numerocuentas, interesVariable, saldoMinimo);
					CAhorro.add(CA);
					System.out.println("Cuenta Ahorros Creada.");
					aux=true;
				}else {
					aux=false;
				}
			}
		} while (aux==true);
	}
	
	public void crearCC() throws IOException {
		boolean aux=false;
		do {
			System.out.println("Nombre titular de la cuenta.");
			String nombre = teclado.readLine();
			for (Cliente iter : ListaCliente) {
				if (nombre.equals(iter.getNombre())) {
					System.out.println("Número Cuenta");
					long numerocuentas=Long.parseLong(teclado.readLine());
					CC = new CuentaCorriente(iter, numerocuentas);
					CCorriente.add(CC);
					System.out.println("Cuenta Corriente Creada.");
					aux=true;
				}else {
					aux=false;
				}
			}
		} while (aux==true);
	}
	
	public void ingresarCuentaAhorro() throws NumberFormatException, IOException {
		boolean aux=false;
		do {
			System.out.println("Dame un numero de cuenta.");
			long numerocuenta=Long.parseLong(teclado.readLine());
			for (CuentaAhorro iter : CAhorro) {
				if (Long.compare(numerocuenta, iter.getNumerocuenta())==0) {
					System.out.println("Cantidad a ingrsar.");
					double saldo=Double.parseDouble(teclado.readLine());
					iter.ingresar(saldo);
					aux=false;
				}else {
					aux=true;
				}
			}
		} while (aux==true);
	}
	
	public void ingresarCuentaCorriente() throws NumberFormatException, IOException {
		boolean aux=false;
		do {
			System.out.println("Dame un numero de cuenta.");
			long numerocuenta=Long.parseLong(teclado.readLine());
			for (CuentaCorriente iter : CCorriente) {
				if (Long.compare(numerocuenta, iter.getNumerocuenta())==0) {
					System.out.println("Cantidad a ingresar");
					double saldo=Double.parseDouble(teclado.readLine());
					iter.ingresar(saldo);
					aux=false;
				}else {
					aux=true;
				}
			}
		} while (aux==true);
	}
	
	public void retirarCuentaAhorro() throws NumberFormatException, IOException {
		boolean aux=false;
		do {
			System.out.println("Dame un numero de cuenta.");
			long numerocuenta=Long.parseLong(teclado.readLine());
			for (CuentaAhorro iter : CAhorro) {
				if (Long.compare(numerocuenta, iter.getNumerocuenta())==0) {
					iter.retirar();
					aux=false;
				}else {
					System.out.println("No se encuentra la cuenta.");
					aux=true;
				}
			}
		} while (aux==true);
	}
	
	public void retirarCuentaCorriente() throws NumberFormatException, IOException {
		boolean aux=false;
		do {
			System.out.println("Dame un numero de cuenta.");
			long numerocuenta=Long.parseLong(teclado.readLine());
			for (CuentaCorriente iter : CCorriente) {
				if (Long.compare(numerocuenta, iter.getNumerocuenta())==0) {
					iter.retirar();
					aux=false;
				}else {
					System.out.println("No se encuentra la cuenta.");
					aux=true;
				}
			}
		} while (aux==false);
	}
	
	public void actualizarCuentaAhorro() throws NumberFormatException, IOException {
		boolean aux=false;
		do {
			System.out.println("Numero de Cuenta:");
			long numerocuenta=Long.parseLong(teclado.readLine());
			for (CuentaAhorro iter : CAhorro) {
				if (numerocuenta==iter.getNumerocuenta()) {
					iter.actualizarSaldo();
					aux=false;
				}else {
					System.out.println("No se encuentra la cuenta.");
					aux=true;
				}
			}
		} while (aux==true);
	}
	
	public void actualizarCuentaCorriente() throws NumberFormatException, IOException {
		boolean aux=false;
		do {
			System.out.println("Numero de Cuenta:");
			long numerocuenta=Long.parseLong(teclado.readLine());
			for (CuentaCorriente iter : CCorriente) {
				if (numerocuenta==iter.getNumerocuenta()) {
					iter.actualizarSaldo();
					aux=false;
				}else {
					System.out.println("No se encuentra la cuenta.");
					aux=true;
				}
			}
		} while (aux==true);
	}
	
	public void cambiarInteresCuentaAhorro() throws NumberFormatException, IOException {
		boolean aux=false;
		do {
			System.out.println("Numero de Cuenta:");
			long numerocuenta=Long.parseLong(teclado.readLine());
			for (CuentaAhorro iter : CAhorro) {
				if (Long.compare(numerocuenta, iter.getNumerocuenta())==0) {
					iter.cambiarInteres();
					aux=false;
				}else {
					System.out.println("No se ha encontrado la cuenta.");
					aux=true;
				}
			}
		} while (aux==true);
	}
}
