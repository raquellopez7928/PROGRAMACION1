package co.edu.uniquindio.poo;

public class Medicamento extends Producto {
    private final double dosis;

    @Override
    public String toString() {
        return "Medicamento [dosis=" + dosis + "]";
    }

    public Medicamento(String idProducto, String nombre, String descripcion, String idProveedor, int precio, int stock,
            double dosis) {
        super(idProducto, nombre, descripcion, idProveedor, precio, stock);
        this.dosis = dosis;
    }

    public double getDosis(){
        return dosis;
    }

}
