package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import ec.edu.intsuperior.modelo.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author quish
 */
public class Aplicacion {
   

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Cliente c1 = new Cliente();
        
        c1.setCi(JOptionPane.showInputDialog("Ingresa tu numero de cedula"));
        c1.setApellido1(JOptionPane.showInputDialog("Ingresa tu primer apellido"));
        c1.setApellido2(JOptionPane.showInputDialog("Ingresa tu segundo apellido"));
        c1.setNombre1(JOptionPane.showInputDialog("Ingresa tu primer nombre"));
        c1.setNombre2(JOptionPane.showInputDialog("Ingresa tu segundo nombre"));
        c1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad")));
        c1.setTelefonoContacto(Long.parseLong(JOptionPane.showInputDialog("Ingresa tu numero de telefono sin el cero")));
        
        
        JOptionPane.showMessageDialog(null,c1.mostrarDatos());
    }
    
}
