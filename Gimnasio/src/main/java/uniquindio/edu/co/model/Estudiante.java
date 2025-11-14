package uniquindio.edu.co.model;

public class Estudiante  extends Usuario {

    /**
     * Atributos de la clase Estudiante
     */
    private String programa;
    private double descuento;

    /**
     *
     * @param idUsuario
     * @param nombre
     * @param edad
     * @param telefono
     * @param programa
     */
    public Estudiante(String idUsuario, String nombre, String edad, String telefono, String programa) {
        super(idUsuario, nombre, edad, telefono);
        this.programa = programa;
        this.descuento = 0.10;
    }

    public void asignarMembresia(Membresia membresia) {
        double precioConDescuento = membresia.getPrecio() * (1 - descuento);
        membresia.setPrecio(precioConDescuento);
        super.asignarMembresia(membresia);
        System.out.println("Membresía asignada a estudiante con descuento del " + (descuento * 100) + "%.");
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "programa='" + programa + '\'' +
                ", descuento=" + descuento +
                '}';
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
