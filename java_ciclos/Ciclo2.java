import java.util.Scanner;
public class Ciclo2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int a,b,c = 0;
        a = 10;

        while(a > 0){
            b = 0;
            c = 0;

                while(b < a){
                    System.out.print(" ");
                    b = b + 1;
                }

                while(c <= 10 - a){
                    System.out.print("*");
                    c = c + 1;
                }

                System.out.println("");
                a = a - 1;                
              
        }
        
    }
}
