package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dan Arevalo
 */
public class ConexionBD {

    public String puerto = "5432";
    public String nomservidor = "localhost";
    public String db = "huellas";
    public String user = "corhuila";
    public String pass = "123456789";
    public Connection conn = null;

    public Connection conectar() {
        try {
            String ruta = "jdbc:postgresql://";
            String servidor = nomservidor + ":" + puerto + "/";
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(ruta + servidor + db, user, pass);

            if (conn != null) {
                //System.out.println("Conección a base de datos listo...");
            } else if (conn == null) {
                throw new SQLException();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e.getMessage());
        } finally {
            return conn;
        }
    }

    public void desconectar() {
        conn = null;
        //System.out.println("Desconexion a base de datos listo...");
    }

}
