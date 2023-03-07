package project.esmp.Status;

/**
 * @author Ale
 */

public enum AuthorizationStatus {
    ACCEPTED(1, "Accepted", "Identifier is allowed for charging."),
    BLOCKED(2, "Blocked", "Identifier has been blocked. Not allowed for charging."),
    EXPIRED(3, "Expired", "Identifier has expired. Not allowed for charging."),
    INVALID(4, "Invalid", "Identifier is unknown. Not allowed for charging."),
    CONCURRENTTX(5, "ConcurrentTx", "Identifier is already involved in another transaction and multiple transactions are not allowed.");
   

    private Integer statusAuthorizationID;
    private String value;
    private String description;

    /**
     *
     * Constructor. Al asignarle uno de los valores posibles a una variable del
     * tipo enumerado el constructor asigna      *
     * automáticamente valores de los campos
     *
     */
    private AuthorizationStatus(Integer statusAuthorizationID, String value, String description) {
        this.statusAuthorizationID = statusAuthorizationID;
        this.value = value;
        this.description = description;
    }

    public Integer getStatusAuthorizationID() {
        return statusAuthorizationID;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

 
}
