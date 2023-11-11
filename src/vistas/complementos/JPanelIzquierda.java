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
import javax.swing.JFrame;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import vistas.clases.Button;

public class JPanelIzquierda extends javax.swing.JPanel {
    
    private Registro Frame;
    
    public JPanelIzquierda() {
        initComponents();
        setOpaque(false);
        inicioSecion();//Llamamos a nuestro metodo
        Novedades.setVisible(true);//Hacemos visible lo que se muestra en el panel izquierdo
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Novedades = new javax.swing.JLayeredPane();

        javax.swing.GroupLayout NovedadesLayout = new javax.swing.GroupLayout(Novedades);
        Novedades.setLayout(NovedadesLayout);
        NovedadesLayout.setHorizontalGroup(
            NovedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        NovedadesLayout.setVerticalGroup(
            NovedadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Novedades)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Novedades)
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
    
    private void inicioSecion() {
        Novedades.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]25[]25[]push"));
        JLabel Titulo = new JLabel("¿Aun no tienes tu cuenta?");
        Titulo.setFont(new Font("sansserif", 1, 17));
        Titulo.setForeground(new Color(245, 245, 245));
        Novedades.add(Titulo);
        JLabel descripcion = new JLabel("Registrate de forma gratuita y segura");
        descripcion.setForeground(new Color(245, 245, 245));
        Novedades.add(descripcion);
        JLabel descripcion2 = new JLabel("Haz click en el siguiente boton para realizarlo");
        descripcion2.setForeground(new Color(245, 245, 245));
        Novedades.add(descripcion2);
        Button botonRegistro = new Button();
        botonRegistro.setBackground(new Color(7, 164, 121));
        botonRegistro.setForeground(new Color(250, 250, 250));
        botonRegistro.setText("Registrarse");
        botonRegistro.setFocusPainted(false);
        Novedades.add(botonRegistro, "w 40%, h 40");
        botonRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Frame == null || !Frame.isVisible()) {
                    Frame = new Registro();
                    Frame.setSize(500, 400);
                    Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    Frame.setVisible(true);
                    Frame.setLocationRelativeTo(null);;
                } else {
                    Frame.toFront();
                }
            }
        });  
        Button salir = new Button();
        salir.setBackground(new Color(7, 164, 121));
        salir.setForeground(new Color(250, 250, 250));
        salir.setText("Salir");
        salir.setFocusPainted(false);
        Novedades.add(salir, "w 20%, h 20");
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Novedades;
    // End of variables declaration//GEN-END:variables
}
