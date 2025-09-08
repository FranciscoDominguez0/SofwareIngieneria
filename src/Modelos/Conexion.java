// hola
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3307/software_ingenieria";
    public static final String USER = "root";
    public static final String CLAVE = "";

    public Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null, // Componente padre (null para centrar)
                    "Error al conectar a la base de datos", // Mensaje a mostrar
                    "Error", // Título de la ventana
                    JOptionPane.ERROR_MESSAGE // Tipo de mensaje (ícono de error)
            );
        }
        return con;
    }

}
