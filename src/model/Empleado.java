package model;

/** Representa a un empleado de la agencia. */
public class Empleado extends Persona {

    private String cargo;
    private double sueldo;

    public Empleado() {
        this("Sin registrar", "Sin registrar", new Direccion(), "Sin asignar", 0.0);
    }

    public Empleado(String nombre, String telefono, Direccion direccion, String cargo, double sueldo) {
        super(nombre, telefono, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: " + cargo + "\nSueldo: $" + sueldo;
    }
}
