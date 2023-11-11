/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.complementos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import vistas.clases.Button;
import vistas.clases.MyPasswordField;
import vistas.clases.MyTextField;

public class JPanelDerecha extends javax.swing.JPanel {

    private ContraseñaOlvidada Frame;

    public JPanelDerecha() {
        initComponents();
        iniciSecion();//Llamamos a nuestro metodo
        Registro.setVisible(true);//Hacemos visible lo que se muestra en el panel izquierdo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JLayeredPane();

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setOpaque(true);

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registro)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registro)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * "Inicio" es un JLareyedPanel que se ubico y renombro para utilizarse.
     * JLayeredPane, puedes controlar cómo se superponen y se ordenan los
     * componentes en tu interfaz gráfica. Esto es útil en situaciones donde
     * necesitas controlar visualmente qué componente está en la parte superior
     * y cuál está en la parte inferior.
     */
    private void iniciSecion() {
        Registro.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel titulo = new JLabel("Inicia Secion");
        titulo.setFont(new Font("sansserif", 1, 30));
        titulo.setForeground(new Color(7, 164, 121));
        Registro.add(titulo);
        MyTextField txtCorreo = new MyTextField();
        txtCorreo.setPrefixIcon(new ImageIcon(getClass().getResource("/vistas/img/mail.png")));
        txtCorreo.setHint("Correo Electronico");
        Registro.add(txtCorreo, "w 60%");
        MyPasswordField txtContraseña = new MyPasswordField();
        txtContraseña.setPrefixIcon(new ImageIcon(getClass().getResource("/vistas/img/pass.png")));
        txtContraseña.setHint("Contraseña");
        Registro.add(txtContraseña, "w 60%");
        JButton botonContraseñaOlvidada = new JButton("¿Olvidaste tu contraseña?");
        botonContraseñaOlvidada.setForeground(new Color(100, 100, 100));
        botonContraseñaOlvidada.setFont(new Font("sansserif", 1, 12));
        botonContraseñaOlvidada.setContentAreaFilled(false);
        botonContraseñaOlvidada.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botonContraseñaOlvidada.setFocusPainted(false);
        botonContraseñaOlvidada.setBorderPainted(false);
        Registro.add(botonContraseñaOlvidada);
        botonContraseñaOlvidada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Frame == null || !Frame.isVisible()) {
                    Frame = new ContraseñaOlvidada();
                    Frame.setSize(500, 400);
                    Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    Frame.setVisible(true);
                    Frame.setLocationRelativeTo(null);;
                } else {
                    Frame.toFront();
                }
            }
        });
        Button botonIngresar = new Button();
        botonIngresar.setBackground(new Color(7, 164, 121));
        botonIngresar.setForeground(new Color(250, 250, 250));
        botonIngresar.setText("Ingresar");
        botonIngresar.setFocusPainted(false);
        Registro.add(botonIngresar, "w 40%, h 40");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Registro;
    // End of variables declaration//GEN-END:variables
}
