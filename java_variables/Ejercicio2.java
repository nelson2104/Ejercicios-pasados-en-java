import java.util.Scanner;
public class Ejercicio2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nombre = "";
        String apellidos = "";
        int edad = 0;
        float estatura = 0;

        System.out.println("Cual es tu nombre?");
        nombre = in.nextLine();

        System.out.println("Cual es tu Apellido?");
        apellidos = in.nextLine();

        System.out.println("Cual es tu edad?");
        edad = in.nextInt();
        
        System.out.println("Cual es tu Estatura");
        estatura = in.nextFloat();
    }
}