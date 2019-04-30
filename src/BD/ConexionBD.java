package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

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
    public String driver = "org.postgresql.Driver";
    public String ruta = "jdbc:postgresql://";
    public String servidor = nomservidor + ":" + puerto + "/";
    public Connection conn = null;

    public Connection conectar() {
        try {
            Class.forName(driver);
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

    public void startReport(String reporte) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(ruta + servidor + db, user, pass);
            if (reporte == null) {
                throw new Exception("No se encuentra el archivo de reporte maestro");
            }
            JasperReport jr = null;
            try {
                jr = (JasperReport) JRLoader.loadObject(reporte);
            } catch (Exception e) {
                throw new Exception("Error cargando el reporte: " + e.getMessage());
            }
            JasperPrint jp = null;
            try {
                jp = JasperFillManager.fillReport(jr, null, conn);
            } catch (JRException e) {
                throw new Exception("Error llenando el reporte maestro: " + e.getMessage());
            }
            try {
                JasperViewer view = new JasperViewer(jp, false);
                view.setTitle("Reporte de Asistencia");
                view.setVisible(true);
            } catch (Exception e) {
            }
        } catch (ClassNotFoundException | SQLException e) {
        } catch (Exception ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
