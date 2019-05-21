package logica;

import BD.ConexionBD;
import datos.Alumno;
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
public class Alumnos {
    
    private final ConexionBD postgres = new ConexionBD();
    private Connection con = null;
    private String SQL = "";
    public int totalRegistros, totalEst, totalDocen, totalAdmin;
    
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"IdAlumno", "Nombre", "P. Apellido", "S. Apellido", "Identificación", "Dirección", "Género", "Fecha de Nacimiento", "Fecha de Registro", "Grado", "Sección", "Teléfono", "Sede", "Jornada"};
        String[] registros = new String[14];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT idpersonal, nombre, fapellido, lapellido, dni, direccion, genero, fecha_nace, fecha_registro, grado, grupo, telefono, sede, jornada"
                + " FROM personal WHERE dni LIKE '%" + buscar + "%' AND idpersonal = 1 AND estado='A' ORDER BY nombre ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
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

    public DefaultTableModel mostrarvista_ingresopersonal(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"IdAlumno", "Nombre", "P. Apellido", "S. Apellido", "Identificación", "Dirección", "Género", "Fecha de Nacimiento", "Fecha de Registro", "Grado", "Sección", "Teléfono", "Sede", "Jornada"};
        String[] registros = new String[14];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT idpersonal, nombre, fapellido, lapellido, dni, direccion, genero, fecha_nace, fecha_registro, grado, grupo, telefono, sede, jornada"
                + " FROM personal WHERE dni LIKE '%" + buscar + "%' AND idpersonal = 1 AND estado='A' ORDER BY nombre ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
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
        DefaultTableModel modeloEst;

        String[] titulosEst = {"IdAlumno", "Nombre", "P. Apellido", "S. Apellido", "Identificación", "Dirección", "Género", "Fecha de Nacimiento", "Fecha de Registro", "Grado", "Grupo", "Teléfono", "Sede", "Jornada"};
        String[] registros = new String[14];
        totalEst = 0;
        modeloEst = new DefaultTableModel(null, titulosEst);
        SQL = "SELECT idpersonal, nombre, fapellido, lapellido, dni, direccion, genero, fecha_nace, fecha_registro, grado, grupo, telefono, sede, jornada"
                + " FROM personal WHERE dni LIKE '%" + buscar + "%' AND idpersonal = 1 AND estado='A' ORDER BY nombre ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rsEst = st.executeQuery(SQL);
            while (rsEst.next()) {
                registros[0] = rsEst.getString("idpersonal");
                registros[1] = rsEst.getString("nombre");
                registros[2] = rsEst.getString("fapellido");
                registros[3] = rsEst.getString("lapellido");
                registros[4] = rsEst.getString("dni");
                registros[5] = rsEst.getString("direccion");
                registros[6] = rsEst.getString("genero");
                registros[7] = rsEst.getString("fecha_nace");
                registros[8] = rsEst.getString("fecha_registro");
                registros[9] = rsEst.getString("grado");
                registros[10] = rsEst.getString("grupo");
                registros[11] = rsEst.getString("telefono");
                registros[12] = rsEst.getString("sede");
                registros[13] = rsEst.getString("jornada");

                totalEst = totalEst + 1;
                modeloEst.addRow(registros);
            }
            return modeloEst;
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
    
    public DefaultTableModel mostrarvista_salidapersonalAdmin(String buscar) {
        DefaultTableModel modeloAdmin;

        String[] titulosAdmin = {"IdAlumno", "Cargo", "Nombre", "P. Apellido", "S. Apellido", "Identificación", "Dirección", "Email", "Género", "Fecha de Nacimiento", "Fecha de Ingreso", "Teléfono"};
        String[] registros = new String[12];
        totalAdmin = 0;
        modeloAdmin = new DefaultTableModel(null, titulosAdmin);
        SQL = "SELECT p.idpersonal, c.idcargo, c.descripcion, p.nombre, p.fapellido, p.lapellido, p.dni, p.direccion, p.email, p.genero, p.fecha_nace, p.fecha_ingreso, p.telefono"
                + " FROM personal p INNER JOIN cargo c ON p.idcargo = c.idcargo WHERE dni LIKE '%" + buscar + "%' AND p.idpersonal = 3 AND p.estado='A' ORDER BY p.nombre ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
            ResultSet rsAdmin = st.executeQuery(SQL);
            while (rsAdmin.next()) {
                registros[0] = rsAdmin.getString("idpersonal");
                registros[1] = rsAdmin.getString("descripcion");
                registros[2] = rsAdmin.getString("nombre");
                registros[3] = rsAdmin.getString("fapellido");
                registros[4] = rsAdmin.getString("lapellido");
                registros[5] = rsAdmin.getString("dni");
                registros[6] = rsAdmin.getString("direccion");
                registros[7] = rsAdmin.getString("email");
                registros[8] = rsAdmin.getString("genero");
                registros[9] = rsAdmin.getString("fecha_nace");
                registros[10] = rsAdmin.getString("fecha_ingreso");
                registros[11] = rsAdmin.getString("telefono");

                totalAdmin = totalAdmin + 1;
                modeloAdmin.addRow(registros);
            }
            return modeloAdmin;
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
    
    public DefaultTableModel mostrarvista_salidapersonalDocen(String buscar) {
        DefaultTableModel modeloDocen;

        String[] titulosDocen = {"IdAlumno", "Nombre", "P. Apellido", "S. Apellido", "Identificación", "Dirección", "Email", "Género", "Fecha de Nacimiento", "Materia", "Teléfono"};
        String[] registros = new String[11];
        totalDocen = 0;
        modeloDocen = new DefaultTableModel(null, titulosDocen);
        SQL = "SELECT idpersonal, nombre, fapellido, lapellido, dni, direccion, email, genero, materia, fecha_nace, telefono"
                + " FROM personal WHERE dni LIKE '%" + buscar + "%' AND idpersonal = 2 AND estado='A' ORDER BY nombre ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();            
            ResultSet rsDocen = st.executeQuery(SQL);
            while (rsDocen.next()) {             
                registros[0] = rsDocen.getString("idpersonal");
                registros[1] = rsDocen.getString("nombre");
                registros[2] = rsDocen.getString("fapellido");
                registros[3] = rsDocen.getString("lapellido");
                registros[4] = rsDocen.getString("dni");
                registros[5] = rsDocen.getString("direccion");
                registros[6] = rsDocen.getString("email");
                registros[7] = rsDocen.getString("genero");
                registros[8] = rsDocen.getString("fecha_nace");
                registros[9] = rsDocen.getString("materia");
                registros[10] = rsDocen.getString("telefono");
                
                totalDocen += 1;
                modeloDocen.addRow(registros);
            }
            return modeloDocen;
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

        String[] titulos = {"IdAlumno", "Nombre", "P. Apellido", "S. Apellido", "Identificación", "Dirección", "Género", "Fecha de Nacimiento", "Fecha de Registro", "Grado", "Sección", "Teléfono", "Sede", "Jornada"};
        String[] registros = new String[14];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT idpersonal, nombre, fapellido, lapellido, dni, direccion, genero, fecha_nace, fecha_registro, grado, grupo, telefono, sede, jornada"
                + " FROM personal WHERE dni LIKE '%" + buscar + "%' AND idpersonal = 1 AND estado='A' ORDER BY nombre ASC;";

        try {
            con = postgres.conectar();
            Statement st = con.createStatement();
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

    public boolean insertar(Alumno dts) {
        SQL = "INSERT INTO personal(idpersonal, nombre, fapellido, lapellido, dni, direccion, genero, fecha_nace, fecha_registro, grado, grupo, telefono, sede, jornada)" + 
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
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

    public boolean editar(Alumno dts) {
        SQL = "UPDATE personal "
                + "SET lapellido=?, direccion=?, fecha_nace=?, fecha_registro=?, grado=?, grupo=?, telefono=?, sede=?, jornada=?"
                + "WHERE idpersonal=1 AND dni=?";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
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

    public boolean eliminar(Alumno dts) {
        SQL = "UPDATE personal SET estado='I' WHERE idpersonal=1 AND dni=?";
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
