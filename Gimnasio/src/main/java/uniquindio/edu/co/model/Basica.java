package uniquindio.edu.co.model;

import java.time.LocalDate;

public class Basica extends Membresia{

    public Basica(LocalDate fechaInicio,TipoMembresia tipoMembresia) {
super(tipoMembresia, calcularPrecio (tipoMembresia), fechaInicio, calcularFechaFin(fechaInicio, tipoMembresia));
}

private static double calcularPrecio(TipoMembresia tipoMembresia) {

    return switch (tipoMembresia) {
        case MENSUAL -> 25000;
        case TRIMESTRAL -> 70000;
        case ANUAL -> 280000;
        default -> 0;
    };
}

private static LocalDate calcularFechaFin (LocalDate fechaInicio, TipoMembresia tipoMembresia) {
    return switch (tipoMembresia) {
        case MENSUAL -> fechaInicio.plusMonths(1);
        case TRIMESTRAL -> fechaInicio.plusMonths(3);
        case ANUAL -> fechaInicio.plusYears(1);
        default -> fechaInicio;
    };
}
}
