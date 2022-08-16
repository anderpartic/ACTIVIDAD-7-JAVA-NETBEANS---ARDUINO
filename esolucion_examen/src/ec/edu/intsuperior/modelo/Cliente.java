package ec.edu.intsuperior.modelo;

public class Cliente extends Persona{
    

    public Cliente() {
    }

    public Cliente(int cedula, String nombre, String apellido, String telefono, String provincia) {
        super(cedula, nombre, apellido, telefono, provincia);
    }

    @Override
    public String toString() {
        return "Cliente{" + '}';
    }
    
    
    
}
