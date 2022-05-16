import java.util.Scanner;

public class Ciclo3{

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		int incremento;
		a = 11;

		do {
			b = 0;
			c = 0;
			do {
				System.out.print(" ");
				b = b+1;
			} while (b!=a);

			do {
				System.out.print("*");
				c = c+1;
			} while (c!=12-a);
			c = 0;

			if (a!=11) {
				do {
					System.out.print("*");
					c = c+1;
				} while (c!=11-a);
			}
			System.out.println(" ");
			a = a-1;
			
		} while (a!=0);
		incremento = 0;
		do {
			System.out.print(" ");
			incremento = incremento+1;
		} while (incremento!=10);
		System.out.println("***");
		incremento = 0;
		do {
			System.out.print(" ");
			incremento = incremento+1;
		} while (incremento!=10);
		System.out.println("***");
		incremento = 0;
		do {
			System.out.print(" ");
			incremento = incremento+1;
		} while (incremento!=9);
		incremento = 0;
		do {
			System.out.print("*");
			incremento = incremento+1;
		} while (incremento!=5);
		System.out.println(" ");
		incremento = 0;
		do {
			System.out.print(" ");
			incremento = incremento+1;
		} while (incremento!=8);
		incremento = 0;
		do {
			System.out.print("*");
			incremento = incremento+1;
		} while (incremento!=7);
		System.out.println(" ");
	}


}


