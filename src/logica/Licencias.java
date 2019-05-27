package logica;

import BD.ConexionBD;
import datos.Licencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dan Arevalo
 */
public class Licencias {
    
    private final ConexionBD postgres = new ConexionBD();
    private Connection con = null;
    private String SQL = "";
    public Integer totalRegistros;
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdDocente", "Nombres", "P. Apellido", "S. Apellido", "Identificación", "Materia", "Fecha", "Tiempo", "Tipo de Licencia", "Descripción"};
        String[] registros = new String[11];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT pe.idpermiso, pe.dni, p.nombre, p.fapellido, p.lapellido, p.dni, p.materia, pe.fecha, pe.tiempo, pe.tipo_licencia, pe.perdescripcion "
                + "FROM permisos pe INNER JOIN personal p ON pe.dni = p.dni "
                + "WHERE p.nombre LIKE '%" + buscar + "%' AND pe.idpermiso=2 AND pe.estado='A' ORDER BY nombre ASC";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idpermiso");
                registros[1] = rs.getString("dni");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("fapellido");
                registros[4] = rs.getString("lapellido");
                registros[5] = rs.getString("dni");
                registros[6] = rs.getString("materia");
                registros[7] = rs.getString("fecha");
                registros[8] = rs.getString("tiempo");
                registros[9] = rs.getString("tipo_licencia");
                registros[10] = rs.getString("perdescripcion");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

    public boolean insertar(Licencia dts) {
        SQL = "INSERT INTO permisos (idpermiso, dni, fecha, tiempo, tipo_licencia, perdescripcion)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, 2);
            pst.setString(2, dts.getDni());
            pst.setDate(3, dts.getFecha());
            pst.setString(4, dts.getTiempo());
            pst.setString(5, dts.getTipo_licencia());
            pst.setString(6, dts.getDescripcion());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
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

    public boolean editar(Licencia dts) {
        SQL = "UPDATE permisos SET fecha=?,tiempo=?,tipo_licencia=?,perdescripcion=?"
                + "WHERE idpermiso=? AND dni=?";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setDate(1, dts.getFecha());
            pst.setString(2, dts.getTiempo());
            pst.setString(3, dts.getTipo_licencia());
            pst.setString(4, dts.getDescripcion());
            pst.setInt(5, 2);
            pst.setString(6, dts.getDni());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
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

    public boolean eliminar(Licencia dts) {
        SQL = "delete from permisos where idpermiso=? AND dni=?";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, 2);
            pst.setString(2, dts.getDni());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
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
