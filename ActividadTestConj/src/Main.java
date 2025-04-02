import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        int eleccion = 0;

        do {
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1 : break; //añadir vuelos disponibles
                case 2 : break; //consultar vuelos disponibles por dia y por semana
                case 3 : break; //reservar un vuelo para un usuario
                case 4 : break; //consultar los vuelos reservados por parte de un usuario
                case 5 : break; //cancelas una reserva
                case 6 : break; //enviar notificaciones mediante metodo ecterno (?)
                case 7 :  {
                    seguir = false;
                    break;
                }
            }
        } while (seguir);
    }
}