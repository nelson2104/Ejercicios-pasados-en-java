import java.util.Scanner;
public class Ciclo7 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);

        boolean seguir = false;
        int opcion, tel,vehiculos, ref, continuar, vehiculoRef = 0;
        String nombre, placa, marca = "";
        int vehiculo1, vehiculo2,vehiculo3,vehiculo4,vehiculo5 = 0;

        vehiculoRef = 1;
        vehiculos = 0;
        vehiculo1 = 0;
        vehiculo2 = 0;
        vehiculo3 = 0;
        vehiculo4 = 0;
        vehiculo5 = 0;

        do {
            System.out.println("Parqueadero El Guardian, BIENVENIDOS");
            System.out.println("1. Ingresar al Parqueadero");
            System.out.println("2. Retirar del Parqueadero");
            System.out.println("3. Consultar Vehiculos");
            opcion = Integer.parseInt(input.nextLine());

            switch(opcion){
                case 1:
                    System.out.println("Ingresa Tu nombre Completo");
                    nombre = input.nextLine();

                    System.out.println("Digita tu Numero Telefonico");
                    tel = Integer.parseInt(input.nextLine());

                    System.out.println("Registra La Placa de Tu Vehiculo");
                    placa = input.nextLine();

                    System.out.println("Marca del Vehiculo?");
                    marca = input.nextLine();

                    System.out.println("Ingreso Exitoso!");
                    vehiculos = vehiculos +1;
                    vehiculo1 = 1;
                    System.out.println("A Su Vehiculo se le Asigno el #" + vehiculoRef++ +" Como Referencia de Salida");

                    if(vehiculos == 5){
                        System.out.println("El Parqueadero Esta Lleno");
                    } 
                    break;
                case 2:
                    System.out.println("Cual es La Referencia Que se Le Asigno a Su Vehiculo?");
                    System.out.println("1.");
                    System.out.println("2.");
                    System.out.println("3.");
                    System.out.println("4.");
                    System.out.println("5.");
                    ref = Integer.parseInt(input.nextLine());
                        switch(ref){
                            case 1:
                                if(vehiculo1 == 1){
                                    System.out.println("Retirando Vehiculo con Referencia #1 del Parqueadero");
                                    vehiculo1 = 0;
                                    vehiculos = vehiculos -1;
                                } else {
                                    System.out.println("No Existe Vehiculo Con Ese Numero de Referencia");
                                } break;

                            case 2:
                                if(vehiculo2 == 2){
                                    System.out.println("Retirando Vehiculo con Referencia #2 del Parqueadero");
                                    vehiculo2 = 0;
                                    vehiculos = vehiculos -1;
                                } else {
                                    System.out.println("No Existe Vehiculo Con Ese Numero de Referencia");
                                } break;

                            case 3:
                                if(vehiculo3 == 3){
                                    System.out.println("Retirando Vehiculo con Referencia #3 del Parqueadero");
                                    vehiculo3 = 0;
                                    vehiculos = vehiculos -1;
                                } else {
                                    System.out.println("No Existe Vehiculo Con Ese Numero de Referencia");
                                } break;

                            case 4:
                                if(vehiculo4 == 4){
                                    System.out.println("Retirando Vehiculo con Referencia #4 del Parqueadero");
                                    vehiculo4 = 0;
                                    vehiculos = vehiculos -1;
                                } else {
                                    System.out.println("No Existe Vehiculo Con Ese Numero de Referencia");
                                } break;

                            case 5:
                                if(vehiculo5 == 5){
                                    System.out.println("Retirando Vehiculo con Referencia #5 del Parqueadero");
                                    vehiculo5 = 0;
                                    vehiculos = vehiculos -1;
                                } else {
                                    System.out.println("No Existe Vehiculo Con Ese Numero de Referencia");
                                } break;

                            default:
                                    System.out.println("Opcion No Valida");
                                    break;

                        }

                case 3:
                        System.out.println("Vehiculos Ingresados : " + vehiculos);
                        break;

                default: 
                        System.out.println("Opcion No Valida");
                        break;

            }

            if(vehiculos == 0){
                System.out.println("No Tenemos Vehiculos En Nuestro Parqueadero Hasta el Momento");
            }

            System.out.println("DESEA CONTINUAR EN EL PROCESO?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            continuar = Integer.parseInt(input.nextLine());
            if(continuar == 1){
                seguir = true;
            } else {
                seguir = false;
            }
            
        } while (seguir == true || vehiculos == 5 || vehiculoRef == 5);
    }   
}
