import javax.swing.undo.UndoableEditSupport;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        int eleccion = 0;
        GestorVuelos gv = new GestorVuelos();
        String destino = "";
        String origen = "";
        String fecha = "";
        String usuario = "";
        do {
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1 -> {
                    System.out.println("Inserta el destino: ");
                    destino = sc.next();
                    System.out.println("Inserta el origen: ");
                    origen = sc.next();
                    System.out.println("Inserta fecha: ");
                    fecha = sc.next();
                    gv.insertarVuelos(destino, origen, fecha);
                } //añadir vuelos disponibles
                case 2 -> {
                    System.out.println("Quieres buscar por dia o por semana?");
                    System.out.println("1. Por dia.");
                    System.out.println("2. Por semana");
                    eleccion = sc.nextInt();
                    switch (eleccion) {
                        case 1 -> {
                            System.out.println("Indica el dia: ");
                            fecha = sc.next();
                            gv.consultarVueloDia(fecha);
                        }
                        case 2 -> {
                            System.out.println("Indica la semana: ");
                            fecha = sc.next();
                            gv.consultarVueloSemana(fecha);
                        }
                    }
                }  //consultar vuelos disponibles por dia y por semana
                case 3 -> {
                    System.out.println("Indica tu nombre: ");
                    usuario = sc.next();
                    System.out.println("Indica el vuelo: ");

                } //reservar un vuelo para un usuario
                case 4 -> {

                }  //consultar los vuelos reservados por parte de un usuario
                case 5 -> {

                }  //cancelas una reserva
                case 6 -> {

                } //enviar notificaciones mediante metodo ecterno (?)
                case 7 ->  {
                    seguir = false;
                }
            }
        } while (seguir);
    }
}