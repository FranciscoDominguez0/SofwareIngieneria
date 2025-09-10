/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.PanelAdminn;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author domin
 */
// contrador colores
public class ControladorColores implements MouseListener {

    PanelAdminn panel;
    private final Set<Component> panelesDashboard;
    private Component panelSeleccionado = null;
    private final Color COLOR_HOVER = new Color(0, 144, 153);
    private final Color COLOR_NORMAL = new Color(40, 51, 66);

    public ControladorColores(PanelAdminn panel) {
        this.panel = panel;
        panelesDashboard = Set.of(
          
                panel.btnDasboard1,
                panel.btnDasboard2,
                panel.btnDasboard4,
                panel.btnDasboard5,
                panel.btnDasboard6,
                panel.btnDasboard7,
                panel.btnDasboard8
              
               
              
        );

        for (Component panelItem : panelesDashboard) {
            panelItem.addMouseListener(this);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Component clicado = e.getComponent();
        // Restaurar todos los paneles al color normal
        for (Component panelItem : panelesDashboard) {
            panelItem.setBackground(COLOR_NORMAL);
        }
        // Marcar el nuevo panel como seleccionado
        clicado.setBackground(COLOR_HOVER);
        panelSeleccionado = clicado;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Component hovered = e.getComponent();
        // Solo cambiar color si no es el panel seleccionado
        if (panelesDashboard.contains(hovered) && hovered != panelSeleccionado) {
            hovered.setBackground(COLOR_HOVER);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Component exited = e.getComponent();
        // Solo restaurar color si no es el panel seleccionado
        if (panelesDashboard.contains(exited) && exited != panelSeleccionado) {
            exited.setBackground(COLOR_NORMAL);
        }
    }

}
