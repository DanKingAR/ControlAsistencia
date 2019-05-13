package logica;

import BD.ConexionBD;
import datos.Trabajador;
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
public class Trabajadores {
    
    private final ConexionBD postgres = new ConexionBD();
    private final Connection con = postgres.conectar();
    private String SQL = "";
    public Integer totalRegistros;
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"IdUsuario", "Nombre", "FApellido", "LApellido", "Dni", "Telefono", "Direccion", "Email", "Género", "Login", "Password", "Acceso", "Estado", "Fecha_Ingreso"};
        String[] registros = new String[14];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT idusuario, nombre, fapellido, lapellido, dni, telefono, direccion, email, genero, login, pass, acceso, estado, fecha_ingreso "
                + "FROM usuario WHERE dni LIKE '%" + buscar + "%' AND estado='A' ORDER BY nombre ASC";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idusuario");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("fapellido");
                registros[3] = rs.getString("lapellido");
                registros[4] = rs.getString("dni");
                registros[5] = rs.getString("telefono");
                registros[6] = rs.getString("direccion");
                registros[7] = rs.getString("email");
                registros[8] = rs.getString("genero");
                registros[9] = rs.getString("login");
                registros[10] = rs.getString("pass");
                registros[11] = rs.getString("acceso");
                registros[12] = rs.getString("estado");
                registros[13] = rs.getString("fecha_ingreso");

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

    public boolean insertar(Trabajador dts) {
        SQL = "insert into usuario (nombre,fapellido,lapellido,dni,telefono,direccion,email,genero,login,pass,acceso,estado,fecha_ingreso)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, dts.getNombres());
            pst.setString(2, dts.getFapellido());
            pst.setString(3, dts.getLapellido());
            pst.setString(4, dts.getDni());
            pst.setString(5, dts.getTelefono());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getEmail());
            pst.setString(8, dts.getSexo());
            pst.setString(9, dts.getLogin());
            pst.setString(10, dts.getPassword());
            pst.setString(11, dts.getAcceso());
            pst.setString(12, dts.getEstado());
            pst.setDate(13, dts.getFecha_ingreso());

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

    public boolean editar(Trabajador dts) {
        SQL = "UPDATE usuario SET telefono=?, direccion=?, email=?, login=?, pass=?, fecha_ingreso=?"
                + "WHERE idusuario=?";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, dts.getTelefono());
            pst.setString(2, dts.getDireccion());
            pst.setString(3, dts.getEmail());
            pst.setString(4, dts.getLogin());
            pst.setString(5, dts.getPassword());
            pst.setDate(6, dts.getFecha_ingreso());
            pst.setInt(7, dts.getIdTrabajador());

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

    public boolean eliminar(Trabajador dts) {
        SQL = "UPDATE usuario SET estado='I' WHERE idusuario=?";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, dts.getIdTrabajador());

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

    public DefaultTableModel login(String login, String pass) {
        DefaultTableModel modelo;

        String[] titulos = {"IdTrabajador", "Nombre", "FApellido", "LApellido", "Login", "Password", "Acceso", "Estado"};
        String[] registros = new String[8];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT idusuario, nombre, fapellido, lapellido, login, pass, acceso, estado FROM usuario WHERE login='" + login + "' AND pass='" + pass + "' AND estado='A'";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idusuario");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("fapellido");
                registros[3] = rs.getString("lapellido");
                registros[4] = rs.getString("login");
                registros[5] = rs.getString("pass");
                registros[6] = rs.getString("acceso");
                registros[7] = rs.getString("estado");

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
