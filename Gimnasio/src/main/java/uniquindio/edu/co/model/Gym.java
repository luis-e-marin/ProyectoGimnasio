package uniquindio.edu.co.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gym {

    private List<Usuario> usuarios;
    private List<Entrenador> entrenadores;
    private List<ClaseDeportes> clases;
    private List<Reserva> reservas;


    public Gym() {
        usuarios = new ArrayList<>();
        entrenadores = new ArrayList<>();
        clases = new ArrayList<>();
        reservas = new ArrayList<>();
    }


    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }


    public void asignarMembresia(String idUsuario, Membresia membresia) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {
                usuario.asignarMembresia(membresia);
                System.out.println("Membresía asignada a: " + usuario.getNombre());
                return;
            }
        }
        System.out.println("Usuario con ID " + idUsuario + " no encontrado.");
    }


    public void registrarReserva(String idUsuario, ClaseDeportes clases) {

        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {

                if (!clases.hayCupoDisponible()) {
                    System.out.println("Clase llena: " + clases.getNombre());
                    return;
                }

                Reserva reserva = new Reserva(usuario, clases, LocalDate.now());
                reservas.add(reserva);
                clases.reservarCupo(usuario);
                System.out.println("Reserva registrada para " + usuario.getNombre() + " en " + clases.getNombre());
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }


    // 4. Validar acceso al gimnasio
    public boolean validarIngreso(String idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {

                if (usuario.getMembresia() != null && usuario.getMembresia().isActiva()) {
                    System.out.println("Acceso permitido a " + usuario.getNombre());
                    return true;
                }

                System.out.println("Acceso denegado: Membresía inactiva.");
                return false;
            }
        }
        System.out.println("Usuario no encontrado.");
        return false;
    }


    public void reporteUsuariosActivos() {
        System.out.println("===== Usuarios con membresía activa =====");
        for (Usuario usuario : usuarios) {
            if (usuario.getMembresia() != null && usuario.getMembresia().isActiva()) {
                System.out.println(usuario.getNombre());
            }
        }
    }

    public void registrarEntrenador(Entrenador entrenador) {
        entrenadores.add(entrenador);
        System.out.println("Entrenador registrado: " + entrenador.getNombre());
    }

    public void eliminarEntrenador(String id) {
        entrenadores.removeIf(entrenador -> entrenador.getIdEntrenador().equals(id));
        System.out.println("Entrenador eliminado.");
    }

    public void registrarClase(ClaseDeportes clase) {
        clases.add(clase);
        System.out.println("Clase registrada: " + clase.getNombre());
    }

    public void reporteClasesPopulares() {

        System.out.println("Clases Populares");

        for (ClaseDeportes c : clases) {
            System.out.println(c.getNombre() + " → Reservas: " + c.getCupoActual());
        }
    }

    @Override
    public String toString() {
        return "Gym{" +
                "usuarios=" + usuarios +
                ", entrenadores=" + entrenadores +
                ", clases=" + clases +
                ", reservas=" + reservas +
                '}';
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(List<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    public List<ClaseDeportes> getClases() {
        return clases;
    }

    public void setClases(List<ClaseDeportes> clases) {
        this.clases = clases;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
