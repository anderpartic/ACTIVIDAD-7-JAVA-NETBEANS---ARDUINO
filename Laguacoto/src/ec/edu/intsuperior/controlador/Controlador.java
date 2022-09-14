package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.Empleado;
import ec.edu.intsuperior.vista.JPFAcercaDe;
import ec.edu.intsuperior.vista.JPFAyuda;
import ec.edu.intsuperior.vista.JPFCabanas;
import ec.edu.intsuperior.vista.Loggin;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Controlador {
    
    Loggin loggin = new Loggin(this);
    Administrador administrador = new Administrador(this);
    JPFAyuda jPFAyuda = new JPFAyuda(this);
    JPFAcercaDe jPFAcercaDe = new JPFAcercaDe(this);
    Empleado empleado = new Empleado(this);
    JPFCabanas jPFCabanas = new JPFCabanas(this);
    
    //    public void llenarTipoUsuario(JComboBox jbox){
//        PreparedStatement stm;
//        ResultSet rs;
//        String consulta = "select tipo_usuario from tipo_usuario";
//        
//        try {
//            stm = Conexion.getConnection().prepareStatement();
//            rs = stm.executeQuery();
//            while(rs.next()){
//                jbox.setSelectedIndex(0);
//            }
//        } catch (Exception e) {
//        }
//    }
    public void probarConexion(){
        Conexion.getConnection();
    }
    public void showJPFCabanas(){
        jPFCabanas.setSize(6000, 6000);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(jPFCabanas);
        jPFCabanas.setVisible(true);
        administrador.escritorio.repaint();
    }
 
    public void showEmpleado(){
        empleado.setVisible(true);
    }
    public void closeEmpleado(){
        empleado.setVisible(false);
    }
    
    
    public void showLoggin(){
        loggin.setVisible(true);
        loggin.setLocationRelativeTo(null);
        loggin.setResizable(false);

    }
    
    public void closeLoggin(){
        loggin.setVisible(false);
    }
    
    
    public void showAdministrador(){
        administrador.setVisible(true);
        administrador.setSize(6000, 6000);
        administrador.setTitle("Administrador");
        
    }
    
    public void closeAdministrador(){
        administrador.setVisible(false);
        administrador.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void openJPFAyuda(){
        jPFAyuda.setSize(4000, 4000);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(jPFAyuda);
        jPFAyuda.setVisible(true);
        administrador.escritorio.repaint();
    
    }
    public void closeJPFAyuda(){
        jPFAyuda.setVisible(false);
        
    }
    public void openJPFAcercaDe(){
        jPFAcercaDe.setSize(2500, 2500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(jPFAcercaDe);
        jPFAcercaDe.setVisible(true);
        administrador.escritorio.repaint();
    
    }
    
    
}
