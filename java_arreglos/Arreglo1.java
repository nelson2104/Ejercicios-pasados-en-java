import java.util.Scanner;
public class Arreglo1 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);

        int datos[];
        int i;
        datos = new int[5];

        for(i = 0; i <= 4; i++){
            System.out.println("Escribe El Numero " + (i+1));
            datos[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(" ");
        for(i = 0; i<=4; i++){
            System.out.println("[" + (i) + "] = " + datos[i]);
        }
    }
}