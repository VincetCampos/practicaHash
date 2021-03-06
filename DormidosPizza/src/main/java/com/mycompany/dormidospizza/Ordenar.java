/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dormidospizza;

import Clases.Pizza;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC1
 */
public class Ordenar extends javax.swing.JFrame {
    
    public String SucursalPedido;
    public String Pedidopizza;
    ArrayList<Pizza> listapizzas;
    DefaultTableModel mitabla2;
    
    public void setListapizzas(ArrayList<Pizza> lpizzas){
        this.listapizzas = lpizzas;
    }
    private String getSucursal(){
        var selectedItem = CmbSucursal.getSelectedItem();
        if(selectedItem == null){
            return "";
        }
        return selectedItem.toString();
        
    }
    private String getNombrePizza(){
        var selectedItem = cmbPizzas.getSelectedItem();
        if(selectedItem == null){
            return "";
        }
        return selectedItem.toString();
        
    }
    private void Actualizarlistapizza(){
        SucursalPedido = getSucursal();
        cmbPizzas.removeAllItems();
//        System.out.println(SucursalPedido);
        if(listapizzas != null){
            for (Pizza mipizza : listapizzas) {
//                System.out.println(mipizza.getNombre());
//                System.out.println(mipizza.getSucursal());
                if(mipizza.getSucursal().equals(SucursalPedido)){
                    cmbPizzas.addItem(mipizza.getNombre());
                }
            }
            
        }
        
        
    }
    private void SeleccionarPizza(){
        
        txtareaDescripcion.setText("");
        
        LabelPrecio.setText("");
        
        Pedidopizza = getNombrePizza();
        if(CmbSucursal != null){
            //System.out.println(Pedidopizza);
            for(Pizza mipizza : listapizzas){
//                System.out.println(mipizza.getNombre());
//                System.out.println(mipizza.getPrecio());
//                System.out.println(mipizza.getDescripcion());
                if(mipizza.getNombre().equals(Pedidopizza)){
                    txtareaDescripcion.setText(mipizza.getDescripcion());
                    LabelPrecio.setText(mipizza.getPrecio());
                }
            }
        }    
    }
    
    private void Ordenarpizza(){
      
        for (Pizza mipizza : listapizzas) {
            if(mipizza.getSucursal().equals(getSucursal())
                    && mipizza.getNombre().equals(getNombrePizza())){
                String[] nuevaFila = new String[] {String.valueOf(mitabla2.getRowCount()+1),
                    mipizza.getNombre(),
                    mipizza.getDescripcion(),
                    mipizza.getSucursal()
                };
                mitabla2.addRow(nuevaFila);
                
            }
                
        }
        
        
        
    }
    
    
    /**
     * Creates new form Ordenar
     */
    public Ordenar() {
        initComponents();
        mitabla2 = new DefaultTableModel();
        mitabla2.addColumn("No");
        mitabla2.addColumn("Nombre");
        mitabla2.addColumn("Descripcion");
        mitabla2.addColumn("Sucursal");
        tbOrdenes.setModel(mitabla2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CmbSucursal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbPizzas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaDescripcion = new javax.swing.JTextArea();
        LabelPrecio = new javax.swing.JLabel();
        btxOrdenarPizza = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbOrdenes = new javax.swing.JTable();
        btnVolverdeOrden = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ordenes");

        jLabel2.setText("Sucursal:");

        CmbSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guatemala", "El Progreso", "Jalapa" }));
        CmbSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbSucursalActionPerformed(evt);
            }
        });
        CmbSucursal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CmbSucursalPropertyChange(evt);
            }
        });

        jLabel3.setText("Pizza:");

        cmbPizzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPizzasActionPerformed(evt);
            }
        });

        jLabel4.setText("Descripcion:");

        txtareaDescripcion.setColumns(20);
        txtareaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtareaDescripcion);

        LabelPrecio.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        LabelPrecio.setText("0");

        btxOrdenarPizza.setText("Ordenar");
        btxOrdenarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxOrdenarPizzaActionPerformed(evt);
            }
        });

        tbOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nombre", "Descripcion", "Sucursal"
            }
        ));
        jScrollPane3.setViewportView(tbOrdenes);

        btnVolverdeOrden.setText("Volver al menu principal");
        btnVolverdeOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverdeOrdenActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel6.setText("Q.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbPizzas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolverdeOrden)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LabelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btxOrdenarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CmbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cmbPizzas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(LabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btxOrdenarPizza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolverdeOrden)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverdeOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverdeOrdenActionPerformed
        VentanaPrincipal.Inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverdeOrdenActionPerformed

    private void CmbSucursalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CmbSucursalPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CmbSucursalPropertyChange

    private void btxOrdenarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxOrdenarPizzaActionPerformed
        // TODO add your handling code here:
        Ordenarpizza();
    }//GEN-LAST:event_btxOrdenarPizzaActionPerformed

    private void CmbSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbSucursalActionPerformed
        // TODO add your handling code here:
       Actualizarlistapizza();
    }//GEN-LAST:event_CmbSucursalActionPerformed

    private void cmbPizzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPizzasActionPerformed
        // TODO add your handling code here:
        SeleccionarPizza();
    }//GEN-LAST:event_cmbPizzasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ordenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordenar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbSucursal;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JButton btnVolverdeOrden;
    private javax.swing.JButton btxOrdenarPizza;
    private javax.swing.JComboBox<String> cmbPizzas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbOrdenes;
    private javax.swing.JTextArea txtareaDescripcion;
    // End of variables declaration//GEN-END:variables
}
