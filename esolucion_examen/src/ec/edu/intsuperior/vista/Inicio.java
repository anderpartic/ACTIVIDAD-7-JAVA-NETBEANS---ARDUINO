package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Empleado;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;

public class Inicio extends javax.swing.JFrame {

    ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

    public Inicio() {
        initComponents();
    }

    public void limpiarCampos() {
        this.jtCedula.setText("");
        this.jtNombre.setText("");
        this.jtApellido.setText("");
        this.jtSueldo.setText("");
        this.jtTelefono.setText("");
        this.jtCargo.setText("");
        this.cbProvincia.setSelectedIndex(0);
        this.lbInfo.setVisible(false);
        this.jtCedula.setEditable(true);
    }

    public void inicializar() {
        limpiarCampos();
    }

    public void mostrarMensaje(String mensaje) {
        this.lbInfo.setVisible(true);
        this.lbInfo.setText(mensaje);
    }

    public boolean validarCedula(int cedula) {
        for (Empleado em : listaEmpleados) {
            if (em.getCedula() == cedula) return false;
            }
        return true;
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbCedula = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jtCedula = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        lbSueldo = new javax.swing.JLabel();
        jtSueldo = new javax.swing.JTextField();
        lbInfo = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        lbCargo = new javax.swing.JLabel();
        jtCargo = new javax.swing.JTextField();
        lbCargo1 = new javax.swing.JLabel();
        lbProvincia = new javax.swing.JLabel();
        cbProvincia = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));

        jPanel1.setBackground(new java.awt.Color(27, 45, 60));

        lbCedula.setBackground(new java.awt.Color(255, 255, 255));
        lbCedula.setForeground(new java.awt.Color(255, 255, 255));
        lbCedula.setText("Cedula");

        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setText("Nombre");

        lbApellido.setForeground(new java.awt.Color(255, 255, 255));
        lbApellido.setText("Apellido");

        btGuardar.setText("GUARDAR");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btBuscar.setText("BUSCAR");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btBorrar.setText("BORRAR");
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });

        btEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btEliminar.setText("LIMPIAR");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btSalir.setText("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        jtCedula.setText("jtCed");
        jtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCedulaActionPerformed(evt);
            }
        });

        jtNombre.setText("jtNom");

        jtApellido.setText("jtApe");

        lbSueldo.setForeground(new java.awt.Color(255, 255, 255));
        lbSueldo.setText("Sueldo");

        jtSueldo.setText("jtSue");

        lbInfo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbInfo.setForeground(new java.awt.Color(255, 255, 255));
        lbInfo.setText(" ");

        lbTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lbTelefono.setText("Telefono");

        jtTelefono.setText("jtTel");
        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });

        lbCargo.setForeground(new java.awt.Color(255, 255, 255));
        lbCargo.setText("Cargo");

        jtCargo.setText("jtCar");
        jtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCargoActionPerformed(evt);
            }
        });

        lbCargo1.setFont(new java.awt.Font("Showcard Gothic", 3, 36)); // NOI18N
        lbCargo1.setForeground(new java.awt.Color(255, 255, 255));
        lbCargo1.setText("ENIGMA  ENTERPRISE");

        lbProvincia.setForeground(new java.awt.Color(255, 255, 255));
        lbProvincia.setText("Provincia");

        cbProvincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una provincia:", "Azuay", "Bolívar", "Cañar", "Carchi", "Chimborazo", "Cotopaxi", "El Oro", "Esmeraldas", "Galápagos", "Guayas", "Imbabura", "Loja", "Los Ríos", "Manabí", "Morona Santiago", "Napo", "Orellana", "Pastaza", "Pichincha", "Santa Elena", "Santo Domingo de los Tsáchilas", "Sucumbíos", "Tungurahua", "Zamora Chinchipe" }));
        cbProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProvinciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTelefono)
                            .addComponent(lbCargo)
                            .addComponent(lbProvincia)
                            .addComponent(lbSueldo)
                            .addComponent(lbApellido)
                            .addComponent(lbNombre)
                            .addComponent(lbCedula))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBorrar))
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtApellido)
                            .addComponent(jtSueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                            .addComponent(jtTelefono)
                            .addComponent(jtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(lbCargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btGuardar)
                        .addGap(49, 49, 49)
                        .addComponent(btEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalir)
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbCedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbNombre)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lbApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbCargo))
                            .addComponent(lbCargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbProvincia))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBorrar)
                            .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(lbInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalir)
                    .addComponent(btGuardar)
                    .addComponent(btEliminar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        try {

            String cedulaStr = jtCedula.getText();
            String nombre = jtNombre.getText();
            String apellido = jtApellido.getText();
            String sueldoStr = jtSueldo.getText();
            String telefono = jtTelefono.getText();
            String cargo = jtCargo.getText();
            String provincia = (String) cbProvincia.getSelectedItem();

            boolean errorIngresoVacio = false;
            if ("".equals(cedulaStr))   errorIngresoVacio = true;
            if ("".equals(nombre))      errorIngresoVacio = true;
            if ("".equals(apellido))    errorIngresoVacio = true;
            if ("".equals(sueldoStr))   errorIngresoVacio = true;
            if ("".equals(telefono))    errorIngresoVacio = true;
            if ("".equals(cargo))       errorIngresoVacio = true;
            if (cbProvincia.getSelectedIndex() == 0)    errorIngresoVacio = true;

            if (errorIngresoVacio) {
                mostrarMensaje("Debe ingresar todos los datos");
                return;
            }

            int cedula = Integer.parseInt(cedulaStr);
            int sueldo = Integer.parseInt(sueldoStr);

            if (validarCedula(cedula)) {
                Empleado em = new Empleado(sueldo, cedula, nombre, apellido, telefono, cargo, provincia);
                this.listaEmpleados.add(em);
                limpiarCampos();
                mostrarMensaje("Empleado Ingresado");
            } else {
                mostrarMensaje("Cedula no valido");
            }

        } catch (Exception e) {
            mostrarMensaje("Cedula y Sueldo deben ser numericos.");
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        limpiarCampos();

    }//GEN-LAST:event_btEliminarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_btSalirActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        this.lbInfo.setVisible(false);
        String cedulaStr = jtCedula.getText();
        if ("".equals(cedulaStr)) {
            mostrarMensaje("Debe ingresar un numero de Cedula");
        }
        try {
            int cedula = Integer.parseInt(cedulaStr);
            for (Empleado listaEmpleado : listaEmpleados) {
                if (listaEmpleado.getCedula() == cedula) {
                    String nombre = listaEmpleado.getNombre();
                    this.listaEmpleados.remove(listaEmpleado);
                    mostrarMensaje(nombre + " Eliminado");
                    return;
                }
            }
            limpiarCampos();
            this.jtCedula.setText(cedulaStr);
            mostrarMensaje("Cedula no encontrada");
        } catch (Exception e) {
            mostrarMensaje("Cedula debe ser numerico");
        }
    }//GEN-LAST:event_btBorrarActionPerformed

    private void jtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCedulaActionPerformed

    private void jtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoActionPerformed

    private void jtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCargoActionPerformed

    private void cbProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProvinciaActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        
        this.lbInfo.setVisible(false);
        String cedulaStr = jtCedula.getText();
        if ("".equals(cedulaStr)) {
            mostrarMensaje("Debe ingresar un numero de Cedula");
        }
        try {
            int cedula = Integer.parseInt(cedulaStr);
            for (Empleado listaEmpleado : listaEmpleados) {
                if (listaEmpleado.getCedula() == cedula) {
                    this.jtCedula.setEditable(false);
                    
                    jtNombre.setText(listaEmpleado.getNombre());
                    jtApellido.setText(listaEmpleado.getApellido());
                    jtSueldo.setText(String.valueOf(listaEmpleado.getSueldo()));
                    jtTelefono.setText(listaEmpleado.getTelefono());
                    jtCargo.setText(listaEmpleado.getCargo());
                    ComboBoxModel cbm = this.cbProvincia.getModel();
                    for (int i = 0; i < cbm.getSize(); i++) {
                        if (cbm.getElementAt(i).toString().equals(listaEmpleado.getProvincia())) {
                            this.cbProvincia.setSelectedIndex(i);
                            return;
                        }
                    }
                    
                }
                
            }
            limpiarCampos();
            this.jtCedula.setText(cedulaStr);
            mostrarMensaje("Cedula no encontrada");
        }catch (Exception e) {
            mostrarMensaje("Cedula debe ser numerico");
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox cbProvincia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCargo;
    private javax.swing.JTextField jtCedula;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtSueldo;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCargo1;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbProvincia;
    private javax.swing.JLabel lbSueldo;
    private javax.swing.JLabel lbTelefono;
    // End of variables declaration//GEN-END:variables
}
