import java.util.Scanner;
public class Condicional8 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int id = 0;
            int decoraciones = 0;
            int decoracionExtra = 5000;
            int compra = 0;
            int cantidad = 0;
            String nombreCompleto = "";
            String sabor1 = "Chocolate";
            String sabor2 = "Vainilla";
            String sabor3 = "Fresa";
            String sabor4 = "Arequipe";
            String sabor5 = "Chocolate Con Mani";

            int precio1 = 15000;
            int precio2 = 12000;
            int precio3 = 14500;
            int precio4 = 16000;
            int precio5 = 22500;

            System.out.println("BIENVENIDO A LA PASTELERIA DE DON CARLOS, LA MEJOR PASTELERIA DE LA CIUDAD");
            System.out.println("Ingresanos Tu nombre y apellidos");
            nombreCompleto = input.nextLine();

            System.out.println("Numero de Identidad Por favor?");
            id = input.nextInt();

            System.out.println("Bienvenido " + nombreCompleto);
            System.out.println("LOS SABORES DISPONIBLES QUE TENEMOS SON LOS SIGUIENTES: CUAL DE ESTOS DESEAS LLEVAR?");
            System.out.println("1. " + sabor1);
            System.out.println("2. " + sabor2);
            System.out.println("3. " + sabor3);
            System.out.println("4. " + sabor4);
            System.out.println("5. " + sabor5);
            compra = input.nextInt();

            System.out.println("QUE CANTIDAD EN PORCIONES DESEAS LLEVAR?");
            System.out.println("1 Unidad");
            System.out.println("2 Unidades");
            System.out.println("3 Unidades");
            System.out.println("4 Unidades");
            System.out.println("5 Unidades");
            cantidad = input.nextInt();

            System.out.println("REQUIERES LA TORTA CON DECORACIONES? , TENGA EN CUENTA QUE LA DECORACION TIENE UN PRECIO EXTRA DE:" + decoracionExtra + "$");
            System.out.println("1. SI");
            System.out.println("2. NO");
            decoraciones = input.nextInt();

            if(decoraciones == 1){
                switch(compra){
                    case 1:
                        System.out.println("Gracias Por su Compra Estiamdo " + nombreCompleto + " El Total a Pagar es: $ " + (precio1*cantidad+decoracionExtra));
                        System.out.println("Su Respectivo Pedido, Estara Llegando En Minutos a Su Direecion de Domicilio");
                        break;
                    case 2:
                        System.out.println("Gracias Por su Compra Estiamdo " + nombreCompleto + " El Total a Pagar es: $ " + (precio2*cantidad+decoracionExtra));
                        System.out.println("Su Respectivo Pedido, Estara Llegando En Minutos a Su Direecion de Domicilio");
                        break;
                    case 3:
                        System.out.println("Gracias Por su Compra Estiamdo " + nombreCompleto + " El Total a Pagar es: $ " + (precio3*cantidad+decoracionExtra));
                        System.out.println("Su Respectivo Pedido, Estara Llegando En Minutos a Su Direecion de Domicilio");
                        break;
                    case 4:
                        System.out.println("Gracias Por su Compra Estiamdo " + nombreCompleto + " El Total a Pagar es: $ " + (precio4*cantidad+decoracionExtra));
                        System.out.println("Su Respectivo Pedido, Estara Llegando En Minutos a Su Direecion de Domicilio");
                        break;
                    case 5:
                        System.out.println("Gracias Por su Compra Estiamdo " + nombreCompleto + " El Total a Pagar es: $ " + (precio5*cantidad+decoracionExtra));
                        System.out.println("Su Respectivo Pedido, Estara Llegando En Minutos a Su Direecion de Domicilio");
                        break;
                    default:
                        System.out.println("La Opcion Que Elegiste No Esta Disponible");
                        break;
                }

            } else {
                switch(compra){
                    case 1:
                        System.out.println("Gracias Por su Compra Estiamdo " + nombreCompleto + " El Total a Pagar es: $ " + (precio1*cantidad));
                        System.out.println("Su Respectivo Pedido, Estara Llegando En Minutos a Su Direecion de Domicilio");
                        break;
                    case 2:
                        System.out.println("Gracias Por su Compra Estiamdo " + nombreCompleto + " El Total a Pagar es: $ " + (precio2*cantidad));
                        System.out.println("Su Respectivo Pedido, Estara Llegando En Minutos a Su Direecion de Domicilio");
                        break;
                    case 3:
                        System.out.println("Gracias Por su Compra Estiamdo " + nombreCompleto + " El Total a Pagar es: $ " + (precio3*cantidad));
                        System.out.println("Su Respectivo Pedido, Estara Llegando En Minutos a Su Direecion de Domicilio");
                        break;
                    case 4:
                        System.out.println("Gracias Por su Compra Estiamdo " + nombreCompleto + " El Total a Pagar es: $ " + (precio4*cantidad));
                        System.out.println("Su Respectivo Pedido, Estara Llegando En Minutos a Su Direecion de Domicilio");
                        break;
                    case 5:
                        System.out.println("Gracias Por su Compra Estiamdo " + nombreCompleto + " El Total a Pagar es: $ " + (precio5*cantidad));
                        System.out.println("Su Respectivo Pedido, Estara Llegando En Minutos a Su Direecion de Domicilio");
                        break;
                    default:
                        System.out.println("La Opcion Que Elegiste No Esta Disponible");
                        break;

                }

            }
        }
    }
}
