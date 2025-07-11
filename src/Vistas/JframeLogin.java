/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controladores.LoginControler;
import Modelos.Usuarios;
import Modelos.UsuariosConsulta;
import Modelos.textoSombra;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author domin
 */
public class JframeLogin extends javax.swing.JFrame {

    Usuarios us = new Usuarios();
    UsuariosConsulta usdao = new UsuariosConsulta();
    Register register = new Register();

    public JframeLogin() {
        initComponents();
         txtusuario.setOpaque(false);
         txtClave.setOpaque(false);
         textoSombra usuario = new textoSombra("Usuario", txtusuario);
         textoSombra clave = new textoSombra("Contraseña", txtClave);
      
        
    this.pack(); // Ajusta tamaño al contenido
    this.setLocationRelativeTo(null); // Centra en pantalla

 
        LoginControler login = new LoginControler(us, usdao, this);

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        checkRecodar = new javax.swing.JCheckBox();
        loginLoader = new javax.swing.JProgressBar();
        btnregistro = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkRecodar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkRecodar.setForeground(new java.awt.Color(150, 150, 150));
        checkRecodar.setText("Recuérdame");
        checkRecodar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        checkRecodar.setBorderPainted(true);
        checkRecodar.setContentAreaFilled(false);
        checkRecodar.setFocusPainted(false);
        jPanel4.add(checkRecodar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        loginLoader.setBackground(new java.awt.Color(242, 243, 244));
        loginLoader.setForeground(new java.awt.Color(59, 140, 237));
        jPanel4.add(loginLoader, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 140, 0));

        btnregistro.setBackground(new java.awt.Color(255, 255, 255));
        btnregistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnregistro.setForeground(new java.awt.Color(102, 102, 102));
        btnregistro.setText("Registrar nueva cuenta");
        btnregistro.setBorder(null);
        btnregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistroActionPerformed(evt);
            }
        });
        jPanel4.add(btnregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, -1));

        txtusuario.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(30, 30, 30));
        txtusuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtusuario.setToolTipText("Ingrese su nombre de usuario");
        txtusuario.setBorder(null);
        txtusuario.setOpaque(true);
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel4.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 340, 40));

        txtClave.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClave.setForeground(new java.awt.Color(0, 0, 0));
        txtClave.setToolTipText("Ingrese su contraseña");
        txtClave.setBorder(null);
        txtClave.setInheritsPopupMenu(true);
        txtClave.setOpaque(true);
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        jPanel4.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 340, 40));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Frame 10_1.png"))); // NOI18N
        btnLogin.setAutoscrolls(true);
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin.setFocusPainted(false);
        btnLogin.setOpaque(true);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 350, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Frame 4_1.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 440, 580));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Iniciar sesión ");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 255));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 300, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 20, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mail.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 30));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 255));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 255));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 300, 20));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Por favor, introduce tus credenciales");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroActionPerformed
        
        
        register.setLogin(this);
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        // ocultar la ventana 
        this.setVisible(false);
        
        // para volver abrir 
        // this.setVisible(true);  
        
        
        /*
        Configurar que al cerrar registro no cierre toda la app
        register.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.dispose(); // Cierra login
        */
      
    }//GEN-LAST:event_btnregistroActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
     txtClave.requestFocus();
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLogin;
    public javax.swing.JButton btnregistro;
    private javax.swing.JCheckBox checkRecodar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JProgressBar loginLoader;
    public javax.swing.JPasswordField txtClave;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
