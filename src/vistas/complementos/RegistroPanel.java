/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import vistas.clases.Button;
import vistas.clases.ModeloEmail;
import vistas.clases.MyPasswordField;
import vistas.clases.MyTextField;

/**
 *
 * @author criss
 */
public class RegistroPanel extends javax.swing.JPanel {

    /**
     * @return the modeloCorreoElectronico
     */
    public ModeloEmail getModeloCorreoElectronico() {
        return modeloCorreoElectronico;
    }

    private ModeloEmail modeloCorreoElectronico;

    public RegistroPanel(ActionListener eventoPantallaCarga) {
        initComponents();
        setOpaque(false);
        inicioSecion(eventoPantallaCarga);
        Inicio.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new javax.swing.JLayeredPane();

        Inicio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio)
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint gra = new GradientPaint(0, 0, new Color(35, 166, 97), 0, getHeight(), new Color(22, 116, 66));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

    private void inicioSecion(ActionListener eventoPantallaCarga) {
        Inicio.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel JLabel1 = new JLabel("Crear Cuenta");
        JLabel1.setFont(new Font("sansserif", 1, 30));
        JLabel1.setForeground(new Color(245, 245, 245));
        Inicio.add(JLabel1);
        MyTextField txtUsuario = new MyTextField();
        txtUsuario.setPrefixIcon(new ImageIcon(getClass().getResource("/vistas/img//user.png")));
        txtUsuario.setHint("Nombre");
        Inicio.add(txtUsuario, "w 60%");
        MyTextField txtCorreo = new MyTextField();
        txtCorreo.setPrefixIcon(new ImageIcon(getClass().getResource("/vistas/img/mail.png")));
        txtCorreo.setHint("Correo Electronico");
        Inicio.add(txtCorreo, "w 60%");
        MyPasswordField txtContraseña = new MyPasswordField();
        txtContraseña.setPrefixIcon(new ImageIcon(getClass().getResource("/vistas/img/pass.png")));
        txtContraseña.setHint("Contraseña");
        Inicio.add(txtContraseña, "w 60%");
        Button botonRegistro = new Button();
        botonRegistro.setBackground(new Color(7, 164, 121));
        botonRegistro.setForeground(new Color(250, 250, 250));
        botonRegistro.addActionListener(eventoPantallaCarga);
        botonRegistro.setText("Registrarse");
        botonRegistro.setFocusPainted(false);
        Inicio.add(botonRegistro, "w 40%, h 40");
        botonRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtUsuario.getText().trim();
                String correoElectronico = txtCorreo.getText().trim();
                String contraseña = String.valueOf(txtContraseña.getPassword());
                modeloCorreoElectronico = new ModeloEmail(nombre, correoElectronico, contraseña);
            }
        });
        Button cierre = new Button();
        cierre.setBackground(new Color(7, 164, 121));
        cierre.setForeground(new Color(250, 250, 250));
        cierre.setText("Salir");
        cierre.setFocusPainted(false);
        Inicio.add(cierre, "w 15%, h 15");
        cierre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(RegistroPanel.this).dispose();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Inicio;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the modeloCorreoElectronico
     */
}
