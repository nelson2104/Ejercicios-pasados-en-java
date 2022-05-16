import java.util.Scanner;
public class Condicional6 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int observaciones = 0;
            int confirmacion= 0;
            int cilindraje = 0;
            String nombre = "";



      System.out.println("BIENVENIDOS AL TALLER DE MOTOS EL MAQUINNISTA");
      System.out.println("****** UN GUSTO PODER AYUDARTE******\n");
      System.out.println("Digitanos tu nombre Por Favor:");
      nombre = input.nextLine();

      System.out.println("Bienvenido " + nombre + " Tu Motocicleta es de Alto Cilindraje?");
      System.out.println("1. SI");
      System.out.println("2. NO");
      cilindraje = input.nextInt();

            if(cilindraje == 1){
                System.out.println("Desea Usted Ingresar Su Motocicleta a Nuestro Taller?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                confirmacion = input.nextInt();
                    if(confirmacion == 1){
                        System.out.println("Cuentanos¡ Cuales son tus Observaciones de Tu Motocileta? Que problema Tiene?");
                        System.out.println("1. Problemas de Tecnomecanica");
                        System.out.println("2. Problemas en Una de sus Ruedas");
                        System.out.println("3. Necesita un Lavado General");
                        observaciones = input.nextInt();
                        
                        switch(observaciones){
                            case 1:
                                System.out.println("Comenzaremos a Realizarle un Chequeo a Tu Motocicleta, y Le realizaremos el Prcoceso Tecnomecanico que Requiera\n");
                                System.out.println("EVALUANDO...\n");
                                System.out.println(nombre + " Proceso de Chequeo Terminado, Hemos Trabajado en el Sistema Electrico de tu Moto, Reemplazando Algunas luces LED Descompuestas por Unas Totalmente Nuevas");
                                break;
                            case 2:
                                System.out.println("Verificaremos en Que Estado se Encuentran las Ruedas de La Moto, Si necesitan Aire se lo Proporcionaremos, y Si es Mas Complejo el Problema, Desmontaremos la Rueda, y Pasaremos al Cambio de Rueda\n");
                                System.out.println("EVALUANDO...\n");
                                System.out.println(nombre + " Respectivamente, Las ruedas Tuvieron Que ser Cambiadas Por su Mal Estado");
                                break;
                            case 3: 
                                System.out.println("Le Realizaremos un Lavado a La Motocicleta\n");
                                System.out.println("EVALUANDO...\n");
                                System.out.println(nombre + " Le Hemos Realizado Con exito Un Lavado General a Tu Motocicleta");
                                break;

                            default:
                                System.out.println("Lo Sentimos, Servicio u Opcion No Disponible");
                                break;
                        }


                    }else{
                        System.out.println("Te Invitamos a que Ingreses Tu Motocicleta a Nuestro Taller Para Poder Trabajar con Ella, Gracias");
                    }




            } else {
                System.out.println("Lo Sentimos " + nombre + " Solo Trabajamos En Motocicletas de Alto Cilindraje");
            }
        }



    }
}
