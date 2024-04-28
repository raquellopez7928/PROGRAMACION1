package co.edu.uniquindio.poo;

public abstract class Producto {
    private final String idProducto;
    private final String nombre;
    private final String descripcion;
    private final int precio;
    private final int stock;
    private final String idProveedor;

 public Producto(String idProducto, String nombre, String descripcion, String idProveedor, int precio, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idProveedor = idProveedor;
        this.precio = precio;
        this.stock = stock;
    }

    public String getIdProducto(){
        return idProducto;
    }

    public String getNombre(){
        return nombre;
    }costoTotalPedido

    public String getDescripcion(){
        return descripcion;
    }

    public String getIdProveedor(){
        return idProveedor;
    }

    public int getPrecio(){
        return precio;
    }

    public int getStock(){
        return stock;
    }

}