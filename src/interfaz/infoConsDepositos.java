// Martín Tabó 227665 - Mateo Mazzini 219372

package interfaz;

import dominio.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class infoConsDepositos extends javax.swing.JFrame {
    //private List<JButton> botones;
    private Sistema sist;
    private int indice;
    private Deposito depo = new Deposito();

    public infoConsDepositos(Sistema unSistema) {
        initComponents();
        sist = unSistema;
        //botones = new ArrayList<>();
        this.crearBotones();
    }
    
    public void crearBotones(){
        
        ArrayList<Deposito> depos = depo.ordenA(sist.getListaDepositos());
        for(Deposito deposito : depos){
            JButton btnDepo = new JButton("Núm "+ deposito.getId());
            if(sist.listaAlquilados().contains(deposito)){
                btnDepo.setBackground(Color.RED);
            }
            else{
                btnDepo.setBackground(Color.GREEN);
            }
            btnDepo.setSize(100,50);
            
            btnDepo.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(sist.listaAlquilados().contains(deposito)){
                        depoAlquilado(deposito);
                    }else{
                        depoDisponible(deposito);
                    }
            }});
            
            this.panelBotones.add(btnDepo); 
            //botones.add(btnDepo);
        }   
    this.panelBotones.updateUI();  
    }
        
    //Muestra la información del depósito alquilado seleccionado.
    private void depoAlquilado(Deposito unDeposito){
        Contrato contrato = sist.buscarContrato(unDeposito);
        String cliente = "Cliente: " + contrato.getCliente().getNombre();
        String numContrato = "N°: " + contrato.getNumContrato();
        String cantVisitas = "Cant. Visitas: " + sist.visitasContrato(contrato).size();
        
        String infoContrato = cliente + "\n" + numContrato + "\n" + cantVisitas;
        JOptionPane.showMessageDialog(null, infoContrato + "\n" + 
                                            unDeposito.toString(), 
                                    "Info. Depósito alquilado", JOptionPane.PLAIN_MESSAGE);
    }
    
    //Muestra la información del depósito disponible seleccionado.
    private void depoDisponible(Deposito unDeposito){
        JOptionPane.showMessageDialog(null, unDeposito.toString(), 
                                    "Info. Depósito alquilado", JOptionPane.PLAIN_MESSAGE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        panelBotones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        panelBotones.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        panelBotones.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane2.setViewportView(panelBotones);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 500, 250);

        setBounds(0, 0, 582, 324);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelBotones;
    // End of variables declaration//GEN-END:variables
}
