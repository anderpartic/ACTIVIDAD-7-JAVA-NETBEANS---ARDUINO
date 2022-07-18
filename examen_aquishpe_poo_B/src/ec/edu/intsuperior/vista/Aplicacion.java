package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author quish
 */
public class Aplicacion {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();

        c1.setCi(JOptionPane.showInputDialog("Digite su numero de cedula"));
        c1.setNombreEmpresa(JOptionPane.showInputDialog("Empresa en la que trabaja"));
        c1.setApellido1(JOptionPane.showInputDialog("Ingrese su primer apellido"));
        c1.setApellido2(JOptionPane.showInputDialog("Ingrese su segundo apellido"));
        c1.setNombre1(JOptionPane.showInputDialog("Ingrese su primer nombre"));
        c1.setNombre2(JOptionPane.showInputDialog("Ingrese su segundo nombre"));
        c1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento(dd/mm/aaaa)")));
        c1.setTelefonoContacto(Long.parseLong(JOptionPane.showInputDialog("Ingrese su numero de telefono sin el cero")));

        JOptionPane.showMessageDialog(null, c1.mostrarDatos());
    }

}
