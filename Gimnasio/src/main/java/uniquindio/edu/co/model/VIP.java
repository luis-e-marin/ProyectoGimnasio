package uniquindio.edu.co.model;

import java.time.LocalDate;

public class VIP extends Membresia {
        public VIP(LocalDate fechaInicio, TipoMembresia tipoMembresia) {
            super(tipoMembresia, calcularPrecio(tipoMembresia), fechaInicio, calcularFechaFin(fechaInicio, tipoMembresia));
        }

        private static double calcularPrecio(TipoMembresia tipoMembresia) {

            if (tipoMembresia == TipoMembresia.MENSUAL) {
                return 60000;
            } else if (tipoMembresia == TipoMembresia.TRIMESTRAL) {
                return 170000;
            } else if (tipoMembresia == TipoMembresia.ANUAL) {
                return 700000;
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
    }


