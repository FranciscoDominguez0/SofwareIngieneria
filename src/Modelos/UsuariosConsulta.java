
package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author domin
 */
public class UsuariosConsulta {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrarUsuario(Usuarios usuario) {
        String sql = "INSERT INTO usuarios (nombre, apellido, email, usuario, clave, rol) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getUsuario());
            ps.setString(5, usuario.getClave());
            ps.setString(6, usuario.getRol());
            
            int resultado = ps.executeUpdate();
            return resultado > 0;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar usuario: " + e.getMessage());
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
    }
    
    // Verificar si el usuario ya existe
    public boolean existeUsuario(String usuario) {
        String sql = "SELECT usuario FROM usuarios WHERE usuario = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar usuario: " + e.getMessage());
            return false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
    }
    
    // Verificar si el email ya existe
    public boolean existeEmail(String email) {
        String sql = "SELECT email FROM usuarios WHERE email = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar email: " + e.getMessage());
            return false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
    }
    
    
   public Usuarios login(String usuario, String clave){
    String sql = "SELECT * FROM usuarios WHERE usuario = ? AND clave = ?";
    Usuarios us = new Usuarios();
    try {
        con = cn.getConexion();
        ps = con.prepareStatement(sql);
        ps.setString(1, usuario);
        ps.setString(2, clave);
        rs = ps.executeQuery();
        if (rs.next()) {
            us.setId(rs.getInt("id"));
            us.setNombre(rs.getString("nombre"));
            us.setApellido(rs.getString("apellido"));
            us.setUsuario(rs.getString("usuario"));
            us.setClave(rs.getString("clave"));
            us.setRol(rs.getString("rol"));
            us.setEmail(rs.getString("email"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
    return us;
}
}


