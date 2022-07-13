/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author quish
 */
public class Aplicacion {
    public static void main(String[] args){
       
        Persona p1= new Persona();
        p1.setCi(JOptionPane.showInputDialog("Ingresa tu numero de cedula"));
        p1.setNombre1(JOptionPane.showInputDialog("Ingresa tu primer nombre"));
        p1.setNombre2(JOptionPane.showInputDialog("Ingresa tu segundo nombre"));
        p1.setApellido1(JOptionPane.showInputDialog("Ingresa el apellido paterno"));
        p1.setApellido2(JOptionPane.showInputDialog("Ingresa el apellido materno"));
        p1.setEdad(JOptionPane.showInputDialog("Ingresa tu edad"));
        p1.setDireccion(JOptionPane.showInputDialog("Ingrese su Direccion"));
        JOptionPane.showMessageDialog(null,p1.toString());
        
    }
 }
    
