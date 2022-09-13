package ec.edu.intsuperior.modelo;

import ec.edu.intsuperior.controlador.Controlador;
import ec.edu.intsuperior.vista.JFCliente;



public class Aplicacion {
    public static void main(String[] args) {
        cliente mod = new cliente();
        consultasCliente modC = new consultasCliente();
        JFCliente jfc = new JFCliente();
       
        
        Controlador ctr = new Controlador(mod, modC, jfc);
        ctr.iniciar();        
        jfc.setVisible(true);
        
        
        
    }
    
}
