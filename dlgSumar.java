
package view;

import java.util.HashSet;
import java.util.Set;

public class dlgSumar extends javax.swing.JDialog {

    public dlgSumar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    public void calcularTotal() {
        if (txtValor1.getText().length() > 0 && txtValor2.getText().length() > 0) {
            int num1 = Integer.parseInt(txtValor1.getText());
            int num2 = Integer.parseInt(txtValor2.getText());

            int total = num1 + num2;
            lblResultado.setText(String.valueOf(total));
        } else {
            lblResultado.setText("");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUno = new javax.swing.JPanel();
        lblValor1 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        lblValor2 = new javax.swing.JLabel();
        txtValor2 = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlUno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValor1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValor1.setText("1er Valor");
        pnlUno.add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txtValor1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtValor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValor1KeyReleased(evt);
            }
        });
        pnlUno.add(txtValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, -1));

        lblValor2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValor2.setText("2do Valor");
        pnlUno.add(lblValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        txtValor2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtValor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValor2KeyReleased(evt);
            }
        });
        pnlUno.add(txtValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 190, -1));

        lblResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultado.setText("-------");
        pnlUno.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 290, -1));

        btnSalir1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        pnlUno.add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 120, 50));

        getContentPane().add(pnlUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValor1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor1KeyReleased
        calcularTotal();
    }//GEN-LAST:event_txtValor1KeyReleased

    private void txtValor2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor2KeyReleased
        calcularTotal();
    }//GEN-LAST:event_txtValor2KeyReleased

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

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
            java.util.logging.Logger.getLogger(dlgSumar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgSumar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgSumar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgSumar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgSumar dialog = new dlgSumar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JPanel pnlUno;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}
