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
public class ControladorColores implements MouseListener{
    
    PanelAdminn panel;
    private final Set<Component> botonesDashboard;
    private Component botonSeleccionado = null;
       private final Color COLOR_HOVER = new Color(0, 144, 153);
    private final Color COLOR_NORMAL = new Color(40, 51, 66);

    public ControladorColores(PanelAdminn panel) {
        this.panel = panel;
         botonesDashboard = Set.of(
            panel.btnDasboard,
            panel.btnDasboard1,
            panel.btnDasboard2,
            panel.btnDasboard5,
            panel.btnDasboard6,
            panel.btnDasboard7,
            panel.btnDasboard8
        );

        // Añadir listener a todos los botones
        for (Component boton : botonesDashboard) {
            boton.addMouseListener(this);
        }
        
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        Component clicado = e.getComponent();

        // Restaurar todos los botones al color normal
        for (Component boton : botonesDashboard) {
            boton.setBackground(COLOR_NORMAL);
        }

        // Marcar el nuevo botón como seleccionado
        clicado.setBackground(COLOR_HOVER);
        botonSeleccionado = clicado;
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

        // Solo cambiar color si no es el botón seleccionado
        if (botonesDashboard.contains(hovered) && hovered != botonSeleccionado) {
            hovered.setBackground(COLOR_HOVER);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
         Component exited = e.getComponent();

        // Solo restaurar color si no es el botón seleccionado
        if (botonesDashboard.contains(exited) && exited != botonSeleccionado) {
            exited.setBackground(COLOR_NORMAL);
        }
    }
    
}
