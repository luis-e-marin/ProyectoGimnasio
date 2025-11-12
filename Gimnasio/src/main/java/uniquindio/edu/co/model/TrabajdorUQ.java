package uniquindio.edu.co.model;

public class TrabajdorUQ extends Usuario {
    private String dependencia;
    private double descuento;

    public TrabajdorUQ(String idUsuario, String nombre, String telefono,String edad) {
        super(idUsuario, nombre, telefono, edad);
        this.dependencia = dependencia;
        this.descuento = 0.15;
    }

    public void asignarMembresia(Membresia membresia) {
        double precioConDescuento = membresia.getPrecio() * (1 - descuento);
        membresia.setPrecio(precioConDescuento);
        super.asignarMembresia(membresia);
        System.out.println("Membresía asignada a trabajador UQ con descuento del " + (descuento * 100) + "%");
    }

    @Override
    public String toString() {
        return "TrabajdorUQ{" +
                "dependencia='" + dependencia + '\'' +
                ", descuento=" + descuento +
                '}';
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
