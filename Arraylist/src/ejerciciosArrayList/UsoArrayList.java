package ejerciciosArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UsoArrayList {

	static BufferedReader teclado;
	static ArrayList<Venta> listaVentas;
	static Venta v;
	
	public static void main(String[] args) {
		
		listaVentas = new ArrayList<>();
		teclado = new BufferedReader(new InputStreamReader(System.in));
		

	}
	
	//public void menu() throws NumberFormatException, IOException {
		
		//String salir="";
		
		/*do {
			System.out.println("Menu de Opciones:\n"
					+ "1. Introducir ventas de coche.\n"
					+ "2. Mostrar la última venta introducida.\n"
					+ "3. Mostrar venta total de coches del año.\n"
					+ "4. Mostrar ventas totales de los meses que empiezan con A.\n"
					+ "5. Mostrar nombre de mes con más ventas.\n"
					+ "6. Salir del programa");
			int opcion = Integer.parseInt(teclado.readLine());
			switch (opcion) {
			case 1:
				//addVentaCoches();
				break;
			case 2:
				//verUltimaVenta();
				break;
			case 3:
				//verVentasTotales();
				break;
			case 4:
				//verVentasMesesA();
				break;
			case 5:
				//verMesMasVentas();
				break;
			case 6:
				System.out.println("¿Desea salir del programa?(s/n)");
				
				//if (salir.equalsIgnoreCase("S")) {
					System.out.println("Hasta otra cabesa.");
				//}
				break;
			default:
				System.out.println("Opción incorrecta. Mete otro número picha");
				break;
			}
		} while ();
	}*/
	
	public void addVentaCoches() throws IOException {
		
		System.out.println("Número de ventas en " + v.getM());
		int num = Integer.parseInt(teclado.readLine());
		
	}

}
