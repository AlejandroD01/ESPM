package project.esmp.Status;

/**
 * @author Ale
 */
public enum RegistrationStatus {
    ACCEPTED(1, "Accepted", "Charge point is accepted by Central System."),
    PENDING(2, "Pending ", "Central System is not yet ready to accept the Charge Point. Central System may send messages to retrieve information or prepare the Charge Point."),
    REJECTED (3, "Rejected ", "Charge point is not accepted by Central System. This may happen when the Charge Point id is not known by Central System.");

    private Integer statusRegistrationID;
    private String value;
    private String description;

    /**
     *
     * Constructor. Al asignarle uno de los valores posibles a una variable del
     * tipo enumerado el constructor asigna * automáticamente valores de los
     * campos
     *
     */
    private RegistrationStatus(Integer statusRegistrationID, String value, String description) {
        this.statusRegistrationID = statusRegistrationID;
        this.value = value;
        this.description = description;
    }

    public Integer getStatusRegistrationID() {
        return statusRegistrationID;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

}
