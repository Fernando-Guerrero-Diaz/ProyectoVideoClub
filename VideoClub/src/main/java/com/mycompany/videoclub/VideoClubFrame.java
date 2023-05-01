/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.videoclub;

import java.awt.BorderLayout;

/**
 *
 * @author Sulfu
 */
public class VideoClubFrame extends javax.swing.JFrame {

    /**
     * Creates new form VideoClubFrame
     */
    public VideoClubFrame(CollectionManager cm) {
        initComponents();
        collectionManager = cm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonHome = new javax.swing.JButton();
        panelVacio = new javax.swing.JPanel();
        panelMenuPrincipal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        botonCliente = new javax.swing.JButton();
        botonArriendos = new javax.swing.JButton();
        botonGuardarYSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonHome.setText("HOME");
        botonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHomeActionPerformed(evt);
            }
        });

        jButton1.setText("PELICULAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonCliente.setText("CLIENTES");
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
            }
        });

        botonArriendos.setText("ARRIENDOS");
        botonArriendos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArriendosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuPrincipalLayout = new javax.swing.GroupLayout(panelMenuPrincipal);
        panelMenuPrincipal.setLayout(panelMenuPrincipalLayout);
        panelMenuPrincipalLayout.setHorizontalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonArriendos)
                    .addComponent(botonCliente)
                    .addComponent(jButton1))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        panelMenuPrincipalLayout.setVerticalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButton1)
                .addGap(117, 117, 117)
                .addComponent(botonCliente)
                .addGap(86, 86, 86)
                .addComponent(botonArriendos)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelVacioLayout = new javax.swing.GroupLayout(panelVacio);
        panelVacio.setLayout(panelVacioLayout);
        panelVacioLayout.setHorizontalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVacioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelVacioLayout.setVerticalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVacioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        botonGuardarYSalir.setText("GUARDAR Y SALIR");
        botonGuardarYSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarYSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(botonHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                .addComponent(botonGuardarYSalir)
                .addGap(71, 71, 71))
            .addComponent(panelVacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelVacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonHome)
                    .addComponent(botonGuardarYSalir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHomeActionPerformed
        panelVacio.removeAll();
        panelVacio.add(panelMenuPrincipal,BorderLayout.CENTER);
        panelVacio.revalidate();
        panelVacio.repaint();
    }//GEN-LAST:event_botonHomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelPelículas panelPeliculas = new PanelPelículas(collectionManager);
        panelPeliculas.setSize(800,514);
        panelPeliculas.setLocation(0,0);
        panelVacio.removeAll();
        panelVacio.add(panelPeliculas,BorderLayout.CENTER);
        panelVacio.revalidate();
        panelVacio.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonArriendosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArriendosActionPerformed
        panelMenuArriendos panelArriendo = new panelMenuArriendos(collectionManager);
        panelArriendo.setSize(800,514);
        panelArriendo.setLocation(0,0);
        panelVacio.removeAll();
        panelVacio.add(panelArriendo,BorderLayout.CENTER);
        panelVacio.revalidate();
        panelVacio.repaint();
    }//GEN-LAST:event_botonArriendosActionPerformed

    private void botonGuardarYSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarYSalirActionPerformed
        collectionManager.escrituraEnCSV();
        this.dispose();
    }//GEN-LAST:event_botonGuardarYSalirActionPerformed

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        panelClientes panelCliente = new panelClientes(collectionManager);
        panelCliente.setSize(800,514);
        panelCliente.setLocation(0,0);
        panelVacio.removeAll();
        panelVacio.add(panelCliente,BorderLayout.CENTER);
        panelVacio.revalidate();
        panelVacio.repaint();
    }//GEN-LAST:event_botonClienteActionPerformed

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
            java.util.logging.Logger.getLogger(VideoClubFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoClubFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoClubFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoClubFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CollectionManager cm = new CollectionManager();
                new VideoClubFrame(cm).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonArriendos;
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonGuardarYSalir;
    private javax.swing.JButton botonHome;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JPanel panelVacio;
    // End of variables declaration//GEN-END:variables
    private CollectionManager collectionManager;
}
