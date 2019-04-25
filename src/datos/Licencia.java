package datos;

import java.sql.Date;

/**
 *
 * @author Dan Arevalo
 */
public class Licencia extends Administrativo {
    
    private int idLicencia;
    private String dni;
    private Date fecha;
    private String tiempo;
    private String tipo_licencia;
    private String descripcion;
    
    public Licencia() {
        
    }
    
    public Licencia(int idLicencia, String dni, Date fecha, String tiempo, String tipo_licencia, String descripcion) {
        this.idLicencia = idLicencia;
        this.dni = dni;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.tipo_licencia = tipo_licencia;
        this.descripcion = descripcion;
    }

    /**
     * @return the idLicencia
     */
    public int getIdLicencia() {
        return idLicencia;
    }

    /**
     * @param idLicencia the idLicencia to set
     */
    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    /**
     * @return the idAdministrativo
     */
    @Override
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the idAdministrativo to set
     */
    @Override
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
     * @return the tipo_licencia
     */
    public String getTipo_licencia() {
        return tipo_licencia;
    }

    /**
     * @param tipo_licencia the tipo_licencia to set
     */
    public void setTipo_licencia(String tipo_licencia) {
        this.tipo_licencia = tipo_licencia;
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
