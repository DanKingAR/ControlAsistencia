package datos;

import java.sql.Date;

/**
 *
 * @author Dan Arevalo
 */
public class Permiso extends Alumno {
    
    private int idPermiso;
    private String dni;
    private Date fecha;
    private String tiempo;
    private String descripcion;
    
    public Permiso() {
        
    }
    
    public Permiso(int idPermiso, String dni, Date fecha, String tiempo, String descripcion) {
        this.idPermiso = idPermiso;
        this.dni = dni;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }

    /**
     * @return the idPermiso
     */
    public int getIdPermiso() {
        return idPermiso;
    }

    /**
     * @param idPermiso the idPermiso to set
     */
    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    /**
     * @return the idEstudiante
     */
    @Override
    public String getDni() {
        return dni;
    }

    /**
     * @param idEstudiante the idAlumno to set
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
     * @return the descripción
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripción to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
