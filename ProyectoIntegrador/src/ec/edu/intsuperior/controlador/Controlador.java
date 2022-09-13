package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.cliente;
import ec.edu.intsuperior.modelo.SQLConsultas;
import ec.edu.intsuperior.vista.JFCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
    private cliente mod;
    private SQLConsultas modC;
    private JFCliente jfc;
    private Empleado empC;
    
    
    
    public Controlador (cliente mod, SQLConsultas modC, JFCliente jfc, Empleado empC)
    {
        this.mod = mod;
        this.modC = modC;
        this.jfc = jfc;
        this.empC = empC;
        
        
        this.jfc.btnGuardar.addActionListener(this);
        this.jfc.btnModificar.addActionListener(this);
        this.jfc.btnEliminar.addActionListener(this);
        this.jfc.btnLimpiar.addActionListener(this);
        this.jfc.btnBuscar.addActionListener(this);
        
    
    }
    public void iniciar (){
        jfc.setTitle("Clientes");
        jfc.setLocationRelativeTo(null);
        jfc.txtId.setVisible(false);
    }
    
    
    @Override
    public void actionPerformed (ActionEvent e){
        if(e.getSource()== jfc.btnGuardar) {
            mod.setCed(jfc.txtCedula.getText());
            mod.setNom(jfc.txtNom.getText());
            mod.setTel(jfc.txtTel.getText());
            mod.setDir(jfc.txtDir.getText());
            mod.setEmail(jfc.txtEmail.getText());
            
            if (modC.registrar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                Limpiar ();
            }else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                Limpiar();
            }
        }
        
        if(e.getSource()== jfc.btnModificar) {
            mod.setId(Integer.parseInt(jfc.txtId.getText()));
            mod.setCed(jfc.txtCedula.getText());
            mod.setNom(jfc.txtNom.getText());
            mod.setTel(jfc.txtTel.getText());
            mod.setDir(jfc.txtDir.getText());
            mod.setEmail(jfc.txtEmail.getText());
            
            if (modC.modificar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                Limpiar ();
            }else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                Limpiar();
            }
        }
        
        if(e.getSource()== jfc.btnEliminar) {
            mod.setId(Integer.parseInt(jfc.txtId.getText()));
              
            if (modC.eliminar(mod)){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                Limpiar ();
            }else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                Limpiar();
            }
        }
        if(e.getSource()== jfc.btnBuscar) {
            mod.setCed(jfc.txtCedula.getText());
              
            if (modC.buscar(mod)){
                
                jfc.txtId.setText(String.valueOf(mod.getId()));
                jfc.txtCedula.setText(mod.getCed());
                jfc.txtNom.setText(mod.getNom());
                jfc.txtTel.setText(mod.getTel());
                jfc.txtDir.setText(mod.getDir());
                jfc.txtEmail.setText(mod.getEmail());
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el registro");
                Limpiar();
            }
        }
         if(e.getSource()== jfc.btnLimpiar) {
             Limpiar();
             
         }
    }
    
    public void Limpiar (){
        jfc.txtId.setText(null);
        jfc.txtCedula.setText(null);
        jfc.txtNom.setText(null);
        jfc.txtTel.setText(null);
        jfc.txtDir.setText(null);
        jfc.txtEmail.setText(null);
    }
 
 
       
 }
