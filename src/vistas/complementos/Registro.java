/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.complementos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLayeredPane;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import vistas.clases.ModeloEmail;

/**
 *
 * @author criss
 */
public class Registro extends javax.swing.JFrame {

    private MigLayout Layout;
    private RegistroPanel panel;
    private PantallaCarga pantallaDeCargaRegistro;
    private VerificarCodigo panelVerificarCodigo;
    private final double PanelSize = 100;

    public Registro() {
        initComponents();
        inicioPanel();
        Inicio.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Inicio.setBackground(new java.awt.Color(255, 255, 255));
        Inicio.setOpaque(true);

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void inicioPanel() {
        Layout = new MigLayout("fill, insets 0");
        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModeloEmail usuario = panel.getModeloCorreoElectronico();
//pantallaDeCargaRegistro.setVisible(true);
//                panelVerificarCodigo.setVisible(true);
                System.out.println("correo "+usuario.getCorreo());
            }
        };
        panel = new RegistroPanel(evento);
        panelVerificarCodigo = new VerificarCodigo();
        pantallaDeCargaRegistro = new PantallaCarga();
        Animator animator = new Animator(1000);
        Inicio.setLayout(Layout);
        Inicio.setLayer(pantallaDeCargaRegistro, JLayeredPane.POPUP_LAYER);
        Inicio.setLayer(panelVerificarCodigo, JLayeredPane.POPUP_LAYER);
        Inicio.add(pantallaDeCargaRegistro, "pos 0 0 100% 100%");
        Inicio.add(panelVerificarCodigo, "pos 0 0 100% 100%");
        Inicio.add(panel, "width " + PanelSize + "%, pos 0al 0 n 100%");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Inicio;
    // End of variables declaration//GEN-END:variables
}
