package interfaz;

import dominio.Sistema;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Mateo
 */
public class infoGrafica extends javax.swing.JFrame {

    private Sistema sist;
    
    public infoGrafica(Sistema unSistema) {
        initComponents();
        sist = unSistema;
        cargarGrafica();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGrafica = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadísticas de ocupación");

        javax.swing.GroupLayout pnlGraficaLayout = new javax.swing.GroupLayout(pnlGrafica);
        pnlGrafica.setLayout(pnlGraficaLayout);
        pnlGraficaLayout.setHorizontalGroup(
            pnlGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlGraficaLayout.setVerticalGroup(
            pnlGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(pnlGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(pnlGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        setBounds(0, 0, 524, 282);
    }// </editor-fold>//GEN-END:initComponents

    private void cargarGrafica(){
        int cantSiSi = 3; 
        int cantSiNo = 2;  
        int cantNoNo = 5;
        int cantNoSi = 1;
        
        int total = cantSiSi + cantSiNo + cantNoNo + cantNoSi;
        
        // Asignamos valores y nombres a los datos de la gráfica
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Refrigerados Con Estantes: " + cantSiSi, cantSiSi);
        datos.setValue("Refrigerados Sin Estantes: " + cantSiNo, cantSiNo);
        datos.setValue("No Refrigerados Sin Estantes: " + cantNoNo, cantNoNo);
        datos.setValue("No Refrigerados Con Estantes: " + cantNoSi, cantNoSi);
        
        JFreeChart grafico_circular = ChartFactory.createPieChart("Depósitos alquilados: " + total, datos, false, true, false);
        
        ChartPanel panel = new ChartPanel(grafico_circular);
        panel.setPreferredSize(new Dimension(400, 200));
        
        // Asignamos grafica a panel
        pnlGrafica.setLayout(new BorderLayout());
        pnlGrafica.add(panel,BorderLayout.NORTH);
        
        repaint();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlGrafica;
    // End of variables declaration//GEN-END:variables
}
