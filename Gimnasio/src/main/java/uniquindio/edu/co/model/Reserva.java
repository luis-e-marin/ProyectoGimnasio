package uniquindio.edu.co.model;

import java.time.LocalDate;

public class Reserva {
    /**
     * atributos de la clase Reserva
     */
    public ClaseDeportes clases;
    private String idReserva;
    private Usuario usuario;
    private LocalDate fechaReserva;
    private boolean asistio;

    /**
     *
     * @param usuario
     * @param clase
     * @param now
     */
    public Reserva(Usuario usuario, ClaseDeportes clase, LocalDate now) {
        this.usuario = usuario;
        this.clases = clase;
        this.fechaReserva = LocalDate.now();
        this.asistio = false;
    }

    public void registrarAsistencia() {
        if (!asistio) {
            this.asistio = true;
            System.out.println(" Asistencia registrada para " + usuario.getNombre() + " en la clase " + clases.getNombre());
        } else {
            System.out.println("️ El usuario ya estaba marcado como asistente.");
        }
    }

    public void cancelarReserva() {
        System.out.println(" Reserva cancelada: " + clases.getNombre() + " - Usuario: " + usuario.getNombre());
        clases.removerUsuario(usuario);
    }

    public boolean esValida() {
        return fechaReserva.isAfter(LocalDate.now().minusDays(1));
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "clases=" + clases +
                ", idReserva='" + idReserva + '\'' +
                ", usuario=" + usuario +
                ", fechaReserva=" + fechaReserva +
                ", asistio=" + asistio +
                '}';
    }

    public ClaseDeportes getClases() {
        return clases;
    }

    public void setClases(ClaseDeportes clases) {
        this.clases = clases;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public boolean isAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }
}
