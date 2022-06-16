package interfaz;

import dominio.*;
import javax.swing.*;

public class registroEmpleado extends javax.swing.JFrame {
 
    private Sistema sist;
    private Empleado empl;
    
    public registroEmpleado(Sistema unSistema) {
        initComponents();
        this.sist = unSistema;
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
        inputDir_E = new javax.swing.JTextField();
        btnCancelarR_E = new javax.swing.JButton();
        btnRegistrar_E = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        inputCi_E.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputCi_EKeyTyped(evt);
            }
        });

        inputAnio_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAnio_EActionPerformed(evt);
            }
        });
        inputAnio_E.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputAnio_EKeyTyped(evt);
            }
        });

        inputTel_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTel_EActionPerformed(evt);
            }
        });
        inputTel_E.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputTel_EKeyTyped(evt);
            }
        });

        inputDir_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDir_EActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAnio_E)
                                    .addComponent(lblNombre_E, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCi_E, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTel_E, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDir_E, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputDir_E)
                                            .addComponent(inputTel_E)
                                            .addComponent(inputNombre_E))
                                        .addComponent(inputAnio_E, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(inputCi_E, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelarR_E, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegistrar_E, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 52, Short.MAX_VALUE)))
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
                    .addComponent(inputDir_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDir_E))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarR_E)
                    .addComponent(btnRegistrar_E))
                .addContainerGap(57, Short.MAX_VALUE))
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
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setBounds(0, 0, 314, 399);
    }// </editor-fold>//GEN-END:initComponents

    private void inputNombre_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombre_EActionPerformed

    }//GEN-LAST:event_inputNombre_EActionPerformed

    private void inputCi_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCi_EActionPerformed
        
    }//GEN-LAST:event_inputCi_EActionPerformed

    private void inputAnio_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAnio_EActionPerformed
        
    }//GEN-LAST:event_inputAnio_EActionPerformed

    private void inputTel_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTel_EActionPerformed
        
    }//GEN-LAST:event_inputTel_EActionPerformed

    private void inputDir_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDir_EActionPerformed
        
    }//GEN-LAST:event_inputDir_EActionPerformed

    private void btnRegistrar_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_EActionPerformed
       
        // Obtenemos los datos de los text fields y los introducimos en variables para utilizarlos.
        String nombre = this.inputNombre_E.getText();
        String cedula = this.inputCi_E.getText();
        String anio = this.inputAnio_E.getText();
        String telefono = this.inputTel_E.getText();
        String direccion = this.inputDir_E.getText();
        
        // Variables para verificar completitud de los campos
        boolean vn = nombre.isEmpty();
        boolean vc = cedula.isEmpty();
        boolean va = anio.isEmpty();
        boolean vt = telefono.isEmpty();
        boolean vd = direccion.isEmpty();
        
        //Si hay campos vacíos, se le advierte al usuario y no se procede
        if(vn || vc || va || vt || vd){
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacíos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            int cedulaNum = Integer.parseInt(cedula);
            int anioNum = Integer.parseInt(anio);
            int telNum = Integer.parseInt(telefono);
            
            //Validamos que la cedula no haya sido registrada anteriormente previo a registrar a la persona
            if(sist.cedulaExistente(cedulaNum)){
                JOptionPane.showMessageDialog(null, "La cédula ya se encuentra registrada", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.inputCi_E.setText("");
            }
            else{
                if(anioNum < 1940){
                    JOptionPane.showMessageDialog(null, "Ingrese un año mayor a 1940", "ERROR", JOptionPane.ERROR_MESSAGE);
                    this.inputAnio_E.setText("");
                }
                else{
                    //Pedimos confirmación de registro
                    int resp = JOptionPane.showConfirmDialog(null, "Confirmar registro" , "Confirmar empleado", 0);
                    if(resp == 0){
                        
                        // Agregamos el registro a la lista de personas.
                        Persona p = new Persona(nombre,cedulaNum,telNum);
                        sist.agregarPersona(p);
                    
                        // Agregamos el registro a la lista de empleados.
                        Empleado e = new Empleado (nombre,cedulaNum,telNum, direccion,anioNum);
                        sist.agregarEmpleado(e);
                    
                        /*
                        Creamos una variable registro para mostrar un mensaje de empleado registrado con exito y sus respectivos datos 
                        en un showMessageDialog
                        */
                        String registro =   "¡Empleado registrado con exito!" + 
                                            "\n" + "Empleado: " + nombre + 
                                            "\n" + "Cedula: " + cedulaNum + 
                                            "\n" + "Telefono: " + telNum + 
                                            "\n" + "Direccion: " + direccion + 
                                            "\n" + "Año de ingreso: " + anioNum;
                    
                        JOptionPane.showMessageDialog(null, registro, "Status", JOptionPane.PLAIN_MESSAGE);
                    
                        // Dejamos los text fields en blanco otra vez.
                        this.inputNombre_E.setText("");
                        this.inputCi_E.setText("");
                        this.inputAnio_E.setText("");
                        this.inputTel_E.setText("");
                        this.inputDir_E.setText("");     
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Se ha cancelado el registro", "Status", JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        }   
    }//GEN-LAST:event_btnRegistrar_EActionPerformed

    private void btnCancelarR_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarR_EActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarR_EActionPerformed

    private void inputCi_EKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCi_EKeyTyped
        int ci = evt.getKeyChar();

        boolean numeros = ci >= 48 && ci <= 57;
        
        if (!numeros){
            evt.consume();
        }
        
        if(this.inputCi_E.getText().length() >= 9){
            evt.consume();
        }
    }//GEN-LAST:event_inputCi_EKeyTyped

    private void inputAnio_EKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputAnio_EKeyTyped
        int anio = evt.getKeyChar();

        boolean numeros = anio >= 48 && anio <= 57;
        
        if (!numeros){
            evt.consume();
        }
        
        if(this.inputAnio_E.getText().length() >= 9){
            evt.consume();
        }
    }//GEN-LAST:event_inputAnio_EKeyTyped

    private void inputTel_EKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTel_EKeyTyped
        int tel = evt.getKeyChar();

        boolean numeros = tel >= 48 && tel <= 57;
        
        if (!numeros){
            evt.consume();
        }
        
        if(this.inputTel_E.getText().length() >= 9){
            evt.consume();
        }
    }//GEN-LAST:event_inputTel_EKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarR_E;
    private javax.swing.JButton btnRegistrar_E;
    private javax.swing.JTextField inputAnio_E;
    private javax.swing.JTextField inputCi_E;
    private javax.swing.JTextField inputDir_E;
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
