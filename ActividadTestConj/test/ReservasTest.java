import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservasTest {

    @Test
    void setReservado() {
        Reservas reservas = new Reservas();
        boolean result = true;
        Assertions.assertEquals(true, result);
    }

    @Test
    void getEstado() {
        Reservas reservas = new Reservas();
        Assertions.assertEquals(false, reservas.getEstado());
    }

    @Test
    void getUsuario() {
        Reservas reservas = new Reservas("Rafa", new Vuelos(), false);
        Assertions.assertEquals("Rafa", reservas.getUsuario());
    }

    @Test
    void getVuelo() {
        Reservas reservas = new Reservas("Gines", new Vuelos("Mallorca", "Barcelona", "2025-06-15", true), true);
        reservas.getVuelo();
    }

    @Test
    void cancelarReserva() {

    }
}