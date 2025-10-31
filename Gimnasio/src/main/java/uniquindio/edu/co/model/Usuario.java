package uniquindio.edu.co.model;

public class Usuario {
private String nombre;
private String identificacion;
private int edad;
private String telefono;
Membresia membresia;

public Usuario(String nombre, String identificacion, int edad, String telefono) {
    this.nombre = nombre;
    this.identificacion = identificacion;
    this.edad = edad;
    this.telefono = telefono;
    this.membresia = membresia;
}
    public boolean tieneMembresiaActiva() {
        return membresia != null && membresia.estaActiva();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    protected void asignarMembresia(Membresia membresia) {
    }
}
