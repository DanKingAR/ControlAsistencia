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
public class AsistenciaDocente {
    
    private final ConexionBD postgres = new ConexionBD();
    private final Connection con = postgres.conectar();
    private String SQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrarasisdocentes(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdDocente", "Nombre", "P. Apellido", "S. Apellido", "Identificación", "Materia", "Fecha", "Hora de Ingreso", "Hora de Salida"};
        String[] registros = new String[10];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT asp.idasistencia, asp.idpersonal, p.nombre, p.fapellido, p.lapellido, p.dni, p.materia, asp.fecha, asp.hora_ingreso, asp.hora_salida "
                + "FROM asistencia_personal asp LEFT JOIN personal p ON asp.dni = p.dni "
                + "WHERE asp.fecha LIKE '%" + buscar + "%' AND p.idpersonal = 2 AND asp.estado='A' ORDER BY asp.fecha, asp.idpersonal ASC";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idasistencia");
                registros[1] = rs.getString("idpersonal");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("fapellido");
                registros[4] = rs.getString("lapellido");
                registros[5] = rs.getString("dni");
                registros[6] = rs.getString("materia");
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
