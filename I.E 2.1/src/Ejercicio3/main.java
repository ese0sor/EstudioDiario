package Ejercicio3;

public class main {

	public static void main(String[] args) {
		
		Cuenta c = new Cuenta(15364785, 450, 12);

		c.ingresar(150);
		c.retirar(10);
		c.mostrar();
		c.actualizarSaldo();
		c.mostrar();
		
		Cuenta d = new Cuenta(78945613, 200, 10);
		
		d.mostrar();
	}

}
