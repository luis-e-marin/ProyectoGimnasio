package uniquindio.edu.co.model;

import java.time.LocalDate;
import java.util.List;

public class Reserva {
    private String nombre;
    private String identificacion;
    private List<Usuario> usuarios;
    List<ClaseDeportes> clases;
    private List<Reserva> reservas;

    public Reserva(Usuario usuario, ClaseDeportes clase, LocalDate now) {
    }
}
