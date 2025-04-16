public class Reservas {
    private String Usuario;
    private Vuelos Vuelo;
    private boolean Estado;

    public Reservas(String Usuario, Vuelos Vuelo, boolean Estado) {
        this.Usuario = Usuario;
        this.Vuelo = Vuelo;
        this.Estado = Estado;
    }

    public void setReservado(boolean Estado) {
        this.Estado = Estado;
    }

    public boolean getEstado() {
        return this.Estado;
    }
    
    public String getUsuario() {
        return Usuario;
    }
    
    public Vuelos getVuelo() {
        return Vuelo;
    }

    public void cancelarReserva() {
        this.Estado = false;
        this.Vuelo.setReservado(false);
    }

    @Override
    public String toString() {
        return "Reservas{" +
                "Usuario='" + Usuario + '\'' +
                ", Vuelo=" + Vuelo +
                ", Estado=" + Estado +
                '}';
    }
}