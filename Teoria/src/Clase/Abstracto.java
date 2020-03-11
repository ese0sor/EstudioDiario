package Clase;

public class Abstracto {

	/**
	 * POLIMORFISMO:H
	 * 
	 * Con las clases Abstractas podemos hacer que el padre pueda tener caracteristicas del hijo y crear objetos del tipo hijo.
	 * Eso si, no podemos instanciar objetos de una Clase Abstracta.
	 * 
	 * 														   Trabajador
	 * 																|
	 * 														---------------
	 * 													    |              |
	 * 													Empleado	   Consultor
	 * 
	 *  ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();
	 * 
	 * 	Trabajador e = new Empleado();
	 *  Empleado e1 = new Empleado();
	 *  
	 *  listaTrabajadores.add(e);
	 *  listaTrabajadores.add(e1);
	 *  
	 *  ¿No entiendo el crear el trabajador e si la clase es abstracta? Se supone que no se puede. ¿O El trabajador no es una
	 *  clase abstracta y es un ejemplo de como crear el ArrayList solo?
	 * 
	 * Ahora podemos crear un ArrayList de la clase padre, pero podemos guardar objetos de la clase padre o de sus clases
	 * hijos. Pero viendo el ejemplo de arriba de Trabajador, al crear un ArrayList no podriamos hacer un ArrayList de 
	 * Empleado por ejemplo porque solo podriamos guardar Empleados ya que es hijo de Trabajador. En cambio, si hacemos 
	 * el ArrayList de Trabajador, en el podemos guardar objetos de Trabajador, de Empelados, y de Consultores.
	 */
}
