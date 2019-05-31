package logica;

import BD.ConexionBD;
import datos.Permiso;
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
public class Permisos {

    private final ConexionBD postgres = new ConexionBD();
    private Connection con = null;
    private String SQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdPersonal", "Nombre", "P. Apellido", "S. Apellido", "Identificación", "Grado", "Grupo", "Fecha", "Tiempo", "Descripción"};
        String[] registros = new String[11];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT pe.idPermiso, pe.dni, p.nombre, p.fapellido, p.lapellido, p.dni, p.grado, p.grupo, pe.fecha, pe.tiempo, pe.perdescripcion "
                + "FROM permisos pe INNER JOIN personal p ON pe.dni = p.dni "
                + "WHERE p.nombre LIKE '%" + buscar + "%' AND p.idpersonal = 1 AND pe.estado='A' ORDER BY nombre ASC";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idPermiso");
                registros[1] = rs.getString("dni");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("fapellido");
                registros[4] = rs.getString("lapellido");
                registros[5] = rs.getString("dni");
                registros[6] = rs.getString("grado");
                registros[7] = rs.getString("grupo");
                registros[8] = rs.getString("fecha");
                registros[9] = rs.getString("tiempo");
                registros[10] = rs.getString("perdescripcion");

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

    public DefaultTableModel mostrarvistapersonal(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdPersonal", "Nombre", "P. Apellido", "S. Apellido", "Grado", "Grupo", "Fecha", "Tiempo", "Descripción"};
        String[] registros = new String[10];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT pe.idPermiso, pe.dni, p.nombre, p.fapellido, p.lapellido, p.grado, p.grupo, pe.fecha, pe.tiempo, pe.perdescripcion "
                + "FROM permisos pe INNER JOIN personal p ON pe.dni = p.dni "
                + "WHERE p.nombre LIKE '%" + buscar + "%' AND p.idpersonal = 1 AND pe.estado='A' ORDER BY nombre ASC";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idPermiso");
                registros[1] = rs.getString("dni");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("fapellido");
                registros[4] = rs.getString("lapellido");
                registros[5] = rs.getString("grado");
                registros[6] = rs.getString("grupo");
                registros[7] = rs.getString("fecha");
                registros[8] = rs.getString("tiempo");
                registros[9] = rs.getString("perdescripcion");

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

    public boolean insertar(Permiso dts) {
        SQL = "insert into permisos (idpersonal,dni,fecha,tiempo,perdescripcion)"
                + "values (?,?,?,?,?)";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, 1);
            pst.setString(2, dts.getDni());
            pst.setDate(3, dts.getFecha());
            pst.setString(4, dts.getTiempo());
            pst.setString(5, dts.getDescripcion());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
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

    public boolean editar(Permiso dts) {
        SQL = "UPDATE permisos SET fecha=?, tiempo=?, perdescripcion=?"
                + "WHERE idPermiso=? AND dni=?";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setDate(1, dts.getFecha());
            pst.setString(2, dts.getTiempo());
            pst.setString(3, dts.getDescripcion());
            pst.setInt(4, dts.getIdPermiso());
            pst.setString(5, dts.getDni());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
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

    public boolean eliminar(Permiso dts) {
        SQL = "UPDATE permisos SET estado='I' WHERE idPermiso=? AND dni=?";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, dts.getIdPermiso());
            pst.setString(2, dts.getDni());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
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
