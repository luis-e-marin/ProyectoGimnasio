package uniquindio.edu.co.model;

import java.util.ArrayList;

public class Recepcionista extends Usuario {
    private ArrayList<Usuario> usuariosRegistrados;
    private ArrayList<ClaseDeportes> clasesRegistradas;

//Constructor de la clase Padre
    public Recepcionista(int id, String nombre, String telefono) {
        super(id, nombre, telefono);
        usuariosRegistrados = new ArrayList<>();
        clasesRegistradas = new ArrayList<>();

    }

    public void registrarUsuario(Usuario usuario) {
        usuariosRegistrados.add(usuario);
    }

    public void asignarMembresiaAUsuario(Usuario usuario, Membresia membresia) {
        usuario.asignarMembresia(membresia);
    }

    public boolean reservarClase(ClaseDeportes clase) {
        return clase.registrarParticipante();
    }

    public boolean validarAcceso(Usuario usuario) {
        return usuario.getMembresia() != null && usuario.getMembresia().isActiva();
    }

    public ArrayList<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public ArrayList<ClaseDeportes> getClasesRegistradas() {
        return clasesRegistradas;
    }
}

