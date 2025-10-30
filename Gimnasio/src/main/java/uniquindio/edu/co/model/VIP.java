package uniquindio.edu.co.model;

import java.time.LocalDate;

public class VIP extends Membresia {
    public VIP(LocalDate fechaInicio, TipoMembresia tipoMembresia) {
        super(tipoMembresia, calcularPrecio (tipoMembresia), fechaInicio, calcularFechaFin(fechaInicio, tipoMembresia));
    }

    private static double calcularPrecio(TipoMembresia tipoMembresia) {

        return switch (tipoMembresia) {
            case MENSUAL -> 60000;
            case TRIMESTRAL -> 160000;
            case ANUAL -> 700000;
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
