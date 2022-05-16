import java.util.Scanner;
public class Ciclo6 {
    public static void main(String args []) {
        Scanner in = new Scanner(System.in); 
            String nombre, empresa = "";
            int opcion, tel, contactos, eliminarContacto, decision = 0;
            boolean seguir = false;

            contactos = 0;

            do {
                System.out.println("OPCIONES DEL SISTEMA:");
                System.out.println("1. Registro de Usuarios");
                System.out.println("2. Usuarios Almacenados");
                System.out.println("3. Eliminar Contactos");
                opcion = Integer.parseInt(in.nextLine());

                switch(opcion){
                    case 1:
                        System.out.println("NOMBRE COMPLETO:");
                        nombre = in.nextLine();

                        System.out.println("NUMERO DE TELEFONO:");
                        tel = Integer.parseInt(in.nextLine()); 

                        System.out.println("NOMBRE DE LA ORGANIZACION:");
                        empresa = in.nextLine();

                        contactos = contactos + 1;
                        System.out.println("Registro Exitoso!");
                        break;

                    case 2:
                        System.out.println("Los Usuarios Almacnenados Son: " + contactos);
                        break;

                    case 3:
                        System.out.println("DESEA ELIMINAR CONTACTOS?");
                        System.out.println("1. SI");
                        System.out.println("2. NO");
                        
                        eliminarContacto = Integer.parseInt(in.nextLine());
                        if(contactos == 0){
                            System.out.println("UPSS!! La Lista de Contactos Esta vacia");
                        } else {
                            if(eliminarContacto == 1){
                                contactos = contactos - 1;
                                System.out.println("El Numero ahora de Contactos es " + contactos);
                            } break;
                        }

                    default:
                        System.out.println("OPCION INVALIDA");
                        break;

                }   

                
                System.out.println("DESEA CONTINUAR CON EL PROCESO?:");
                System.out.println("1. SI");
                System.out.println("2. NO");
                decision = Integer.parseInt(in.nextLine());

                    if(decision == 1){
                        seguir = true;
                    } else {
                        seguir = false;
                    }

                    if(contactos == 3){
                        System.out.println("Limite de Contactos Alcanzados");
                    }

            } while (seguir == true || contactos == 3);
        
    }
}
