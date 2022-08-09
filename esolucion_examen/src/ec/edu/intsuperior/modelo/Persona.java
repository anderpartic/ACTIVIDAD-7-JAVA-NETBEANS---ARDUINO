package ec.edu.intsuperior.modelo;



public class Persona {

    public int cedula;
    public String nombre;
    public String apellido;
    public String telefono;
    public String provincia;
    
    

    public Persona() {
    }

    public Persona(int cedula, String nombre, String apellido, String telefono, String provincia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.provincia = provincia;
    }

    

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Persona" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido 
                + ", telefono=" + telefono + ", provincia=" + provincia;
    }

    
}
