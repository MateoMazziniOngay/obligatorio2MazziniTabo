package interfaz;
import dominio.*;
import java.util.*;
import javax.swing.*;

public class registroContrato extends javax.swing.JFrame {

    private Sistema sist;
    private Contrato con;
    /*Creamos un modelo para cada una de las listas, el modelo seria el "cuerpo" de la lista.*/
    DefaultListModel modelo1 = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();
    DefaultListModel modelo3 = new DefaultListModel();
  
    public registroContrato(Sistema unSistema) {
        this.sist = unSistema;
        initComponents();
        this.cargarListaEmpleados();
        this.cargarListaClientes();
        
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
        inputMaxSize_Con = new javax.swing.JTextField();
        inputMinSize_Con = new javax.swing.JTextField();
        btnBuscar_Con = new javax.swing.JButton();
        btnBorrar_Con = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDepos_Con = new javax.swing.JList<>();
        lblDepos_Con = new javax.swing.JLabel();
        btnRegistrar_Con = new javax.swing.JButton();
        btnCancelar_Con = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstClientes_Con.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstClientes_Con);

        lblContratos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblContratos.setText("Registro de Contrato");

        lstEmpleados_Con.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstEmpleados_Con);

        lblClientes_Con.setText("Clientes");

        lblEmpleados_Con.setText("Empleados");

        lblSpecsDepo_Con.setText("Características del depósito");

        lblMaxSize_Con.setText("Tamaño Min.");

        lblMinSize_Con.setText("Tamaño Máx.");

        lblEstantes_Con.setText("Estantes");

        lblRefri_Con.setText("Refrigeración");

        comboRefri_Con.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO", "N/A" }));

        comboEstantes_Con.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO", "N/A" }));

        inputMaxSize_Con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMaxSize_ConActionPerformed(evt);
            }
        });
        inputMaxSize_Con.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputMaxSize_ConKeyTyped(evt);
            }
        });

        inputMinSize_Con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMinSize_ConActionPerformed(evt);
            }
        });
        inputMinSize_Con.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputMinSize_ConKeyTyped(evt);
            }
        });

        btnBuscar_Con.setText("Buscar");
        btnBuscar_Con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_ConActionPerformed(evt);
            }
        });

        btnBorrar_Con.setText("Borrar");
        btnBorrar_Con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar_ConActionPerformed(evt);
            }
        });

        lstDepos_Con.setToolTipText("");
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblClientes_Con))
                            .addComponent(lblEmpleados_Con)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMaxSize_Con)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEstantes_Con)
                                        .addComponent(lblMinSize_Con)
                                        .addComponent(lblRefri_Con))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBorrar_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboRefri_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputMaxSize_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputMinSize_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboEstantes_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar_Con, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lblSpecsDepo_Con)))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegistrar_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(237, 237, 237))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblContratos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDepos_Con)
                        .addGap(359, 359, 359))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblContratos)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblClientes_Con))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSpecsDepo_Con)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblMaxSize_Con)
                                            .addComponent(inputMinSize_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblMinSize_Con)
                                            .addComponent(inputMaxSize_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblEstantes_Con)
                                            .addComponent(comboEstantes_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboRefri_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblRefri_Con)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBuscar_Con)
                                    .addComponent(btnBorrar_Con)
                                    .addComponent(btnCancelar_Con)
                                    .addComponent(btnRegistrar_Con)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmpleados_Con)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblDepos_Con)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        inputMinSize_Con.getAccessibleContext().setAccessibleName("");
        inputMinSize_Con.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1095, 397);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnBorrar_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar_ConActionPerformed
        
        this.inputMinSize_Con.setText("");
        this.inputMaxSize_Con.setText("");        
        
    }//GEN-LAST:event_btnBorrar_ConActionPerformed

    private void btnRegistrar_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_ConActionPerformed
        //Tomamos los valores a utilizar en el registro de nuestra ventana
        Cliente clie = this.lstClientes_Con.getSelectedValue();
        Empleado empl = this.lstEmpleados_Con.getSelectedValue();
        Object[] depos = this.lstDepos_Con.getSelectedValues();
        
        //Chequeamos si alguno de los datos requeridos no fue completado/seleccionado
        boolean vc = clie == null;
        boolean ve = empl == null;
        boolean vd = Arrays.toString(depos).equals("[]");
        
        //Si alguno es vacío, se le alerta al usuario y no se procede
        if(vc || ve || vd){ //
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos: un cliente, un empleado" + 
                                                " y un depósito", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            //Si no hay ningún vacío, se le pregunta al usuario si quiere confirmar el registro de su/s contrato/s
            int resp = JOptionPane.showConfirmDialog(null, "Confirmar registro" , "Confirmar contrato/s", 0);
            /*Si confirma el registro, se crean los contratos 
            con el cliente, el empleado y el/los deposito/s seleccionado/s*/
            
            if(resp == 0){
                //Recorremos la lista de depósitos seleccionados por el usuario
                for(Object depo : depos){
                    
                    /*El jList nos devuelve un Object, por lo cual debemos castearlo 
                    a Deposito para poder operar con él*/
                    Deposito depo2;
                    depo2 = (Deposito)depo;
                    
                    /*El número de contrato se crea a partir de la cantidad 
                    de contratos previos en la lista de contratos*/
                    int numContrato = sist.getListaContratos().size()+1;
                    //Creamos el objeto contrato con los valores dados
                    Contrato c = new Contrato(clie,empl,depo2,numContrato);
                    sist.agregarContrato(c);
                
                    /*Creamos una variable registro para mostrar un mensaje de deposito registrado con exito y sus 
                    respectivos datos en un showMessageDialog*/
                    
                    String registro =   "¡Contrado registrado con éxito!" + 
                                        "\n" + "Cliente: " + (clie.getNombre() + " - " + clie.getCedula()) + 
                                        "\n" + "Empleado: " + empl.getNombre() + 
                                        "\n" + "Deposito N°: " + depo2.getId() + 
                                        "\n" + "Num Contrato: " + numContrato;
                    
                    JOptionPane.showMessageDialog(null, registro, "Status", JOptionPane.PLAIN_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Se ha cancelado el registro", "Status", JOptionPane.PLAIN_MESSAGE);
            }
        }    
    }//GEN-LAST:event_btnRegistrar_ConActionPerformed

    private void btnCancelar_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_ConActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelar_ConActionPerformed

    private void inputMinSize_ConKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputMinSize_ConKeyTyped
        int min = evt.getKeyChar();

        boolean numeros = min >= 48 && min <= 57;
        
        if (!numeros){
            evt.consume();
        }    
    }//GEN-LAST:event_inputMinSize_ConKeyTyped

    private void btnBuscar_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_ConActionPerformed
         this.buscarDepositos();
    }//GEN-LAST:event_btnBuscar_ConActionPerformed

    private void inputMinSize_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMinSize_ConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMinSize_ConActionPerformed

    private void inputMaxSize_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMaxSize_ConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMaxSize_ConActionPerformed

    private void inputMaxSize_ConKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputMaxSize_ConKeyTyped
        int max = evt.getKeyChar();

        boolean numeros = max >= 48 && max <= 57;
        
        if (!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_inputMaxSize_ConKeyTyped

    //______CARGA DE LISTAS______//
    private void buscarDepositosGen(){
        String specs = this.comboEstantes_Con.getSelectedItem().toString() + this.comboRefri_Con.getSelectedItem().toString();
        if(specs.contains("N/A")){
            
        }
        switch (specs){
            case "SINO":{
                
            }
            case "NOSI":{
                
            }
            case "NONO":{
                
            }
            case "SISI":{
                
            }
            case " ":{
                
            }
        }
    }     
    private void cargarListaEmpleados(){
        /*cada vez que cargamos una lista, borramos el contenido de su modelo, para no cargar elementos repetidos*/
        modelo1.removeAllElements();
        /*Recorremos el arrayList, añadiendo cada elemento al modelo*/
        for(Empleado empleado : sist.getListaEmpleados()){
            modelo1.addElement(empleado);
        }
        /*Seteamos nuestro modelo como el modelo de la lista*/
        lstEmpleados_Con.setModel(modelo1);
    }

    private void cargarListaClientes(){
        modelo2.removeAllElements();
        
        for(Cliente cliente : sist.getListaClientes()){
            modelo2.addElement(cliente);
        }
        lstClientes_Con.setModel(modelo2);
    }

    public void buscarDepositos(){
        ArrayList<Deposito> validos = new ArrayList();
        
        for(Deposito deposito : sist.getListaDepositos()){
            if(compararSize(deposito.getTamanio())){
                validos.add(deposito);
            }
        }
        cargarListaDepositos(validos);
    }
    
    public boolean compararSize(int size){
        boolean es = false;
        
        int max = Integer.parseInt(this.inputMaxSize_Con.getText());
        int min = Integer.parseInt(this.inputMinSize_Con.getText()); 

        if(min <= size && size <= max){
            es = true;
        }
        return es;
    }
    
    private void cargarListaDepositos(ArrayList <Deposito> lstDepositos){
        modelo3.removeAllElements();
        
        for(Deposito deposito : lstDepositos){
            modelo3.addElement(deposito);
        }
        lstDepos_Con.setModel(modelo3);
    }
    
   //______________________________________//

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
    private javax.swing.JList<Cliente> lstClientes_Con;
    private javax.swing.JList<Deposito> lstDepos_Con;
    private javax.swing.JList<Empleado> lstEmpleados_Con;
    // End of variables declaration//GEN-END:variables
}
