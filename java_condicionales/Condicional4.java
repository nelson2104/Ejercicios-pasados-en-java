import java.util.Scanner;
public class Condicional4 {
    public static void main(String args[]){

        try (Scanner input = new Scanner(System.in)) {
            int opcion1;
            int opcion2;
            int anotacion;
            String nombre = "";

            String pelicula1 = "Harry Potter";
            String pelicula2 = "Camino hacia el Terror";
            String pelicula3 = "La Casa de Cera";
            String pelicula4 = "Juegos Macabros";
            String pelicula5 = "Jack el Cazagigantes";
            

            System.out.println("********* BIENVENIDOS A LA VIDEOTIENDA**********");
            System.out.println("***** DIRECCION BARRIO EL PORVENIR*******");
            System.out.println("Por Favor Ingresa tu Nombre Completo en Nuestra Base de Datos");
            nombre = input.nextLine();
            System.out.println("Bienvenido Señor "+ nombre + " Tenemos estas Peliculas Disponibles para Usted, Cual de estas Peliculas le Gustaria Alquilar?");
            System.out.println("1." + pelicula1);
            System.out.println("2." + pelicula2);
            System.out.println("3." + pelicula3);
            System.out.println("4." + pelicula4);
            System.out.println("5." + pelicula5);
            opcion1 = input.nextInt();

            switch(opcion1){
                case 1:
                    System.out.println("Desea Confirmar el Alquiler de la Pelicula " + pelicula1 + " ?");
                    System.out.println("1." + "SI");
                    System.out.println("2." + "NO");
                    opcion2 = input.nextInt();
                    switch(opcion2){
                        case 1:
                            System.out.println("Gracias Por su Alquiler Señor " + nombre + " Que La Disfrute");
                            System.out.println("Comfirme si Tuvo algun Problema Con Respecto a la Pelicula, Elija una Opcion:");
                            System.out.println("1."+ "SI");
                            System.out.println("2."+ "NO");
                            anotacion = input.nextInt();
                            switch(anotacion){
                                case 1:
                                    System.out.println("Lamentamos que hayas Tenido Problemas Con respecto a la Pelicula, Trabajaremos para Que Casos Como Estos no se Presenten, Una Disculpa de Antemano");
                                    break;
                                case 2:
                                    System.out.println("Gracias por su Aporte Querido Cliente");
                                    break;
                                default:
                                    System.out.println("Opcion No Valida");
                                    break;
                            } break;
                        case 2:
                            System.out.println("Lo Invitamos a Volver a ver Nuestro Catalogo de Peliculas Disponibles");
                            break;
                        default:
                            System.out.println("Opcion No Valida");
                            break;
                    } break;
                case 2:
                    System.out.println("Desea Confirmar el Alquiler de la Pelicula " + pelicula2 + " ?");
                    System.out.println("1." + "SI");
                    System.out.println("2." + "NO");
                    opcion2 = input.nextInt();
                    switch(opcion2){
                        case 1:
                            System.out.println("Gracias Por su Alquiler Señor " + nombre + " Que La Disfrute");
                            System.out.println("Comfirme si Tuvo algun Problema Con Respecto a la Pelicula, Elija una Opcion:");
                            System.out.println("1."+ "SI");
                            System.out.println("2."+ "NO");
                            anotacion = input.nextInt();
                            switch(anotacion){
                                case 1:
                                    System.out.println("Lamentamos que hayas Tenido Problemas Con respecto a la Pelicula, Trabajaremos para Que Casos Como Estos no se Presenten, Una Disculpa de Antemano");
                                    break;
                                case 2:
                                    System.out.println("Gracias por su Aporte Querido Cliente");
                                    break;
                                default:
                                    System.out.println("Opcion No Valida");
                                    break;
                            } break;
                        case 2:
                            System.out.println("Lo Invitamos a Volver a ver Nuestro Catalogo de Peliculas Disponibles");
                            break;
                        default:
                            System.out.println("Opcion No Valida");
                            break;
                    } break;
                case 3:
                    System.out.println("Desea Comfirmar el Alquiler de la Pelicula " + pelicula3 + " ?");
                    System.out.println("1." + "SI");
                    System.out.println("2." + "NO");
                    opcion2 = input.nextInt();
                    switch(opcion2){
                        case 1:
                            System.out.println("Gracias Por su Alquiler Señor " + nombre + " Que La Disfrute");
                            System.out.println("Comfirme si Tuvo algun Problema Con Respecto a la Pelicula, Elija una Opcion:");
                            System.out.println("1."+ "SI");
                            System.out.println("2."+ "NO");
                            anotacion = input.nextInt();
                            switch(anotacion){
                                case 1:
                                    System.out.println("Lamentamos que hayas Tenido Problemas Con respecto a la Pelicula, Trabajaremos para Que Casos Como Estos no se Presenten, Una Disculpa de Antemano");
                                    break;
                                case 2:
                                    System.out.println("Gracias por su Aporte Querido Cliente");
                                    break;
                                default:
                                    System.out.println("Opcion No Valida");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Lo Invitamos a Volver a ver Nuestro Catalogo de Peliculas Disponibles");
                            break;
                        default:
                            System.out.println("Opcion No Valida");
                            break;
                    } break;
                case 4:
                    System.out.println("Desea Comfirmar el Alquiler de la Pelicula " + pelicula4 + " ?");
                    System.out.println("1." + "SI");
                    System.out.println("2." + "NO");
                    opcion2 = input.nextInt();
                    switch(opcion2){
                        case 1:
                            System.out.println("Gracias Por su Alquiler Señor " + nombre + " Que La Disfrute");
                            System.out.println("Comfirme si Tuvo algun Problema Con Respecto a la Pelicula, Elija una Opcion:");
                            System.out.println("1."+ "SI");
                            System.out.println("2."+ "NO");
                            anotacion = input.nextInt();
                            switch(anotacion){
                                case 1:
                                    System.out.println("Lamentamos que hayas Tenido Problemas Con respecto a la Pelicula, Trabajaremos para Que Casos Como Estos no se Presenten, Una Disculpa de Antemano");
                                    break;
                                case 2:
                                    System.out.println("Gracias por su Aporte Querido Cliente");
                                    break;
                                default:
                                    System.out.println("Opcion No Valida");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Lo Invitamos a Volver a ver Nuestro Catalogo de Peliculas Disponibles");
                            break;
                        default:
                            System.out.println("Opcion No Valida");
                            break;
                    } break;
                case 5:
                    System.out.println("Desea Comfirmar el Alquiler de la Pelicula " + pelicula5 + " ?");
                    System.out.println("1." + "SI");
                    System.out.println("2." + "NO");
                    opcion2 = input.nextInt();
                    switch(opcion2){
                        case 1:
                            System.out.println("Gracias Por su Alquiler Señor " + nombre + " Que La Disfrute");
                            System.out.println("Comfirme si Tuvo algun Problema Con Respecto a la Pelicula, Elija una Opcion:");
                            System.out.println("1."+ "SI");
                            System.out.println("2."+ "NO");
                            anotacion = input.nextInt();
                            switch(anotacion){
                                case 1:
                                    System.out.println("Lamentamos que hayas Tenido Problemas Con respecto a la Pelicula, Trabajaremos para Que Casos Como Estos no se Presenten, Una Disculpa de Antemano");
                                    break;
                                case 2:
                                    System.out.println("Gracias por su Aporte Querido Cliente");
                                    break;
                                default:
                                    System.out.println("Opcion No Valida");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Lo Invitamos a Volver a ver Nuestro Catalogo de Peliculas Disponibles");
                            break;
                        default:
                            System.out.println("Opcion No Valida");
                            break;
                    } break;
                default:
                    System.out.println("UPPPS¡¡ Opcion No Valida");
                    break;
                    
            }
        }
    }
}