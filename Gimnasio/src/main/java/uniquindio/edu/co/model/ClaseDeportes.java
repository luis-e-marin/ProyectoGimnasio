package uniquindio.edu.co.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ClaseDeportes {
    /**
     * Atributos de la clase ClaseDeportes
     */
    private String nombre;
    private String tipoEjercicio;
    private LocalDateTime horario;
    private int cupoMaximo;
    private Entrenador entrenador;
    private List<Usuario> usuariosReservados;

    /**
     *
     * @param nombre
     * @param tipoEjercicio
     * @param horario
     * @param cupoMaximo
     */
    public ClaseDeportes(String nombre, String tipoEjercicio, LocalDateTime horario, int cupoMaximo) {
        this.nombre = nombre;
        this.tipoEjercicio = tipoEjercicio;
        this.horario = horario;
        this.cupoMaximo = cupoMaximo;
        this.entrenador = null;
        this.usuariosReservados = new ArrayList<>();
    }

    public boolean reservarCupo(Usuario usuario) {
        if (usuariosReservados.size() >= cupoMaximo) {
            System.out.println(" No hay cupos disponibles en la clase: " + nombre);
            return false;
        }

        usuariosReservados.add(usuario);
        System.out.println(" Reserva registrada para: " + usuario.getNombre() + " en " + nombre);
        return true;
    }

    public void removerUsuario(Usuario usuario) {
        usuariosReservados.remove(usuario);
    }

    public boolean hayCupoDisponible() {
        return usuariosReservados.size () < cupoMaximo;
    }

    @Override
    public String toString() {
        return "ClaseDeportes{" +
                "nombre='" + nombre + '\'' +
                ", tipoEjercicio='" + tipoEjercicio + '\'' +
                ", horario=" + horario +
                ", cupoMaximo=" + cupoMaximo +
                ", entrenador=" + entrenador +
                ", usuariosReservados=" + usuariosReservados +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEjercicio() {
        return tipoEjercicio;
    }

    public void setTipoEjercicio(String tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public List<Usuario> getUsuariosReservados() {
        return usuariosReservados;
    }

    public void setUsuariosReservados(List<Usuario> usuariosReservados) {
        this.usuariosReservados = usuariosReservados;
    }

    public int getCupoActual() {
        return usuariosReservados.size();
    }
}
