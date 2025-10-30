package uniquindio.edu.co.model;

import java.time.LocalDate;

public class Premium extends Membresia {
    public Premium(LocalDate fechaInicio, TipoMembresia tipoMembresia) {
        super(tipoMembresia, calcularPrecio (tipoMembresia), fechaInicio, calcularFechaFin(fechaInicio, tipoMembresia));
    }

    private static double calcularPrecio(TipoMembresia tipoMembresia) {

        return switch (tipoMembresia) {
            case MENSUAL -> 40000;
            case TRIMESTRAL -> 110000;
            case ANUAL -> 450000;
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

    @Override
    public String toString() {
        return "Premium{}";
    }
}
