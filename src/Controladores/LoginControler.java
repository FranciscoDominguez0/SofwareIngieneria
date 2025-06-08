package Controladores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Modelos.Usuarios;
import Modelos.UsuariosConsulta;
import Vistas.JframeLogin;
import Vistas.PanelAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class LoginControler implements ActionListener{
     private Usuarios us;
    private UsuariosConsulta usDao;
    private JframeLogin views;

 

    public LoginControler(Usuarios us, UsuariosConsulta usDao, JframeLogin views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
       
        this.views.btnLogin.addActionListener(this);
        this.views.btnCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnLogin) {
            if (views.txtusuario.getText().equals("") || 
                String.valueOf(views.txtClave.getPassword()).equals("")) {

                JOptionPane.showMessageDialog(null, "Los campos están vacíos");

            } else {
                String usuario = views.txtusuario.getText();
                String clave = String.valueOf(views.txtClave.getPassword());
                us = usDao.login(usuario, clave);

                if (us.getUsuario() != null) {
                    // Aplicar Look and Feel Nimbus
                    try {
                        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                    } catch (Exception ex) {
                        System.out.println("No se pudo aplicar Nimbus");
                    }

                    // Abrir PanelAdmin maximizado
                    PanelAdmin admin = new PanelAdmin();
                    admin.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizar pantalla
                    admin.setVisible(true);
                    this.views.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos");
                }
            }
        }
    }


    
}
