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
        ArchivoLectura arch = new ArchivoLectura(unPath);
        boolean hay = arch.hayMasLineas();
        
        while(hay){
            String [] linea = arch.linea().split("#");
            int numDeposito = Integer.parseInt(linea[0]);
            int size = Integer.parseInt(linea[1]);
            String estantes = linea[2];
            String refri = linea[3];
            
            Deposito depo = new Deposito(numDeposito,size,estantes,refri);
            sist.agregarDeposito(depo);
            hay = arch.hayMasLineas();
        }
        this.llamarInicio();
    }
    
    private void llamarInicio(){
        inicioPrograma vInicioProg = new inicioPrograma(sist);
        ventanaInicio vInicio = new ventanaInicio(sist);
        
        vInicioProg.setVisible(false);
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
                .addComponent(selectorArch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectorArch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectorArchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorArchActionPerformed
        File archivo = this.selectorArch.getSelectedFile();
        if(!(archivo == null)){
            String path = archivo.getAbsolutePath();
            crear(path);
        }
        else{
           dispose();
        }
    }//GEN-LAST:event_selectorArchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser selectorArch;
    // End of variables declaration//GEN-END:variables
}
