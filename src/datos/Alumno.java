package datos;

import java.sql.Date;

/**
 *
 * @author Dan Arevalo
 */
public class Alumno {
    
    private int idEstudiante;
    private String nombre;
    private String fapellido;
    private String lapellido;
    private String dni;    
    private String direccion;
    private String genero;
    private Date fecha_nace;
    private Date fecha_registro;
    private String grado;
    private String grupo;
    private String telefono;
    private String sede;
    private String jornada;
    
    public Alumno() {
        
    }
    
    public Alumno(int idAlumno, String nombre, String fapellido, String lapellido, String dni, String direccion, String genero, Date fecha_nace, Date fecha_registro, String grado, String grupo, String telefono, String sede, String jornada) {
        this.idEstudiante = idAlumno;
        this.nombre = nombre;
        this.fapellido = fapellido;
        this.lapellido = lapellido;
        this.dni = dni;
        this.direccion = direccion;
        this.genero = genero;
        this.fecha_nace = fecha_nace;
        this.fecha_registro = fecha_registro;
        this.grado = grado;
        this.grupo = grupo;
        this.telefono = telefono;
        this.sede = sede;
        this.jornada = jornada;
    }

    /**
     * @return the idEstudiante
     */
    public int getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * @param idEstudiante the idEstudiante to set
     */
    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fapellido
     */
    public String getFapellido() {
        return fapellido;
    }

    /**
     * @param fapellido the fapellido to set
     */
    public void setFapellido(String fapellido) {
        this.fapellido = fapellido;
    }

    /**
     * @return the lapellido
     */
    public String getLapellido() {
        return lapellido;
    }

    /**
     * @param lapellido the lapellido to set
     */
    public void setLapellido(String lapellido) {
        this.lapellido = lapellido;
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the fecha_nace
     */
    public Date getFecha_nace() {
        return fecha_nace;
    }

    /**
     * @param fecha_nace the fecha_nace to set
     */
    public void setFecha_nace(Date fecha_nace) {
        this.fecha_nace = fecha_nace;
    }

    /**
     * @return the fecha_registro
     */
    public Date getFecha_registro() {
        return fecha_registro;
    }

    /**
     * @param fecha_registro the fecha_registro to set
     */
    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    /**
     * @return the grado
     */
    public String getGrado() {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(String grado) {
        this.grado = grado;
    }

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the sede
     */
    public String getSede() {
        return sede;
    }

    /**
     * @param sede the sede to set
     */
    public void setSede(String sede) {
        this.sede = sede;
    }

    /**
     * @return the jornada
     */
    public String getJornada() {
        return jornada;
    }

    /**
     * @param jornada the jornada to set
     */
    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    
    
}
