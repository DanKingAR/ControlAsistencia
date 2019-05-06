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
public class Retardos {
    
    private final ConexionBD postgres = new ConexionBD();
    private final Connection conn = postgres.conectar();
    private String SQL = "";
    public Integer totalRegistros;
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"Nombre", "FApellido", "LApellido", "Identificación", "Fecha", "Estado"};
        String[] registros = new String[6];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT p.nombre, p.fapellido, p.lapellido, p.dni, his.fecha, his.estado "
                + "FROM personal p INNER JOIN historial his ON p.dni = his.dni "
                + "WHERE his.estado = 'Retardo' ORDER BY his.fecha ASC;";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {            
                registros[0] = rs.getString("nombre");
                registros[1] = rs.getString("fapellido");
                registros[2] = rs.getString("lapellido");
                registros[3] = rs.getString("dni");
                registros[4] = rs.getString("fecha");
                registros[5] = rs.getString("estado");

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
