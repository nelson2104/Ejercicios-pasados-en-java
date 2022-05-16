import java.util.Scanner;
public class Ciclo4 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);

        int num, i = 0;

        System.out.println("Que Tabla de Multiplicar Deseas Imprimir?");
        num = input.nextInt();

        for(i = 1; i <= 10; i++){
            System.out.println(i + " X " + num + " = " + (num*i));
        }
    }    
}
