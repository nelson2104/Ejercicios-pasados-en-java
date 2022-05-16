import java.util.Scanner;
public class Condicional10 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {

            String nombre = "";
            int cedula, transaccion, retiro, Ingreso = 0;
            int saldo = 6000000;

            System.out.println("Bienvenidos a Su Banco Fiel\n");
            System.out.println("Por Favor Ingrese su Nombre Completo");
            nombre = input.nextLine();

            System.out.println("Ingrese Su Numero De Documento Por Favor");
            cedula = input.nextInt();

            System.out.println("Bienvenido " + nombre + " Usted es el Titular de Su Cuenta #000034534\n");
            System.out.println("Que Proceso Usted desea Realizar?");
            System.out.println("1. Consulta De Saldo");
            System.out.println("2. Retiro");
            System.out.println("3. Ingreso");
            transaccion = input.nextInt();


            switch(transaccion){
                case 1:
                    System.out.println("Actualmente su Cuenta Tiene un Saldo de: $ " + saldo);
                    break;

                case 2:
                    System.out.println("Cuanto dinero Desea Usted Retirar?");
                    retiro = input.nextInt();
                        if(retiro > saldo){
                            System.out.println("ERROR!!, Su retiro es Mayor Con Respecto aL Saldo Que Tiene Disponible en su Cuenta");

                        }else {
                            System.out.println("PROCESANDO SU RETIRO...\n");
                            System.out.println("Se han Descontado $ " + retiro + " de su Cuenta");
                            System.out.println("EXPULSANDO DINERO...\n");
                            System.out.println("Su Total ahora es de $ " + (saldo-retiro));
                        } break;
                
                case 3:
                System.out.println("Digite el Monto de Dinero Que desea Usted Embolsar en su Cuenta");
                Ingreso = input.nextInt();
                        if(Ingreso > 0){
                            System.out.println("Procesando Ingreso, y Embolsando Dinero a cuenta\n");
                            System.out.println("Ahora su saldo en Cuenta es de: $ "+ (saldo+Ingreso));
                        } else {
                            System.out.println("ERROR!!, No Puede Ingresar Montos Negativos");
                        } break;

                default:
                    System.out.println("Opcion Invalida");
                    break;

            }


        }
        
    }
}
