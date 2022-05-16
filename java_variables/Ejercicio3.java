import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nombre = "";
        String nombreMadre = "";
        String nombrePadre = "";

        System.out.println("Cual es tu nombre Completo?");
        nombre = in.nextLine();

        System.out.println("Cual es el Nombre de tu Madre?");
        nombreMadre = in.nextLine();
        
        System.out.println("Cual es el Nombre de tu Padre?");
        nombrePadre = in.nextLine();

        System.out.println("Yo " + nombre + " Soy Hijo de " + nombreMadre + " Y " + nombrePadre);
    }
}