package interfaz;

import dominio.*;
import javax.swing.*;

public class registroCliente extends javax.swing.JFrame {

    static Cliente clie = new Cliente();
    private Sistema sist;
    
    public registroCliente(Sistema unSistema) {
        this.sist = unSistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        lblNombre_C = new javax.swing.JLabel();
        lblCi_C = new javax.swing.JLabel();
        lblMail_C = new javax.swing.JLabel();
        lblTel_C = new javax.swing.JLabel();
        inputNombre_C = new javax.swing.JTextField();
        inputMail_C = new javax.swing.JTextField();
        btnRegistrar_C = new javax.swing.JButton();
        btnCancelarR_C = new javax.swing.JButton();
        inputCi_C = new javax.swing.JTextField();
        inputTel_C = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCliente.setText("REGISTRO DE CLIENTE");

        lblNombre_C.setText("Nombre");

        lblCi_C.setText("Cédula");

        lblMail_C.setText("Mail");

        lblTel_C.setText("Teléfono");

        inputNombre_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombre_CActionPerformed(evt);
            }
        });

        inputMail_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMail_CActionPerformed(evt);
            }
        });

        btnRegistrar_C.setText("Registrar");
        btnRegistrar_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_CActionPerformed(evt);
            }
        });

        btnCancelarR_C.setText("Cancelar");
        btnCancelarR_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarR_CActionPerformed(evt);
            }
        });

        inputCi_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCi_CActionPerformed(evt);
            }
        });

        inputTel_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTel_CActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre_C)
                            .addComponent(lblCi_C)
                            .addComponent(lblMail_C)
                            .addComponent(lblTel_C))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrar_C)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputCi_C, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputNombre_C, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputMail_C, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputTel_C, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnCancelarR_C)
                    .addComponent(lblCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre_C)
                    .addComponent(inputNombre_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCi_C)
                    .addComponent(inputCi_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMail_C)
                    .addComponent(inputMail_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel_C)
                    .addComponent(inputTel_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarR_C)
                    .addComponent(btnRegistrar_C))
                .addContainerGap(23, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 249, 332);
    }// </editor-fold>//GEN-END:initComponents

    
    private void inputNombre_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombre_CActionPerformed

    }//GEN-LAST:event_inputNombre_CActionPerformed

    private void inputMail_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMail_CActionPerformed

    }//GEN-LAST:event_inputMail_CActionPerformed

    private void btnCancelarR_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarR_CActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarR_CActionPerformed

    private void inputCi_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCi_CActionPerformed
        
    }//GEN-LAST:event_inputCi_CActionPerformed

    private void inputTel_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTel_CActionPerformed
        
    }//GEN-LAST:event_inputTel_CActionPerformed

    private void btnRegistrar_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_CActionPerformed
        
        String nombre = this.inputNombre_C.getText();
        String cedula = this.inputCi_C.getText();
        String mail = this.inputMail_C.getText();
        String telefono = this.inputTel_C.getText();
        
        //EMPIEZA PRUEBA
        
        
        Persona p = new Persona(nombre, Integer.parseInt(this.inputCi_C.getText()), Integer.parseInt(this.inputTel_C.getText()));
        sist.agregarPersona(p);
                    
        Cliente c = new Cliente (nombre, Integer.parseInt(this.inputCi_C.getText()), Integer.parseInt(this.inputTel_C.getText()),mail);
        sist.agregarCliente(c);
        
        // TERMINA PRUEBA
        
        String hayVacios = clie.vacios(nombre,cedula,mail,telefono);
        String noNum = clie.noNum(cedula, telefono);
        
        if(!hayVacios.equals("") || !noNum.equals("")){
            
            JOptionPane.showMessageDialog(null, hayVacios + "\n" + noNum, "ERROR", JOptionPane.ERROR_MESSAGE);
            this.setVacios(cedula,telefono);
            
        }else{
            
            int cedulaNum = Integer.parseInt(cedula);
            int telefonoNum = Integer.parseInt(telefono);
            
            if(sist.cedulaExistente(cedulaNum)){
                JOptionPane.showMessageDialog(null, "La cédula ya se encuentra registrada", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.inputCi_C.setText("");
                
            }else{
                
                int resp = JOptionPane.showConfirmDialog(null, "Confirmar registro" , "Confirmar cliente", 0);
                if(resp == 0){
                    
                    Persona pC = new Persona(nombre,cedulaNum,telefonoNum);
                    sist.agregarPersona(pC);
                    
                    Cliente cl = new Cliente (nombre,cedulaNum,telefonoNum,mail);
                    sist.agregarCliente(cl);
                
                    JOptionPane.showMessageDialog(null, "Cliente registrado con éxito", "Status", JOptionPane.PLAIN_MESSAGE);
                
                    this.inputNombre_C.setText("");
                    this.inputCi_C.setText("");
                    this.inputMail_C.setText("");
                    this.inputTel_C.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Se ha cancelado el registro", "Status", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }   
    }//GEN-LAST:event_btnRegistrar_CActionPerformed

    public void setVacios(String num1, String num2){
        
        if(!sist.esNum(num1)){
                this.inputCi_C.setText("");
        }
        if(!sist.esNum(num2)){
            this.inputTel_C.setText("");
        }   
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new registroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarR_C;
    private javax.swing.JButton btnRegistrar_C;
    private javax.swing.JTextField inputCi_C;
    private javax.swing.JTextField inputMail_C;
    private javax.swing.JTextField inputNombre_C;
    private javax.swing.JTextField inputTel_C;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCi_C;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblMail_C;
    private javax.swing.JLabel lblNombre_C;
    private javax.swing.JLabel lblTel_C;
    // End of variables declaration//GEN-END:variables
}
