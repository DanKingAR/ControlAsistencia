package logica;

import BD.ConexionBD;
import datos.Horario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dan Arevalo
 */
public class Horarios {
    
    private final ConexionBD postgres = new ConexionBD();
    private Connection con = null;
    private String SQL = "";
    
    public boolean insert(Horario dts) {
        SQL = "INSERT INTO horario (dni, elunes, emartes, emiercoles, ejueves, eviernes, slunes, smartes, smiercoles, sjueves, sviernes)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            con = postgres.conectar();
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, dts.getDni());
            pst.setString(2, dts.getElunes());
            pst.setString(3, dts.getEmartes());
            pst.setString(4, dts.getEmiercoles());
            pst.setString(5, dts.getEjueves());
            pst.setString(6, dts.getEviernes());
            pst.setString(7, dts.getSlunes());
            pst.setString(8, dts.getSmartes());
            pst.setString(9, dts.getSmiercoles());
            pst.setString(10, dts.getSjueves());
            pst.setString(11, dts.getSviernes());
            
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
