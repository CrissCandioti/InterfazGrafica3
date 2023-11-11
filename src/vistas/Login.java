/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import net.miginfocom.swing.MigLayout;
import vistas.complementos.JPanelDerecha;
import vistas.complementos.JPanelIzquierda;

/**
 *
 * @author criss
 */
public class Login extends javax.swing.JFrame {

    //Atributos
    private MigLayout Layout;
    private JPanelIzquierda JPanelIzquierda;
    private JPanelDerecha JPanelDerecha;
    private final double JPanelIzquierdaSize = 40;//Medidas de ubicacion del JJPanelIzquierda
    private final double JPanelDerechaSize = 60;//Medidas de ubicacion del JJPanelIzquierda

    //Constructor
    public Login() {
        initComponents();
        inicio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setOpaque(true);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodos
    public void inicio() {
        Layout = new MigLayout("fill, insets 0");
        JPanelIzquierda = new JPanelIzquierda();//Hacemos nacer nuestros JPanel para poder mostrarlo en nuestro JFrame
        JPanelDerecha = new JPanelDerecha();
        Principal.setLayout(Layout); //Principal se llama a nuestro JLayaredPanel que esta ubicado en nuestro JFrame
        Principal.add(JPanelIzquierda, "width " + JPanelIzquierdaSize + "%, pos 0al 0 n 100%");//Agregamos el JPanelIzquierdo a nuestro JFrame
        Principal.add(JPanelDerecha, "width " + JPanelDerechaSize + "%, pos 1al 0 n 100%");//Agregamos el JPanelDerecho a nuestro JFrame
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Principal;
    // End of variables declaration//GEN-END:variables
}
