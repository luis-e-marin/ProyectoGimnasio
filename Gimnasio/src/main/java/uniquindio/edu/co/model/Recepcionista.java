package uniquindio.edu.co.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Recepcionista {
    private String nombre;
    private String identificacion;
    private List<Usuario> usuarios;
    private List<ClaseDeportes> clases;
    private List<Reserva> reservas;

    public Recepcionista(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.usuarios = new ArrayList<>();
        this.clases = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado correctamente: " + usuario.getNombre());
    }

    public void asignarMembresia(String idUsuario, Membresia membresia) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {
                usuario.asignarMembresia(membresia);
                System.out.println("Membresía asignada al usuario " + usuario.getNombre());
                return;
            }
        }
        System.out.println("Usuario no encontrado con ID: " + idUsuario);
    }

    public void registrarReserva(String idUsuario, ClaseDeportes clase) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {
                Reserva reserva = new Reserva(usuario, clase, LocalDate.now());
                reservas.add(reserva);
                System.out.println("Reserva registrada para " + usuario.getNombre() + " en la clase " + clase.getNombre());
                return;
            }
        }
        System.out.println("Usuario no encontrado para reserva.");
    }

    public boolean validarIngreso(String idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {
                Membresia membresia = usuario.getMembresia();
                if (membresia != null && membresia.isEstado()) {
                    System.out.println("Acceso permitido al usuario: " + usuario.getNombre());
                    return true;
                } else {
                    System.out.println("Acceso denegado: Membresía inactiva o vencida.");
                    return false;
                }
            }
        }
        System.out.println("Usuario no encontrado.");
        return false;
    }


    public void generarReporteUsuariosActivos() {
        System.out.println("--USUARIOS ACTIVOS--");
        for (Usuario usuario : usuarios) {
            if (usuario.getMembresia() != null && usuario.getMembresia().isEstado()) {
                System.out.println(usuario.getNombre() + " - " + usuario.getMembresia().getTipoMembresia());
            }
        }
    }

    public void generarReporteClasesMasReservadas() {
        System.out.println("--CLASES MÁS RESERVADAS--");
        for (ClaseDeportes clase : clases) {
            long cantidad = reservas.stream()
                    .filter(r -> r.clases.equals(clase))
                    .count();
            System.out.println(clase.getNombre() + ": " + cantidad + " reservas");
        }
    }

    public void generarReporteVencimientoMembresias() {
        System.out.println("--VENCIMIENTO DE MEMBRESÍAS--");
        for (Usuario usuario : usuarios) {
            if (usuario.getMembresia() != null) {
                System.out.println(usuario.getNombre() + " - vence el: " + usuario.getMembresia().getFechaFin());
            }
        }
    }

    @Override
    public String toString() {
        return "Recepcionista{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", usuarios=" + usuarios +
                ", clases=" + clases +
                ", reservas=" + reservas +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
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

