package model;

/** Representa a un empleado de la agencia. */
public class Empleado extends Persona {
    private String cargo;
    private double sueldo;

    /** Crea el objeto con valores iniciales. */
    public Empleado() {
        this("Sin registrar", "Sin registrar", new Direccion(), "Sin asignar", 0.0);
    }

    /** Recibe los datos de la persona y su trabajo. */
    public Empleado(String nombre, String telefono, Direccion direccion, String cargo, double sueldo) {
        super(nombre, telefono, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    /** Devuelve cargo. */
    public String getCargo() {
        return cargo;
    }

    /** Cambia cargo. */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /** Devuelve sueldo. */
    public double getSueldo() {
        return sueldo;
    }

    /** Cambia sueldo. */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /** Devuelve los datos como texto. */
    @Override
    public String toString() {
        return super.toString() + "\nCargo: " + cargo + "\nSueldo: $" + sueldo;
    }
}
