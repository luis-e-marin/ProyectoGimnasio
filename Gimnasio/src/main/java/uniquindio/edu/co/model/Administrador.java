package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {
    /**
     * Atributos de la clase Administrador
     */
    private String contrasena;
    private List<Entrenador> entrenadores;
    private List<ClaseDeportes> clases;

    /**
     *
     * @param idEntrenador
     * @param nombre
     * @param edad
     * @param telefono
     * @param contrasena
     */
    public Administrador(String idEntrenador, String nombre, String edad, String telefono, String contrasena) {
        super(idEntrenador, nombre, edad, telefono);
        this.contrasena = contrasena;
        this.entrenadores = new ArrayList<>();
        this.clases = new ArrayList<>();
    }

    public boolean autenticar(String id, String pass,String idEntrenador) {
        return idEntrenador.equals(id) && contrasena.equals(pass);
    }

    public void registrarEntrenador(Entrenador entrenador) {
        if (entrenador == null) {
            throw new IllegalArgumentException("El entrenador no puede ser nulo");
        }
        entrenadores.add(entrenador);
    }

    public void modificarEntrenador(String id, String nuevoNombre, String nuevaEspecialidad) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getIdEntrenador().equals(id)) {
                entrenador.setNombre(nuevoNombre);
                entrenador.setEspecialidad(nuevaEspecialidad);
                return;
            }
        }
        System.out.println("Entrenador no encontrado con ID: " + id);
    }

    public void eliminarEntrenador(String id, String idEntrenador) {
        entrenadores.removeIf(entrenador -> entrenador.getIdEntrenador().equals(id));
    }

    public void asignarEntrenadorAClase(String idEntrenador, ClaseDeportes clase) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getIdEntrenador().equals(idEntrenador)) {
                clase.setEntrenador(entrenador);
                return;
            }
        }
        System.out.println("No se encontró entrenador con ID: " + idEntrenador);
    }


    public void validarEntrenador(Entrenador entrenador) {
        if (entrenador == null) {
            throw new IllegalArgumentException("Entrenador nulo");
        }
        if (entrenador.getNombre() == null || entrenador.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre del entrenador no puede estar vacío");
        }
        if (entrenador.getEspecialidad() == null || entrenador.getEspecialidad().isEmpty()) {
            throw new IllegalArgumentException("Debe tener una especialidad válida");
        }
    }



    public int calcularAsistenciaTotal(List<ClaseDeportes> clases) {
        int total = 0;
        for (ClaseDeportes clase : clases) {
            total += clase.getUsuariosReservados().size();
        }
        return total;
    }

    public double calcularIngresosPorMembresias(List<Usuario> usuarios) {
        double total = 0;
        for (Usuario usuario : usuarios) {
            if (usuario.getMembresia() != null) {
                total += usuario.getMembresia().getPrecio();
            }
        }
        return total;
    }

    public ClaseDeportes claseMasPopular(List<ClaseDeportes> clases) {
        ClaseDeportes masPopular = null;
        int maxReservas = 0;

        for (ClaseDeportes clase : clases) {
            int reservas = clase.getUsuariosReservados().size();
            if (reservas > maxReservas) {
                maxReservas = reservas;
                masPopular = clase;
            }
        }
        return masPopular;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "contrasena='" + contrasena + '\'' +
                ", entrenadores=" + entrenadores +
                ", clases=" + clases +
                '}';
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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
}
