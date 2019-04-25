package datos;

/**
 *
 * @author Dan Arevalo
 */
public class AsistenciaAlumnos extends Alumno {
    
    private int idAsistenciaAlumnos;
    private int idPersonal;
    private String dni;
    private String fecha;
    private String hora_ingreso;
    private String hora_salida;
    private int idusuario;
    
    public AsistenciaAlumnos() {
        
    }
    
    public AsistenciaAlumnos(int idAsistenciaAlumnos, int idPersonal, String dni, String fecha, String hora_ingreso, String hora_salida, int idusuario) {
        this.idAsistenciaAlumnos = idAsistenciaAlumnos;
        this.idPersonal = idPersonal;
        this.dni = dni;
        this.fecha = fecha;
        this.hora_ingreso = hora_ingreso;
        this.hora_salida = hora_salida;
        this.idusuario = idusuario;
    }

    /**
     * @return the idAsistenciaAlumnos
     */
    public int getIdAsistenciaAlumnos() {
        return idAsistenciaAlumnos;
    }

    /**
     * @param idAsistenciaAlumnos the idAsistenciaAlumnos to set
     */
    public void setIdAsistenciaAlumnos(int idAsistenciaAlumnos) {
        this.idAsistenciaAlumnos = idAsistenciaAlumnos;
    }

    /**
     * @return the idPersonal
     */
    public int getIdPersonal() {
        return idPersonal;
    }

    /**
     * @param idPersonal the idPersonal to set
     */
    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
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
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
