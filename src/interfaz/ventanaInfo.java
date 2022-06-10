package interfaz;

import dominio.*;
import javax.swing.*;

public class ventanaInfo extends javax.swing.JFrame {

    public ventanaInfo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informacion");
        getContentPane().setLayout(null);

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPanelLayout = new javax.swing.GroupLayout(pnlPanel);
        pnlPanel.setLayout(pnlPanelLayout);
        pnlPanelLayout.setHorizontalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras)
                .addContainerGap(303, Short.MAX_VALUE))
        );
        pnlPanelLayout.setVerticalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanelLayout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(pnlPanel);
        pnlPanel.setBounds(12, 12, 381, 280);

        setBounds(0, 0, 416, 308);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ventanaInicio vIni = new ventanaInicio();
        vIni.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JPanel pnlPanel;
    // End of variables declaration//GEN-END:variables
}
