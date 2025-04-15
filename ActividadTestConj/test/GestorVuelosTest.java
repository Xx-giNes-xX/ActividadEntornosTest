import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GestorVuelosTest {

    @Test
    void consultarVueloDia() {
        //arrange
        GestorVuelos gv = new GestorVuelos();
        Vuelos[] vuelos = {
                new Vuelos("Madrid", "Barcelona", "2025-04-10", true),
                new Vuelos("Mallorca", "Sevilla", "2025-03-07", false),
                new Vuelos("Sevilla", "Gijon", "2025-04-16", false)
        };
        //act
        Vuelos[] resultado = gv.consultarVueloDia("2025-03-07");

        //assert
        Assertions.assertEquals(1, resultado.length);
        Assertions.assertEquals("2025-03-07", resultado[0].fechaVuelo);
    }

    @Test
    void consultarVueloSemana() {
        //arrange
        GestorVuelos gv = new GestorVuelos();
        Vuelos[] vuelos = {
                new Vuelos("Madrid", "Barcelona", "2025-04-10", true),
                new Vuelos("Mallorca", "Sevilla", "2025-03-07", false),
                new Vuelos("Sevilla", "Gijon", "2025-04-16", false)
        };
        //act
        Vuelos[] resultado = gv.consultarVueloDia("2025-03-07");

        //assert
        Assertions.assertEquals(1, resultado.length);
        Assertions.assertEquals("2025-03-07", resultado[0].fechaVuelo);
    }

    @Test
    void insertarVuelos() {

    }

    @Test
    void vuelosReservados() {

    }

    @Test
    void print() {

    }
}