import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorVuelos gestor = new GestorVuelos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- GESTOR DE VUELOS ---");
            System.out.println("1. Insertar vuelo");
            System.out.println("2. Consultar vuelos por día");
            System.out.println("3. Consultar vuelos por semana");
            System.out.println("4. Reservar vuelo");
            System.out.println("5. Mostrar vuelos reservados");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Origen: ");
                    String origen = sc.nextLine();
                    System.out.print("Destino: ");
                    String destino = sc.nextLine();
                    System.out.print("Fecha (yyyy-mm-dd): ");
                    String fecha = sc.nextLine();
                    gestor.insertarVuelos(destino, origen, fecha);
                    System.out.println("Vuelo insertado.");
                    break;

                case 2:
                    System.out.print("Introduce la fecha (yyyy-mm-dd): ");
                    String dia = sc.nextLine();
                    Vuelos[] vuelosDia = gestor.consultarVueloDia(dia);
                    if (vuelosDia.length == 0) {
                        System.out.println("No hay vuelos ese día.");
                    } else {
                        for (int i = 0; i < vuelosDia.length; i++) {
                            System.out.println(i + ": " + vuelosDia[i].toString());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Introduce la fecha de inicio (yyyy-mm-dd): ");
                    String semana = sc.nextLine();
                    Vuelos[] vuelosSemana = gestor.consultarVueloSemana(semana);
                    if (vuelosSemana.length == 0) {
                        System.out.println("No hay vuelos esa semana.");
                    } else {
                        for (Vuelos v : vuelosSemana) {
                            System.out.println(v.toString());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Introduce la fecha del vuelo (yyyy-mm-dd): ");
                    String fechaReserva = sc.nextLine();
                    Vuelos[] disponibles = gestor.consultarVueloDia(fechaReserva);
                    if (disponibles.length == 0) {
                        System.out.println("No hay vuelos para reservar.");
                    } else {
                        for (int i = 0; i < disponibles.length; i++) {
                            System.out.println(i + ": " + disponibles[i].toString());
                        }
                        System.out.print("Introduce tu nombre de usuario: ");
                        String usuario = sc.nextLine();
                        System.out.print("Selecciona el número del vuelo: ");
                        int index = sc.nextInt();
                        sc.nextLine();
                        if (index >= 0 && index < disponibles.length) {
                            gestor.reservarVuelo(usuario, disponibles[index]);
                            System.out.println("Vuelo reservado.");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 5:
                    Vuelos[] reservados = gestor.vuelosReservados(gestor.vuelos);
                    if (reservados.length == 0) {
                        System.out.println("No hay vuelos reservados.");
                    } else {
                        for (Vuelos v : reservados) {
                            System.out.println(v.toString());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del gestor...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

        sc.close();
    }
}
