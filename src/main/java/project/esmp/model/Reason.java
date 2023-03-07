package project.esmp.model;

/**
 * @author Ale
 */
public enum Reason {
    EMERGENCYSTOP(1, "EmergencyStop ", "Emergency stop button was used"),
    EVDISCONNECTED(2, "EVDisconnected ", "disconnecting of cable, vehicle moved away from\n"
            + "inductive charge unit."),
    HARDRESET(3, "HardReset ", "A hard reset command was received."),
    LOCAL(4, "Local  ", "Stopped locally on request of the user at the\n"
            + "Charge Point. This is a regular termination of a\n"
            + "transaction. Examples: presenting an RFID tag,\n"
            + "pressing a button to stop."),
    OTHER(5, "Other ", "Any other reason."),
    POWERLOSS(6, "PowerLoss ", "Complete loss of power."),
    REBOOT(7, "Reboot  ", "A locally initiated reset/reboot occurred. (for\n"
            + "instance watchdog kicked in)"),
    REMOTE(8, "Remote ", "Stopped remotely on request of the user. This is a\n"
            + "regular termination of a transaction. Examples:\n"
            + "termination using a smartphone app, exceeding a\n"
            + "(non local) prepaid credit."),
    SOFTRESET(9, "SoftReset  ", "A soft reset command was received."),
    UNLOCKCOMMAND(10, "UnlockCommand  ", "Central System sent an Unlock Connector\n"
            + "command."),
    DEAUTHORIZED(11, "DeAuthorized  ", "The transaction was stopped because of the\n"
            + "authorization status in a StartTransaction.conf");

    private Integer ReasonsID;
    private String value;
    private String description;

    /**
     *
     * Constructor. Al asignarle uno de los valores posibles a una variable del
     * tipo enumerado el constructor asigna * automáticamente valores de los
     * campos
     *
     */
    private Reason(Integer ReasonsID, String value, String description) {
        this.ReasonsID = ReasonsID;
        this.value = value;
        this.description = description;
    }

    public Integer getReasonsID() {
        return ReasonsID;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

}
