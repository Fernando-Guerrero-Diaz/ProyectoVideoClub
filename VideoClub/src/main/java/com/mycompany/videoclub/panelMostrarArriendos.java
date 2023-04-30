/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.videoclub;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author njorg
 */
public class panelMostrarArriendos extends javax.swing.JPanel {
    private CollectionManager collectionManager;
    DefaultTableModel modelo;
    /**
     * Creates new form panelMostrarArriendos
     */
    public panelMostrarArriendos(CollectionManager mc) {
        initComponents();
        collectionManager = mc;
        modelo = new DefaultTableModel();
        modelo.addColumn("Pelicula");
        modelo.addColumn("Fecha");
        modelo.addColumn("Dias Arriendo");
        modelo.addColumn("Precio Arriendo");
        modelo.addColumn("Estado");
        modelo.addColumn("Dias Atraso");
        tablaArriendos.setModel(modelo);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArriendos = new javax.swing.JTable();
        botonMostrarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fieldRut = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MOSTRAR ARRIENDOS");

        tablaArriendos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Pelicula", "Fecha", "Dias Arriendo", "Precio Arriendo", "Estado", "Dias Atraso"
            }
        ));
        jScrollPane1.setViewportView(tablaArriendos);

        botonMostrarCliente.setText("Buscar Cliente");
        botonMostrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Rut Cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(botonMostrarCliente))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(194, 194, 194)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMostrarCliente)
                    .addComponent(jLabel2))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonMostrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarClienteActionPerformed
        if(fieldRut.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese Un Cliente.", "Error", HEIGHT);
        }
        else{
            Cliente cliente = collectionManager.buscarCliente(Integer.valueOf(fieldRut.getText()));
            if(cliente == null){
                JOptionPane.showMessageDialog(null, "Cliente Inexistente.", "Error", HEIGHT);
            }
            else{
                String[] columnas = new String[6];
                Arriendo arr[] = cliente.ArriendosPendientes(false);
                for(int i = 0;i<arr.length;i++){
                    columnas[0] = arr[i].getPelículaArrendada().getNombre();
                    columnas[1] = arr[i].getFechaArriendo().toString();
                    columnas[2] = String.valueOf(arr[i].getDíasArriendo());
                    columnas[3] = String.valueOf(arr[i].getPrecioArriendo());
                    if (arr[i].getDevuelto()==true){
                        columnas[4] = "Devuelto";
                    }
                    else columnas[4] = "No Devuelto";
                    columnas[5] = String.valueOf(arr[i].getDíasAtraso());
                }
            }
        }
        
        
    }//GEN-LAST:event_botonMostrarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMostrarCliente;
    private javax.swing.JTextField fieldRut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaArriendos;
    // End of variables declaration//GEN-END:variables
}
