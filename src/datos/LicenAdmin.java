package datos;

import java.sql.Date;

/**
 *
 * @author Dan Arevalo
 */
public class LicenAdmin {
    
    private int idLicenAdmin;
    private String dni;
    private Date fecha;
    private String tipoLicencia;
    private String tiempo;
    private String descripcion;
    
    public LicenAdmin() {
        
    }
    
    public LicenAdmin(int idLicenAdmin, String dni, Date fecha, String tiempo, String tipoLicencia, String descripcion) {
        this.idLicenAdmin = idLicenAdmin;
        this.dni = dni;
        this.fecha = fecha;
        this.tipoLicencia = tipoLicencia;
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }

    /**
     * @return the idLicenAdmin
     */
    public int getIdLicenAdmin() {
        return idLicenAdmin;
    }

    /**
     * @param idLicenAdmin the idLicenAdmin to set
     */
    public void setIdLicenAdmin(int idLicenAdmin) {
        this.idLicenAdmin = idLicenAdmin;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tipoLicencia
     */
    public String getTipoLicencia() {
        return tipoLicencia;
    }

    /**
     * @param tipoLicencia the tipoLicencia to set
     */
    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    /**
     * @return the tiempo
     */
    public String getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
