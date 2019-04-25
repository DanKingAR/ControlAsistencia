package logica;

import BD.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dan Arevalo
 */
public class AsistenciaDocente {
    
    private final ConexionBD postgres = new ConexionBD();
    private final Connection conn = postgres.conectar();
    private String SQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrarasisdocentes(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdDocente", "Nombre", "FApellido", "LApellido", "Materia", "Fecha", "Hora Ingreso", "Hora Salida"};
        String[] registros = new String[9];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT asp.idasistencia, asp.idpersonal, p.nombre, p.fapellido, p.lapellido, p.materia, asp.fecha, asp.hora_ingreso, asp.hora_salida "
                + "FROM asistencia_personal asp LEFT JOIN personal p ON asp.dni = p.dni "
                + "WHERE p.nombre LIKE '%" + buscar + "%' AND p.idpersonal = 2 AND asp.estado='A' ORDER BY nombre ASC";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idasistencia");
                registros[1] = rs.getString("idpersonal");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("fapellido");
                registros[4] = rs.getString("lapellido");
                registros[5] = rs.getString("materia");
                registros[6] = rs.getString("fecha");
                registros[7] = rs.getString("hora_ingreso");
                registros[8] = rs.getString("hora_salida");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
}
