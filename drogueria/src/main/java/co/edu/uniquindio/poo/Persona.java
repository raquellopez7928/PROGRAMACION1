package co.edu.uniquindio.poo;

public class Persona {
    private final String nombre;
    private final String apellido;
    private final String dni;
    private final String direccion;
    private final String telefono;

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion
                + ", telefono=" + telefono + "]";
    }
    
    public Persona(String nombre, String apellido, String dni, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getDni(){
        return dni;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getTelefono(){
        return telefono;
    }

}
