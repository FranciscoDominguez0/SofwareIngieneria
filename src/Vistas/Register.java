/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controladores.ControladorRegistro;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class Register extends javax.swing.JFrame {
    
    private JframeLogin login;

    
    public Register() {
        initComponents();
         inicializarControlador();
        
        configurarPlaceholders();
       
        javax.swing.SwingUtilities.invokeLater(() -> {
            jPanel1.requestFocusInWindow();
        });
    }

    private void inicializarControlador() {
    ControladorRegistro sc = new ControladorRegistro(
        txtNombre,
        txtApellido,
        txtCorreo,
        txtUsuario,
        jPasswordFieldContrasena,
        btnRegistro 
    );
}
    

    private void configurarPlaceholders() {
      
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Nombre");
            txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        }
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtNombre.getText().equals("Nombre")) {
                    txtNombre.setText("");
                    txtNombre.setForeground(new java.awt.Color(51, 51, 51));
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtNombre.getText().isEmpty()) {
                    txtNombre.setText("Nombre");
                    txtNombre.setForeground(new java.awt.Color(153, 153, 153));
                }
            }
        });

     
        if (txtApellido.getText().isEmpty()) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(new java.awt.Color(153, 153, 153));
        }
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtApellido.getText().equals("Apellido")) {
                    txtApellido.setText("");
                    txtApellido.setForeground(new java.awt.Color(51, 51, 51));
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtApellido.getText().isEmpty()) {
                    txtApellido.setText("Apellido");
                    txtApellido.setForeground(new java.awt.Color(153, 153, 153));
                }
            }
        });

      
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo Electrónico");
            txtCorreo.setForeground(new java.awt.Color(153, 153, 153));
        }
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtCorreo.getText().equals("Correo Electrónico")) {
                    txtCorreo.setText("");
                    txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtCorreo.getText().isEmpty()) {
                    txtCorreo.setText("Correo Electrónico");
                    txtCorreo.setForeground(new java.awt.Color(153, 153, 153));
                }
            }
        });

    
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Usuario");
            txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        }
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtUsuario.getText().equals("Usuario")) {
                    txtUsuario.setText("");
                    txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtUsuario.getText().isEmpty()) {
                    txtUsuario.setText("Usuario");
                    txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
                }
            }
        });

      
        String placeholderContrasena = "Contraseña";
        jPasswordFieldContrasena.setEchoChar((char) 0);
        jPasswordFieldContrasena.setText(placeholderContrasena);
        jPasswordFieldContrasena.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordFieldContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (String.valueOf(jPasswordFieldContrasena.getPassword()).equals(placeholderContrasena)) {
                    jPasswordFieldContrasena.setText("");
                    jPasswordFieldContrasena.setEchoChar('•');
                    jPasswordFieldContrasena.setForeground(new java.awt.Color(0, 0, 0));
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (String.valueOf(jPasswordFieldContrasena.getPassword()).isEmpty()) {
                    jPasswordFieldContrasena.setText(placeholderContrasena);
                    jPasswordFieldContrasena.setEchoChar((char) 0);
                    jPasswordFieldContrasena.setForeground(new java.awt.Color(153, 153, 153));
                }
            }
        });
    }

    
    public void limpiarCamposConPlaceholders() {
     
        txtNombre.setText("Nombre");
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        
      
        txtApellido.setText("Apellido");
        txtApellido.setForeground(new java.awt.Color(153, 153, 153));
        
      
        txtCorreo.setText("Correo Electrónico");
        txtCorreo.setForeground(new java.awt.Color(153, 153, 153));
        
       
        txtUsuario.setText("Usuario");
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
    
        jPasswordFieldContrasena.setText("Contraseña");
        jPasswordFieldContrasena.setEchoChar((char) 0);
        jPasswordFieldContrasena.setForeground(new java.awt.Color(153, 153, 153));
        
       
        jPanel1.requestFocusInWindow();
    }

    /**
     * Método para obtener los valores reales de los campos (sin placeholders)
     */
    private String obtenerValorReal(javax.swing.JTextField campo, String placeholder) {
        String texto = campo.getText();
        return texto.equals(placeholder) ? "" : texto;
    }

    private String obtenerValorRealPassword(javax.swing.JPasswordField campo, String placeholder) {
        String texto = String.valueOf(campo.getPassword());
        return texto.equals(placeholder) ? "" : texto;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtApellido = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        jPasswordFieldContrasena = new javax.swing.JPasswordField();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(51, 51, 51));
        txtApellido.setToolTipText("");
        txtApellido.setBorder(null);
        txtApellido.setCaretColor(new java.awt.Color(51, 51, 51));
        txtApellido.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 130, 40));

        btnRegistro.setBackground(new java.awt.Color(37, 99, 235));
        btnRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrarse");
        btnRegistro.setBorderPainted(false);
        btnRegistro.setContentAreaFilled(false);
        btnRegistro.setFocusPainted(false);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 230, 40));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        txtCorreo.setToolTipText("");
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(51, 51, 51));
        txtCorreo.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 320, 30));

        jPasswordFieldContrasena.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldContrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordFieldContrasena.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordFieldContrasena.setBorder(null);
        jPasswordFieldContrasena.setCaretColor(new java.awt.Color(0, 0, 0));
        jPasswordFieldContrasena.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPasswordFieldContrasena.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        jPasswordFieldContrasena.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPasswordFieldContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 280, 30));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setToolTipText("");
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(51, 51, 51));
        txtNombre.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 150, 40));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(51, 51, 51));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 320, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 92, 224));
        jButton2.setText("Iniciar sesión");
        jButton2.setBorder(null);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Primary.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Frame 13.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 0, 510, 570));

        jPanel2.setBackground(new java.awt.Color(0, 92, 224));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 1.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 8.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    public void setLogin(JframeLogin login) {
        this.login = login;
    }

  

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        login.setVisible(true);
       
        login.setLocationRelativeTo(null);
         this.setVisible(false);
      
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPasswordField jPasswordFieldContrasena;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
