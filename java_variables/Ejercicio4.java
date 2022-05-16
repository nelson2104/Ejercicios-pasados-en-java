import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String ciudad = "";
        String pais = "";
        
        System.out.println("Dame un Nombre de Una Ciudad Capital:");
        ciudad = in.nextLine();
        
        System.out.println("Digita el Pais:");
        pais = in.nextLine();

        System.out.println("La Ciudad " + ciudad + " Es la Capital del Pais " + pais);
    }
}