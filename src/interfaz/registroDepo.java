package interfaz;

import dominio.*;
import javax.swing.*;

public class registroDepo extends javax.swing.JFrame {

    private Sistema sist;
    private Deposito depo = new Deposito();
    
    public registroDepo(Sistema unSistema) {
        initComponents();
        this.sist = unSistema;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
                .addContainerGap(27, Short.MAX_VALUE))
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
                .addContainerGap(31, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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
        dispose();
    }//GEN-LAST:event_btnCancelarR_DActionPerformed

    private void btnRegistrar_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_DActionPerformed
        
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
                    
                        //Convertimos las variables de acuerdo a como debemos pasarlas al crear un depósito.
                        refri = depo.pasarSN(refri);
                        estantes = depo.pasarSN(estantes);
                    
                        //Creamos un nuevo depósito y lo agregamos a su lista.
                        Deposito d = new Deposito(idNum,tamanioNum,estantes,refri);
                        sist.agregarDeposito(d);

                        /*
                        Creamos una variable registro para mostrar un mensaje de depósito registrado con exito 
                        y sus respectivos datos en un showMessageDialog
                        */
                        String registro =   "¡Depósito registrado con exito!" + 
                                            "\n" + "ID: " + idNum + 
                                            "\n" + "Tamaño: " + tamanioNum + 
                                            "\n" + "Estantes: " + estantes +
                                            "\n" + "Refrigeración: " + refri;
 
                        JOptionPane.showMessageDialog(null, registro, "Status", JOptionPane.PLAIN_MESSAGE);
                    
                        // Dejamos los text fields en blanco otra vez.
                        this.inputId_D.setText("");
                        this.inputSize_D.setText("");
                        this.comboEstantes_D.setSelectedIndex(0);
                        this.comboRefri_D.setSelectedIndex(0);
                
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Se ha cancelado el registro", "Status", JOptionPane.PLAIN_MESSAGE);
                    } 
                }  
            }
        }
    }//GEN-LAST:event_btnRegistrar_DActionPerformed
   
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbblSize_D;
    private javax.swing.JLabel lblDeposito;
    private javax.swing.JLabel lblEstantes_D;
    private javax.swing.JLabel lblId_D;
    private javax.swing.JLabel lblRefri_D;
    // End of variables declaration//GEN-END:variables
}
