package ec.edu.intsuperior.modelo;

import ec.edu.intsuperior.controlador.Controlador;
import ec.edu.intsuperior.vista.JFCliente;



public class Aplicacion {
    public static void main(String[] args) {
        cliente mod = new cliente();
        SQLConsultas modC = new SQLConsultas();
        JFCliente jfc = new JFCliente();
        Empleado empC = new Empleado();
       
        
        Controlador ctr = new Controlador(mod, modC, jfc, empC);
        ctr.iniciar();        
        jfc.setVisible(true);
        
        
        
    }
    
}
