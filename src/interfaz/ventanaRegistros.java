package interfaz;
import dominio.Sistema;
public class ventanaRegistros extends javax.swing.JFrame {

    private Sistema sist;    
    
    public ventanaRegistros(Sistema unSistema) {
        this.sist = unSistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDepo = new javax.swing.JLabel();
        btnDepo = new javax.swing.JButton();
        btnEmple = new javax.swing.JButton();
        lblEmple = new javax.swing.JLabel();
        btnClie = new javax.swing.JButton();
        lblClie = new javax.swing.JLabel();
        btnContr = new javax.swing.JButton();
        lblContra = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registros");

        jPanel1.setPreferredSize(new java.awt.Dimension(348, 217));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("REGISTROS");

        lblDepo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblDepo.setText("Depósitos");

        btnDepo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnDepo.setText("Registrar nuevo depósito");
        btnDepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepoActionPerformed(evt);
            }
        });

        btnEmple.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEmple.setText("Registrar nuevo empleado");
        btnEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleActionPerformed(evt);
            }
        });

        lblEmple.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblEmple.setText("Empleados");

        btnClie.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnClie.setText("Registrar nuevo cliente");
        btnClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClieActionPerformed(evt);
            }
        });

        lblClie.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblClie.setText("Clientes");

        btnContr.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnContr.setText("Registrar nuevo contrato");
        btnContr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContrActionPerformed(evt);
            }
        });

        lblContra.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblContra.setText("Contratos");

        btnAtras.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 174, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDepo)
                            .addComponent(lblClie)
                            .addComponent(lblContra))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEmple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnContr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDepo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepo))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmple))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClie)
                    .addComponent(btnClie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContra)
                    .addComponent(btnDepo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 686, 459);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ventanaInicio vIni = new ventanaInicio(sist);
        vIni.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnContrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContrActionPerformed
        registroContrato vContr = new registroContrato(sist);
        vContr.setVisible(true);
    }//GEN-LAST:event_btnContrActionPerformed

    private void btnClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClieActionPerformed
        registroCliente vClie = new registroCliente(sist);
        vClie.setVisible(true);
    }//GEN-LAST:event_btnClieActionPerformed

    private void btnEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleActionPerformed
        registroEmpleado vEmple = new registroEmpleado();
        vEmple.setVisible(true);
    }//GEN-LAST:event_btnEmpleActionPerformed

    private void btnDepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepoActionPerformed
        registroDepo vDepo = new registroDepo();
        vDepo.setVisible(true);
    }//GEN-LAST:event_btnDepoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new ventanaRegistros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnClie;
    private javax.swing.JButton btnContr;
    private javax.swing.JButton btnDepo;
    private javax.swing.JButton btnEmple;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClie;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblDepo;
    private javax.swing.JLabel lblEmple;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
