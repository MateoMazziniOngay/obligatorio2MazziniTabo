/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;
import utilidades.*;
import dominio.*;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class SelectorArchivos extends javax.swing.JFrame {

    private Sistema sist;
    
    public SelectorArchivos(Sistema unSistema) {
        this.sist = unSistema;
        initComponents();
    }
    
    private void crear(String unPath){
        
        //Define la ruta recibida como el archivo a leer.
        ArchivoLectura arch = new ArchivoLectura(unPath);
        
        //Chequeamos que el archivo tenga más contenido.
        boolean hay = arch.hayMasLineas();
        
        while(hay){
            
            /*
            Separamos la línea en "#", cada uno de los espacios del Array 
            contendrá un parámetro del depósito.
            */
            String [] linea = arch.linea().split("#");
            int numDeposito = Integer.parseInt(linea[0]);
            int size = Integer.parseInt(linea[1]);
            String estantes = linea[2];
            String refri = linea[3];
            
            //Creamos un depósito y lo añadimos a la lista.
            Deposito depo = new Deposito(numDeposito,size,estantes,refri);
            sist.agregarDeposito(depo);
            
            /*
            Volvemos a chequear que hayan más líneas en el archivo 
            para seguir avanzando.
            */
            hay = arch.hayMasLineas();
        }
        //Luego de cargados todos los depósitos, se llama a la ventana de inicio.
        this.llamarInicio();
    }
    
    private void llamarInicio(){
        
        ventanaInicio vInicio = new ventanaInicio(sist);
        vInicio.setVisible(true);
        dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectorArch = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        selectorArch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorArchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectorArch, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectorArch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectorArchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorArchActionPerformed
       
        //Tomamos el archivo seleccionado por el usuario.
        File archivo = this.selectorArch.getSelectedFile();
        
        //Chequeamos que haya escogido algún archivo al clickear "Open".
        if(!(archivo == null)){
            
            //Guarda la ruta del archivo en un String.
            String path = archivo.getAbsolutePath();
            crear(path);
        }
        else{
            
            /*
            Si clickea Cancel, no toma el path del archivo, cierra 
            la ventana y muestra el selector de sistema.
            */
            inicioPrograma vInicioProg = new inicioPrograma(sist);
            vInicioProg.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_selectorArchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser selectorArch;
    // End of variables declaration//GEN-END:variables
}
