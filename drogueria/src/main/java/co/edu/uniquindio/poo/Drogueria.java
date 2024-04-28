package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class Drogueria {
    private final String nombre;
    private final Collection <Producto> listaProductos;
    private final Collection<Persona> listaPersonas;
    private final Collection <Cliente> listaClientes;

@Override
    public String toString() {
        return "Drogueria [nombre=" + nombre + ", listaProductos=" + listaProductos + ", listaPersonas=" + listaPersonas
                + ", listaClientes=" + listaClientes + "]";
    }

public Drogueria(String nombre) {
this.nombre = nombre;
listaProductos = new LinkedList<>();
listaPersonas = new LinkedList<>();
listaClientes = new LinkedList<>();
}

public String getNombre(){
    return nombre;
}

public Collection <Producto> getListaProductos(){
    return listaProductos;
}

public Collection <Persona> getListaPersonas(){
    return listaPersonas;
}

public Collection <Cliente> getListaClientes(){
    return listaClientes;
}
       
}
