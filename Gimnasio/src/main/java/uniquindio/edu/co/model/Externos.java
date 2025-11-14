package uniquindio.edu.co.model;

public class Externos extends Usuario{
    /**
     * atributos de la clase Externos
     */
    private String ocupacion;

    /**
     *
     * @param idUsuario
     * @param nombre
     * @param edad
     * @param telefono
     * @param ocupacion
     */
    public Externos(String idUsuario, String nombre, String edad, String telefono, String ocupacion) {
        super(idUsuario, nombre, edad, telefono);
        this.ocupacion = ocupacion;
    }

    public void asignarMembresia(Membresia membresia) {
        super.asignarMembresia(membresia);
        System.out.println("Membresía asignada al usuario externo sin descuentos.");
    }

    @Override
    public String toString() {
        return "Externos{" +
                "ocupacion='" + ocupacion + '\'' +
                '}';
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
