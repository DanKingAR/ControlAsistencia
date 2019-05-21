package logica;

import BD.ConexionBD;
import datos.AsistenciaAlumnos;
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
public class AsistenciaAlumno {
    
    private final ConexionBD postgres = new ConexionBD();
    private Connection con = null;
    private String SQL = "";
    public Integer totalRegistros;
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdAlumno", "Nombre", "P. Apellido", "S. Apellido", "Identificación", "Fecha", "Hora de Ingreso", "Hora de Salida"};
        String[] registros = new String[9];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT asp.idasistencia, asp.idpersonal, p.nombre, p.fapellido, p.lapellido, p.dni, p.grado, p.grupo, asp.fecha, asp.hora_ingreso, asp.hora_salida, usu.idusuario "
                + "FROM usuario usu LEFT JOIN asistencia_personal asp ON usu.idusuario = asp.idusuario LEFT JOIN personal p ON asp.dni = p.dni LEFT JOIN cargo c ON p.idcargo = c.idcargo "
                + "WHERE p.nombre LIKE '%" + buscar + "%' AND asp.estado='A' ORDER BY asp.fecha, asp.idpersonal ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idasistencia");
                registros[1] = rs.getString("idpersonal");               
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("fapellido");
                registros[4] = rs.getString("lapellido");
                registros[5] = rs.getString("dni");
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

    public DefaultTableModel mostrarreportealumnos(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdAlumno", "Nombre", "P. Apellido", "S. Apellido", "Identificación", "Grado", "Grupo", "Fecha", "Hora de Ingreso", "Hora de Salida"};
        String[] registros = new String[11];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT asp.idasistencia, asp.idpersonal, p.nombre, p.fapellido, p.lapellido, p.dni, p.grado, p.grupo, asp.fecha, asp.hora_ingreso, asp.hora_salida, usu.idusuario "
                + "FROM usuario usu LEFT JOIN asistencia_personal asp ON usu.idusuario = asp.idusuario LEFT JOIN personal p ON asp.dni = p.dni LEFT JOIN cargo c ON p.idcargo = c.idcargo "
                + "WHERE asp.fecha LIKE '%" + buscar + "%' AND p.idpersonal=1 AND asp.estado='A' ORDER BY asp.fecha, asp.idpersonal ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idasistencia");
                registros[1] = rs.getString("idpersonal");            
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("fapellido");
                registros[4] = rs.getString("lapellido");
                registros[5] = rs.getString("dni");
                registros[6] = rs.getString("grado");
                registros[7] = rs.getString("grupo");
                registros[8] = rs.getString("fecha");
                registros[9] = rs.getString("hora_ingreso");
                registros[10] = rs.getString("hora_salida");

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

    public boolean ingreso(AsistenciaAlumnos dts) {        
        SQL = "insert into asistencia_personal (idpersonal, dni, fecha, hora_ingreso, hora_salida, idusuario)"
                + "values (?,?,?,?,?,?)";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, dts.getIdPersonal());
            pst.setString(2, dts.getDni());
            pst.setString(3, dts.getFecha());
            pst.setString(4, dts.getHora_ingreso());
            pst.setString(5, dts.getHora_salida());
            pst.setInt(6, dts.getIdusuario());

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

    public boolean salida(AsistenciaAlumnos dts) {
        SQL = "UPDATE asistencia_personal SET hora_salida=?, idusuario=?"
                + "WHERE idAsistencia=? AND fecha=? AND dni=?";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, dts.getHora_salida());
            pst.setInt(2, dts.getIdusuario());
            pst.setInt(3, dts.getIdAsistenciaAlumnos());
            pst.setString(4, dts.getFecha());
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

    public boolean eliminar(AsistenciaAlumnos dts) {
        SQL = "UPDATE asistencia_personal SET estado='I' WHERE idAsistencia=?";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, dts.getIdAsistenciaAlumnos());
            
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
