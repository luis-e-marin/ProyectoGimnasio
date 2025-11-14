package uniquindio.edu.co.model;

public class Entrenador {

    /**
     *
     * atributos de la clase Entrenador
     */
    private String  idEntrenador;
    private String nombre;
    private String especialidad;
    private double salario;

    /**
     *
     * @param idEntrenador
     * @param nombre
     * @param especialidad
     * @param salario
     */
    public Entrenador(String idEntrenador, String nombre, String especialidad, double salario) {
        this.idEntrenador = idEntrenador;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "idEntrenador=" + idEntrenador +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(String idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
