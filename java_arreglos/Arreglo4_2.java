import java.util.Scanner;
public class Arreglo4_2 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);

        int columna2;
		int fila2;
		int i;
		int j;
		int matriz[][];
		int x;
        matriz = new int[4][5];
		x = 1;


		for (i = 0; i <= 3; i++) {
			for (j = 0; j <= 4; j++) {
				matriz[i][j] = x;
				x = x + 1;
			}
		}
		for (fila2 = 0; fila2 <= 3; fila2++) {
			for (columna2 = 0; columna2 <= 4; columna2++) {
				if (fila2 % 2 == 0) {
					System.out.print(matriz[fila2][columna2] + " ");
				} else {
					System.out.print(matriz[fila2][4-columna2] + " ");
				}
			}
			System.out.println(" ");
		}
		System.out.println(" ");
    }
}
