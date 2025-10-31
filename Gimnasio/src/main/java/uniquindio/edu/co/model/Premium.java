package uniquindio.edu.co.model;

import java.time.LocalDate;

public class Premium extends Membresia {
    public Premium(LocalDate fechaInicio, TipoMembresia tipoMembresia) {
        super(tipoMembresia, calcularPrecio (tipoMembresia), fechaInicio, calcularFechaFin(fechaInicio, tipoMembresia));
    }

    private static double calcularPrecio(TipoMembresia tipoMembresia) {

        if (tipoMembresia == TipoMembresia.MENSUAL) {
            return 40000;
        } else if (tipoMembresia == TipoMembresia.TRIMESTRAL) {
            return 110000;
        } else if (tipoMembresia == TipoMembresia.ANUAL) {
            return 450000;
        } else {
            return 0;
        }
    }


private static LocalDate calcularFechaFin(LocalDate fechaInicio, TipoMembresia tipoMembresia) {

    if (tipoMembresia == TipoMembresia.MENSUAL) {
        return fechaInicio.plusMonths(1);

    } else if (tipoMembresia == TipoMembresia.TRIMESTRAL) {
        return fechaInicio.plusMonths(3);

    } else if (tipoMembresia == TipoMembresia.ANUAL) {
        return fechaInicio.plusYears(1);

    } else {
        return fechaInicio;
    }
}


@Override
public String toString() {
    return "Premium{}";
}
}
