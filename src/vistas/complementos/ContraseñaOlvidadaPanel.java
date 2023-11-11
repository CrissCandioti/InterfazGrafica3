/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import vistas.clases.Button;
import vistas.clases.MyTextField;

/**
 *
 * @author criss
 */
public class ContraseñaOlvidadaPanel extends javax.swing.JPanel {

    public ContraseñaOlvidadaPanel() {
        initComponents();
        contraseña();
        contraseñaOlvidada.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contraseñaOlvidada = new javax.swing.JLayeredPane();

        contraseñaOlvidada.setBackground(new java.awt.Color(255, 255, 255));
        contraseñaOlvidada.setOpaque(true);

        javax.swing.GroupLayout contraseñaOlvidadaLayout = new javax.swing.GroupLayout(contraseñaOlvidada);
        contraseñaOlvidada.setLayout(contraseñaOlvidadaLayout);
        contraseñaOlvidadaLayout.setHorizontalGroup(
            contraseñaOlvidadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        contraseñaOlvidadaLayout.setVerticalGroup(
            contraseñaOlvidadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contraseñaOlvidada)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contraseñaOlvidada)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contraseña() {
        contraseñaOlvidada.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]25[]push"));
        JLabel titulo = new JLabel("Recuperacion de cuenta");
        titulo.setFont(new Font("sansserif", 1, 30));
        titulo.setForeground(new Color(7, 164, 121));
        contraseñaOlvidada.add(titulo);
        JLabel ingresar = new JLabel("Ingrese el correo electronico");
        ingresar.setForeground(new Color(7, 164, 121));
        contraseñaOlvidada.add(ingresar);
        MyTextField txtCorreo = new MyTextField();
        txtCorreo.setPrefixIcon(new ImageIcon(getClass().getResource("/vistas/img/mail.png")));
        txtCorreo.setHint("Correo Electronico");
        contraseñaOlvidada.add(txtCorreo, "w 60%");
        Button botonIngresar = new Button();
        botonIngresar.setBackground(new Color(7, 164, 121));
        botonIngresar.setForeground(new Color(250, 250, 250));
        botonIngresar.setText("Enviar");
        botonIngresar.setFocusPainted(false);
        contraseñaOlvidada.add(botonIngresar, "w 40%, h 40");
        Button cierre = new Button();
        cierre.setBackground(new Color(7, 164, 121));
        cierre.setForeground(new Color(250, 250, 250));
        cierre.setText("Salir");
        cierre.setFocusPainted(false);
        contraseñaOlvidada.add(cierre, "w 15%, h 15");
        cierre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(ContraseñaOlvidadaPanel.this).dispose();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane contraseñaOlvidada;
    // End of variables declaration//GEN-END:variables
}
