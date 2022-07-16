package ec.edu.intsuperior.modelo;

/**
 *
 * @author quish
 */
public class Empleado extends Persona {

    private float sueldoBruto;

    //Constructores
    public Empleado() {
    }

    public Empleado(float sueldoBruto, String ci, String nombre1, String nombre2, String apellido1, String apellido2, int edad, String nombreEmpresa) {
        super(ci, nombre1, nombre2, apellido1, apellido2, edad, nombreEmpresa);
        this.sueldoBruto = sueldoBruto;
    }

    //Getters and Setters
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
                + "Trabaja en la empresa: " + getNombreEmpresa() + "\n"
                + "Sueldo: " + getSueldoBruto() + "\n";

    }
}
