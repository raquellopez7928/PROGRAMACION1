package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Gerente extends Empleado{
    private Collection <Producto> listaProductos;

    @Override
    public String toString() {
        return "Gerente [listaProductos=" + listaProductos + "]";
    }

    public Gerente(String nombre, String apellido, String dni, String direccion, String telefono, double salario,
            String idEmpleado, Collection<Producto> listaProductos) {
        super(nombre, apellido, dni, direccion, telefono, salario, idEmpleado);
        listaProductos = new LinkedList<>();
    }

    public void agregarPedido(Producto producto){
        listaProductos.add(producto);
    }

    public void eliminarPedido(Producto producto){
        listaProductos.remove(producto);
    }


}
