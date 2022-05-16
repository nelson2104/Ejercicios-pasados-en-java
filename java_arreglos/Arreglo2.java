import java.util.Scanner;
public class Arreglo2 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
         
        int i,a;
        int vector[];
        vector = new int[20];
        i = 0;
        a = 0;

        while (i<=19) {
			vector[i] = (int) (Math.random()*100);
			i = i+1;
		}
        do {
			System.out.println(vector[a]);
			a = a+1;
		} while (a!=i);
		System.out.println(" ");
		System.out.println("Numeros Pares:");

        for (a = 0; a <= 19; a++) {
			if (vector[a] % 2 ==0) {
				System.out.print(vector[a] + ",");
			}
		}

        System.out.println(" ");
		System.out.println(" ");
		System.out.println("Numeros Impares:");
		for ( a = 0; a <= 19; a++) {
			if (vector[a] % 2 != 0) {
				System.out.print(vector[a] + ",");
			}
		}

        
    }
}