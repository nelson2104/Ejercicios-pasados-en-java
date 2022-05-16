import java.util.Scanner;
public class Condicional3 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int age = 0;
            String name = "";
            String lastName = "";

            System.out.println("Cual es tu Nombre:?");
            name = in.nextLine();
            System.out.println("Cuales son tus Apellidos:?");
            lastName = in.nextLine();
            System.out.println("Cual es tu Edad:?");
            age = in.nextInt();

            if(age >= 18){
                System.out.println(name + " " + lastName + " Usted es Mayor de Edad, Por lo tanto Puede Entrar a la Fiesta");
            } else{
                System.out.println(name + " " + lastName + " Usted es Menor de Edad, Por lo tanto no Puede Entrar a la Fiesta, Por favor Devuelvase a su casa");
            }
        }


    }


}
