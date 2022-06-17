// Martín Tabó 227665 - Mateo Mazzini 219372

package interfaz;

import dominio.*;
import java.io.Serializable;
import java.util.*;
import javax.swing.*;

public class registroContrato extends javax.swing.JFrame implements Serializable{

    private CriterioDeposito crit = new CriterioDeposito();
    private Sistema sist;
    private Contrato con;
    private Deposito depo = new Deposito();
    
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

    //______CARGA DE LISTAS______//
      
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
    
    private void cargarListaDepositos(ArrayList <Deposito> lstDepositos){
        modelo3.removeAllElements();
        
        for(Deposito deposito : lstDepositos){
            modelo3.addElement(deposito);
        }
        lstDepos_Con.setModel(modelo3);
    }
       
    //________________________________//
    
    //Se asegura de que el fotmato del tamaño deseado sea el adecuado
    public boolean validarTamanio(){
        int max = Integer.parseInt(this.inputMaxSize_Con.getText());
        int min = Integer.parseInt(this.inputMinSize_Con.getText());
        
        return max >= min;
    }
    
    //Se encarga de buscar los depósitos de acuerdo a los parámetros bsolicitados por el usuario.
    private void buscarDepoTipo(){
        //Toma los valores seleccionados por el usuario y los convierte en Strings.
        String specE = this.comboEstantes_Con.getSelectedItem().toString(); 
        String specR = this.comboRefri_Con.getSelectedItem().toString();
        //Concatena ambos valores en un único String para su evaluación.
        String specs = specR + specE;
        
        /*
        Si al usuario no le importa si es refrigerado, ni si tiene estantes, 
        únicamente carga la lista de depósitos disponibles de acuerdo al tamaño solicitado
        */
        if(specs.equals("N/AN/A")){
            this.buscarTamanio(sist.listaDisponibles());
        }
        else{
            
            /*
            Si al usuario no le importa alguno de los parámetros, se fija cuál es 
            y carga los depósitos de acuerdo al parámetro que sí le importa y al tamaño solicitado.
            */
            if(specs.contains("N/A")){
                if(specE.equals("N/A")){
                    this.buscarTamanio(depo.refriSpec(depo.pasarSN(specR), sist.listaDisponibles()));
                }
                else{
                    this.buscarTamanio(depo.estSpec(depo.pasarSN(specE), sist.listaDisponibles()));
                }
            }
            else{
                /*
                Si le importan ambos parámetros, carga los depósitos de acuerdo a ambos parámetros y al tamaño solicitado.
                */
                switch (specs){
                    case "SINO":{
                        this.buscarTamanio(depo.listaSpecs("SN", sist.listaDisponibles()));
                        break;
                    }
                    case "NOSI":{
                        this.buscarTamanio(depo.listaSpecs("NS", sist.listaDisponibles()));
                        break;
                    }
                    case "NONO":{
                        this.buscarTamanio(depo.listaSpecs("NN", sist.listaDisponibles()));
                        break;
                    }
                    case "SISI":{
                        this.buscarTamanio(depo.listaSpecs("SS", sist.listaDisponibles()));
                        break;
                    }
                }
            }   
        }   
    }
    
