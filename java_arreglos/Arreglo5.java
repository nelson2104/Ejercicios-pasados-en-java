import java.util.Scanner;
public class Arreglo5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int i;
		int j;
		int matriz[][];
		matriz = new int[10][10];

        for (i = 0; i <= 9; i++) {
			for (j = 0; j <= 9; j++) {
				System.out.print(j + 1 + "x" + i  + " ");
				matriz[i][j] = i*j;
			}
			System.out.println(" ");
		}
        System.out.println(" ");
		System.out.println("Ingrese la fila y la columna que desee:");
		System.out.println("fila:");
		i = Integer.parseInt(input.nextLine());

		System.out.println("columna:");
		j = Integer.parseInt(input.nextLine());

		System.out.println(i*j);
    }
}
