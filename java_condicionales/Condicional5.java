import java.util.Scanner;
public class Condicional5 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int devolucion = 0;
            int cantidad = 0;
            int compra = 0;
            int opcion = 0;
            int doc = 0;
            int precio1 = 1000;
            int precio2 = 700;
            int precio3 = 650;
            int precio4 = 1200;
            int precio5 = 900;

            String nombre = "";
            String producto1 = "Acetamenofen";
            String producto2 = "Dolex Forte";
            String producto3 = "Apronax";
            String producto4 = "Aspirina";
            String producto5 = "Sevedol";

                System.out.println("DROGUERIA MI SALUD");
                System.out.println("DIRECCION: LOCALIDAD DE SUBA\n");
                System.out.println("Ingrese su Nombre Completo por Favor:");
                nombre = input.nextLine();
                
                System.out.println("Ingrese su Numero de Documento:");
                doc = input.nextInt();

                System.out.println("Gracias por su Visita a Nuestra Drogueria Señor "+ nombre + " Que Servicio desea Consultar:");
                System.out.println("ELIJA UNA OPCION:\n");
                System.out.println("1." + " Consulta de Precios");
                System.out.println("2." + " Compra de Producto");
                System.out.println("3." + " Salir\n");
                opcion = input.nextInt();

                switch(opcion){
                    case 1:
                        System.out.println("La Lista de Precios es La Siguiente:\n");
                        System.out.println("1. " + producto1 + " - " + precio1 + " $");
                        System.out.println("2. " + producto2 + " - " + precio2 + " $");
                        System.out.println("3. " + producto3 + " - " + precio3 + " $");
                        System.out.println("4. " + producto4 + " - " + precio4 + " $");
                        System.out.println("5. " + producto5 + " - " + precio5 + " $");
                        break;
                    case 2:
                        System.out.println("Elija Cual Producto desea Comprar:\n");
                        System.out.println("1." + producto1);
                        System.out.println("2." + producto2);
                        System.out.println("3." + producto3);
                        System.out.println("4." + producto4);
                        System.out.println("5." + producto5);
                        compra = input.nextInt();

                        System.out.println("Que Cantidad Desea Llevar?:\n");
                        System.out.println("1 Unidad");
                        System.out.println("2 Unidades");
                        System.out.println("3 Unidades");
                        System.out.println("4 Unidades");
                        System.out.println("5 Unidades");
                        cantidad = input.nextInt();
                        
                        switch(compra){
                            case 1:
                                System.out.println("Gracias Por su Compra, El total a Pagar es " + (precio1*cantidad) + " $\n");
                                System.out.println("Tienes algun Problema con Respecto a La Medicina?\n");
                                System.out.println("1. SI");
                                System.out.println("2. NO\n");
                                devolucion = input.nextInt();
                                if(devolucion == 1){
                                    System.out.println("Medicina Devuelta Correctamente, Lamentamos lo Sucedido");
                                }
                                break;

                            case 2:
                                System.out.println("Gracias Por su Compra, El total a Pagar es " + (precio2*cantidad) + " $\n");
                                System.out.println("Tienes algun Problema con Respecto a La Medicina?\n");
                                System.out.println("1. SI");
                                System.out.println("2. NO\n");
                                devolucion = input.nextInt();
                                if(devolucion == 1){
                                    System.out.println("Medicina Devuelta Correctamente, Lamentamos lo Sucedido");
                                }
                                break;

                            case 3:
                                System.out.println("Gracias Por su Compra, El total a Pagar es " + (precio3*cantidad) + " $\n");
                                System.out.println("Tienes algun Problema con Respecto a La Medicina?\n");
                                System.out.println("1. SI");
                                System.out.println("2. NO\n");
                                devolucion = input.nextInt();
                                if(devolucion == 1){
                                    System.out.println("Medicina Devuelta Correctamente, Lamentamos lo Sucedido");
                                }
                                break;

                            case 4:
                                System.out.println("Gracias Por su Compra, El total a Pagar es " + (precio4*cantidad) + " $\n");
                                System.out.println("Tienes algun Problema con Respecto a La Medicina?\n");
                                System.out.println("1. SI");
                                System.out.println("2. NO\n");
                                devolucion = input.nextInt();
                                if(devolucion == 1){
                                    System.out.println("Medicina Devuelta Correctamente, Lamentamos lo Sucedido");
                                }
                                break;

                            case 5:
                                System.out.println("Gracias Por su Compra, El total a Pagar es " + (precio5*cantidad) + " $\n");
                                System.out.println("Tienes algun Problema con Respecto a La Medicina?\n");
                                System.out.println("1. SI");
                                System.out.println("2. NO\n");
                                devolucion = input.nextInt();
                                if(devolucion == 1){
                                    System.out.println("Medicina Devuelta Correctamente, Lamentamos lo Sucedido");
                                }
                                break;

                            default:
                                System.out.println("Medicina No Disponible En Este Momento");
                        }
                         
                     


                    case 3:
                        System.out.println("Lo Esperamos Para una Proxima Ocasion, Que tenga un Buen dia");
                        break;
                        
                    default:
                        System.out.println("Opcion Invalida");
                        break;

                }
        }

    }
}
