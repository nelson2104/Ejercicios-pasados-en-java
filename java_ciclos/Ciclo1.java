import java.util.Scanner;
public class Ciclo1 {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);

        int i,a = 0;

        for(i = 1; i <= 10; i++){
            for (a = 1; a <= i; a++){
                System.out.print("*");
            }
                System.out.println("");
        }

    }
}