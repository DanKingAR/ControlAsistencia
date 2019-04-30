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
public class AsistenciaAdmini {
    
    private final ConexionBD postgres = new ConexionBD();
    private final Connection conn = postgres.conectar();
    private String SQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrarasisadministrativos(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdAdministrativo", "Cargo", "Nombre", "FApellido", "LApellido", "Fecha", "Hora Ingreso", "Hora Salida"};
        String[] registros = new String[9];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT asap.idAsistencia, asap.idpersonal, c.descripcion, p.nombre, p.fapellido, p.lapellido, asap.fecha, asap.hora_ingreso, asap.hora_salida "
                + "FROM asistencia_personal asap INNER JOIN personal p ON asap.dni = p.dni INNER JOIN cargo c ON p.idcargo = c.idcargo "
                + "WHERE asap.fecha LIKE '%" + buscar + "%' AND p.idpersonal = 3 AND asap.estado='A' ORDER BY asap.fecha ASC";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idAsistencia");
                registros[1] = rs.getString("idpersonal");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("nombre");
                registros[4] = rs.getString("fapellido");
                registros[5] = rs.getString("lapellido");
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
