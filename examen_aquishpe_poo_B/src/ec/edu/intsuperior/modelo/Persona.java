package ec.edu.intsuperior.modelo;

/**
 *
 * @author aquishpe
 */
public class Persona {

    private String ci;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private int edad;

    public Persona() {
    }

    //Constructor
    public Persona(String ci, String nombre1, String nombre2, String apellido1, String apellido2, int edad) {
        this.ci = ci;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    //Accesores Getters y Setters
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mostrarDatos() {
        return "Los datos de la persona son: \n"
                + "Cedula: " + getCi() + "\n"
                + "Apellidos y Nombres: " + getApellido1() + " " + getApellido2() + " " + getNombre1() + " " + getNombre2() + "\n"
                + "Edad: " + getEdad() + "\n";

    }
}
