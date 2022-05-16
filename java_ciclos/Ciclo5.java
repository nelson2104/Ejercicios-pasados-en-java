import java.util.Scanner;
public class Ciclo5 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);

        String nombre = "";
        int opcion = 0;
        boolean salir = false;

        do {
            System.out.println("MENU DEL USUARIO\n");
            System.out.println("NOMBRE:");
            nombre = input.nextLine();

            System.out.println("SALUDAR");
            System.out.println("Hola " + nombre + " Un Gusto Saludarte\n");

            System.out.println("DESEAS SALIR DEL SISTEMA?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            opcion = input.nextInt();

                if(opcion == 1){
                    salir = true;
                }             

        } while (salir = true);
    }
}
