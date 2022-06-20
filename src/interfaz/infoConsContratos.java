// Martín Tabó 227665 - Mateo Mazzini 219372

package interfaz;

import utilidades.CriterioVisita;
import dominio.*;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class infoConsContratos extends javax.swing.JFrame implements Serializable {

    private Sistema sist;
    
    /*
    Creamos un modelo para cada una de las listas, el modelo sería el "cuerpo" 
    de la lista.
    */
    DefaultListModel modelo1 = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();
    DefaultListModel modelo3 = new DefaultListModel();
        
    public infoConsContratos(Sistema unSistema) {
        initComponents();
        this.sist = unSistema;
        cargarListaContratos();
    }
    
    
    //______CARGA DE LISTAS______//
    private void cargarVisitas(Contrato unContrato){
           
        //Cargamos un arrayList con las visitas del contrato seleccionado
        ArrayList<Visita> visitasConSelec = ordenFecha(sist.visitasContrato(unContrato));
        if(visitasConSelec.isEmpty()){
            JOptionPane.showMessageDialog(null, "Este contrato no posee visitas","Status", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            
            //Contador para ir avanzando en las filas de nuestra tabla.
            int fila = 0;
            
            //Cantidad de filas de nuestra tabla.
            int cantVisitas = visitasConSelec.size();
            
            //Header de la tabla.
            String colHead [] = {"Día","Mes","Empleado"};
            
            //Cuerpo/texto de la tabla
            String info [][]= new String[cantVisitas][3];

            /*
            Recorre las visitas del contrato y carga su información 
            en el array que será cuerpo de la tabla.
            */
            for(Visita visita : visitasConSelec){
                
                info[fila][0]= visita.getDia()+"";
                info[fila][1]= visita.getMes()+"";
                info[fila][2]= visita.getEmpleado().getNombre();
                
                fila++;
            }
            
            //Seteamos el cuerpo y el header de la tabla.
            tablaInfo.setModel(new DefaultTableModel(info, colHead));
        }            
    }
    
    private void cargarListaContratos(){
        
        /*
        Cada vez que cargamos una lista, borramos el contenido de su modelo 
        para no cargar elementos repetidos.
        */
        modelo1.removeAllElements(); 
        ArrayList<Contrato> contratos = sist.getListaContratos();    
        boolean vc = contratos.isEmpty();
        
        //Chequeamos que la lista de contratos no esté vacía.
        if(vc){
            modelo1.addElement("No hay contratos registrados");
        }
        else{
            
            //Recorremos el arrayList, añadiendo cada elemento al modelo
            for(Contrato contrato : contratos){
                modelo1.addElement("Contrato N°: " + contrato.getNumContrato());
            }
        }
        
        //Seteamos nuestro modelo como el modelo de la lista
        lstContratos_Info.setModel(modelo1);
    }
   
    //Crea el archivo con la información del contrato que quiere ser dado de baja.
    private void generarArchivo(Contrato unContrato){
        
        //Definimos el nombre de nuestro archivo.
        String titulo = unContrato.getCliente().getNombre() + " " + unContrato.getNumContrato() +".txt";
        
        //Cargamos un arrayList con las visitas de nuestro contrato.
        ArrayList<Visita> visitas = sist.visitasContrato(unContrato);
        try{
            
            //Creamos el archivo con el nombre definido anteriormente.
            Formatter arch = new Formatter(titulo);
            
            
            // --Ingreso de datos al archivo--   

            //Recorremos nuestro arrayList de visitas.
            for(Visita visita : visitas){
                String dia = visita.getDia();
                String mes = visita.getMes();
                String empleado = visita.getEmpleado().getNombre();
                
                //Tomamos la información de cada visita y la ponemos en un String.
                String texto = "Dia: " + dia + " Mes: " + mes + " Empleado: " + empleado; 
                
                //Creamos una nueva línea en el archivo de texto con el texto anteriormente creado.
                arch.format("%s%n", texto);
            }
            
            //Cerramos el archivo de texto.
            arch.close();
            
        }catch(FileNotFoundException e){
            System.out.println("Error de archivo");
        }
        this.eliminarDatos(unContrato);
    }
    
    //Elimina los datos del contrato seleccionado.
    private void eliminarDatos(Contrato unContrato){
        ArrayList<Visita> visitasC = sist.visitasContrato(unContrato);
        ArrayList<Visita> visitasS = sist.getListaVisitas();
        
        //Recorremos la lista de visitas.
        for(int i = 0; i < visitasS.size(); i++){
            
            //Si la visita pertenece a la lista de visitas del contrato a eliminar, la quitamos de la lista de visitas.
            if(visitasC.contains(visitasS.get(i))){
                visitasS.remove(visitasS.get(i));
            }
        }
        
        //Previo a eliminar el contrato, mostramos una ventana con la información del contrato que se eliminó.
        JOptionPane.showMessageDialog(null, "El contrato " + 
                                            "\n" + unContrato.toString() + 
                                            "\n" + "Ha sido eliminado", 
                                    "Status", JOptionPane.PLAIN_MESSAGE);
        //Eliminamos el contrato.
        sist.getListaContratos().remove(unContrato);
        
        //Cargamos nuevamente la lista de contratos.
        this.cargarListaContratos();
        
        //Ponemos en blanco el txtArea y la tabla de visitas.
        borrarTextos();    
    }

    //Deja en blanco la tabla de visitas y la información del contrato.
    private void borrarTextos(){
        
        //Le damos un cuerpo vacío a la tabla y no le ponemos header.
        String info [][]= new String[0][0];
        this.tablaInfo.setModel(new DefaultTableModel(info, null));
        
        //Ponemos un string vacío como texto del txtArea.
        this.txtAreaInfoContrato.setText("");
                
    }
    
    //Ordena los depósitos de manera ascendente de acuerdo a su ID.
    public ArrayList<Visita> ordenFecha (ArrayList visitas){
        Collections.sort(visitas, new CriterioVisita());
        
        return visitas;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstContratos_Info = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaInfoContrato = new javax.swing.JTextArea();
        btnInfoContrato = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaInfo = new javax.swing.JTable();
        btnEliminarContrato = new javax.swing.JButton();
        lblContratos = new javax.swing.JLabel();
        lblInfoContratos = new javax.swing.JLabel();
        lblVisitasContrato = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Contratos");
        getContentPane().setLayout(null);

        lstContratos_Info.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstContratos_Info);

        txtAreaInfoContrato.setColumns(20);
        txtAreaInfoContrato.setRows(5);
        jScrollPane2.setViewportView(txtAreaInfoContrato);

        btnInfoContrato.setText("Mostrar información");
        btnInfoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoContratoActionPerformed(evt);
            }
        });

        tablaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaInfo);

        btnEliminarContrato.setText("Dar de baja");
        btnEliminarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarContratoActionPerformed(evt);
            }
        });

        lblContratos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContratos.setText("Contratos:");

        lblInfoContratos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoContratos.setText("Información de contratos:");

        lblVisitasContrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVisitasContrato.setText("Visitas a depósito del contrato:");

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContratos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInfoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblVisitasContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(lblInfoContratos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoContratos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(lblVisitasContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInfoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtras)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 510, 380);

        setSize(new java.awt.Dimension(528, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarContratoActionPerformed
        String idSelec = lstContratos_Info.getSelectedValue();
        
        //Chequeamos si el usuario seleccionó o no un contrato a eliminar.
        boolean vc = idSelec == null;
        ArrayList<Contrato> contratos = sist.getListaContratos();  
        
        //Si no hay ningún contrato registrado, se le advierte al usuario nuevamente.
        if(contratos.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay contratos para dar de baja","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
        //Si no seleccionó un Contrato, se le dice que debe hacerlo antes de presionar el botón "dar de baja".
            if(vc){
                JOptionPane.showMessageDialog(null, "Seleccione un contrato para dar de baja","ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
            
                int idSelecNum = Integer.parseInt(idSelec.substring(13));
                Contrato contratoSelec = sist.buscarId(idSelecNum);
            
                /*
                Se le pide confirmación al usuario previo a borrar el contrato. 
                Se le muestra la información del contrato a eliminar.
                */
                int resp = JOptionPane.showConfirmDialog(null,  "¿Está seguro de que quiere eliminar este contrato?" + 
                                                            "\n" + contratoSelec.toString() , "Confirmar eliminar contrato", 0);
                if(resp == 0){
                    this.generarArchivo(contratoSelec);   
                }
            }
        }
    }//GEN-LAST:event_btnEliminarContratoActionPerformed

    private void btnInfoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoContratoActionPerformed
        
        //Borramos cualquier información que haya quedado de un contrato mostrado anteriormente.
        this.borrarTextos();
        String idSelec = lstContratos_Info.getSelectedValue();
        
        //Nos aseguramos de que el usuario seleccione un contrato.
        boolean vc = idSelec == null;
        ArrayList<Contrato> contratos = sist.getListaContratos();  
        
        //Si no hay ningún contrato registrado, se le advierte al usuario nuevamente.
        if(contratos.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay contratos registrados","ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            
            /*
            Si hay contratos y el usuario no los selecciona se le avisa que debe 
            seleccionar al menos uno antes de querer mostrar infomación.
            */
            if(vc){
                JOptionPane.showMessageDialog(null, "Seleccione un contrato","ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
                
                //Tomamos la ID del contrato de la línea seleccionada por el usuario.
                int idSelecNum = Integer.parseInt(idSelec.substring(13));
                for(Contrato contrato : sist.getListaContratos()){
                    if(contrato.getNumContrato() == idSelecNum){
                        
                        //Cargamos la información del contrato seleccionado en el txtArea.
                        this.txtAreaInfoContrato.setText(contrato.toString());
                        
                        //Cargamos las visitas del contrato.
                        this.cargarVisitas(contrato);
                    }
                }
            }
        }      
    }//GEN-LAST:event_btnInfoContratoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminarContrato;
    private javax.swing.JButton btnInfoContrato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblContratos;
    private javax.swing.JLabel lblInfoContratos;
    private javax.swing.JLabel lblVisitasContrato;
    private javax.swing.JList<String> lstContratos_Info;
    private javax.swing.JTable tablaInfo;
    private javax.swing.JTextArea txtAreaInfoContrato;
    // End of variables declaration//GEN-END:variables
}
