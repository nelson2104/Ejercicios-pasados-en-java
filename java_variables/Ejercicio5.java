import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nombreMascota = "";
        String tipoDeMascota = "";
        String nombre = "";
        int edadMascota = 0;

        System.out.println("Cual es el Nombre de tu Mascota?");
        nombreMascota = in.nextLine();

        System.out.println("Que Tipo de Mascota es?");
        tipoDeMascota = in.nextLine();

        System.out.println("Cual es tu nombre?");
        nombre = in.nextLine();

        System.out.println("Que edad Tiene tu Mascota?");
        edadMascota = in.nextInt();

      
        
        System.out.println(nombreMascota + " Es un " + tipoDeMascota + " El Cual tiene " + edadMascota + " Años de Edad y " + nombre + " Es su Dueño");
    }
}