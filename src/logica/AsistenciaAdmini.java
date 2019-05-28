package logica;

import BD.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dan Arevalo
 */
public class AsistenciaAdmini {
    
    private final ConexionBD postgres = new ConexionBD();
    private final Connection con = postgres.conectar();
    private String SQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrarasisadministrativos(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdPersonal", "Cargo", "Nombre", "P. Apellido", "S. Apellido", "Identificación", "Fecha", "Hora de Ingreso", "Hora de Salida"};
        String[] registros = new String[10];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT asap.idAsistencia, asap.idpersonal, c.descripcion, p.nombre, p.fapellido, p.lapellido, p.dni, asap.fecha, asap.hora_ingreso, asap.hora_salida "
                + "FROM asistencia_personal asap INNER JOIN personal p ON asap.dni = p.dni INNER JOIN cargo c ON p.idcargo = c.idcargo "
                + "WHERE asap.fecha LIKE '%" + buscar + "%' AND p.idpersonal = 3 AND asap.estado='A' ORDER BY asap.fecha, asap.idpersonal ASC";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idAsistencia");
                registros[1] = rs.getString("idpersonal");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("nombre");
                registros[4] = rs.getString("fapellido");
                registros[5] = rs.getString("lapellido");
                registros[6] = rs.getString("dni");
                registros[7] = rs.getString("fecha");
                registros[8] = rs.getString("hora_ingreso");
                registros[9] = rs.getString("hora_salida");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    
}
