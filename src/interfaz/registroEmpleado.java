// Martín Tabó 227665 - Mateo Mazzini 219372

package interfaz;

import dominio.*;
import java.io.Serializable;
import javax.swing.*;

public class registroEmpleado extends javax.swing.JFrame implements Serializable{
 
    private Sistema sist;
    private Empleado empl;
    
    public registroEmpleado(Sistema unSistema) {
        initComponents();
        this.sist = unSistema;
    }

    //Crea los objetos de acuerdo a los datos recibidos.
    private void completarRegistro(String unNombre, int unaCi, int unTelefono, String unaDireccion, int unAnio){
        // Agregamos el registro a la lista de personas.
        Persona p = new Persona(unNombre,unaCi,unTelefono);
        sist.agregarPersona(p);
                    
        // Agregamos el registro a la lista de empleados.
        Empleado e = new Empleado (unNombre,unaCi,unTelefono, unaDireccion, unAnio);
        sist.agregarEmpleado(e);
        
        this.status(unNombre,unaCi,unTelefono, unaDireccion, unAnio);            
        this.setVoid();
    }
    
    //Informa al usuario sobre el estado del registro.
    private void status(String unNombre, int unaCi, int unTelefono, String unaDireccion, int unAnio){
        /*
        Creamos una variable registro para mostrar un mensaje de empleado registrado con exito y sus respectivos datos 
        en un showMessageDialog.
        */
        String registro =   "¡Empleado registrado con exito!" + 
                            "\n" + "Empleado: " + unNombre + 
                            "\n" + "Cedula: " + unaCi + 
                            "\n" + "Telefono: " + unTelefono + 
                            "\n" + "Direccion: " + unaDireccion + 
                            "\n" + "Año de ingreso: " + unAnio;
                    
        JOptionPane.showMessageDialog(null, registro, "Status", JOptionPane.PLAIN_MESSAGE);
    }
    
    //Deja los text fields en blanco.
    private void setVoid(){
        
        
        this.inputNombre_E.setText("");
        this.inputCi_E.setText("");
        this.inputAnio_E.setText("");
        this.inputTel_E.setText("");
        this.inputDir_E.setText("");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel = new javax.swing.JPanel();
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
        setTitle("Registro de empleados");

        lblEmpleado.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        javax.swing.GroupLayout pnlPanelLayout = new javax.swing.GroupLayout(pnlPanel);
        pnlPanel.setLayout(pnlPanelLayout);
        pnlPanelLayout.setHorizontalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlPanelLayout.createSequentialGroup()
                                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCi_E)
                                    .addComponent(lblNombre_E)
                                    .addComponent(lblAnio_E)
                                    .addComponent(lblTel_E)
                                    .addComponent(lblDir_E))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputDir_E, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(inputTel_E)
                                            .addComponent(inputNombre_E))
                                        .addComponent(inputAnio_E, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(inputCi_E, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnCancelarR_E, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPanelLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(btnRegistrar_E, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlPanelLayout.setVerticalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelLayout.createSequentialGroup()
                .addComponent(lblEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre_E)
                    .addComponent(inputNombre_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCi_E)
                    .addComponent(inputCi_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnio_E)
                    .addComponent(inputAnio_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel_E)
                    .addComponent(inputTel_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDir_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDir_E))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnRegistrar_E)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarR_E)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(296, 459));
        setLocationRelativeTo(null);
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
       
        // --- EN ESTE MÉTODO ÚNICAMENTE VALIDAMOS LOS DATOS TOMADOS AL ACCIONAR EL BOTÓN REGISTRAR --- //
        // Obtenemos los datos de los text fields y los introducimos en variables para utilizarlos.
        String nombre = this.inputNombre_E.getText().trim();
        String cedula = this.inputCi_E.getText();
        String anio = this.inputAnio_E.getText();
        String telefono = this.inputTel_E.getText();
        String direccion = this.inputDir_E.getText().trim();
        
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
                /*
                La variable inicioEmpresa, guarda el año en el que se fundó la empresa, este será
                el valor mínimo de año de ingreso de un empleado.
                El valor debe ser modificado para cada empresa que utilice el sistema.
                */
                int inicioEmpresa = 0;
                if(anioNum < inicioEmpresa){
                    JOptionPane.showMessageDialog(null, "Ingrese un año mayor a " + inicioEmpresa, "ERROR", JOptionPane.ERROR_MESSAGE);
                    this.inputAnio_E.setText("");
                }
                else{
                    //Pedimos confirmación de registro
                    int resp = JOptionPane.showConfirmDialog(null, "Confirmar registro" , "Confirmar empleado", 0);
                    if(resp == 0){
                        this.completarRegistro(nombre,cedulaNum,telNum,direccion,anioNum);         
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

    /*
    Se asegura de que los valores ingresados sean números 
    y limita su tamaño a 9 dígitos, para no pasar al valor máximo de Int.
    */
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

    /*
    Se asegura de que los valores ingresados sean números 
    y limita su tamaño a 9 dígitos, para no pasar al valor máximo de Int.
    */
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

    /*
    Se asegura de que los valores ingresados sean números 
    y limita su tamaño a 9 dígitos, para no pasar al valor máximo de Int.
    */
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
    private javax.swing.JLabel lblAnio_E;
    private javax.swing.JLabel lblCi_E;
    private javax.swing.JLabel lblDir_E;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblNombre_E;
    private javax.swing.JLabel lblTel_E;
    private javax.swing.JPanel pnlPanel;
    // End of variables declaration//GEN-END:variables
}
