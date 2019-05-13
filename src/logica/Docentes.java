package logica;

import BD.ConexionBD;
import datos.Docente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dan Arevalo
 */
public class Docentes {
    
    private final ConexionBD postgres = new ConexionBD();
    private Connection con = null;
    private String SQL = "";
    public Integer totalRegistros;
    
    public void llenarMateria(JComboBox cmbMateria) {
        String sSQL = "SELECT materia FROM personal ORDER BY materia ASC;";
        try {
            PreparedStatement pst = con.prepareStatement(sSQL);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                cmbMateria.addItem(rst.getString("materia"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "FApellido", "LApellido", "Género", "Dni", "Teléfono", "Dirección", "Email", "Materia", "Fecha Nacimiento"};
        String[] registros = new String[11];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT idpersonal, nombre, fapellido, lapellido, genero, dni, telefono, direccion, email, materia, fecha_nace "
                + "FROM personal WHERE dni LIKE '%" + buscar + "' AND idpersonal=2 AND estado='A' ORDER BY nombre ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idpersonal");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("fapellido");
                registros[3] = rs.getString("lapellido");
                registros[4] = rs.getString("genero");
                registros[5] = rs.getString("dni");
                registros[6] = rs.getString("telefono");
                registros[7] = rs.getString("direccion");
                registros[8] = rs.getString("email");
                registros[9] = rs.getString("materia");
                registros[10] = rs.getString("fecha_nace");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
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
    
    public DefaultTableModel mostrarvistadocente(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "FApellido", "LApellido", "Género", "Dni", "Teléfono", "Dirección", "Email", "Materia", "Fecha Nacimiento"};
        String[] registros = new String[11];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT idpersonal, nombre, fapellido, lapellido, genero, dni, telefono, direccion, email, materia, fecha_nace "
                + "FROM personal WHERE dni LIKE '%" + buscar + "' AND idpersonal=2 AND estado='A' ORDER BY nombre ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idpersonal");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("fapellido");
                registros[3] = rs.getString("lapellido");
                registros[4] = rs.getString("genero");
                registros[5] = rs.getString("dni");
                registros[6] = rs.getString("telefono");
                registros[7] = rs.getString("direccion");
                registros[8] = rs.getString("email");
                registros[9] = rs.getString("materia");
                registros[10] = rs.getString("fecha_nace");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
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
    
    public boolean insertar(Docente dts) {
        SQL = "INSERT INTO personal(idpersonal, nombre, fapellido, lapellido, dni, direccion, email, materia, genero, fecha_nace, telefono)" + 
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, 2);
            pst.setString(2, dts.getNombre());
            pst.setString(3, dts.getfApellido());
            pst.setString(4, dts.getlApellido());
            pst.setString(5, dts.getDni());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getEmail());
            pst.setString(8, dts.getMateria());
            pst.setString(9, dts.getGenero());
            pst.setDate(10, dts.getFecha_nace());
            pst.setString(11, dts.getTelefono());

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

    public boolean editar(Docente dts) {
        SQL = "UPDATE personal SET lapellido=?, telefono=?, direccion=?, email=?, materia=?"
                + "WHERE idpersonal=2 AND dni=?";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, dts.getlApellido());
            pst.setString(2, dts.getTelefono());
            pst.setString(3, dts.getDireccion());
            pst.setString(4, dts.getEmail());
            pst.setString(5, dts.getMateria());
            pst.setString(6, dts.getDni());

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

    public boolean eliminar(Docente dts) {
        SQL = "UPDATE personal SET estado='I' WHERE idpersonal=2 AND dni?";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, dts.getDni());
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
