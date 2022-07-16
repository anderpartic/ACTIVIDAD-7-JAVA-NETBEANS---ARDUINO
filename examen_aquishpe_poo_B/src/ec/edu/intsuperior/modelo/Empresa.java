package ec.edu.intsuperior.modelo;

/**
 *
 * @author quish
 */
public class Empresa {

    private String nombreEmpresa;

    //Constructores
    public Empresa() {
    }

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    //Getters y Setters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String mostrarDatos() {
        return "Nombre de la Empresa: "
                + getNombreEmpresa();
    }

}
