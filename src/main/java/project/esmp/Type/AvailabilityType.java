package project.esmp.Type;

/**
 * @author Ale
 */

public enum AvailabilityType {
    INOPERATIVE(1, "Inoperative", "Charge point is not available for charging."),
    OPERATIVE(2, "Operative", "Charge point is available for charging.");
   

    private Integer availabilityTypeID;
    private String value;
    private String description;

    /**
     *
     * Constructor. Al asignarle uno de los valores posibles a una variable del
     * tipo enumerado el constructor asigna      *
     * automáticamente valores de los campos
     *
     */
    private AvailabilityType(Integer availabilityTypeID, String value, String description) {
        this.availabilityTypeID = availabilityTypeID;
        this.value = value;
        this.description = description;
    }

    public Integer getAvailabilityTypeID() {
        return availabilityTypeID;
    }
    public String getValue() {
        return value;
    }
    public String getDescription() {
        return description;
    }

}
