/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.complementos;

import net.miginfocom.swing.MigLayout;

/**
 *
 * @author criss
 */
public class ContraseñaOlvidada extends javax.swing.JFrame {

    private MigLayout Layout;
    private ContraseñaOlvidadaPanel ContraseñaOlvidadaPanel;
    private final double ContraseñaOlvidadaPanelSize = 100;

    public ContraseñaOlvidada() {
        initComponents();
        init();
        pass.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout passLayout = new javax.swing.GroupLayout(pass);
        pass.setLayout(passLayout);
        passLayout.setHorizontalGroup(
            passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        passLayout.setVerticalGroup(
            passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pass)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pass)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void init() {
        Layout = new MigLayout("fill, insets 0");
        pass.setLayout(Layout);
        ContraseñaOlvidadaPanel = new ContraseñaOlvidadaPanel();
        pass.add(ContraseñaOlvidadaPanel, "width " + ContraseñaOlvidadaPanelSize + "%, pos 1al 0 n 100%");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane pass;
    // End of variables declaration//GEN-END:variables
}
