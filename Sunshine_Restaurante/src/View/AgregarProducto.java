/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controlador;

/**
 *
 * @author danip
 */
public class AgregarProducto extends javax.swing.JFrame {

    /**
     * Creates new form AgregarProducto
     */
    public AgregarProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNombre = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jLDuracion = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jTDuracion = new javax.swing.JTextField();
        jTDescripcion = new javax.swing.JTextField();
        jLTitulo = new javax.swing.JLabel();
        jBConfirmacion = new javax.swing.JButton();
        jLDescripcion = new javax.swing.JLabel();
        jBInicio = new javax.swing.JButton();
        jLImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(760, 505));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLNombre.setText("Nombre");
        getContentPane().add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLPrecio.setText("Precio");
        getContentPane().add(jLPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLDuracion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLDuracion.setText("Duracion");
        getContentPane().add(jLDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));
        getContentPane().add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 250, -1));
        getContentPane().add(jTPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 250, -1));
        getContentPane().add(jTDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 250, -1));
        getContentPane().add(jTDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 250, -1));

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(241, 234, 226));
        jLTitulo.setText("Agregar Producto");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 80, 360, -1));

        jBConfirmacion.setBackground(new java.awt.Color(241, 234, 226));
        jBConfirmacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBConfirmacion.setText("Crear");
        getContentPane().add(jBConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, -1, -1));

        jLDescripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLDescripcion.setText("Descripcion");
        getContentPane().add(jLDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

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

        jLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/vinoConBlanco.jpg"))); // NOI18N
        jLImagen.setText("jLabel1");
        jLImagen.setMaximumSize(new java.awt.Dimension(760, 505));
        jLImagen.setMinimumSize(new java.awt.Dimension(760, 505));
        jLImagen.setPreferredSize(new java.awt.Dimension(760, 505));
        getContentPane().add(jLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        // TODO add your handling code here:
        Principal p = Controlador.getCtr().getPrincipal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBInicioActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirmacion;
    private javax.swing.JButton jBInicio;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLDuracion;
    private javax.swing.JLabel jLImagen;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTDuracion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPrecio;
    // End of variables declaration//GEN-END:variables
}
