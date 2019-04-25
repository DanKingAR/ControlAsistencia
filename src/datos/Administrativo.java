package datos;

import java.sql.Date;

/**
 *
 * @author Dan Arevalo
 */
public class Administrativo extends Cargo {
    
    private int idAdministrativo;
    private int idCargo;
    private String nombre;
    private String fapellido;
    private String lapellido;
    private String dni;
    private String telefono;
    private String direccion;
    private String email;
    private String sexo;
    private Date fecha_nace;
    private Date fecha_ingreso;
    
    public Administrativo(){
        
    }
    
    public Administrativo(int idAdministrativo, int idCargo, String nombres, String fapellido, String lapellido, String dni, String telefono, String direccion, String email, String sexo, Date fecha_nace, Date fecha_ingreso){
        this.idAdministrativo = idAdministrativo;
        this.idCargo = idCargo;
        this.nombre = nombres;
        this.fapellido = fapellido;
        this.lapellido = lapellido;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.sexo = sexo;
        this.fecha_nace = fecha_nace;
        this.fecha_ingreso = fecha_ingreso;
    }

    /**
     * @return the idAdministrativo
     */
    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    /**
     * @param idAdministrativo the idAdministrativo to set
     */
    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    /**
     * @return the idCargo
     */
    @Override
    public int getIdCargo() {
        return idCargo;
    }

    /**
     * @param idCargo the idCargo to set
     */
    @Override
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
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
