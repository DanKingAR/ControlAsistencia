package datos;

/**
 *
 * @author Dan Arevalo
 */
public class AsistenciaDocentes extends Docente {
    
    private int idAsistencia;
    private int idDocente;
    private String dni;
    private String fecha;
    private String hora_ingreso;
    private String hora_salida;
    private int idusuario;
    
    public AsistenciaDocentes() {
        
    }
    
    public AsistenciaDocentes(int idAsistencia, int idDocente, String dni, String fecha, String hora_ingreso, String hora_salida, int idusuario) {
        this.idAsistencia = idAsistencia;
        this.idDocente = idDocente;
        this.dni = dni;
        this.fecha = fecha;
        this.hora_ingreso = hora_ingreso;
        this.hora_salida = hora_salida;
        this.idusuario = idusuario;
    }

    /**
     * @return the idAsistencia
     */
    public int getIdAsistencia() {
        return idAsistencia;
    }

    /**
     * @param idAsistencia the idAsistencia to set
     */
    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora_ingreso
     */
    public String getHora_ingreso() {
        return hora_ingreso;
    }

    /**
     * @param hora_ingreso the hora_ingreso to set
     */
    public void setHora_ingreso(String hora_ingreso) {
        this.hora_ingreso = hora_ingreso;
    }

    /**
     * @return the hora_salida
     */
    public String getHora_salida() {
        return hora_salida;
    }

    /**
     * @param hora_salida the hora_salida to set
     */
    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    /**
     * @return the idDocente
     */
    @Override
    public int getIdDocente() {
        return idDocente;
    }

    /**
     * @param idDocente the idDocente to set
     */
    @Override
    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    /**
     * @return the idusuario
     */
    public int getIdusuario() {
        return idusuario;
    }

    /**
     * @param idusuario the idusuario to set
     */
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    /**
     * @return the dni
     */
    @Override
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
