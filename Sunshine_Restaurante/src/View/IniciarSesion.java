/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controlador;
import Model.User;
import Model.UserClient;
//import Model.UserEmpl;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author danip
 */
public class IniciarSesion extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    
    
 
    public IniciarSesion() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Resources/icons2.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBInicio = new javax.swing.JButton();
        lblUp = new javax.swing.JLabel();
        jLConfirmar = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLContrasena = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTContrasena = new javax.swing.JTextField();
        lblDataSesion = new javax.swing.JLabel();
        lblDataSesion1 = new javax.swing.JLabel();
        jLImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesion");
        setMaximumSize(new java.awt.Dimension(760, 505));
        setMinimumSize(new java.awt.Dimension(760, 505));
        setPreferredSize(new java.awt.Dimension(760, 505));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBInicio.setBackground(new java.awt.Color(241, 234, 226));
        jBInicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBInicio.setForeground(new java.awt.Color(89, 17, 18));
        jBInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/menuPrin.png"))); // NOI18N
        jBInicio.setText("Inicio");
        jBInicio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBInicio.setMaximumSize(new java.awt.Dimension(130, 40));
        jBInicio.setMinimumSize(new java.awt.Dimension(130, 40));
        jBInicio.setOpaque(false);
        jBInicio.setPreferredSize(new java.awt.Dimension(130, 40));
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jBInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 140, -1));

        lblUp.setBackground(new java.awt.Color(255, 235, 238));
        lblUp.setOpaque(true);
        getContentPane().add(lblUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 60));

        jLConfirmar.setBackground(new java.awt.Color(241, 234, 226));
        jLConfirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLConfirmar.setForeground(new java.awt.Color(89, 17, 18));
        jLConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/checked2.png"))); // NOI18N
        jLConfirmar.setText("Confirmar");
        jLConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLConfirmar.setMaximumSize(new java.awt.Dimension(130, 40));
        jLConfirmar.setMinimumSize(new java.awt.Dimension(130, 40));
        jLConfirmar.setOpaque(false);
        jLConfirmar.setPreferredSize(new java.awt.Dimension(130, 40));
        jLConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jLConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 230, -1));

        jLTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(241, 234, 226));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Iniciar Sesion");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 510, 70));

        jLNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(241, 234, 226));
        jLNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombre.setText("Nombre:");
        getContentPane().add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 190, -1));

        jLContrasena.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLContrasena.setForeground(new java.awt.Color(241, 234, 226));
        jLContrasena.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLContrasena.setText("Contraseña:");
        getContentPane().add(jLContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 190, -1));

        jTNombre.setBackground(new java.awt.Color(241, 234, 226));
        jTNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 230, -1));

        jTContrasena.setBackground(new java.awt.Color(241, 234, 226));
        jTContrasena.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(jTContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 230, -1));

        lblDataSesion.setBackground(new java.awt.Color(167, 39, 32));
        lblDataSesion.setOpaque(true);
        getContentPane().add(lblDataSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 510, 330));

        lblDataSesion1.setBackground(new java.awt.Color(98, 39, 32));
        lblDataSesion1.setOpaque(true);
        getContentPane().add(lblDataSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 510, 330));

        jLImagen.setBackground(new java.awt.Color(241, 234, 226));
        jLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/vinoConBlanco.jpg"))); // NOI18N
        getContentPane().add(jLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTContrasenaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTContrasenaActionPerformed

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        // TODO add your handling code here:
        Principal p = Controlador.getCtr().getPrincipal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBInicioActionPerformed

    private void jLConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLConfirmarActionPerformed
        // TODO add your handling code here:
        getUser();
    }//GEN-LAST:event_jLConfirmarActionPerformed

    private void getUser(){
        if(validarCampos()){

        }else{
          JOptionPane.showMessageDialog(null, "Llene los datos correspondientes");
        }

    }
    
    private boolean validarCampos(){
        boolean result = true;
        if(this.jTNombre.getText().isEmpty() || this.jTContrasena.getText().isEmpty())
            result = false;
        return result;
    }
    
    private void ventanaEmpleado(int tipo){
        VentanaGerente nuevaVentana = Controlador.getCtr().getVentanaGerente();
        nuevaVentana.setVisible(true);
        this.dispose();
    }
    /**
     * @param args the command line arguments
     */
    
          /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */  
    /*
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }
   //</editor-fold>

        /* Create and display the form */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jLConfirmar;
    private javax.swing.JLabel jLContrasena;
    private javax.swing.JLabel jLImagen;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JTextField jTContrasena;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JLabel lblDataSesion;
    private javax.swing.JLabel lblDataSesion1;
    private javax.swing.JLabel lblUp;
    // End of variables declaration//GEN-END:variables
}
