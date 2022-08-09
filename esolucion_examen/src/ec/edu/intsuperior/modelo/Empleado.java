package ec.edu.intsuperior.modelo;

public class Empleado extends Persona {

    private int sueldo;
    private String cargo;

    public Empleado() {
    }

    public Empleado(int sueldo, int cedula, String nombre, String apellido, String telefono, String cargo, String provincia) {
        super(cedula, nombre, apellido, telefono, provincia);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public Empleado(int sueldo, int cedula, String nombre, String apellido, String telefono, String cargo, Object provincia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCargo(){
    return cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado" + "Su sueldo es: " + sueldo + ", tiene el puesto de: " + cargo;
    }

   
}
