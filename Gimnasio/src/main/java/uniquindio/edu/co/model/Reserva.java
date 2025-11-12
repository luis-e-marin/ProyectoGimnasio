package uniquindio.edu.co.model;

import java.time.LocalDate;

public class Reserva {
    public ClaseDeportes clases;
    private String idReserva;
    private Usuario usuario;
    private ClaseDeportes clase;
    private LocalDate fechaReserva;
    private boolean asistio;

    public Reserva(Usuario usuario, ClaseDeportes clase, LocalDate fechaReserva) {
        if (usuario == null || clase == null) {
            throw new IllegalArgumentException("Usuario y clase no pueden ser nulos.");
        }
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.clase = clase;
        this.fechaReserva = fechaReserva;
        this.asistio = false;
    }


    public void registrarAsistencia() {
        if (!asistio) {
            this.asistio = true;
            System.out.println(" Asistencia registrada para " + usuario.getNombre() + " en la clase " + clase.getNombre());
        } else {
            System.out.println("️ El usuario ya estaba marcado como asistente.");
        }
    }

    public void cancelarReserva() {
        System.out.println(" Reserva cancelada: " + clase.getNombre() + " - Usuario: " + usuario.getNombre());
        clase.removerUsuario(usuario);
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
                ", clase=" + clase +
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

    public ClaseDeportes getClase() {
        return clase;
    }

    public void setClase(ClaseDeportes clase) {
        this.clase = clase;
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
