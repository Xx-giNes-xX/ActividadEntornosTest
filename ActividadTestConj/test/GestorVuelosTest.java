import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GestorVuelosTest {

    @Test
    void consultarVueloDia() {
        GestorVuelos gv = new GestorVuelos();
        gv.insertarVuelos("Madrid", "Barcelona", "2025-04-10");
        gv.insertarVuelos("Barcelona", "Madrid", "2025-04-10");
        gv.insertarVuelos("Mallorca", "Barcelona", "2024-04-10");
        Assertions.assertEquals(2, gv.consultarVueloDia("2025-04-10").length);
    }



    @Test
    public void consultarVueloSemana() {
        GestorVuelos gv = new GestorVuelos();
        gv.insertarVuelos("Madrid", "Barcelona", "20250410");
        gv.insertarVuelos("Barcelona", "Madrid", "20250411");
        gv.insertarVuelos("Bilbao", "Sevilla", "20250412");
        gv.insertarVuelos("Mallorca", "Barcelona", "20240207");
        Assertions.assertEquals(3, gv.consultarVueloSemana("20250410").length);
    }

    @Test
    void insertarVuelos() {
        GestorVuelos gv = new GestorVuelos();
        gv.insertarVuelos("Madrid", "Barcelona", "2025-04-16");
        Vuelos[] vuelos = gv.vuelos;
        Assertions.assertEquals(1, vuelos.length);
        Vuelos vuelo = vuelos[0];
        Assertions.assertEquals("Madrid", vuelo.destino);
        Assertions.assertEquals("Barcelona", vuelo.origen);
        Assertions.assertEquals("2025-04-16", vuelo.fechaVuelo);
        Assertions.assertFalse(vuelo.reservado);
    }

    @Test
    void vuelosReservados() {
        GestorVuelos gv = new GestorVuelos();
        gv.insertarVuelos("Madrid", "Barcelona", "2025-04-16");
        gv.insertarVuelos("Sevilla", "Valencia", "2025-04-17");
        gv.insertarVuelos("Bilbao", "Malaga", "2025-04-18");
        Vuelos[] todosLosVuelos = gv.vuelos;
        gv.reservarVuelo("usuario1", todosLosVuelos[1]);
        Vuelos[] reservados = gv.vuelosReservados(todosLosVuelos);
        Assertions.assertEquals(1, reservados.length);
        Assertions.assertEquals("Sevilla", reservados[0].destino);
        Assertions.assertTrue(reservados[0].reservado);
    }

    @Test
    void print() {

    }
}