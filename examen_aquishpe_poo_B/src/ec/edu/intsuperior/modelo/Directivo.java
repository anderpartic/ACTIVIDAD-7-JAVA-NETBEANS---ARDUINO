package ec.edu.intsuperior.modelo;

/**
 *
 * @author quish
 */
public class Directivo extends Persona {

    private String categoria;

    //Constructores
    public Directivo(String categoria, String ci, String nombre1, String nombre2, String apellido1, String apellido2, int edad) {
        super(ci, nombre1, nombre2, apellido1, apellido2, edad);
        this.categoria = categoria;
    }

    //Getters and Setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String mostrarDatos() {
        return "Datos importantes del empleado son: \n"
                + "Cedula: " + getCi() + "\n"
                + "Apellidos y Nombres: " + getApellido1() + " " + getApellido2() + " " + getNombre1() + " " + getNombre2() + "\n"
                + "Edad: " + getEdad() + "\n"
                + "Categoria: " + getCategoria() + "\n";

    }
    

}
