package codetheory.Vista;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class general extends javax.swing.JFrame {

    public general() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jTextField1 = new javax.swing.JTextField();
        jPanel = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        info1 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        k = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        q = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Theory of code");
        setBackground(new java.awt.Color(255, 0, 51));

        jPanel.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel1.setText("Theory of code");
        jLabel1.setToolTipText("");

        info.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        info.setText("C[n,k,d]");

        info1.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        info1.setText("q=");

        n.setBorder(null);

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        k.setBorder(null);

        d.setBorder(null);

        q.setBorder(null);

        jPanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel.setLayer(info, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel.setLayer(info1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel.setLayer(n, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel.setLayer(k, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel.setLayer(d, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel.setLayer(q, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(132, 132, 132))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(info1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton2)))
                .addGap(37, 37, 37)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }//GEN-END:initComponents
    /**
     *
     * @param evt Sirve para validar que los valores sean validos
     */
    static int dn;
    static int nn;
    static int kn;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            dn = Integer.parseInt(d.getText());
            nn = Integer.parseInt(n.getText());
            kn = Integer.parseInt(k.getText());
            if (dn <= (nn - kn + 1)) {
                codetheory.Controls.CodeTheory.comienzo(nn, kn, dn, Integer.parseInt(q.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "d no cumple la condicion");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ingrese un valor valido", "Error", 0);
        }

    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(general.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new general().setVisible(true);

            }
        });
    }

    public static int getDn() {
        return dn;
    }

    public static int getNn() {
        return nn;
    }

    public static int getKn() {
        return kn;
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField d;
    private javax.swing.JLabel info;
    private javax.swing.JLabel info1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jPanel;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField k;
    private javax.swing.JTextField n;
    private javax.swing.JTextField q;
    // End of variables declaration//GEN-END:variables
}
