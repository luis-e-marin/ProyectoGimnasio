package uniquindio.edu.co.model;

import java.time.LocalDate;
import java.util.List;

public class Reserva {
    public String nombre;
    public String identificacion;
    public List<Usuario> usuarios;
    public List<ClaseDeportes> clases;
    public List<Reserva> reservas;

    public Reserva(Usuario usuario, ClaseDeportes clase, LocalDate now) {
    }
}
