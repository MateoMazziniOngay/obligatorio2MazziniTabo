package interfaz;
import dominio.*;
import java.util.ArrayList;
import javax.swing.*;

public class registroContrato extends javax.swing.JFrame {

    private Sistema sist;
    DefaultListModel modelo = new DefaultListModel();
    
    public registroContrato(Sistema unSistema) {
        this.sist = unSistema;
        initComponents();
        this.cargarListaEmpleados();
        this.cargarListaClientes();
        this.cargarListaDepositos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstClientes_Con = new javax.swing.JList<>();
        lblContratos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstEmpleados_Con = new javax.swing.JList<>();
        lblClientes_Con = new javax.swing.JLabel();
        lblEmpleados_Con = new javax.swing.JLabel();
        lblSpecsDepo_Con = new javax.swing.JLabel();
        lblMaxSize_Con = new javax.swing.JLabel();
        lblMinSize_Con = new javax.swing.JLabel();
        lblEstantes_Con = new javax.swing.JLabel();
        lblRefri_Con = new javax.swing.JLabel();
        comboRefri_Con = new javax.swing.JComboBox<>();
        comboEstantes_Con = new javax.swing.JComboBox<>();
        inputMinSize_Con = new javax.swing.JTextField();
        inputMaxSize_Con = new javax.swing.JTextField();
        btnBuscar_Con = new javax.swing.JButton();
        btnBorrar_Con = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDepos_Con = new javax.swing.JList<>();
        lblDepos_Con = new javax.swing.JLabel();
        btnRegistrar_Con = new javax.swing.JButton();
        btnCancelar_Con = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstClientes_Con.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstClientes_Con);

        lblContratos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblContratos.setText("Registro de Contrato");

        lstEmpleados_Con.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstEmpleados_Con);

        lblClientes_Con.setText("Clientes");

        lblEmpleados_Con.setText("Empleados");

        lblSpecsDepo_Con.setText("Características del depósito");

        lblMaxSize_Con.setText("Tamaño Máx.");

        lblMinSize_Con.setText("Tamaño Min.");

        lblEstantes_Con.setText("Estantes");

        lblRefri_Con.setText("Refrigeración");

        comboRefri_Con.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO", "N/A" }));

        comboEstantes_Con.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO", "N/A" }));

        btnBuscar_Con.setText("Buscar");

        btnBorrar_Con.setText("Borrar");
        btnBorrar_Con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar_ConActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstDepos_Con);

        lblDepos_Con.setText("Depósitos Encontrados");

        btnRegistrar_Con.setText("Registrar");
        btnRegistrar_Con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_ConActionPerformed(evt);
            }
        });

        btnCancelar_Con.setText("Cancelar");
        btnCancelar_Con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_ConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblContratos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClientes_Con))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpleados_Con))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnBorrar_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscar_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEstantes_Con)
                                        .addComponent(lblMinSize_Con)
                                        .addComponent(lblRefri_Con)
                                        .addComponent(lblMaxSize_Con))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboEstantes_Con, javax.swing.GroupLayout.Alignment.TRAILING, 0, 1, Short.MAX_VALUE)
                                        .addComponent(comboRefri_Con, javax.swing.GroupLayout.Alignment.TRAILING, 0, 1, Short.MAX_VALUE)
                                        .addComponent(inputMinSize_Con, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, Short.MAX_VALUE)
                                        .addComponent(inputMaxSize_Con, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                            .addComponent(lblSpecsDepo_Con))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar_Con)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegistrar_Con))
                            .addComponent(lblDepos_Con))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContratos)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClientes_Con)
                    .addComponent(lblEmpleados_Con)
                    .addComponent(lblSpecsDepo_Con)
                    .addComponent(lblDepos_Con))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMaxSize_Con)
                                    .addComponent(inputMaxSize_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMinSize_Con)
                                    .addComponent(inputMinSize_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEstantes_Con)
                                    .addComponent(comboEstantes_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRefri_Con)
                                    .addComponent(comboRefri_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBorrar_Con)
                            .addComponent(btnRegistrar_Con)
                            .addComponent(btnCancelar_Con)
                            .addComponent(btnBuscar_Con))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 802, 336);
    }// </editor-fold>//GEN-END:initComponents


    
    private void btnBorrar_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar_ConActionPerformed
        this.inputMaxSize_Con.setText("");
        this.inputMinSize_Con.setText("");
    }//GEN-LAST:event_btnBorrar_ConActionPerformed

    private void btnRegistrar_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_ConActionPerformed
        
    }//GEN-LAST:event_btnRegistrar_ConActionPerformed

    private void btnCancelar_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_ConActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelar_ConActionPerformed

    private void cargarListaEmpleados(){
        modelo.removeAllElements();
        ArrayList <Empleado> lista = sist.getListaEmpleados();

        for(Empleado empleado : lista){
            modelo.addElement(empleado);
        }
        lstEmpleados_Con.setModel(modelo);
    }

    private void cargarListaClientes(){
        modelo.removeAllElements();
        ArrayList <Cliente> lista = sist.getListaClientes();
        System.out.println(lista);
        for(Cliente cliente : lista){
            modelo.addElement(cliente);
        }
        lstClientes_Con.setModel(modelo);
    }

    private void cargarListaDepositos(){
        modelo.removeAllElements();
        ArrayList <Deposito> lista = sist.getListaDepositos();
        for(Deposito deposito : lista){
            modelo.addElement(deposito);
        }
        lstDepos_Con.setModel(modelo);
    }
    
   
 /*   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroContrato().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar_Con;
    private javax.swing.JButton btnBuscar_Con;
    private javax.swing.JButton btnCancelar_Con;
    private javax.swing.JButton btnRegistrar_Con;
    private javax.swing.JComboBox<String> comboEstantes_Con;
    private javax.swing.JComboBox<String> comboRefri_Con;
    private javax.swing.JTextField inputMaxSize_Con;
    private javax.swing.JTextField inputMinSize_Con;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblClientes_Con;
    private javax.swing.JLabel lblContratos;
    private javax.swing.JLabel lblDepos_Con;
    private javax.swing.JLabel lblEmpleados_Con;
    private javax.swing.JLabel lblEstantes_Con;
    private javax.swing.JLabel lblMaxSize_Con;
    private javax.swing.JLabel lblMinSize_Con;
    private javax.swing.JLabel lblRefri_Con;
    private javax.swing.JLabel lblSpecsDepo_Con;
    private javax.swing.JList<String> lstClientes_Con;
    private javax.swing.JList<String> lstDepos_Con;
    private javax.swing.JList<String> lstEmpleados_Con;
    // End of variables declaration//GEN-END:variables
}
