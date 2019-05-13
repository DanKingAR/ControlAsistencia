package logica;

import BD.ConexionBD;
import datos.Administrativo;
import formularios.frmAdministrativo;
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
public class Administrativos {

    private final ConexionBD postgres = new ConexionBD();
    private Connection con = null;
    private String SQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdCargo", "Cargo", "Nombre", "FApellido", "LApellido", "Dni", "Telefono", "Direccion", "Email", "Género", "Fecha Ingreso", "Fecha Nacimiento"};
        String[] registros = new String[13];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT p.idpersonal, p.idcargo, ca.descripcion, p.nombre, p.fapellido, p.lapellido, p.dni, p.telefono, p.direccion, p.email, p.genero, p.fecha_ingreso, p.fecha_nace "
                + "FROM personal p INNER JOIN cargo ca ON p.idcargo = ca.idcargo "
                + "WHERE p.dni LIKE '%" + buscar + "' AND p.idpersonal = 3 AND estado='A' ORDER BY nombre ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idpersonal");
                registros[1] = rs.getString("idcargo");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("nombre");
                registros[4] = rs.getString("fapellido");
                registros[5] = rs.getString("lapellido");
                registros[6] = rs.getString("dni");
                registros[7] = rs.getString("telefono");
                registros[8] = rs.getString("direccion");
                registros[9] = rs.getString("email");
                registros[10] = rs.getString("genero");
                registros[11] = rs.getString("fecha_ingreso");
                registros[12] = rs.getString("fecha_nace");

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

    public DefaultTableModel mostrarvista_ingresopersonal(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdCargo", "Cargo", "Nombre", "FApellido", "LApellido", "Dni", "Telefono", "Direccion", "Email", "Género", "Fecha Ingreso", "Fecha Nacimiento"};
        String[] registros = new String[13];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT p.idpersonal, p.idcargo, ca.descripcion, p.nombre, p.fapellido, p.lapellido, p.dni, p.telefono, p.direccion, p.email, p.genero, p.fecha_ingreso, p.fecha_nace "
                + "FROM personal p INNER JOIN cargo ca ON p.idcargo = ca.idcargo "
                + "WHERE p.dni LIKE '%" + buscar + "' AND p.idpersonal = 3 AND estado='A' ORDER BY nombre ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idpersonal");
                registros[1] = rs.getString("idcargo");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("nombre");
                registros[4] = rs.getString("fapellido");
                registros[5] = rs.getString("lapellido");
                registros[6] = rs.getString("dni");
                registros[7] = rs.getString("telefono");
                registros[8] = rs.getString("direccion");
                registros[9] = rs.getString("email");
                registros[10] = rs.getString("genero");
                registros[11] = rs.getString("fecha_ingreso");
                registros[12] = rs.getString("fecha_nace");

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

    public DefaultTableModel mostrarvista_salidapersonal(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdCargo", "Cargo", "Nombre", "FApellido", "LApellido", "Dni", "Telefono", "Direccion", "Email", "Género", "Fecha Ingreso", "Fecha Nacimiento"};
        String[] registros = new String[13];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT p.idpersonal, p.idcargo, ca.descripcion, p.nombre, p.fapellido, p.lapellido, p.dni, p.telefono, p.direccion, p.email, p.genero, p.fecha_ingreso, p.fecha_nace "
                + "FROM personal p INNER JOIN cargo ca ON p.idcargo = ca.idcargo "
                + "WHERE p.dni LIKE '%" + buscar + "' AND p.idpersonal = 3 AND estado='A' ORDER BY nombre ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idpersonal");
                registros[1] = rs.getString("idcargo");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("nombre");
                registros[4] = rs.getString("fapellido");
                registros[5] = rs.getString("lapellido");
                registros[6] = rs.getString("dni");
                registros[7] = rs.getString("telefono");
                registros[8] = rs.getString("direccion");
                registros[9] = rs.getString("email");
                registros[10] = rs.getString("genero");
                registros[11] = rs.getString("fecha_ingreso");
                registros[12] = rs.getString("fecha_nace");

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

    public DefaultTableModel mostrarvistaadminnistrativo(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdCargo", "Cargo", "Nombre", "FApellido", "LApellido", "Dni", "Telefono", "Direccion", "Email", "Género", "Fecha Ingreso", "Fecha Nacimiento"};
        String[] registros = new String[13];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT p.idpersonal, p.idcargo, ca.descripcion, p.nombre, p.fapellido, p.lapellido, p.dni, p.telefono, p.direccion, p.email, p.genero, p.fecha_ingreso, p.fecha_nace "
                + "FROM personal p INNER JOIN cargo ca ON p.idcargo = ca.idcargo "
                + "WHERE p.dni LIKE '%" + buscar + "' AND p.idpersonal = 3 AND estado='A' ORDER BY nombre ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idpersonal");
                registros[1] = rs.getString("idcargo");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("nombre");
                registros[4] = rs.getString("fapellido");
                registros[5] = rs.getString("lapellido");
                registros[6] = rs.getString("dni");
                registros[7] = rs.getString("telefono");
                registros[8] = rs.getString("direccion");
                registros[9] = rs.getString("email");
                registros[10] = rs.getString("genero");
                registros[11] = rs.getString("fecha_ingreso");
                registros[12] = rs.getString("fecha_nace");

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

    public boolean insertar(Administrativo dts) {
        SQL = "INSERT INTO personal(idpersonal, idcargo, nombre, fapellido, lapellido, dni, direccion, email, genero, fecha_nace, fecha_ingreso, telefono)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, 3);
            pst.setInt(2, dts.getIdCargo());
            pst.setString(3, dts.getNombre());
            pst.setString(4, dts.getFapellido());
            pst.setString(5, dts.getLapellido());
            pst.setString(6, dts.getDni());
            pst.setString(7, dts.getDireccion());
            pst.setString(8, dts.getEmail());
            pst.setString(9, dts.getSexo());
            pst.setDate(10, dts.getFecha_nace());
            pst.setDate(11, dts.getFecha_ingreso());
            pst.setString(12, dts.getTelefono());

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

    public boolean editar(Administrativo dts) {
        SQL = "UPDATE personal SET idcargo=?, lapellido=?, telefono=?, direccion=?, email=?, fecha_ingreso=?"
                + "WHERE idpersonal=3 AND dni=?";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, dts.getIdCargo());
            pst.setString(2, dts.getLapellido());
            pst.setString(3, dts.getTelefono());
            pst.setString(4, dts.getDireccion());
            pst.setString(5, dts.getEmail());
            pst.setDate(6, dts.getFecha_ingreso());
            pst.setString(7, dts.getDni());

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

    public boolean eliminar(Administrativo dts) {
        SQL = "UPDATE personal SET estado='I' WHERE idpersonal=3 AND dni=?";
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
