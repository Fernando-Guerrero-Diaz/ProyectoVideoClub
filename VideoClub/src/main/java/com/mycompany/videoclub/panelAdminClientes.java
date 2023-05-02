/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.videoclub;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

/**
 *
 * @author njorg
 */
public class panelAdminClientes extends javax.swing.JPanel {
    private CollectionManager collectionManager;
    /**
     * Creates new form panelAdminClientes
     */
    public panelAdminClientes(CollectionManager mc) {
        initComponents();
        collectionManager = mc;
        fieldCupones.setVisible(false);
        cuponesLabel.setVisible(false);
        labelCant.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldRut = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        fieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldMail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldCupones = new javax.swing.JTextField();
        cuponesLabel = new javax.swing.JLabel();
        botonModificar = new javax.swing.JButton();
        labelCant = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ADMINISTRACIÓN CLIENTES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Rut Cliente:");

        botonBuscar.setText("Buscar Cliente");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre Cliente:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mail Cliente:");

        cuponesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cuponesLabel.setText("Agregar Cupones");

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        labelCant.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCant.setText("Cantidad Cupones:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(cuponesLabel))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldNombre)
                                    .addComponent(fieldRut)
                                    .addComponent(fieldMail, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(fieldCupones, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                            .addComponent(labelCant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuponesLabel)
                    .addComponent(fieldCupones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(labelCant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(botonModificar)
                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        Cliente cliente = collectionManager.buscarCliente(Integer.valueOf(fieldRut.getText()));
        if(cliente==null){
            JOptionPane.showMessageDialog(null, "Cliente Inexistente.", "Error", HEIGHT);
        }
        else{
            if (cliente instanceof ClientePremium ){
                fieldCupones.setVisible(true);
                cuponesLabel.setVisible(true);
                labelCant.setVisible(true);
                labelCant.setText("Cantidad Cupones:    " + String.valueOf(cliente.getCantcupones()));
                fieldCupones.setText("0");
                fieldNombre.setText(cliente.getNombre());
                fieldMail.setText(cliente.getEmail());
            }
            else{
                fieldNombre.setText(cliente.getNombre());
                fieldMail.setText(cliente.getEmail());
            }
        }
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        collectionManager.buscarCliente(Integer.valueOf(fieldRut.getText())).setEmail(fieldMail.getText());
        collectionManager.buscarCliente(Integer.valueOf(fieldRut.getText())).setNombre(fieldNombre.getText());
        if(collectionManager.buscarCliente(Integer.valueOf(fieldRut.getText())) instanceof ClientePremium){
            collectionManager.buscarCliente(Integer.valueOf(fieldRut.getText())).agregarCupones(Integer.valueOf(fieldCupones.getText()));
        }
    }//GEN-LAST:event_botonModificarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JLabel cuponesLabel;
    private javax.swing.JTextField fieldCupones;
    private javax.swing.JTextField fieldMail;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldRut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelCant;
    // End of variables declaration//GEN-END:variables
}
