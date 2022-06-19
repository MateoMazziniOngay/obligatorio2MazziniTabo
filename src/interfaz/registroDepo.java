// Martín Tabó 227665 - Mateo Mazzini 219372

package interfaz;

import dominio.*;
import java.io.Serializable;
import javax.swing.*;

public class registroDepo extends javax.swing.JFrame implements Serializable{

    private Sistema sist;
    private Deposito depo = new Deposito();
    
    public registroDepo(Sistema unSistema) {
        initComponents();
        this.sist = unSistema;
    }

    //Crea el Deposito de acuerdo a los datos recibidos.
    private void completarRegistro(int unId, int unTamanio, String estantes, String refri){
        
        //Convertimos las variables de acuerdo a como debemos pasarlas al crear un depósito.
        refri = depo.pasarSN(refri);
        estantes = depo.pasarSN(estantes);
                    
        //Creamos un nuevo depósito y lo agregamos a su lista.
        Deposito d = new Deposito(unId,unTamanio,estantes,refri);
        sist.agregarDeposito(d);

        this.status(unId,unTamanio,estantes,refri);
        this.setVoid();
    }
    
    //Informa al usuario sobre el estado del registro.
    private void status(int unId, int unTamanio, String estantes, String refri){
        /*
        Creamos una variable registro para mostrar un mensaje de depósito registrado con exito 
        y sus respectivos datos en un showMessageDialog
        */
        String registro =   "¡Depósito registrado con exito!" + 
                            "\n" + "ID: " + unId + 
                            "\n" + "Tamaño: " + unTamanio + 
                            "\n" + "Estantes: " + estantes +
                            "\n" + "Refrigeración: " + refri;
 
        JOptionPane.showMessageDialog(null, registro, "Status", JOptionPane.PLAIN_MESSAGE);
    }
    
    //Deja en blanco los textFields.
    private void setVoid(){
        
        this.inputId_D.setText("");
        this.inputSize_D.setText("");
        this.comboEstantes_D.setSelectedIndex(0);
        this.comboRefri_D.setSelectedIndex(0);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de depósitos");
        getContentPane().setLayout(null);

        lblDeposito.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDeposito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        inputId_D.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputId_DKeyTyped(evt);
            }
        });

        inputSize_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSize_DActionPerformed(evt);
            }
        });
        inputSize_D.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputSize_DKeyTyped(evt);
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
        btnRegistrar_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_DActionPerformed(evt);
            }
        });

        btnCancelarR_D.setText("Cancelar");
        btnCancelarR_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarR_DActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPanelLayout = new javax.swing.GroupLayout(pnlPanel);
        pnlPanel.setLayout(pnlPanelLayout);
        pnlPanelLayout.setHorizontalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPanelLayout.createSequentialGroup()
                                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId_D)
                                    .addComponent(lblEstantes_D)
                                    .addComponent(lbblSize_D)
                                    .addComponent(lblRefri_D))
                                .addGap(24, 24, 24)
                                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(inputSize_D, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputId_D, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboEstantes_D, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboRefri_D, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar_D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelarR_D, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pnlPanelLayout.setVerticalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId_D)
                    .addComponent(inputId_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbblSize_D)
                    .addComponent(inputSize_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstantes_D)
                    .addComponent(comboEstantes_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRefri_D)
                    .addComponent(comboRefri_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnRegistrar_D)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarR_D)
                .addGap(45, 45, 45))
        );

        getContentPane().add(pnlPanel);
        pnlPanel.setBounds(0, 0, 280, 420);

        setSize(new java.awt.Dimension(296, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputId_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputId_DActionPerformed

    }//GEN-LAST:event_inputId_DActionPerformed

    private void inputSize_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSize_DActionPerformed

    }//GEN-LAST:event_inputSize_DActionPerformed

    private void comboEstantes_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstantes_DActionPerformed

    }//GEN-LAST:event_comboEstantes_DActionPerformed

    private void comboRefri_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRefri_DActionPerformed

    }//GEN-LAST:event_comboRefri_DActionPerformed

    private void btnCancelarR_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarR_DActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarR_DActionPerformed

    private void btnRegistrar_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_DActionPerformed
        
        // --- EN ESTE MÉTODO ÚNICAMENTE VALIDAMOS LOS DATOS TOMADOS AL ACCIONAR EL BOTÓN REGISTRAR --- //
        // Obtenemos los datos ingresados y los introducimos en variables para utilizarlos.
        String id = this.inputId_D.getText();
        String tamanio = this.inputSize_D.getText();
        String estantes = this.comboEstantes_D.getSelectedItem().toString();;
        String refri = this.comboRefri_D.getSelectedItem().toString();
        
        //Variables para verificar la completitud de los campos.
        boolean vi = id.isEmpty();
        boolean vt = tamanio.isEmpty();
        
        //Si hay campos vacíos, se le advierte al usuario y no se procede.
        if(vt || vi){
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacíos", "ERROR", JOptionPane.ERROR_MESSAGE);  
        }
        else{
            int idNum = Integer.parseInt(id);
            
            //Validamos que la ID no haya sido registrada anteriormente.
            if(sist.idExistente(idNum)){
                JOptionPane.showMessageDialog(null, "La ID ya se encuentra registrada", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.inputId_D.setText("");
            }
            else{
                int tamanioNum = Integer.parseInt(tamanio);
                if(tamanioNum < 1){
                    JOptionPane.showMessageDialog(null, "Ingrese un tamaño mayor a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                    this.inputSize_D.setText("");
                }
                else{
                    int resp = JOptionPane.showConfirmDialog(null, "Confirmar registro" , "Confirmar depósito", 0);
                    if(resp == 0){                       
                        this.completarRegistro(idNum, tamanioNum, estantes, refri);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Se ha cancelado el registro", "Status", JOptionPane.PLAIN_MESSAGE);
                    } 
                }  
            }
        }
    }//GEN-LAST:event_btnRegistrar_DActionPerformed
    
    /*
    Se asegura de que los valores ingresados sean números 
    y limita su tamaño a 9 dígitos, para no pasar al valor máximo de Int
    */    
    private void inputSize_DKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSize_DKeyTyped
        int size = evt.getKeyChar();

        boolean numeros = size >= 48 && size <= 57;
        
        if (!numeros){
            evt.consume();
        }
        
        if(this.inputSize_D.getText().length() >= 9){
            evt.consume();
        }
    }//GEN-LAST:event_inputSize_DKeyTyped

    /*
    Se asegura de que los valores ingresados sean números 
    y limita su tamaño a 9 dígitos, para no pasar al valor máximo de Int
    */
    private void inputId_DKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputId_DKeyTyped
        int id = evt.getKeyChar();

        boolean numeros = id >= 48 && id <= 57;
        
        if (!numeros){
            evt.consume();
        }
        
        if(this.inputId_D.getText().length() >= 9){
            evt.consume();
        }
    }//GEN-LAST:event_inputId_DKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarR_D;
    private javax.swing.JButton btnRegistrar_D;
    private javax.swing.JComboBox<String> comboEstantes_D;
    private javax.swing.JComboBox<String> comboRefri_D;
    private javax.swing.JTextField inputId_D;
    private javax.swing.JTextField inputSize_D;
    private javax.swing.JLabel lbblSize_D;
    private javax.swing.JLabel lblDeposito;
    private javax.swing.JLabel lblEstantes_D;
    private javax.swing.JLabel lblId_D;
    private javax.swing.JLabel lblRefri_D;
    private javax.swing.JPanel pnlPanel;
    // End of variables declaration//GEN-END:variables
}
