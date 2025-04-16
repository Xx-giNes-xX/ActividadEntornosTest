public class Vuelos {
    String destino;
    String origen;
    String fechaVuelo;  // AAAA - MM - DD
    boolean reservado;

    public Vuelos(String destino, String origen, String fechaVuelo, boolean reservado) {
        this.destino = destino;
        this.origen = origen;
        this.fechaVuelo = fechaVuelo;
        this.reservado = reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    @Override
    public String toString() {
        return "Vuelos{" +
                "destino='" + destino + '\'' +
                ", origen='" + origen + '\'' +
                ", fechaVuelo='" + fechaVuelo + '\'' +
                ", reservado=" + reservado +
                '}';
    }
}
