package logica;

import datos.Cargo;
import BD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dan Arevalo
 */
public class Cargos {
    
    private final ConexionBD postgres = new ConexionBD();
    private final Connection conn = postgres.conectar();
    private String SQL = "";
    public Integer totalRegistros;
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"IdCargo", "Descripcion"};
        String[] registros = new String[2];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT * FROM cargo WHERE descripcion LIKE '%" + buscar + "%' ORDER BY descripcion ASC";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idcargo");
                registros[1] = rs.getString("descripcion");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel mostrarvista(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"IdCargo", "Descripcion"};
        String[] registros = new String[2];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT * FROM cargo WHERE descripcion LIKE '%" + buscar + "%' ORDER BY descripcion ASC";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idcargo");
                registros[1] = rs.getString("descripcion");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(Cargo dts) {
        SQL = "INSERT INTO cargo (descripcion)"
                + "VALUES (?)";
        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            pst.setString(1, dts.getCargodescripcion());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Cargo dts) {
        SQL = "UPDATE cargo SET descripcion=?"
                + "WHERE idcargo=?";
        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            pst.setString(1, dts.getCargodescripcion());
            pst.setInt(2, dts.getIdCargo());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Cargo dts) {
        SQL = "DELETE FROM cargo WHERE idcargo=?";
        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            pst.setInt(1, dts.getIdCargo());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
}
