package uniquindio.edu.co.model;

import java.time.LocalDate;

public class Membresia {
    private TipoMembresia tipoMembresia;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;
    private boolean estado;

    public Membresia(TipoMembresia tipoMembresia, double precio, LocalDate fechaInicio, LocalDate fechaFin) {
        this.tipoMembresia = tipoMembresia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
        this.estado = true;
    }
    //

    public boolean isActiva() {
        return estado && (fechaFin == null || !LocalDate.now().isAfter(fechaFin));
    }

    @Override
    public String toString() {
        return "Membresia{" +
                "tipoMembresia=" + tipoMembresia +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", precio=" + precio +
                ", estado=" + estado +
                '}';
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

