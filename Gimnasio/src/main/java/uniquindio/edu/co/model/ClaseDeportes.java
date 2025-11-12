package uniquindio.edu.co.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class ClaseDeportes {

    //atributos
    private int idClase;
    private String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private int cupoMaximo;
    private int cupoActual;

//constructor
    public ClaseDeportes(int idClase, String nombre, LocalDate fecha, LocalTime hora, int cupoMaximo) {
        this.idClase = idClase;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.cupoMaximo = cupoMaximo;
        this.cupoActual = 0;
    }

    public boolean registrarParticipante() {
        if (cupoActual < cupoMaximo) {
            cupoActual++;
            return true;
        }
        return false;
    }

    public boolean cancelarParticipante() {
        if (cupoActual > 0) {
            cupoActual--;
            return true;
        }
        return false;
    }
    public void removerUsuario(Usuario usuario) {
    }

    @Override
    public String toString() {
        return "ClaseDeportes{" +
                "idClase=" + idClase +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", cupoMaximo=" + cupoMaximo +
                ", cupoActual=" + cupoActual +
                '}';
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getCupoActual() {
        return cupoActual;
    }

    public void setCupoActual(int cupoActual) {
        this.cupoActual = cupoActual;
    }


}
