import java.util.Scanner;
public class Ciclo8 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);

        String nombre = "";
        int doc, edad, manejo, usuarios = 0;
        int respuesta1,respuesta2,respuesta3,respuesta4,respuesta5, puntaje = 0;

        for(usuarios = 0; usuarios <= 8; usuarios++){
            System.out.println("*************** ESCUELA AUTOMOVILISTICA EL MAESTRO *****************");
        System.out.println(" BIENVENIDO");
        System.out.println("PARA REGISTRAR SU INGRESO AL CURSO, INGRESE TODA LA SIGUIENTE INFORMACION:\n");
        System.out.println("Digita tu Nombre Completo");
        nombre = input.nextLine();

        System.out.println("Digita tu numero de Documento");
        doc = Integer.parseInt(input.nextLine());

        System.out.println("Cual es su edad?");
        edad = Integer.parseInt(input.nextLine());

        System.out.println("TENGA EN CUENTA QUE, PARA APROBAR EL CURSO DEBE SACAR UN PUNTAJE DE 8 HASTA 10, DE LO CONTRARIO EL CURSO NO LE SERA APROBADO");
        System.out.println("CONSTA DE 5 PREGUNTAS CADA UNA EQUIVALE A 2 PUNTOS, DESEA EMPEZAR SU CURSO DE MANEJO?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        manejo = Integer.parseInt(input.nextLine());

        if(manejo == 1){
            System.out.println("El Curso Ha Iniciado...\n");
            System.out.println("PRIMERA PREGUNTA:");
            System.out.println("¿Cuando maneje en niebla, lluvia o nieve, debe usar?:");
            System.out.println("1. Luces Bajas");
            System.out.println("2. Luces Altas");
            System.out.println("3. Solo Direccionales");
            respuesta1 = Integer.parseInt(input.nextLine());

                if(respuesta1 == 2){
                    System.out.println("RESPUESTA CORRECTA!");
                    puntaje = puntaje + 2;
                }else {
                    System.out.println("RESPUESTA INCORRECTA");
                    puntaje = puntaje + 0;

                }
                System.out.println("SEGUNDA PREGUNTA:");
                System.out.println("¿Cuando Vaya a Girar a la izquierda, Que debe señalizar?:");
                System.out.println("1. Direccional Derecho");
                System.out.println("2. Direccionales Completos (4)");
                System.out.println("3. Direccional Izquierdo");
                respuesta2 = Integer.parseInt(input.nextLine());

                    if(respuesta2 == 3){
                        System.out.println("RESPUESTA CORRECTA!");
                        puntaje = puntaje + 2;
                    }else {
                        System.out.println("RESPUESTA INCORRECTA");
                        puntaje = puntaje + 0;

                }  
                System.out.println("TERCERA PREGUNTA:");
                System.out.println("¿Un Conductor Va Manejando Sin Su Cinturon de seguridad, ¿ES CORRECTO?:");
                System.out.println("1. si, Porque va a Poca Velocidad");
                System.out.println("2. si, Porque va solo el en el auto");
                System.out.println("3. No, Debe ir Ajustado y Abrochado");
                respuesta3 = Integer.parseInt(input.nextLine());

                    if(respuesta3 == 3){
                        System.out.println("RESPUESTA CORRECTA!");
                        puntaje = puntaje + 2;
                    }else {
                        System.out.println("RESPUESTA INCORRECTA");
                        puntaje = puntaje + 0;


                }
                System.out.println("CUARTA PREGUNTA:");
                System.out.println("¿De Cuanta es La Distancia En Metros Que se Debe Tener Cuando Un Vehiculo Esta Delante?:");
                System.out.println("1. 5 Metros");
                System.out.println("2. 1 Metro");
                System.out.println("3. 3 Metros");
                respuesta4 = Integer.parseInt(input.nextLine());

                    if(respuesta4 == 3){
                        System.out.println("RESPUESTA CORRECTA!");
                        puntaje = puntaje + 2;
                    }else {
                        System.out.println("RESPUESTA INCORRECTA");
                        puntaje = puntaje + 0;
                }
                System.out.println("QUINTA Y ULTIMA PREGUNTA:");
                System.out.println("¿Cuando Va a Estacionar Su Vehiculo en una carretera Principal Que es lo Mas Correcto:");
                System.out.println("1. Dejar El Vehiculo Apagado y Con El seguro Activado");
                System.out.println("2. Dejar El Vehiculo apagado, Con El Seguro Activado y Con Luces De Parqueo");
                System.out.println("3. solo Apagarlo");
                respuesta5 = Integer.parseInt(input.nextLine());
                
                    if(respuesta5 == 2){
                        System.out.println("RESPUESTA CORRECTA!");
                        puntaje = puntaje + 2;
                    }else {
                        System.out.println("RESPUESTA INCORRECTA");
                        puntaje = puntaje + 0;
                }

                System.out.println("SU PUNTAJE FINAL ES: " + puntaje);
                if(puntaje < 8){
                    System.out.println("HAS PERDIDO EL CURSO TEORICO, POR LO TANTO NO OBTUVISTE LICENCIA");
                    usuarios = usuarios + 1;
                }  else {
                    System.out.println("FELICITACIONES!! " + nombre + " HAS PASADO EL CURSO TEORICO, OBTUVISTE LA LICENCIA");
                    usuarios = usuarios + 1;
                }
  } else {
      System.out.println("LO ESPERAMOS CON GUSTO PARA UNA PROXIMA OCASION");
      
  }
        }
 }
}