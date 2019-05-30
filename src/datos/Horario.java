package datos;

/**
 *
 * @author Dan Arevalo
 */
public class Horario {
    
    private String dni;
    
    private String elunes;
    private String emartes;
    private String emiercoles;
    private String ejueves;
    private String eviernes;
    
    private String slunes;
    private String smartes;
    private String smiercoles;
    private String sjueves;
    private String sviernes;
    
    public Horario() {
        
    }
    
    public Horario(String _dni, String _elunes, String _emartes, String _emiercoles, String _ejueves, String _eviernes, String _slunes, String _smartes, String _smiercoles, String _sjueves, String _sviernes) {
        this.dni = _dni;
        this.elunes = _elunes;
        this.emartes = _emartes;
        this.emiercoles = _emiercoles;
        this.ejueves = _ejueves;
        this.eviernes = _eviernes;
        this.slunes = _slunes;
        this.smartes = _smartes;
        this.smiercoles = _smiercoles;
        this.sjueves = _sjueves;
        this.sviernes = _sviernes;
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
     * @return the elunes
     */
    public String getElunes() {
        return elunes;
    }

    /**
     * @param elunes the elunes to set
     */
    public void setElunes(String elunes) {
        this.elunes = elunes;
    }

    /**
     * @return the emartes
     */
    public String getEmartes() {
        return emartes;
    }

    /**
     * @param emartes the emartes to set
     */
    public void setEmartes(String emartes) {
        this.emartes = emartes;
    }

    /**
     * @return the emiercoles
     */
    public String getEmiercoles() {
        return emiercoles;
    }

    /**
     * @param emiercoles the emiercoles to set
     */
    public void setEmiercoles(String emiercoles) {
        this.emiercoles = emiercoles;
    }

    /**
     * @return the ejueves
     */
    public String getEjueves() {
        return ejueves;
    }

    /**
     * @param ejueves the ejueves to set
     */
    public void setEjueves(String ejueves) {
        this.ejueves = ejueves;
    }

    /**
     * @return the eviernes
     */
    public String getEviernes() {
        return eviernes;
    }

    /**
     * @param eviernes the eviernes to set
     */
    public void setEviernes(String eviernes) {
        this.eviernes = eviernes;
    }

    /**
     * @return the slunes
     */
    public String getSlunes() {
        return slunes;
    }

    /**
     * @param slunes the slunes to set
     */
    public void setSlunes(String slunes) {
        this.slunes = slunes;
    }

    /**
     * @return the smartes
     */
    public String getSmartes() {
        return smartes;
    }

    /**
     * @param smartes the smartes to set
     */
    public void setSmartes(String smartes) {
        this.smartes = smartes;
    }

    /**
     * @return the smiercoles
     */
    public String getSmiercoles() {
        return smiercoles;
    }

    /**
     * @param smiercoles the smiercoles to set
     */
    public void setSmiercoles(String smiercoles) {
        this.smiercoles = smiercoles;
    }

    /**
     * @return the sjueves
     */
    public String getSjueves() {
        return sjueves;
    }

    /**
     * @param sjueves the sjueves to set
     */
    public void setSjueves(String sjueves) {
        this.sjueves = sjueves;
    }

    /**
     * @return the sviernes
     */
    public String getSviernes() {
        return sviernes;
    }

    /**
     * @param sviernes the sviernes to set
     */
    public void setSviernes(String sviernes) {
        this.sviernes = sviernes;
    }
    
}
