package co.edu.uniquindio.poo;

public class CuidadoPersonal extends Producto {
    private final String ingredientes;

    @Override
    public String toString() {
        return "CuidadoPersonal [ingredientes=" + ingredientes + "]";
    }

    public CuidadoPersonal(String idProducto, String nombre, String descripcion, String idProveedor, int precio,
            int stock, String ingredientes) {
        super(idProducto, nombre, descripcion, idProveedor, precio, stock);
        this.ingredientes = ingredientes;
    }
    
    public String getIngredientes(){
        return ingredientes;
    }

}
