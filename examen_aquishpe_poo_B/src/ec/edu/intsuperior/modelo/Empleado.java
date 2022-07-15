package ec.edu.intsuperior.modelo;

/**
 *
 * @author quish
 */
public class Empleado extends Persona {

    private float sueldoBruto;

    //Constructores
    public Empleado(float sueldoBruto, String ci, String nombre1, String nombre2, String apellido1, String apellido2, int edad) {
        super(ci, nombre1, nombre2, apellido1, apellido2, edad);
        this.sueldoBruto = sueldoBruto;
    }

    //Getters y Setters
    public float getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String mostrarDatos() {
        return "Datos importantes del empleado son: \n"
                + "Cedula: " + getCi() + "\n"
                + "Apellidos y Nombres: " + getApellido1() + " " + getApellido2() + " " + getNombre1() + " " + getNombre2() + "\n"
                + "Edad: " + getEdad() + "\n"
                + "Sueldo: " + getSueldoBruto() + "\n";

    }
}
