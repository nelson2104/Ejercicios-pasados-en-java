import java.util.Scanner;
public class Arreglo3 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);
        int contador;
		int num;
		int x;
        for (num = 1; num <= 1000; num++) {
			x = 1;
			contador = 0;
            while (x <= num) {
				if (num % x == 0) {
					contador = contador + 1;
				}
				x = x + 1;
			}
			if (contador == 2) {
				System.out.println("El numero "+ num +" Es Primo");
			}
		}
    }
}
