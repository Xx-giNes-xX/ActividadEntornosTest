import java.util.Arrays;

public class GestorVuelos {
    Vuelos []vuelos = new Vuelos[0];
    public Vuelos[] consultarVueloDia(String fechaVuelo) {
        Vuelos []vueloDia = new Vuelos[0];
        for (int i = 0; i < vuelos.length; i++) {
            if (vuelos[i].fechaVuelo == fechaVuelo) {
                vueloDia = Arrays.copyOf(vueloDia, vuelos.length + 1);
                vueloDia[vueloDia.length - 1] = vuelos[i];
            }
        }
        return vueloDia;
    }

    public Vuelos[] consultarVueloSemana(String fechaInicio) {
        fechaInicio = fechaInicio.replace("-", "");
        int fecha = Integer.parseInt(fechaInicio);
        Vuelos [] vueloSem = new Vuelos[0];
        for (int i = 0; i < vuelos.length; i++) {
            if (Integer.parseInt(vuelos[i].fechaVuelo) >= fecha || Integer.parseInt(vuelos[i].fechaVuelo) <= fecha+7) {
                vueloSem = Arrays.copyOf(vueloSem, vuelos.length + 1);
                vueloSem[vueloSem.length - 1] = vuelos[i];
            }
        }
        return vueloSem;
    }

    public void insertarVuelos(String destino, String origen, String fechaInicio, boolean reservado) {
        Vuelos vuelo = new Vuelos(destino, origen, fechaInicio, reservado);
        vuelos = Arrays.copyOf(vuelos, vuelos.length + 1);
        vuelos[vuelos.length - 1] = vuelo;
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
