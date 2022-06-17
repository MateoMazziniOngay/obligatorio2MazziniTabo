// Martín Tabó 227665 - Mateo Mazzini 219372

package interfaz;

import dominio.*;
import java.io.Serializable;
import javax.swing.*;

public class registroCliente extends javax.swing.JFrame implements Serializable{

    private Cliente clie;
    private Sistema sist;
    
    public registroCliente(Sistema unSistema) {
        this.sist = unSistema;
        initComponents();
    }
    
    //Deja los textFields en blanco.
    private void setVoid(){
        this.inputNombre_C.setText("");
        this.inputCi_C.setText("");
        this.inputTel_C.setText("");
        this.inputMail_C.setText(""); 
    }
    
    //Crea los objetos de acuerdo a los datos recibidos e informa al usuario.
    private void completarRegistro(String unNombre, int unaCi, int unTelefono, String unMail){
        // Agregamos el registro a la lista de personas.
        Persona p = new Persona(unNombre,unaCi,unTelefono);
        sist.agregarPersona(p);
                    
        // Agregamos el registro a la lista de clientes.
        Cliente c = new Cliente (unNombre,unaCi,unTelefono, unMail);
        sist.agregarCliente(c);
        
        this.status(unNombre, unaCi, unTelefono, unMail);
        this.setVoid();       
    }
    
    //Informa al usuario sobre el estado del registro.
    private void status(String unNombre, int unaCi, int unTelefono, String unMail){
        /*Creamos una variable registro para mostrar un mensaje de cliente registrado con exito y sus respectivos datos 
        en un showMessageDialog*/
        String registro =   "¡Cliente registrado con exito!" + 
                            "\n" + "Cliente: " + unNombre + 
                            "\n" + "Cedula: " + unaCi + 
                            "\n" + "Telefono: " + unTelefono + 
                            "\n" + "Mail: " + unMail;
                    
        JOptionPane.showMessageDialog(null, registro, "Status", JOptionPane.PLAIN_MESSAGE);   
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de clientes");
        getContentPane().setLayout(null);

        lblCliente.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
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
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTel_C)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputTel_C, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCi_C)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputCi_C, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombre_C)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputNombre_C, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMail_C)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputMail_C, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelarR_C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar_C, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnRegistrar_C)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarR_C)
                .addGap(42, 42, 42))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(6, 6, 268, 410);

        setSize(new java.awt.Dimension(296, 459));
        setLocationRelativeTo(null);
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
         // --- EN ESTE MÉTODO ÚNICAMENTE VALIDAMOS LOS DATOS TOMADOS AL ACCIONAR EL BOTÓN REGISTRAR --- //
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
                    this.completarRegistro(nombre, cedulaNum, telNum, mail);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Se ha cancelado el registro", "Status", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnRegistrar_CActionPerformed

    /*
    Se asegura de que los valores ingresados sean números 
    y limita su tamaño a 9 dígitos, para no pasar al valor máximo de Int
    */
    private void inputCi_CKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCi_CKeyTyped
        int ci = evt.getKeyChar();

        boolean numeros = ci >= 48 && ci <= 57;
        
        if (!numeros){
            evt.consume();
        }
        
        if(this.inputCi_C.getText().length() >= 9){
            evt.consume();
        }
    }//GEN-LAST:event_inputCi_CKeyTyped

    /*
    Se asegura de que los valores ingresados sean números 
    y limita su tamaño a 9 dígitos, para no pasar al valor máximo de Int
    */
    private void inputTel_CKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTel_CKeyTyped
        int tel = evt.getKeyChar();

        boolean numeros = tel >= 48 && tel <= 57;
        
        if (!numeros){
            evt.consume();
        }
        
        if(this.inputTel_C.getText().length() >= 9){
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