    //Recibe una lista de depósitos y los filtra de acuerdo a su tamaño.
    public void buscarTamanio(ArrayList<Deposito> depos){
        ArrayList<Deposito> validos = new ArrayList();
        
        for(Deposito deposito : depos){
            if(compararSize(deposito.getTamanio())){
                validos.add(deposito);
            }
        }
        if(validos.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay depóstos disponibles con esas características", 
                                                "ERROR", JOptionPane.ERROR_MESSAGE);
            this.borrarCampos();
        }else{
            cargarListaDepositos(depo.ordenA(validos));
        }
        
    }
    
    //Recibe un tamaño y nos dice si está comprendido entre los valores ingresados por el usuario.
    public boolean compararSize(int size){
        boolean es = false;
        
        int max = Integer.parseInt(this.inputMaxSize_Con.getText());
        int min = Integer.parseInt(this.inputMinSize_Con.getText()); 

        if(min <= size && size <= max){
            es = true;
        }
        return es;
    }
    
    //Borra todos los campos
    private void borrarCampos(){
        this.inputMinSize_Con.setText("");
        this.inputMaxSize_Con.setText("");
        modelo3.removeAllElements();
        lstDepos_Con.setModel(modelo3);
    }
    
    //Crea el Contrato de acuerdo a los datos recibidos.
    private void completarRegistro(Object[] depos,Cliente unCliente, Empleado unEmpleado){
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
            Contrato c = new Contrato(unCliente,unEmpleado,depo2,numContrato);
            sist.agregarContrato(c);
                
            /*Creamos una variable registro para mostrar un mensaje de deposito registrado con exito y sus 
            respectivos datos en un showMessageDialog*/
            
            String infoCliente = unCliente.getNombre() +  " - " + unCliente.getCedula();
            String infoEmpleado = unEmpleado.getNombre() + " - " + unEmpleado.getCedula();
            int depoId = depo2.getId();
            
            this.status(infoCliente,infoEmpleado,depoId,numContrato);
            this.borrarCampos();
           
        }
    }
    
    //informa al usuario sobre el registro.
    private void status(String cliente, String empleado, int numDepo, int numContrato){
        String registro =   "¡Contrado registrado con éxito!" + 
                            "\n" +  "Cliente: " + cliente + 
                            "\n" +  "Empleado: " + empleado +
                            "\n" + "Deposito N°: " + numDepo  + 
                            "\n" + "Num Contrato: " + numContrato;
                    
        JOptionPane.showMessageDialog(null, registro, "Status", JOptionPane.PLAIN_MESSAGE);
    }
    
   //______________________________________//
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel = new javax.swing.JPanel();
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
        setTitle("Registro de contratos");
        getContentPane().setLayout(null);

        lstClientes_Con.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstClientes_Con);

        lblContratos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblContratos.setText("Registro de Contrato");

        lstEmpleados_Con.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstEmpleados_Con);

        lblClientes_Con.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClientes_Con.setText("Clientes");

        lblEmpleados_Con.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpleados_Con.setText("Empleados");

        lblSpecsDepo_Con.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        lblDepos_Con.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDepos_Con.setText("Depósitos Encontrados");

        btnRegistrar_Con.setText("Registrar contrato");
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

        javax.swing.GroupLayout pnlPanelLayout = new javax.swing.GroupLayout(pnlPanel);
        pnlPanel.setLayout(pnlPanelLayout);
        pnlPanelLayout.setHorizontalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContratos)
                    .addComponent(btnCancelar_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                            .addComponent(lblClientes_Con, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(lblEmpleados_Con, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSpecsDepo_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlPanelLayout.createSequentialGroup()
                                    .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMaxSize_Con)
                                        .addComponent(lblEstantes_Con)
                                        .addComponent(lblMinSize_Con)
                                        .addComponent(lblRefri_Con))
                                    .addGap(68, 68, 68)
                                    .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(comboRefri_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputMaxSize_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputMinSize_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboEstantes_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnlPanelLayout.createSequentialGroup()
                                .addComponent(btnBorrar_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnBuscar_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDepos_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlPanelLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btnRegistrar_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPanelLayout.setVerticalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContratos)
                .addGap(14, 14, 14)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addComponent(lblClientes_Con)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblEmpleados_Con)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSpecsDepo_Con)
                            .addComponent(lblDepos_Con))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaxSize_Con)
                            .addComponent(inputMinSize_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMinSize_Con)
                            .addComponent(inputMaxSize_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPanelLayout.createSequentialGroup()
                                .addComponent(comboEstantes_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanelLayout.createSequentialGroup()
                                .addComponent(lblEstantes_Con)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRefri_Con)
                            .addComponent(comboRefri_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBuscar_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRegistrar_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBorrar_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnCancelar_Con)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        inputMinSize_Con.getAccessibleContext().setAccessibleName("");
        inputMinSize_Con.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(pnlPanel);
        pnlPanel.setBounds(6, 6, 1220, 340);

        setSize(new java.awt.Dimension(1245, 383));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrar_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar_ConActionPerformed
        
        this.borrarCampos();      
        
    }//GEN-LAST:event_btnBorrar_ConActionPerformed

    private void btnRegistrar_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_ConActionPerformed
        // --- EN ESTE MÉTODO ÚNICAMENTE VALIDAMOS LOS DATOS TOMADOS AL ACCIONAR EL BOTÓN REGISTRAR --- //
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
                       
            if(resp == 0){
                this.completarRegistro(depos,clie,empl);
            }
            else{
                JOptionPane.showMessageDialog(null, "Se ha cancelado el registro", "Status", JOptionPane.PLAIN_MESSAGE);
            }
        }    
    }//GEN-LAST:event_btnRegistrar_ConActionPerformed
   
    private void btnCancelar_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_ConActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelar_ConActionPerformed

    /*
    Se asegura de que los valores ingresados sean números 
    y limita su tamaño a 9 dígitos, para no pasar al valor máximo de Int
    */
    private void inputMinSize_ConKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputMinSize_ConKeyTyped
        int min = evt.getKeyChar();

        boolean numeros = min >= 48 && min <= 57;
        
        if (!numeros){
            evt.consume();
        }    
        
        if(this.inputMinSize_Con.getText().length() >= 9){
            evt.consume();
        }
    }//GEN-LAST:event_inputMinSize_ConKeyTyped
      
    private void btnBuscar_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_ConActionPerformed
        boolean vMax = this.inputMaxSize_Con.getText().isEmpty();
        boolean vMin = this.inputMinSize_Con.getText().isEmpty();
        
        if(vMax || vMin){
            JOptionPane.showMessageDialog(null, "Debe completar ambos campos de tamaño antes de buscar", 
                                                "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(this.validarTamanio()){
                this.buscarDepoTipo();
            }
            else{
                JOptionPane.showMessageDialog(null, "El Tamaño máximo debe ser mayor al mínimo", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.borrarCampos();
            }
        }   
    }//GEN-LAST:event_btnBuscar_ConActionPerformed
    
    private void inputMinSize_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMinSize_ConActionPerformed

    }//GEN-LAST:event_inputMinSize_ConActionPerformed

    private void inputMaxSize_ConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMaxSize_ConActionPerformed

    }//GEN-LAST:event_inputMaxSize_ConActionPerformed

    /*
    Se asegura de que los valores ingresados sean números 
    y limita su tamaño a 9 dígitos, para no pasar al valor máximo de Int
    */
    private void inputMaxSize_ConKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputMaxSize_ConKeyTyped
        int max = evt.getKeyChar();

        boolean numeros = max >= 48 && max <= 57;
        
        if (!numeros){
            evt.consume();
        }
        
        if(this.inputMaxSize_Con.getText().length() >= 9){
            evt.consume();
        }
    }//GEN-LAST:event_inputMaxSize_ConKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar_Con;
    private javax.swing.JButton btnBuscar_Con;
    private javax.swing.JButton btnCancelar_Con;
    private javax.swing.JButton btnRegistrar_Con;
    private javax.swing.JComboBox<String> comboEstantes_Con;
    private javax.swing.JComboBox<String> comboRefri_Con;
    private javax.swing.JTextField inputMaxSize_Con;
    private javax.swing.JTextField inputMinSize_Con;
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
    private javax.swing.JPanel pnlPanel;
    // End of variables declaration//GEN-END:variables
}
