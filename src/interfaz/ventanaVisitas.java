package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.*;

public class ventanaVisitas extends javax.swing.JFrame {

    private Visita vis = new Visita();
    Sistema sist;
    DefaultListModel modelo1 = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();
    DefaultListModel modelo3 = new DefaultListModel();
    
    // Constructor con parámetros
    public ventanaVisitas(Sistema unSistema) {
        initComponents();
        this.sist = unSistema;
        this.cargarListaClientes();
        this.cargarListaEmpleados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        lblVisitas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstClientes_V = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstContratos_V = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstEmpleados_V = new javax.swing.JList<>();
        btnRegistrar_V = new javax.swing.JButton();
        comboDia_V = new javax.swing.JComboBox<>();
        comboMes_V = new javax.swing.JComboBox<>();
        btnBuscarContratos_V = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        btnAtras.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lblVisitas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblVisitas.setText("VISITAS");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Cliente:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Empleado:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Contrato:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Fecha:");

        lstClientes_V.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lstClientes_V.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstClientes_V.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstClientes_VValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstClientes_V);

        lstContratos_V.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lstContratos_V.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstContratos_V);

        lstEmpleados_V.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lstEmpleados_V.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstEmpleados_V);

        btnRegistrar_V.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnRegistrar_V.setText("Registrar");
        btnRegistrar_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_VActionPerformed(evt);
            }
        });

        comboDia_V.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        comboMes_V.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        comboMes_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMes_VActionPerformed(evt);
            }
        });

        btnBuscarContratos_V.setText("Buscar Contratos");
        btnBuscarContratos_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarContratos_VActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPanelLayout = new javax.swing.GroupLayout(pnlPanel);
        pnlPanel.setLayout(pnlPanelLayout);
        pnlPanelLayout.setHorizontalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(lblVisitas))
                            .addGroup(pnlPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93)
                                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(pnlPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(52, 52, 52)
                                            .addComponent(comboDia_V, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboMes_V, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPanelLayout.createSequentialGroup()
                                            .addComponent(btnAtras)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnRegistrar_V))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnBuscarContratos_V)))
                .addGap(29, 151, Short.MAX_VALUE))
        );
        pnlPanelLayout.setVerticalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addComponent(lblVisitas)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGap(26, 26, 26)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarContratos_V)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboDia_V, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMes_V, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar_V, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(pnlPanel);
        pnlPanel.setBounds(10, 10, 790, 530);

        setBounds(0, 0, 851, 556);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       // ventanaInicio vIni = new ventanaInicio();
       //vIni.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void cargarListaEmpleados(){
        // Cada vez que cargamos una lista, borramos el contenido de su modelo, para no cargar elementos repetidos
        modelo3.removeAllElements();

        // Recorremos el arrayList, añadiendo cada elemento al modelo
        for(Empleado empleado : sist.getListaEmpleados()){
            modelo3.addElement(empleado);
        }
        // Seteamos nuestro modelo como el modelo de la lista
        lstEmpleados_V.setModel(modelo3);
    }

    private void cargarListaClientes(){
        // cada vez que cargamos una lista, borramos el contenido de su modelo, para no cargar elementos repetidos
        modelo1.removeAllElements();
        
        // Recorremos el arrayList, añadiendo cada elemento al modelo
        for(Cliente cliente : sist.getListaClientes()){
            modelo1.addElement(cliente);
        }
        // Seteamos nuestro modelo como el modelo de la lista
        lstClientes_V.setModel(modelo1);
    }
    
    private void cargarContratoClientes(ArrayList<Contrato> lstContratos){
        modelo2.removeAllElements();

        for(Contrato contrato : lstContratos){
            modelo2.addElement(contrato);
        }
        lstContratos_V.setModel(modelo2);
    }
    private void btnRegistrar_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_VActionPerformed
        String mes = this.comboMes_V.getSelectedItem().toString();    
        String dia = this.comboDia_V.getSelectedItem().toString();
        Cliente clie = this.lstClientes_V.getSelectedValue();
        Empleado emple = this.lstEmpleados_V.getSelectedValue();
        Contrato con = this.lstContratos_V.getSelectedValue();
        
        boolean vm = mes.isEmpty();
        boolean vd = dia.isEmpty();
        boolean vCl = clie == null;
        boolean ve = emple == null;
        boolean vc = con == null;
        
        if(vm || vd || vCl || ve || vc){
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos: un cliente, un empleado" + 
                                                " y un contrato", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            int diaNum = Integer.parseInt(dia);
            int mesNum = Integer.parseInt(mes);
            
            if(!vis.validarFecha(mesNum, diaNum)){
                JOptionPane.showMessageDialog(null, "La fecha " + dia+"/"+mes + " no es valida", "ERROR", JOptionPane.ERROR_MESSAGE); 
                this.comboMes_V.setSelectedIndex(0);
                this.comboDia_V.setSelectedIndex(0);
            }
            else{
                int resp = JOptionPane.showConfirmDialog(null, "Confirmar registro" , "Confirmar empleado", 0);
                if(resp == 0){
                    Deposito depo = con.getDeposito();
                    
                    // Agregamos el registro a la lista de personas.
                    Visita v = new Visita(clie,emple,con,depo,diaNum,mesNum);
                    sist.agregarVisita(v);
                    
                    /*
                    Creamos una variable registro para mostrar un mensaje de empleado registrado con exito y sus respectivos datos 
                    en un showMessageDialog
                    */
                    String registro =   "¡Visita registrada con exito!" + 
                                        "\n" + "Cliente: " + clie.getNombre() + 
                                        "\n" + "Empleado: " + emple.getNombre() + 
                                        "\n" + "Contrato N°: " + con.getNumContrato() + 
                                        "\n" + "Fecha: " + dia+"/"+mes;

                    JOptionPane.showMessageDialog(null, registro, "Status", JOptionPane.PLAIN_MESSAGE);    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Se ha cancelado el registro", "Status", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnRegistrar_VActionPerformed

    private void comboMes_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMes_VActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMes_VActionPerformed

    private void lstClientes_VValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstClientes_VValueChanged
        
    }//GEN-LAST:event_lstClientes_VValueChanged

    private void btnBuscarContratos_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarContratos_VActionPerformed
        Cliente clie = this.lstClientes_V.getSelectedValue();
        if(clie == null){
            JOptionPane.showMessageDialog(null, "Seleccione un cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            ArrayList <Contrato> contratosClie = new ArrayList();

            for(Contrato contrato : sist.getListaContratos()){
                if(contrato.getCliente().equals(clie)){
                    contratosClie.add(contrato);
                }   
            }
            
            if(contratosClie.isEmpty()){
                JOptionPane.showMessageDialog(null, "Este cliente no tiene contratos registrados", 
                                                    "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
               cargarContratoClientes(contratosClie); 
            }  
        }  
    }//GEN-LAST:event_btnBuscarContratos_VActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscarContratos_V;
    private javax.swing.JButton btnRegistrar_V;
    private javax.swing.JComboBox<String> comboDia_V;
    private javax.swing.JComboBox<String> comboMes_V;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblVisitas;
    private javax.swing.JList<Cliente> lstClientes_V;
    private javax.swing.JList<Contrato> lstContratos_V;
    private javax.swing.JList<Empleado> lstEmpleados_V;
    private javax.swing.JPanel pnlPanel;
    // End of variables declaration//GEN-END:variables
}
