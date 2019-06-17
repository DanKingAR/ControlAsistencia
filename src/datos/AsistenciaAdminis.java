package datos;

/**
 *
 * @author Dan Arevalo
 */
public class AsistenciaAdminis extends Administrativo {
    
    private int idAsistenciaAdminis;
    private int idAdministrativo;
    private String dni;
    private String fecha;
    private String hora_ingreso;
    private String hora_salida;
    private int idUsuario;
    
    public AsistenciaAdminis() {
        
    }
    
    public AsistenciaAdminis(int idAsistenciaAdminis, int idAdministrativo, String dni, String fecha, String hora_ingreso, String hora_salida, int idUsuario) {
        this.idAsistenciaAdminis = idAsistenciaAdminis;
        this.idAdministrativo = idAdministrativo;
        this.dni = dni;
        this.fecha = fecha;
        this.hora_ingreso = hora_ingreso;
        this.hora_salida = hora_salida;
        this.idUsuario = idUsuario;
    }

    /**
     * @return the idAsistenciaAdminis
     */
    public int getIdAsistenciaAdminis() {
        return idAsistenciaAdminis;
    }

    /**
     * @param idAsistenciaAdminis the idAsistenciaAdminis to set
     */
    public void setIdAsistenciaAdminis(int idAsistenciaAdminis) {
        this.idAsistenciaAdminis = idAsistenciaAdminis;
    }

    /**
     * @return the idAdministrativo
     */
    @Override
    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    /**
     * @param idAdministrativo the idAdministrativo to set
     */
    @Override
    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
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
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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
