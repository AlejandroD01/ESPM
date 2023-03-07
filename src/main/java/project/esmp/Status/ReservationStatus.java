package project.esmp.Status;

/**
 * @author Ale
 */
public enum ReservationStatus {
    ACCEPTED(1, "Accepted", "Reservation has been made."),
    FAULTED(2, "Faulted", "Reservation has not been made, because\n"
            + "connectors or specified connector are in a faulted\n"
            + "state."),
    OCCUPIED(3, "Occupied ", "Reservation has not been made. All connectors or\n"
            + "the specified connector are occupied."),
    REJECTED(4, "Rejected", "Reservation has not been made. Charge Point is\n"
            + "not configured to accept reservations."),
    Unavailable(5, "Unavailable ", "Reservation has not been made, because\n"
            + "connectors or specified connector are in an\n"
            + "unavailable state.");

    private Integer reservationStatusID;
    private String value;
    private String description;

    /**
     *
     * Constructor. Al asignarle uno de los valores posibles a una variable del
     * tipo enumerado el constructor asigna * automáticamente valores de los
     * campos
     *
     */
    private ReservationStatus(Integer reservationStatusID, String value, String description) {
        this.reservationStatusID = reservationStatusID;
        this.value = value;
        this.description = description;
    }

    public Integer getReservationStatusID() {
        return reservationStatusID;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

}
