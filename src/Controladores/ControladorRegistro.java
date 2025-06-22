/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Usuarios;
import Modelos.UsuariosConsulta;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ControladorRegistro {
     private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtCorreo;
    private JTextField txtUsuario;
    private JPasswordField jPasswordFieldContrasena;
    private JButton btnRegistro;
    private UsuariosConsulta usuariosConsulta;

    // Placeholders usados en el formulario
    private static final String PLACEHOLDER_NOMBRE = "Nombre";
    private static final String PLACEHOLDER_APELLIDO = "Apellido";
    private static final String PLACEHOLDER_CORREO = "Correo Electrónico";
    private static final String PLACEHOLDER_USUARIO = "Usuario";
    private static final String PLACEHOLDER_CONTRASENA = "Contraseña";

    public ControladorRegistro(JTextField txtNombre, JTextField txtApellido,
                               JTextField txtCorreo, JTextField txtUsuario,
                               JPasswordField jPasswordFieldContrasena,
                               JButton btnRegistro) {

        this.txtNombre = txtNombre;
        this.txtApellido = txtApellido;
        this.txtCorreo = txtCorreo;
        this.txtUsuario = txtUsuario;
        this.jPasswordFieldContrasena = jPasswordFieldContrasena;
        this.btnRegistro = btnRegistro;

        this.usuariosConsulta = new UsuariosConsulta();

        // Asociar evento al botón
        this.btnRegistro.addActionListener(e -> registrarUsuario());
    }

    public void registrarUsuario() {
        String nombre = limpiarPlaceholder(txtNombre.getText().trim(), PLACEHOLDER_NOMBRE);
        String apellido = limpiarPlaceholder(txtApellido.getText().trim(), PLACEHOLDER_APELLIDO);
        String correo = limpiarPlaceholder(txtCorreo.getText().trim(), PLACEHOLDER_CORREO);
        String usuario = limpiarPlaceholder(txtUsuario.getText().trim(), PLACEHOLDER_USUARIO);
        String contrasena = limpiarPlaceholder(new String(jPasswordFieldContrasena.getPassword()), PLACEHOLDER_CONTRASENA);

        if (!validarDatos(nombre, apellido, correo, usuario, contrasena)) {
            return;
        }

        if (usuariosConsulta.existeUsuario(usuario)) {
            mostrarError("El nombre de usuario ya existe. Por favor, elija otro.");
            return;
        }

        if (usuariosConsulta.existeEmail(correo)) {
            mostrarError("El email ya está registrado. Use otro email.");
            return;
        }

        Usuarios nuevoUsuario = crearUsuario(nombre, apellido, correo, usuario, contrasena);

        if (usuariosConsulta.registrarUsuario(nuevoUsuario)) {
            mostrarExito("Usuario registrado exitosamente");
            limpiarCampos();
        } else {
            mostrarError("Error al registrar el usuario. Inténtelo nuevamente.");
        }
    }

    private String limpiarPlaceholder(String texto, String placeholder) {
        return texto.equals(placeholder) ? "" : texto;
    }

    private boolean validarDatos(String nombre, String apellido, String correo,
                                 String usuario, String contrasena) {

        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()
                || usuario.isEmpty() || contrasena.isEmpty()) {
            mostrarError("Todos los campos son obligatorios");
            return false;
        }

        if (!validarTexto(nombre)) {
            mostrarError("El nombre solo debe contener letras");
            return false;
        }

        if (!validarTexto(apellido)) {
            mostrarError("El apellido solo debe contener letras");
            return false;
        }

        if (!validarEmail(correo)) {
            mostrarError("El formato del email es inválido");
            return false;
        }

        if (!validarUsuario(usuario)) {
            mostrarError("El usuario solo puede contener letras, números y guión bajo");
            return false;
        }

        if (!validarContrasena(contrasena)) {
            mostrarError("La contraseña debe tener al menos 6 caracteres");
            return false;
        }

        return true;
    }

    private boolean validarTexto(String texto) {
        return texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+");
    }

    private boolean validarEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }

    private boolean validarUsuario(String usuario) {
        return usuario.matches("[a-zA-Z0-9_]+") && usuario.length() >= 3;
    }

    private boolean validarContrasena(String contrasena) {
        return contrasena.length() >= 6;
    }

    private Usuarios crearUsuario(String nombre, String apellido, String correo,
                                  String usuario, String contrasena) {
        Usuarios nuevoUsuario = new Usuarios();
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setApellido(apellido);
        nuevoUsuario.setEmail(correo);
        nuevoUsuario.setUsuario(usuario);
        nuevoUsuario.setClave(contrasena);
        nuevoUsuario.setRol("usuario"); // Por defecto
        return nuevoUsuario;
    }

    public void limpiarCampos() {
        txtNombre.setText(PLACEHOLDER_NOMBRE);
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));

        txtApellido.setText(PLACEHOLDER_APELLIDO);
        txtApellido.setForeground(new java.awt.Color(153, 153, 153));

        txtCorreo.setText(PLACEHOLDER_CORREO);
        txtCorreo.setForeground(new java.awt.Color(153, 153, 153));

        txtUsuario.setText(PLACEHOLDER_USUARIO);
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));

        jPasswordFieldContrasena.setText(PLACEHOLDER_CONTRASENA);
        jPasswordFieldContrasena.setEchoChar((char) 0);
        jPasswordFieldContrasena.setForeground(new java.awt.Color(153, 153, 153));

        txtNombre.requestFocus();
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void mostrarExito(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    public void validarCampoEnTiempoReal(JTextField campo, String tipoValidacion) {
        String texto = campo.getText();

        switch (tipoValidacion) {
            case "texto":
                if (!texto.isEmpty() && !validarTexto(texto)) {
                    campo.setBackground(java.awt.Color.PINK);
                } else {
                    campo.setBackground(java.awt.Color.WHITE);
                }
                break;

            case "email":
                if (!texto.isEmpty() && !validarEmail(texto)) {
                    campo.setBackground(java.awt.Color.PINK);
                } else {
                    campo.setBackground(java.awt.Color.WHITE);
                }
                break;

            case "usuario":
                if (!texto.isEmpty() && !validarUsuario(texto)) {
                    campo.setBackground(java.awt.Color.PINK);
                } else {
                    campo.setBackground(java.awt.Color.WHITE);
                }
                break;
        }
    }
}
