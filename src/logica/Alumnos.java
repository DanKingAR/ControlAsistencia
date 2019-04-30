package logica;

import BD.ConexionBD;
import datos.Alumno;
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
public class Alumnos {
    
    private final ConexionBD postgres = new ConexionBD();
    private final Connection conn = postgres.conectar();
    private String SQL = "";
    public int totalRegistros;
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"IdAlumno", "Nombre", "Fapellido", "LApellido", "Dni", "Direccion", "Género", "Fecha Nacimiento", "Fecha Registro", "Grado", "Seccion", "Teléfono", "Sede", "Jornada"};
        String[] registros = new String[14];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT idpersonal, nombre, fapellido, lapellido, dni, direccion, genero, fecha_nace, fecha_registro, grado, grupo, telefono, sede, jornada"
                + " FROM personal WHERE dni LIKE '%" + buscar + "%' AND idpersonal = 1 AND estado='A' ORDER BY nombre ASC;";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idpersonal");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("fapellido");
                registros[3] = rs.getString("lapellido");
                registros[4] = rs.getString("dni");
                registros[5] = rs.getString("direccion");
                registros[6] = rs.getString("genero");
                registros[7] = rs.getString("fecha_nace");
                registros[8] = rs.getString("fecha_registro");
                registros[9] = rs.getString("grado");
                registros[10] = rs.getString("grupo");
                registros[11] = rs.getString("telefono");
                registros[12] = rs.getString("sede");
                registros[13] = rs.getString("jornada");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel mostrarvista_ingresopersonal(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"IdAlumno", "Nombre", "Fapellido", "LApellido", "Dni", "Direccion", "Género", "Fecha Nacimiento", "Fecha Registro", "Grado", "Seccion", "Teléfono", "Sede", "Jornada"};
        String[] registros = new String[14];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT idpersonal, nombre, fapellido, lapellido, dni, direccion, genero, fecha_nace, fecha_registro, grado, grupo, telefono, sede, jornada"
                + " FROM personal WHERE dni LIKE '%" + buscar + "%' AND idpersonal = 1 AND estado='A' ORDER BY nombre ASC;";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idpersonal");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("fapellido");
                registros[3] = rs.getString("lapellido");
                registros[4] = rs.getString("dni");
                registros[5] = rs.getString("direccion");
                registros[6] = rs.getString("genero");
                registros[7] = rs.getString("fecha_nace");
                registros[8] = rs.getString("fecha_registro");
                registros[9] = rs.getString("grado");
                registros[10] = rs.getString("grupo");
                registros[11] = rs.getString("telefono");
                registros[12] = rs.getString("sede");
                registros[13] = rs.getString("jornada");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel mostrarvista_salidapersonal(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"IdAlumno", "Nombre", "Fapellido", "LApellido", "Dni", "Direccion", "Género", "Fecha Nacimiento", "Fecha Registro", "Grado", "Seccion", "Teléfono", "Sede", "Jornada"};
        String[] registros = new String[14];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT idpersonal, nombre, fapellido, lapellido, dni, direccion, genero, fecha_nace, fecha_registro, grado, grupo, telefono, sede, jornada"
                + " FROM personal WHERE dni LIKE '%" + buscar + "%' AND idpersonal = 1 AND estado='A' ORDER BY nombre ASC;";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idpersonal");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("fapellido");
                registros[3] = rs.getString("lapellido");
                registros[4] = rs.getString("dni");
                registros[5] = rs.getString("direccion");
                registros[6] = rs.getString("genero");
                registros[7] = rs.getString("fecha_nace");
                registros[8] = rs.getString("fecha_registro");
                registros[9] = rs.getString("grado");
                registros[10] = rs.getString("grupo");
                registros[11] = rs.getString("telefono");
                registros[12] = rs.getString("sede");
                registros[13] = rs.getString("jornada");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel mostrarvistapersonal(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"IdAlumno", "Nombre", "Fapellido", "LApellido", "Dni", "Direccion", "Género", "Fecha Nacimiento", "Fecha Registro", "Grado", "Seccion", "Teléfono", "Sede", "Jornada"};
        String[] registros = new String[14];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT idpersonal, nombre, fapellido, lapellido, dni, direccion, genero, fecha_nace, fecha_registro, grado, grupo, telefono, sede, jornada"
                + " FROM personal WHERE dni LIKE '%" + buscar + "%' AND idpersonal = 1 AND estado='A' ORDER BY nombre ASC;";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("idpersonal");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("fapellido");
                registros[3] = rs.getString("lapellido");
                registros[4] = rs.getString("dni");
                registros[5] = rs.getString("direccion");
                registros[6] = rs.getString("genero");
                registros[7] = rs.getString("fecha_nace");
                registros[8] = rs.getString("fecha_registro");
                registros[9] = rs.getString("grado");
                registros[10] = rs.getString("grupo");
                registros[11] = rs.getString("telefono");
                registros[12] = rs.getString("sede");
                registros[13] = rs.getString("jornada");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(Alumno dts) {
        SQL = "INSERT INTO personal(idpersonal, nombre, fapellido, lapellido, dni, direccion, genero, fecha_nace, fecha_registro, grado, grupo, telefono, sede, jornada)" + 
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            pst.setInt(1, 1);
            pst.setString(2, dts.getNombre());
            pst.setString(3, dts.getFapellido());
            pst.setString(4, dts.getLapellido());
            pst.setString(5, dts.getDni());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getGenero());
            pst.setDate(8, dts.getFecha_nace());
            pst.setDate(9, dts.getFecha_registro());
            pst.setString(10, dts.getGrado());
            pst.setString(11, dts.getGrupo());
            pst.setString(12, dts.getTelefono());
            pst.setString(13, dts.getSede());
            pst.setString(14, dts.getJornada());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Alumno dts) {
        SQL = "UPDATE personal "
                + "SET lapellido=?, direccion=?, fecha_nace=?, fecha_registro=?, grado=?, grupo=?, telefono=?, sede=?, jornada=?"
                + "WHERE idpersonal=1 AND dni=?";
        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            pst.setString(1, dts.getLapellido());
            pst.setString(2, dts.getDireccion());
            pst.setDate(3, dts.getFecha_nace());
            pst.setDate(4, dts.getFecha_registro());
            pst.setString(5, dts.getGrado());
            pst.setString(6, dts.getGrupo());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getSede());
            pst.setString(9, dts.getJornada());
            pst.setString(10, dts.getDni());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Alumno dts) {
        SQL = "UPDATE personal SET estado='I' WHERE idpersonal=1 AND dni=?";
        try {
            PreparedStatement pst = conn.prepareStatement(SQL);
            pst.setString(1, dts.getDni());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
}
