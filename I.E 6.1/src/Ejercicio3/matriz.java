package Ejercicio3;

public class matriz {

	int matriz[][];
	
	public void crearMatrizLlenoParam(int x, int y) {
		
		matriz =new int[x][y];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=(int) (Math.random()*10+1);
				System.out.print(" " + matriz[i][j]);
			}
			System.out.println();
		}
	}
}
