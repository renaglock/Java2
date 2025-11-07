
package view;

import javax.swing.JOptionPane;

public class frmMenu extends javax.swing.JFrame {

    public frmMenu() {
        initComponents();
        setSize(750, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnRestar = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        rdoUno = new javax.swing.JRadioButton();
        rdoDos = new javax.swing.JRadioButton();
        mnuBarPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRestar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRestar.setText("Restar");
        btnRestar.setToolTipText("presiona para restar");
        btnRestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 180, 90));

        btnSumar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSumar.setText("Sumar");
        btnSumar.setToolTipText("presiona para sumar");
        btnSumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 180, 90));

        jCheckBox1.setText("jCheckBox1");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        jCheckBox2.setText("jCheckBox2");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        jCheckBox3.setText("jCheckBox3");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        buttonGroup1.add(rdoUno);
        rdoUno.setText("jRadioButton1");
        jPanel1.add(rdoUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        buttonGroup1.add(rdoDos);
        rdoDos.setText("jRadioButton2");
        jPanel1.add(rdoDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 750, 650));

        jMenu1.setText("Sistema");

        itmSalir.setText("Salir");
        itmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                itmSalirMousePressed(evt);
            }
        });
        itmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSalirActionPerformed(evt);
            }
        });
        itmSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itmSalirKeyPressed(evt);
            }
        });
        jMenu1.add(itmSalir);

        mnuBarPrincipal.add(jMenu1);

        jMenu2.setText("Ayuda");
        mnuBarPrincipal.add(jMenu2);

        setJMenuBar(mnuBarPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSalirActionPerformed
        dispose();
    }//GEN-LAST:event_itmSalirActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        dlgRestar objRestar = new dlgRestar(this, true);
        objRestar.setVisible(true);

        
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        dlgSumar objSumar = new dlgSumar(this, true);
        objSumar.setVisible(true);
    }//GEN-LAST:event_btnSumarActionPerformed

    private void itmSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itmSalirMousePressed
        int opcion = JOptionPane.showConfirmDialog(this, "Estás Seguro?", "Pregunta",0);
        if(opcion == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_itmSalirMousePressed

    private void itmSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itmSalirKeyPressed
        
    }//GEN-LAST:event_itmSalirKeyPressed

  
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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem itmSalir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar mnuBarPrincipal;
    private javax.swing.JRadioButton rdoDos;
    private javax.swing.JRadioButton rdoUno;
    // End of variables declaration//GEN-END:variables
}
