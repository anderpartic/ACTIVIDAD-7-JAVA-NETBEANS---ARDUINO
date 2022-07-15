package ec.edu.intsuperior.modelo;

/**
 *
 * @author quish
 */
public class Cliente extends Persona {

    private long telefonoContacto;
    
    public Cliente (){}
    //Constructores
    public Cliente(long telefonoContacto, String ci, String nombre1, String nombre2, String apellido1, String apellido2, int edad) {
        super(ci, nombre1, nombre2, apellido1, apellido2, edad);
        this.telefonoContacto = telefonoContacto;
    }


    //Getters and Setters
    public long getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(long telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    @Override
    public String mostrarDatos() {
        return "Datos importantes del cliente son: \n"
                + "Cedula: " + getCi() + "\n"
                + "Apellidos y Nombres: " + getApellido1() + " " + getApellido2() + " " + getNombre1() + " " + getNombre2() + "\n"
                + "Edad: " + getEdad() + "\n"
                + "Telefono: " + getTelefonoContacto() + "\n";

    }

}
