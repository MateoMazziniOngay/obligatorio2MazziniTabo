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
        inputCi_C.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCi_CKeyTyped(evt);
            }
        });

        inputTel_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTel_CActionPerformed(evt);
            }
        });
        inputTel_C.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputTel_CKeyTyped(evt);
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
        
        // Obtenemos los datos de los text fields y los introducimos en variables para utilizarlos.
        String nombre = this.inputNombre_C.getText();
        String cedula = this.inputCi_C.getText();
        String mail = this.inputMail_C.getText();
        String telefono = this.inputTel_C.getText();
        
        // Variables para verificar completitud de los campos
        boolean vn = nombre.isEmpty();
        boolean vc = cedula.isEmpty();
        boolean vm = mail.isEmpty();
        boolean vt = telefono.isEmpty();
        
        //Si hay campos vacíos, se le advierte al usuario y no se procede
        if(vn || vc || vm || vt){
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacíos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            int cedulaNum = Integer.parseInt(cedula);
            int telNum = Integer.parseInt(telefono);
            
            //Validamos que la cedula no haya sido registrada anteriormente previo a registrar a la persona
            if(sist.cedulaExistente(cedulaNum)){
                JOptionPane.showMessageDialog(null, "La cédula ya se encuentra registrada", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.inputCi_C.setText("");
            }
            else{
                //Pedimos confirmación de registro
                int resp = JOptionPane.showConfirmDialog(null, "Confirmar registro" , "Confirmar cliente", 0);
                if(resp == 0){
                    // Agregamos el registro a la lista de personas.
                    Persona p = new Persona(nombre,cedulaNum,telNum);
                    sist.agregarPersona(p);
                    
                    // Agregamos el registro a la lista de clientes.
                    Cliente c = new Cliente (nombre,cedulaNum,telNum, mail);
                    sist.agregarCliente(c);
                    
                    /*Creamos una variable registro para mostrar un mensaje de cliente registrado con exito y sus respectivos datos 
                    en un showMessageDialog*/
                    String registro =   "¡Cliente registrado con exito!" + 
                                        "\n" + "Cliente: " + nombre + 
                                        "\n" + "Cedula: " + cedulaNum + 
                                        "\n" + "Telefono: " + telNum + 
                                        "\n" + "Mail: " + mail;
                    
                    JOptionPane.showMessageDialog(null, registro, "Status", JOptionPane.PLAIN_MESSAGE);
                    
                    // Dejamos los text fields en blanco otra vez.
                    this.inputNombre_C.setText("");
                    this.inputCi_C.setText("");
                    this.inputTel_C.setText("");
                    this.inputMail_C.setText("");     
                }
                else{
                    JOptionPane.showMessageDialog(null, "Se ha cancelado el registro", "Status", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnRegistrar_CActionPerformed

    private void inputCi_CKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCi_CKeyTyped
        int ci = evt.getKeyChar();

        boolean numeros = ci >= 48 && ci <= 57;
        
        if (!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_inputCi_CKeyTyped

    private void inputTel_CKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTel_CKeyTyped
        int tel = evt.getKeyChar();

        boolean numeros = tel >= 48 && tel <= 57;
        
        if (!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_inputTel_CKeyTyped

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
