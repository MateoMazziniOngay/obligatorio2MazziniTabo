package interfaz;

import dominio.*;
import javax.swing.*;

public class registroEmpleado extends javax.swing.JFrame {
 
    Sistema sist = new Sistema();
    Empleado empl = new Empleado();
    
    public registroEmpleado(Sistema unSistema) {
        this.sist = unSistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEmpleado = new javax.swing.JLabel();
        lblNombre_E = new javax.swing.JLabel();
        lblCi_E = new javax.swing.JLabel();
        lblDir_E = new javax.swing.JLabel();
        lblAnio_E = new javax.swing.JLabel();
        lblTel_E = new javax.swing.JLabel();
        inputNombre_E = new javax.swing.JTextField();
        inputCi_E = new javax.swing.JTextField();
        inputAnio_E = new javax.swing.JTextField();
        inputTel_E = new javax.swing.JTextField();
        inputDirCalle_E = new javax.swing.JTextField();
        inputDirNum_E = new javax.swing.JTextField();
        btnCancelarR_E = new javax.swing.JButton();
        btnRegistrar_E = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEmpleado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEmpleado.setText("REGISTRO DE EMPLEADO");

        lblNombre_E.setText("Nombre");

        lblCi_E.setText("Cédula");

        lblDir_E.setText("Dirección");

        lblAnio_E.setText("Año de Ingreso");

        lblTel_E.setText("Teléfono");

        inputNombre_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombre_EActionPerformed(evt);
            }
        });

        inputCi_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCi_EActionPerformed(evt);
            }
        });

        inputAnio_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAnio_EActionPerformed(evt);
            }
        });

        inputTel_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTel_EActionPerformed(evt);
            }
        });

        inputDirCalle_E.setText("Calle");
        inputDirCalle_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDirCalle_EActionPerformed(evt);
            }
        });

        inputDirNum_E.setText("Número");
        inputDirNum_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDirNum_EActionPerformed(evt);
            }
        });

        btnCancelarR_E.setText("Cancelar");
        btnCancelarR_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarR_EActionPerformed(evt);
            }
        });

        btnRegistrar_E.setText("Registrar");
        btnRegistrar_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_EActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnio_E)
                            .addComponent(lblNombre_E, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCi_E, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTel_E, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDir_E, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputTel_E, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputDirCalle_E, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputDirNum_E, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inputNombre_E, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputAnio_E, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputCi_E, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelarR_E, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar_E, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre_E)
                    .addComponent(inputNombre_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCi_E)
                    .addComponent(inputCi_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnio_E)
                    .addComponent(inputAnio_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel_E)
                    .addComponent(inputTel_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDirCalle_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDirNum_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDir_E))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarR_E)
                    .addComponent(btnRegistrar_E))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        setBounds(0, 0, 314, 395);
    }// </editor-fold>//GEN-END:initComponents

    private void inputNombre_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombre_EActionPerformed

    }//GEN-LAST:event_inputNombre_EActionPerformed

    private void inputCi_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCi_EActionPerformed
        
    }//GEN-LAST:event_inputCi_EActionPerformed

    private void inputAnio_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAnio_EActionPerformed
        
    }//GEN-LAST:event_inputAnio_EActionPerformed

    private void inputTel_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTel_EActionPerformed
        
    }//GEN-LAST:event_inputTel_EActionPerformed

    private void inputDirCalle_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDirCalle_EActionPerformed
        
    }//GEN-LAST:event_inputDirCalle_EActionPerformed

    private void inputDirNum_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDirNum_EActionPerformed
        
    }//GEN-LAST:event_inputDirNum_EActionPerformed

    private void btnRegistrar_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_EActionPerformed
       
        String nombre = this.inputNombre_E.getText();
        String cedula = this.inputCi_E.getText();
        String anio = this.inputAnio_E.getText();
        String telefono = this.inputTel_E.getText();
        String calle = this.inputDirCalle_E.getText();
        String numeroCasa = this.inputDirNum_E.getText();
        
        String hayVacios = empl.vacios(nombre,cedula,anio,telefono,calle,numeroCasa);
        String noNum = empl.noNum(cedula,anio,telefono,numeroCasa);
        
        if(!hayVacios.equals("") || !noNum.equals("")){
            
            JOptionPane.showMessageDialog(null, hayVacios + "\n" + noNum, "ERROR", JOptionPane.ERROR_MESSAGE);
            this.setVacios(cedula,anio,telefono,numeroCasa);
            
        }else{
            
            int cedulaNum = Integer.parseInt(cedula);
            
            if(sist.cedulaExistente(cedulaNum)){
                
                JOptionPane.showMessageDialog(null, "La cédula ya se encuentra registrada", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.inputCi_E.setText("");
                
            }else{
                
                int resp = JOptionPane.showConfirmDialog(null, "Confirmar registro" , "Confirmar cliente", 0);
                
                if(resp == 0){
                    String direccion = calle + " " + numeroCasa; 
                    int telefonoNum = Integer.parseInt(telefono);
                    int anioNum = Integer.parseInt(anio);
                    
                    Persona pE = new Persona(nombre,cedulaNum,telefonoNum);
                    sist.agregarPersona(pE);
                    
                    Empleado e = new Empleado (nombre,cedulaNum,telefonoNum, direccion,anioNum);
                    sist.agregarEmpleado(e);
                
                    JOptionPane.showMessageDialog(null, "Empleado registrado con éxito", "Status", JOptionPane.PLAIN_MESSAGE);
                
                    this.inputNombre_E.setText("");
                    this.inputCi_E.setText("");
                    this.inputAnio_E.setText("");
                    this.inputTel_E.setText("");
                    this.inputDirCalle_E.setText("");
                    this.inputDirNum_E.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Se ha cancelado el registro", "Status", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_btnRegistrar_EActionPerformed

    private void btnCancelarR_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarR_EActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarR_EActionPerformed

    /*public void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroEmpleado().setVisible(true);
            }
        });
    } */  
    public void setVacios(String num1, String num2, String num3, String num4){
        
            if(!sist.esNum(num1)){
                this.inputCi_E.setText("");
            }
            
            if(!sist.esNum(num2)){
                this.inputAnio_E.setText("");
            }
            
            if(!sist.esNum(num3)){
                this.inputTel_E.setText("");
            }
            
            if(!sist.esNum(num4)){
                this.inputDirNum_E.setText("");
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarR_E;
    private javax.swing.JButton btnRegistrar_E;
    private javax.swing.JTextField inputAnio_E;
    private javax.swing.JTextField inputCi_E;
    private javax.swing.JTextField inputDirCalle_E;
    private javax.swing.JTextField inputDirNum_E;
    private javax.swing.JTextField inputNombre_E;
    private javax.swing.JTextField inputTel_E;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAnio_E;
    private javax.swing.JLabel lblCi_E;
    private javax.swing.JLabel lblDir_E;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblNombre_E;
    private javax.swing.JLabel lblTel_E;
    // End of variables declaration//GEN-END:variables
}
