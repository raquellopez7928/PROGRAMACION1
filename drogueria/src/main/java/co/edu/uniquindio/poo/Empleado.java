package co.edu.uniquindio.poo;

public class Empleado extends Persona {
    private final double salario;
    private final String idEmpleado;

    @Override
    public String toString() {
        return "Empleado [salario=" + salario + ", idEmpleado=" + idEmpleado + "]";
    }

    public Empleado(String nombre, String apellido, String dni, String direccion, String telefono, double salario,
            String idEmpleado) {
        super(nombre, apellido, dni, direccion, telefono);
        this.salario = salario;
        this.idEmpleado = idEmpleado;
    }

    public double getSalario(){
        return salario;
    }

    public String getIdEmpleado(){
        return idEmpleado;
    }


}
