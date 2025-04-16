import java.util.Arrays;

public class GestorVuelos {
    Vuelos []vuelos = new Vuelos[0];
    Reservas []reservas = new Reservas[0];

    public Vuelos[] consultarVueloDia(String fechaVuelo) {
        Vuelos[] vueloDia = new Vuelos[0];
        for (int i = 0; i < vuelos.length; i++) {
            if (vuelos[i].fechaVuelo.equals(fechaVuelo)) {
                vueloDia = Arrays.copyOf(vueloDia, vueloDia.length + 1);
                vueloDia[vueloDia.length - 1] = vuelos[i];
            }
        }
        return vueloDia;
    }


    public Vuelos[] consultarVueloSemana(String fechaInicio) {
        fechaInicio = fechaInicio.replace("-", "");
        int fecha = Integer.parseInt(fechaInicio);
        Vuelos[] vueloSem = new Vuelos[0];
        for (int i = 0; i < vuelos.length; i++) {
            int fechaVuelo = Integer.parseInt(vuelos[i].fechaVuelo.replace("-", ""));
            if (fechaVuelo >= fecha && fechaVuelo <= (fecha + 7)) {
                vueloSem = Arrays.copyOf(vueloSem, vueloSem.length + 1);
                vueloSem[vueloSem.length - 1] = vuelos[i];
            }
        }
        return vueloSem;
    }

    public void insertarVuelos(String destino, String origen, String fechaInicio) {
        Vuelos vuelo = new Vuelos(destino, origen, fechaInicio, false);
        vuelos = Arrays.copyOf(vuelos, vuelos.length + 1);
        vuelos[vuelos.length - 1] = vuelo;
    }


    public void reservarVuelo(String usuario, Vuelos Vuelo) {
        Vuelo.setReservado(true);
        Reservas reserva = new Reservas(usuario, Vuelo, true);
        reservas = Arrays.copyOf(reservas, reservas.length + 1);
        reservas[reservas.length - 1] = reserva;
    }


    public void cancelarReserva(String usuario, Vuelos vuelo) {
        for (Reservas reserva : reservas) {
            if (reserva.getUsuario().equals(usuario) && 
                reserva.getVuelo().equals(vuelo)) {
                
                reserva.cancelarReserva();
                break;
            }
        }
    }

    public Vuelos[] vuelosReservados(Vuelos[] vuelosVer) {
        Vuelos[] vuelosRes = {};
        for (int i = 0; i < vuelosVer.length; i++) {
            if (vuelosVer[i].reservado) {
                vuelosRes = Arrays.copyOf(vuelosRes, vuelosRes.length + 1);
                vuelosRes[vuelosRes.length - 1] = vuelosVer[i];
            }
        }
        return vuelosRes;
    }

    public void print() {
        System.out.println("Mensaje enviado.");
    }
}