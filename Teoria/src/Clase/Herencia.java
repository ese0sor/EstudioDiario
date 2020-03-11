package Clase;

public class Herencia {

	/*
	 * Ejemplo de Herencia:
	 * 
	 * 						Figura
	 * 
	 * 			Cuadrado	Circulo		Rectangulo
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Comando para que una clase hija hereda de una clase padre:
	 * 
	 * 		class Rectangulo extends Figura {*contenido de la clase*}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Ejemplo de codigo de herencia:
	 * 
	 * Tenemos la clase figura con un atributo y dos metodos.
	 * 
	 * 		public class figura{
	 * 			String color;
	 * 			public void setColor(String s){color=s;}
	 * 			public void getColor(){return color;}
	 * 		}
	 * 
	 * Y aqui tenemos la clase cuadrado que HEREDA de la clase figura.
	 * 
	 * Hereda de figura el atributo color y los dos metodos publicos, 
	 * las cosas privadas no las hereda.
	 * 
	 * 		public class cuadrado extends figura{
	 * 			private int lado;
	 * 			cuadrado(int l){this.lado=l;}
	 * 			public int getArea(){return lado*lado}
	 * 		}
	 * 
	 * Pasamos a testear un poco con un objeto cuadrado (c).
	 * 
	 * 		class testFiguras{
	 * 			cuadrado c = new cuadrado(5);
	 * 			c.setColor("Verde");
	 * 			System.out,println(c.getColor());
	 * 			System.out.println(c.getArea());
	 * 		}
	 * 
	 * En testFiguras creamos un objeto cuadrado llamado "c"
	 * con el que podemos acceder a métodos de FIGURA como setColor()
	 * o getColor() y tambien podemos acceder a los metodos de la
	 * propia clase CUADRADO como getArea().
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Como usar cosas del padre:
	 * 
	 * En este ejemplo tenemos una clase PERSONA la cual tiene un
	 * constructor por el que se pasa un parametro nombre
	 * 
	 * 	class Persona {
	 * 
	 * 		public Persona(String nombre){
	 * 			this.nombre=nombre;
	 * 		}
	 * 
	 * 	}
	 * 
	 * Acontinuacion tenemos una clase EMPLEADO que HEREDA de la clase
	 * PERSONA, cuando hacemos el constructor de la clase EMPLEADO 
	 * podemos usar el comando "super()" para usar cosas de la clase
	 * padre. 
	 * 
	 * En el constructor de EMPLEADO usamos "super(nombre)" para 
	 * coger el nombre que se ha usado en el constructor de la clase 
	 * PERSONA, y de esta manera, en este ejemplo lo usamos para no tener
	 * que pedirlo en el constructor si no reutilizarlo.
	 * 
	 * 	class Empleado extends Persona {
	 * 		
	 * 		public Empleado(String nombre, double sueldo){
	 * 			super(nombre);
	 * 			this.sueldo=sueldo;
	 * 		}
	 * 	}
	 * 
	 * 
	 * 
	 * 
	 * Sobrescribir (@Override):
	 * 
	 * Vamos a sobrescribir un metodo toString().
	 * 
	 * 
	 * public class Persona {
	 * 		
	 * 		@Override
	 * 		public String toString() {
	 * 			return "Persona (" + "idPersona=" + idPerosna
	 * 							   + ", nombre=" + nombre
	 * 							   + ", edad=" + edad + ")";
	 * 		}
	 * }
	 * 
	 * Aqui sobrescribimos el toString de la clase EMPLEADO para
	 * enlazarlo con el toString de la clase PERSONA
	 * 
	 * public class Empleado extends Persona {
	 * 		
	 * 		@Override
	 * 		public String toString() {
	 * 			return super.toString() + "Empleado(sueldo=" + sueldo + ")" ;
	 * 		}
	 * }
	 *  */
}
