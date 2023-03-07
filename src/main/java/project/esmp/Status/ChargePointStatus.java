package project.esmp.Status;

/**
 * @author Ale
 */
public enum ChargePointStatus {
    AVAILABLE(1, "Available ", "When a Connector becomes available for a new\n"
            + "user (Operative)"),
    PREPARING(2, "Preparing", "When a Connector becomes no longer available\n"
            + "for a new user but no charging session is active.\n"
            + "Typically a Connector is occupied when a user\n"
            + "presents a tag, inserts a cable or a vehicle\n"
            + "occupies the parking bay\n"
            + "(Operative)"),
    CHARGING(3, "Charging ", "When the contactor of a Connector closes,\n"
            + "allowing the vehicle to charge\n"
            + "(Operative)"),
    SUSPENDEDEVSE(4, "SuspendedEVSE ", "When the contactor of a Connector opens upon\n"
            + "request of the EVSE, e.g. due to a smart charging\n"
            + "restriction or as the result of\n"
            + "StartTransaction.conf indicating that charging is\n"
            + "not allowed\n"
            + "(Operative)"),
    SUSPENDEDEV(5, "SuspendedEV", "When the EVSE is ready to deliver energy but\n"
            + "contactor is open, e.g. the EV is not ready."),
    FINISHING(6, "Finishing", "When a charging session has stopped at a\n"
            + "Connector, but the Connector is not yet available\n"
            + "for a new user, e.g. the cable has not been\n"
            + "removed or the vehicle has not left the parking\n"
            + "bay\n"
            + "(Operative)"),
    RESERVED(7, "Reserved ", "When a Connector becomes reserved as a result of\n"
            + "a Reserve Now command\n"
            + "(Operative)"),
    UNAVAILABLE(8, "Unavailable ", "When a Connector becomes unavailable as the\n"
            + "result of a Change Availability command or an\n"
            + "event upon which the Charge Point transitions to\n"
            + "unavailable at its discretion. Upon receipt of a\n"
            + "Change Availability command, the status MAY\n"
            + "change immediately or the change MAY be\n"
            + "scheduled. When scheduled, the Status\n"
            + "Notification shall be send when the availability\n"
            + "change becomes effective\n"
            + "(Inoperative)"),
    FAULTED(9, "Faulted  ", "When a Charge Point or connector has reported\n"
            + "an error and is not available for energy delivery .\n"
            + "(Inoperative).");

    private Integer chargePointStatusID;
    private String value;
    private String description;

    /**
     *
     * Constructor. Al asignarle uno de los valores posibles a una variable del
     * tipo enumerado el constructor asigna * automáticamente valores de los
     * campos
     *
     */
    private ChargePointStatus(Integer chargePointStatusID, String value, String description) {
        this.chargePointStatusID = chargePointStatusID;
        this.value = value;
        this.description = description;
    }

    public Integer getChargePointStatusID() {
        return chargePointStatusID;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

}
