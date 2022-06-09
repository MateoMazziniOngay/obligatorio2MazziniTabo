package interfaz;

public class registroDepo extends javax.swing.JFrame {

    public registroDepo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblDeposito = new javax.swing.JLabel();
        lblId_D = new javax.swing.JLabel();
        lbblSize_D = new javax.swing.JLabel();
        lblEstantes_D = new javax.swing.JLabel();
        lblRefri_D = new javax.swing.JLabel();
        inputId_D = new javax.swing.JTextField();
        inputSize_D = new javax.swing.JTextField();
        comboEstantes_D = new javax.swing.JComboBox<>();
        comboRefri_D = new javax.swing.JComboBox<>();
        btnRegistrar_D = new javax.swing.JButton();
        btnCancelarR_D = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDeposito.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDeposito.setText("REGISTRO DE DEPÓSITO");

        lblId_D.setText("ID Depósito");

        lbblSize_D.setText("Tamaño (m2)");

        lblEstantes_D.setText("Estantes ");

        lblRefri_D.setText("Refrigeración");

        inputId_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputId_DActionPerformed(evt);
            }
        });

        inputSize_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSize_DActionPerformed(evt);
            }
        });

        comboEstantes_D.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        comboEstantes_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstantes_DActionPerformed(evt);
            }
        });

        comboRefri_D.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        comboRefri_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRefri_DActionPerformed(evt);
            }
        });

        btnRegistrar_D.setText("Registrar");

        btnCancelarR_D.setText("Cancelar");
        btnCancelarR_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarR_DActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeposito)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblId_D)
                                .addComponent(lbblSize_D)
                                .addComponent(lblEstantes_D))
                            .addGap(66, 66, 66)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputSize_D, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addComponent(inputId_D)
                                .addComponent(comboEstantes_D, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblRefri_D)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboRefri_D, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnCancelarR_D)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrar_D))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId_D)
                    .addComponent(inputId_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbblSize_D)
                    .addComponent(inputSize_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstantes_D)
                    .addComponent(comboEstantes_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRefri_D)
                    .addComponent(comboRefri_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarR_D)
                    .addComponent(btnRegistrar_D))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 299, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void inputId_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputId_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputId_DActionPerformed

    private void inputSize_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSize_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSize_DActionPerformed

    private void comboEstantes_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstantes_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstantes_DActionPerformed

    private void comboRefri_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRefri_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRefri_DActionPerformed

    private void btnCancelarR_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarR_DActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarR_DActionPerformed

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
            java.util.logging.Logger.getLogger(registroDepo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroDepo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroDepo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroDepo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroDepo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarR_D;
    private javax.swing.JButton btnRegistrar_D;
    private javax.swing.JComboBox<String> comboEstantes_D;
    private javax.swing.JComboBox<String> comboRefri_D;
    private javax.swing.JTextField inputId_D;
    private javax.swing.JTextField inputSize_D;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbblSize_D;
    private javax.swing.JLabel lblDeposito;
    private javax.swing.JLabel lblEstantes_D;
    private javax.swing.JLabel lblId_D;
    private javax.swing.JLabel lblRefri_D;
    // End of variables declaration//GEN-END:variables
}
