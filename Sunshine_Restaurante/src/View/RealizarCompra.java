/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controlador;
import java.awt.Image;
import java.awt.Toolkit;

/** 
 *
 * @author danip
 */
public class RealizarCompra extends javax.swing.JFrame {

    /**
     * Creates new form RealizarCompra
     */
    public RealizarCompra() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaDisponibles = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTListaSeleccionados = new javax.swing.JTable();
        jBAgregar = new javax.swing.JButton();
        jBConfirmar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBInicio = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jLDisponibles = new javax.swing.JLabel();
        jLseleccionados = new javax.swing.JLabel();
        jBBebidas = new javax.swing.JButton();
        jBComidas = new javax.swing.JButton();
        jBPostres = new javax.swing.JButton();
        jBCombos = new javax.swing.JButton();
        shadowTable = new javax.swing.JLabel();
        lblUp = new javax.swing.JLabel();
        jLImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Realizar Compra");
        setMaximumSize(new java.awt.Dimension(760, 505));
        setMinimumSize(new java.awt.Dimension(760, 505));
        setPreferredSize(new java.awt.Dimension(760, 505));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        jTListaDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTListaDisponibles);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 260, 250));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        jTListaSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTListaSeleccionados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 260, 250));

        jBAgregar.setBackground(new java.awt.Color(241, 234, 226));
        jBAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(89, 17, 18));
        jBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/addFood.png"))); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.setMaximumSize(new java.awt.Dimension(130, 40));
        jBAgregar.setMinimumSize(new java.awt.Dimension(130, 40));
        jBAgregar.setOpaque(false);
        jBAgregar.setPreferredSize(new java.awt.Dimension(130, 40));
        getContentPane().add(jBAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 260, -1));

        jBConfirmar.setBackground(new java.awt.Color(241, 234, 226));
        jBConfirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBConfirmar.setForeground(new java.awt.Color(89, 17, 18));
        jBConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/checked2.png"))); // NOI18N
        jBConfirmar.setText("Confirmar");
        jBConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBConfirmar.setMaximumSize(new java.awt.Dimension(130, 40));
        jBConfirmar.setMinimumSize(new java.awt.Dimension(130, 40));
        jBConfirmar.setOpaque(false);
        jBConfirmar.setPreferredSize(new java.awt.Dimension(130, 40));
        getContentPane().add(jBConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 140, -1));

        jBEliminar.setBackground(new java.awt.Color(241, 234, 226));
        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(89, 17, 18));
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/deletedFood.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setMaximumSize(new java.awt.Dimension(130, 40));
        jBEliminar.setMinimumSize(new java.awt.Dimension(130, 40));
        jBEliminar.setOpaque(false);
        jBEliminar.setPreferredSize(new java.awt.Dimension(130, 40));
        getContentPane().add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 260, -1));

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

        jLTitulo.setBackground(new java.awt.Color(241, 234, 226));
        jLTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(241, 234, 226));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Realizar Compra");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 560, -1));

        jLDisponibles.setBackground(new java.awt.Color(241, 234, 226));
        jLDisponibles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLDisponibles.setForeground(new java.awt.Color(241, 234, 226));
        jLDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDisponibles.setText("Productos disponibles");
        getContentPane().add(jLDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 30));

        jLseleccionados.setBackground(new java.awt.Color(241, 234, 226));
        jLseleccionados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLseleccionados.setForeground(new java.awt.Color(241, 234, 226));
        jLseleccionados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLseleccionados.setText("Sus Productos");
        getContentPane().add(jLseleccionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 260, 30));

        jBBebidas.setBackground(new java.awt.Color(241, 234, 226));
        jBBebidas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBBebidas.setForeground(new java.awt.Color(89, 17, 18));
        jBBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/drink.png"))); // NOI18N
        jBBebidas.setText("Bebidas");
        jBBebidas.setMaximumSize(new java.awt.Dimension(130, 40));
        jBBebidas.setMinimumSize(new java.awt.Dimension(130, 40));
        jBBebidas.setOpaque(false);
        jBBebidas.setPreferredSize(new java.awt.Dimension(130, 40));
        getContentPane().add(jBBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jBComidas.setBackground(new java.awt.Color(241, 234, 226));
        jBComidas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBComidas.setForeground(new java.awt.Color(89, 17, 18));
        jBComidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/food.png"))); // NOI18N
        jBComidas.setText("Comidas");
        jBComidas.setMaximumSize(new java.awt.Dimension(130, 40));
        jBComidas.setMinimumSize(new java.awt.Dimension(130, 40));
        jBComidas.setOpaque(false);
        jBComidas.setPreferredSize(new java.awt.Dimension(130, 40));
        getContentPane().add(jBComidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jBPostres.setBackground(new java.awt.Color(241, 234, 226));
        jBPostres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBPostres.setForeground(new java.awt.Color(89, 17, 18));
        jBPostres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/dessert.png"))); // NOI18N
        jBPostres.setText("Postres");
        jBPostres.setMaximumSize(new java.awt.Dimension(130, 40));
        jBPostres.setMinimumSize(new java.awt.Dimension(130, 40));
        jBPostres.setOpaque(false);
        jBPostres.setPreferredSize(new java.awt.Dimension(130, 40));
        getContentPane().add(jBPostres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jBCombos.setBackground(new java.awt.Color(241, 234, 226));
        jBCombos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBCombos.setForeground(new java.awt.Color(89, 17, 18));
        jBCombos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/combo.png"))); // NOI18N
        jBCombos.setText("Combos");
        jBCombos.setMaximumSize(new java.awt.Dimension(130, 40));
        jBCombos.setMinimumSize(new java.awt.Dimension(130, 40));
        jBCombos.setOpaque(false);
        jBCombos.setPreferredSize(new java.awt.Dimension(130, 40));
        getContentPane().add(jBCombos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        shadowTable.setBackground(new java.awt.Color(152, 50, 39));
        shadowTable.setOpaque(true);
        getContentPane().add(shadowTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 570, 390));

        lblUp.setBackground(new java.awt.Color(255, 235, 238));
        lblUp.setOpaque(true);
        getContentPane().add(lblUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 60));

        jLImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/vinoConBlanco.jpg"))); // NOI18N
        jLImagen.setMaximumSize(new java.awt.Dimension(130, 40));
        jLImagen.setMinimumSize(new java.awt.Dimension(130, 40));
        jLImagen.setPreferredSize(new java.awt.Dimension(130, 40));
        getContentPane().add(jLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 520));

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
            /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */ /*
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RealizarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarCompra().setVisible(true);
            }
        });
    }
    
            //</editor-fold>

        /* Create and display the form */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBebidas;
    private javax.swing.JButton jBCombos;
    private javax.swing.JButton jBComidas;
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBPostres;
    private javax.swing.JLabel jLDisponibles;
    private javax.swing.JLabel jLImagen;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLseleccionados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTListaDisponibles;
    private javax.swing.JTable jTListaSeleccionados;
    private javax.swing.JLabel lblUp;
    private javax.swing.JLabel shadowTable;
    // End of variables declaration//GEN-END:variables
}
