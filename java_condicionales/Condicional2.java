import java.util.Scanner;
public class Condicional2 {
    public static void main(String args[]){
    try (Scanner in = new Scanner(System.in)) {
        int edad = 0;
        System.out.println("Introduce tu Edad:");
        edad = in.nextInt();

        if(edad < 18){
            System.out.println("Usted aun es un niño(a)");
        }
    }
    }
}
