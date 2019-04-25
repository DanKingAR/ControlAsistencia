package logica;

import BD.ConexionBD;
import datos.AsistenciaAlumnos;
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
public class AsistenciaAlumno {
    
    private final ConexionBD postgres = new ConexionBD();
    private final Connection conn = postgres.conectar();
    private String SQL = "";
    public Integer totalRegistros;
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdAlumno", "Cargo", "Nombre", "FApellido", "LApellido", "Identificación", "Grado", "Grupo", "Materia", "Fecha", "Hora Ingreso", "Hora Salida"};
        String[] registros = new String[13];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT asp.idasistencia, asp.idpersonal, c.descripcion, p.nombre, p.fapellido, p.lapellido, p.dni, p.materia, p.grado, p.grupo, asp.fecha, asp.hora_ingreso, asp.hora_salida, usu.idusuario "
                + "FROM usuario usu LEFT JOIN asistencia_personal asp ON usu.idusuario = asp.idusuario LEFT JOIN personal p ON asp.dni = p.dni LEFT JOIN cargo c ON p.idcargo = c.idcargo "
                + "WHERE p.nombre LIKE '%" + buscar + "%' AND asp.estado='A' ORDER BY nombre ASC;";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idasistencia");
                registros[1] = rs.getString("idpersonal");
                registros[2] = rs.getString("descripcion");                
                registros[3] = rs.getString("nombre");
                registros[4] = rs.getString("fapellido");
                registros[5] = rs.getString("lapellido");
                registros[6] = rs.getString("dni");
                registros[7] = rs.getString("grado");
                registros[8] = rs.getString("grupo");
                registros[9] = rs.getString("materia");
                registros[10] = rs.getString("fecha");
                registros[11] = rs.getString("hora_ingreso");
                registros[12] = rs.getString("hora_salida");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel mostrarreportealumnos(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "IdAlumno", "Nombre", "FApellido", "LApellido", "Identificación", "Grado", "Grupo", "Fecha", "Hora Ingreso", "Hora Salida"};
        String[] registros = new String[11];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT asp.idasistencia, asp.idpersonal, p.nombre, p.fapellido, p.lapellido, p.dni, p.grado, p.grupo, asp.fecha, asp.hora_ingreso, asp.hora_salida, usu.idusuario "
                + "FROM usuario usu LEFT JOIN asistencia_personal asp ON usu.idusuario = asp.idusuario LEFT JOIN personal p ON asp.dni = p.dni LEFT JOIN cargo c ON p.idcargo = c.idcargo "
                + "WHERE p.nombre LIKE '%" + buscar + "%' AND p.idpersonal=1 AND asp.estado='A' ORDER BY nombre ASC;";

        try {
            Statement st = conn.createStatement();
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
        }
    }

    public boolean ingreso(AsistenciaAlumnos dts) {        
        SQL = "insert into asistencia_personal (idpersonal, dni, fecha, hora_ingreso, hora_salida, idusuario)"
                + "values (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
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
        }
    }

    public boolean salida(AsistenciaAlumnos dts) {
        SQL = "UPDATE asistencia_personal SET hora_salida=?, idusuario=?"
                + "WHERE idAsistencia=? AND fecha=? AND dni=?";
        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
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
        }
    }

    public boolean eliminar(AsistenciaAlumnos dts) {
        SQL = "UPDATE asistencia_personal SET estado='I' WHERE idAsistencia=?";
        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            pst.setInt(1, dts.getIdAsistenciaAlumnos());
            
            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
}
