package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.conexion;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import panamahitek.Arduino.PanamaHitek_Arduino;

public class House extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos;
    Thread hilo;

    PanamaHitek_Arduino ino = new PanamaHitek_Arduino();

    conexion cn = new conexion();
    Connection cx = cn.obtenerConexion();

    public House() {
        initComponents();
        this.setTitle("Abrir y Cerrar puerta");
        this.setLocationRelativeTo(null);
        lbFecha.setText(fecha());
        PuertaClose();
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);

        try {
            ino.arduinoRXTX("COM9", 115200, listener);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    SerialPortEventListener listener = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if (spe.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
                    boolean message = (boolean) spe.getNewValue();
                    if (message == true) {
                        PuertaOpen();

                    } else if (message == false) {
                        PuertaClose();

                    }

                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    };

    public void hora() {
        Calendar calendar = new GregorianCalendar();
        Date horaActual = new Date();
        calendar.setTime(horaActual);
        hora = calendar.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendar.get(Calendar.HOUR_OF_DAY) : "0" + calendar.get(Calendar.HOUR_OF_DAY);
        minutos = calendar.get(Calendar.MINUTE) > 9 ? "" + calendar.get(Calendar.MINUTE) : "0" + calendar.get(Calendar.MINUTE);
        segundos = calendar.get(Calendar.SECOND) > 9 ? "" + calendar.get(Calendar.SECOND) : "0" + calendar.get(Calendar.SECOND);
    }

    public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
            hora();
            lbHora.setText(hora + ":" + minutos + ":" + segundos);

        }
    }

    public void PuertaClose() {
        ImageIcon puerta;
        puerta = new ImageIcon(getClass().getResource("/Imagenes/cerrado.png"));
        Icon puertaIcon = new ImageIcon(puerta.getImage().getScaledInstance(lbPuerta.getWidth(), lbPuerta.getHeight(), Image.SCALE_SMOOTH));
        lbPuerta.setIcon(puertaIcon);
        lbEstado.setText("La puerta esta cerrada");
        lbBTN.setText("0");
        EstadoP();
    }

    public void PuertaOpen() {
        ImageIcon puerta;
        puerta = new ImageIcon(getClass().getResource("/Imagenes/abierto.png"));
        Icon puertaIcon = new ImageIcon(puerta.getImage().getScaledInstance(lbPuerta.getWidth(), lbPuerta.getHeight(), Image.SCALE_SMOOTH));

        lbPuerta.setIcon(puertaIcon);
        lbEstado.setText("La puerta esta abierta");
        lbBTN.setText("1");
        EstadoP();
    }

    public void EstadoP() {

        String fecha = lbFecha.getText();
        String hora = lbHora.getText();
        String Estado = lbBTN.getText();
        //String query = "INSERT INTO estado (est_fecha, est_estado) values (concat('" + fecha + " '  ' ' '" + hora + "'),'" + Estado + "')";
        String query = "UPDATE estado SET est_fecha= CONCAT('" + fecha + " '  ' ' '" + hora + "'), est_estado='" + Estado + "' WHERE id_estado =1";

        try {
            PreparedStatement st = cx.prepareStatement(query);
            st.executeUpdate();
            System.out.println("Exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(House.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbPuerta = new javax.swing.JLabel();
        btnAbrir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lbEstado = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lbFecha = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        lbBTN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 77, 230));
        jPanel1.setForeground(new java.awt.Color(36, 77, 230));

        btnAbrir.setBackground(new java.awt.Color(0, 102, 51));
        btnAbrir.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("ABRIR");
        btnAbrir.setDefaultCapable(false);
        btnAbrir.setFocusPainted(false);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(153, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("CERRAR");
        btnCerrar.setFocusPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lbEstado.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lbEstado.setForeground(new java.awt.Color(255, 255, 255));

        btnVolver.setBackground(new java.awt.Color(0, 204, 204));
        btnVolver.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setText("VOLVER");
        btnVolver.setFocusPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lbFecha.setBackground(new java.awt.Color(255, 255, 255));
        lbFecha.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(255, 255, 255));
        lbFecha.setText("DD/MM/YYYY");

        lbHora.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbHora.setForeground(new java.awt.Color(255, 255, 255));
        lbHora.setText("00:00:00");

        lbBTN.setForeground(new java.awt.Color(36, 77, 230));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPuerta, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addGap(60, 60, 60))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(lbBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 118, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFecha)
                .addGap(18, 18, 18)
                .addComponent(lbHora)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha)
                    .addComponent(lbHora))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPuerta, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lbBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnAbrir)
                        .addGap(47, 47, 47)
                        .addComponent(btnCerrar)
                        .addGap(31, 31, 31)
                        .addComponent(btnVolver)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    try {
                        ino.sendData("k");

                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    Thread.sleep(900);
                    PuertaOpen();

                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }).start();


    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    try {
                        ino.sendData("h");

                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    Thread.sleep(1900);

                    PuertaClose();

                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }).start();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatFecha = new SimpleDateFormat("YYYY/MM/dd");
        return formatFecha.format(fecha);
    }

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new House().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBTN;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbPuerta;
    // End of variables declaration//GEN-END:variables
}
