package co.edu.uniquindio.poo;

public class Hogar extends Producto {
    private final String icostoTotalPedidondicaciones;

    @Override
    public String toString() {
        return "IndicacionesUso [indicaciones=" + indicaciones + "]";
    }

    public Hogar(String idProducto, String nombre, String descripcion, String idProveedor, int precio,
            int stock, String indicaciones) {
        super(idProducto, nombre, descripcion, idProveedor, precio, stock);
        this.indicaciones = indicaciones;
    }

    public String getIndicaciones(){
        return indicaciones;
    }
    

}
