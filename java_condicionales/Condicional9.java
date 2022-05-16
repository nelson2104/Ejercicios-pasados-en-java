import java.util.Scanner;
public class Condicional9 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int figura = 0;
            int baseTrinagulo, alturaTriangulo, baseRectangulo, alturaRectangulo, baseMayor, baseMenor,alturaTrapecio = 0;
            float areaTriangulo, areaRectangulo, areaTrapecio = 0;


            System.out.println("A Cual de Las Siguientes Figuras Le Deseas Hallar el Area?:");
            System.out.println("1. Triangulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Trapecio");
            figura = input.nextInt();

            if(figura == 1){
                System.out.println("Ingresa la Base del Triangulo");
                baseTrinagulo = input.nextInt();

                System.out.println("Ingresa la Altura del Triangulo");
                alturaTriangulo = input.nextInt();

                System.out.println("El Area del Triangulo es: " + (baseTrinagulo*alturaTriangulo) / 2);
                areaTriangulo = input.nextFloat();

            } else if (figura == 2){
                System.out.println("Ingresa la Base del Rectangulo");
                baseRectangulo = input.nextInt();

                System.out.println("Ingresa la Altura del Rectangulo");
                alturaRectangulo = input.nextInt();

                System.out.println("El Area del Rectangulo es: " + (baseRectangulo*alturaRectangulo) / 2);
                areaRectangulo = input.nextFloat();

            } else if (figura == 3){
                System.out.println("Ingresa La Base Mayor del Trapecio");
                baseMayor = input.nextInt();

                System.out.println("Ingresa La Base Menor del Trapecio");
                baseMenor = input.nextInt();

                System.out.println("Ingresa la Altura del Trapecio");
                alturaTrapecio = input.nextInt();

                System.out.println("El Area Del Trapecio es: " + ((baseMayor+baseMenor)* alturaTrapecio) / 2 );
                areaTrapecio = input.nextFloat();

            } else {
                System.out.println("La Figura que Seleccionaste No Esta Disponible");
            }
        }

    }
}
