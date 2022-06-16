package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class infoConsContratos extends javax.swing.JFrame {

    private Sistema sist;
    
    DefaultListModel modelo1 = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();
    DefaultListModel modelo3 = new DefaultListModel();
        
    public infoConsContratos(Sistema unSistema) {
        initComponents();
        this.sist = unSistema;
        cargarListaContratos();
    }
    private void cargarListaContratos(){
        /*cada vez que cargamos una lista, borramos el contenido de su modelo, para no cargar elementos repetidos*/
        modelo1.removeAllElements();
        /*Recorremos el arrayList, añadiendo cada elemento al modelo*/
        for(Contrato contrato : sist.getListaContratos()){
            modelo1.addElement("Contrato N°: " + contrato.getNumContrato());
        }
        /*Seteamos nuestro modelo como el modelo de la lista*/
        lstContratos_Info.setModel(modelo1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstContratos_Info = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaInfoContrato = new javax.swing.JTextArea();
        btnInfoContrato = new javax.swing.JButton();
        btnEliminarContrato = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaInfo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lstContratos_Info.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstContratos_Info);

        txtAreaInfoContrato.setColumns(20);
        txtAreaInfoContrato.setRows(5);
        jScrollPane2.setViewportView(txtAreaInfoContrato);

        btnInfoContrato.setText("Mostrar información");
        btnInfoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoContratoActionPerformed(evt);
            }
        });

        btnEliminarContrato.setText("Dar de baja");
        btnEliminarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarContratoActionPerformed(evt);
            }
        });

        tablaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaInfo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(btnEliminarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnInfoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnInfoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEliminarContrato)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 6, 480, 436);

        setBounds(0, 0, 712, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarContratoActionPerformed
        String idSelec = lstContratos_Info.getSelectedValue();
        boolean vc = idSelec == null;
        
        if(vc){
            JOptionPane.showMessageDialog(null, "Seleccione un contrato para dar de baja","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Contrato contratoSelec = new Contrato();
            int idSelecNum = Integer.parseInt(idSelec.substring(13));
            
            for(Contrato contrato : sist.getListaContratos()){
                if(contrato.getNumContrato() == idSelecNum){
                    contratoSelec = contrato;
                }
            }
            int resp = JOptionPane.showConfirmDialog(null,  "¿Está seguro de que quiere eliminar este contrato?" + 
                                                            "\n" + contratoSelec.toString() , "Confirmar eliminar contrato", 0);
            if(resp == 0){
                
            }
        }
    }//GEN-LAST:event_btnEliminarContratoActionPerformed

    private void btnInfoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoContratoActionPerformed
        
        String idSelec = lstContratos_Info.getSelectedValue();
        boolean vc = idSelec == null;
        
        if(vc){
            JOptionPane.showMessageDialog(null, "Seleccione un contrato","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int idSelecNum = Integer.parseInt(idSelec.substring(13));
            for(Contrato contrato : sist.getListaContratos()){
                if(contrato.getNumContrato() == idSelecNum){
                    this.txtAreaInfoContrato.setText("");
                    this.txtAreaInfoContrato.setText(contrato.toString());
                    this.cargarVisitas(contrato);
                }
            }
        }  
    }//GEN-LAST:event_btnInfoContratoActionPerformed

    private void cargarVisitas(Contrato unContrato){
            
        ArrayList<Visita> visitasConSelec = sist.visitasContrato(unContrato);
        if(visitasConSelec.isEmpty()){
            JOptionPane.showMessageDialog(null, "Este contrato no posee visitas","Status", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            
            int fila = 0;
            int cantVisitas = visitasConSelec.size();
            String colHead [] = {"Día","Mes","Empleado"};
            String info [][]= new String[cantVisitas][3];

            for(Visita visita : visitasConSelec){
                
                info[fila][0]= visita.getDia()+"";
                info[fila][1]= visita.getMes()+"";
                info[fila][2]= visita.getEmpleado().getNombre();
                
                fila++;
            }
            tablaInfo.setModel(new DefaultTableModel(info, colHead));
        }            
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarContrato;
    private javax.swing.JButton btnInfoContrato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lstContratos_Info;
    private javax.swing.JTable tablaInfo;
    private javax.swing.JTextArea txtAreaInfoContrato;
    // End of variables declaration//GEN-END:variables
}
