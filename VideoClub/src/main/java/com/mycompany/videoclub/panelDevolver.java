/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.videoclub;

import javax.swing.JOptionPane;

/**
 *
 * @author njorg
 */
public class panelDevolver extends javax.swing.JPanel {
    private CollectionManager collectionManager;
    /**
     * Creates new form panelDevolver
     */
    public panelDevolver(CollectionManager mc) {
        initComponents();
        collectionManager = mc;
    }
    public void fillComboBox(Cliente cliente){
        try{
        comboBoxArriendosPendientes.removeAllItems();
        Arriendo arr[] = cliente.arriendosPendientes(true);
        for(int i=0; i<arr.length;i++){
            comboBoxArriendosPendientes.addItem(arr[i].getPelículaArrendada().getNombre());
        }
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No existen Arriendos sin devolver.", "Error", HEIGHT);
            }
        
           
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonBuscarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldRutCliente = new javax.swing.JTextField();
        comboBoxArriendosPendientes = new javax.swing.JComboBox<>();
        botonDevolver = new javax.swing.JButton();

        botonBuscarCliente.setText("Buscar Cliente");
        botonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DEVOLVER ARRIENDO");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Ingrese Rut Cliente:");

        botonDevolver.setText("Devolver");
        botonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDevolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(210, 210, 210))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(fieldRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBoxArriendosPendientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(66, 66, 66)
                .addComponent(botonBuscarCliente)
                .addGap(44, 44, 44)
                .addComponent(comboBoxArriendosPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(botonDevolver)
                .addGap(148, 148, 148))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarClienteActionPerformed
        try{
            Cliente cliente = collectionManager.buscarCliente(Integer.valueOf(fieldRutCliente.getText()));
            if (cliente == null){
                JOptionPane.showMessageDialog(null, "Cliente Inexistente.", "Error", HEIGHT);
            }
            else fillComboBox(cliente);
        }
        catch(ClienteNotFoundException e){
                JOptionPane.showMessageDialog(null, "Cliente Inexistente.", "Error", HEIGHT);
            }
        

    }//GEN-LAST:event_botonBuscarClienteActionPerformed

    private void botonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDevolverActionPerformed
        try{
            if(comboBoxArriendosPendientes.getSelectedItem()==null){
            JOptionPane.showMessageDialog(null, "No Hay Arriendos Seleccionados.", "Error", HEIGHT);
            }
            else {
                int index = comboBoxArriendosPendientes.getSelectedIndex();
                collectionManager.buscarCliente(Integer.valueOf(fieldRutCliente.getText())).arriendosPendientes(true)[index].devolver();
            }
        }
        catch(ClienteNotFoundException e){
                JOptionPane.showMessageDialog(null, "Cliente Inexistente.", "Error", HEIGHT);
            }
        
    }//GEN-LAST:event_botonDevolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarCliente;
    private javax.swing.JButton botonDevolver;
    private javax.swing.JComboBox<String> comboBoxArriendosPendientes;
    private javax.swing.JTextField fieldRutCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
