package uniquindio.edu.co.model;

public class Usuario {
private String nombre;
private String identificacion;
private int edad;
private String telefono;

public Usuario(String nombre, String identificacion, int edad, String telefono) {
    this.nombre = nombre;
    this.identificacion = identificacion;
    this.edad = edad;
    this.telefono = telefono;
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
}
