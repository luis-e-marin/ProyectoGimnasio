package uniquindio.edu.co.model;

import java.time.LocalDate;

public class Membresia {
    private TipoMembresia tipoMembresia;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;
    private boolean estado;

    public Membresia(TipoMembresia tipoMembresia,double precio,LocalDate fechaFin,LocalDate fechaInicio) {
        this.tipoMembresia = tipoMembresia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
        this.estado = estado;
    }

}
