package uniquindio.edu.co.model;

import java.time.LocalDate;

public class Estudiante  extends Usuario{
    public Estudiante(String nombre, String identificacion, int edad, String telefono) {
        super(nombre, identificacion, edad, telefono);
}

    public void asignarMembresia(Membresia membresia) {
        double precioFinal = calcularDescuento(membresia.getPrecio());
        membresia.setPrecio(precioFinal);
        super.asignarMembresia(membresia);
    }

    private double calcularDescuento(double costoOriginal) {
        return costoOriginal * 0.9;
    }
}
