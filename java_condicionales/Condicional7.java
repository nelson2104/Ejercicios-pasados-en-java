import java.util.Scanner;
public class Condicional7 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            double estatura = 0;
            int peso = 0;
            int edad = 0;
            String nombre = "";
            String bajoPeso = "BAJO PESO";
            String pesoNormal = "PESO NORMAL";
            String sobrePeso = "SOBRE PESO";
            String obeso = "OBESO";

            System.out.println("BIENVENIDOS A LA SECRETARIA DE SALUD MUNICIPAL");
            System.out.println("AQUI PUEDES CONSULTAR TU PESO GRACIAS A NUESTRO SISTEMA IMC\n");

            System.out.println("Ingresa aqui tu nombre completo para almacenarlo en nuestra base de Datos");
            nombre = input.nextLine();

            System.out.println("Cual es tu Edad?");
            edad = input.nextInt();

            System.out.println("Bienvenido " + nombre);
            System.out.println("Cual es tu Peso Actual?");
            peso = input.nextInt();

            //Menor a 55kg ---- Bajo peso
            //Mayor a 55kg y Menor a 69Kg --- peso normal
            //Mayor a 69kg y Menor a 81Kg ---- sobre peso
            //Mayor a 81kg ---- obeso

            System.out.println("Cuanto es tu estatura");
            estatura = input.nextDouble();

            if(peso <= 55){
                System.out.println("Estimado " + nombre + " Verificando su peso, Su estado Actual es de: " + bajoPeso + " Le Recomendamos Alimentarse De Comidas Altas en Calorias");
                } else if (peso > 55 && peso <= 68){
                    System.out.println("Estimado " + nombre + " Verificando su peso, Su estado Actual es de: " + pesoNormal);
                } else if (peso >= 69 && peso < 81){
                    System.out.println("Estimado " + nombre + " Verificando su peso, Su estado Actual es de: " + sobrePeso + " Lo Invitamos a realizar Rutina de Ejercicio");
            } else {
                System.out.println("Estimado " + nombre + " Verificando su peso, Su estado Actual es de: " + obeso + " Le Recomendamos Visitar su Medico y Ponerse en Tratamiento");
            }
        }

    }
}
