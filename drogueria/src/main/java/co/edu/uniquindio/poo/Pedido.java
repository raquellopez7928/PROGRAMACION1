package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
    private final LocalDate fecha;
    private final int cantidad;
    private final Cliente cliente;
    private final Producto producto;

    @Override
    public String toString() {
        return "Pedido [fecha=" + fecha + ", cantidad=" + cantidad + ", cliente=" + cliente + ", producto=" + producto
                + "]";
    }

    public Pedido(LocalDate fecha, int cantidad, Cliente cliente, Producto producto) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.producto = producto;
    }
    
    public LocalDate getFechDate(){
        return fecha;
    }

    public int getCantidad(){
        return cantidad;
    }

    public Cliente getClientePedido(){
        return cliente;
    }

    public Producto getProductoPedido(){
        return producto;
    }
    

}
