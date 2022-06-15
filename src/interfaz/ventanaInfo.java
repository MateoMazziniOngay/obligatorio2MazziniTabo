package interfaz;

import dominio.*;

public class ventanaInfo extends javax.swing.JFrame {
    
    private Sistema sist;
    
    public ventanaInfo(Sistema unSistema) {
        initComponents();
        this.sist = unSistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        lblStatsOcup = new javax.swing.JLabel();
        btnGrafica = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnDepositos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion");
        getContentPane().setLayout(null);

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInfo.setText("Información");

        btnGrafica.setText("Estadística de ocupación");
        btnGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaActionPerformed(evt);
            }
        });

        btnConsulta.setText("Consulta de contratos");

        btnDepositos.setText("Consulta de depósitos");

        javax.swing.GroupLayout pnlPanelLayout = new javax.swing.GroupLayout(pnlPanel);
        pnlPanel.setLayout(pnlPanelLayout);
        pnlPanelLayout.setHorizontalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblInfo))
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAtras)
                            .addGroup(pnlPanelLayout.createSequentialGroup()
                                .addComponent(lblStatsOcup)
                                .addGap(101, 101, 101))))
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGrafica)
                            .addComponent(btnDepositos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlPanelLayout.setVerticalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGrafica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatsOcup)
                .addGap(38, 38, 38)
                .addComponent(btnConsulta)
                .addGap(42, 42, 42)
                .addComponent(btnDepositos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        getContentPane().add(pnlPanel);
        pnlPanel.setBounds(12, 12, 220, 320);

        setBounds(0, 0, 262, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaActionPerformed
        infoGrafica vGrafica = new infoGrafica(sist);
        vGrafica.setVisible(true);
    }//GEN-LAST:event_btnGraficaActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnDepositos;
    private javax.swing.JButton btnGrafica;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblStatsOcup;
    private javax.swing.JPanel pnlPanel;
    // End of variables declaration//GEN-END:variables
}
