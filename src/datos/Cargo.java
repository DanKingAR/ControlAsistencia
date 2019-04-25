package datos;

/**
 *
 * @author Dan Arevalo
 */
public class Cargo {
    
    private int idCargo;
    private String cargoDescripcion;
    
    public Cargo() {
        
    }

    public Cargo(int idCargo, String cargoDescripcion) {
        this.idCargo = idCargo;
        this.cargoDescripcion = cargoDescripcion;
    }

    /**
     * @return the idCargo
     */
    public int getIdCargo() {
        return idCargo;
    }

    /**
     * @param idCargo the idCargo to set
     */
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    /**
     * @return the cargo descripción
     */
    public String getCargodescripcion() {
        return cargoDescripcion;
    }

    /**
     * @param cargoDescripcion the cargo descripción to set
     */
    public void setCargodescripcion(String cargoDescripcion) {
        this.cargoDescripcion = cargoDescripcion;
    }
    
}
