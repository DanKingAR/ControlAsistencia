package datos;

import java.sql.Date;

/**
 *
 * @author Dan Arevalo
 */
public class Docente {
    
    private int idDocente;
    private String nombre;
    private String fApellido;
    private String lApellido;
    private String genero;
    private String dni;
    private String telefono;
    private String direccion;
    private String email;
    private String materia;
    private Date fecha_nace;
    
    public Docente() {
        
    }
    
    public Docente(int idDocente, String nombre, String fApellido, String lApellido, String genero, String dni, String telefono, String direccion, String email, String materia, Date fecha_nace) {
        this.idDocente = idDocente;
        this.nombre = nombre;
        this.fApellido = fApellido;
        this.lApellido = lApellido;
        this.genero = genero;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.materia = materia;
        this.fecha_nace = fecha_nace;
    }

    /**
     * @return the idDocente
     */
    public int getIdDocente() {
        return idDocente;
    }

    /**
     * @param idDocente the idDocente to set
     */
    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
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
     * @return the fApellido
     */
    public String getfApellido() {
        return fApellido;
    }

    /**
     * @param fApellido the fApellido to set
     */
    public void setfApellido(String fApellido) {
        this.fApellido = fApellido;
    }

    /**
     * @return the lApellido
     */
    public String getlApellido() {
        return lApellido;
    }

    /**
     * @param lApellido the lApellido to set
     */
    public void setlApellido(String lApellido) {
        this.lApellido = lApellido;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
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
    
}
