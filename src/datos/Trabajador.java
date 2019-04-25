package datos;

import java.sql.Date;

/**
 *
 * @author Dan Arevalo
 */
public class Trabajador {
    
    private int idTrabajador;
    private String nombres;
    private String fapellido;
    private String lapellido;
    private String dni;
    private String telefono;
    private String direccion;
    private String email;
    private String sexo;
    private String login;
    private String password;
    private String acceso;
    private String estado;    
    private Date fecha_ingreso;
    
    public Trabajador() {
        
    }
    
    public Trabajador(int idTrabajador, String nombres, String fapellido, String lapellido, String dni, String telefono, String direccion, String email, String sexo, String login, String password, String acceso, String estado, Date fecha_ingreso) {
        this.idTrabajador = idTrabajador;
        this.nombres = nombres;
        this.fapellido = fapellido;
        this.lapellido = lapellido;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.sexo = sexo;
        this.login = login;
        this.password = password;
        this.acceso = acceso;
        this.estado = estado;
        this.fecha_ingreso = fecha_ingreso;
    }

    /**
     * @return the idTrabajador
     */
    public int getIdTrabajador() {
        return idTrabajador;
    }

    /**
     * @param idTrabajador the idTrabajador to set
     */
    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
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
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the acceso
     */
    public String getAcceso() {
        return acceso;
    }

    /**
     * @param acceso the acceso to set
     */
    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the fecha_ingreso
     */
    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    /**
     * @param fecha_ingreso the fecha_ingreso to set
     */
    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
}
