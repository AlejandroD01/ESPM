package project.esmp.errorCode;

/**
 * @author Ale
 */
public enum ChargePointErrorCode {
    CONNECTORLOCKFAILURE(1, "ConnectorLockFailure", "Failure to lock or unlock connector."),
    EVCOMMUNICATIONERROR(2, "EVCommunicationError", "Communication failure with the vehicle, might be\n"
            + "Mode 3 or other communication protocol\n"
            + "problem. This is not a real error in the sense that\n"
            + "the Charge Point doesn’t need to go to the faulted\n"
            + "state. Instead, it should go to the SuspendedEVSE\n"
            + "state."),
    GROUNDFAILURE(3, "GroundFailure", "Ground fault circuit interrupter has been\n"
            + "activated."),
    HIGHTEMPERATURE(4, "HighTemperature", "Temperature inside Charge Point is too high."),
    INTERNALERROR(5, "InternalError", "Error in internal hard- or software component."),
    LOCALLISTCONFLICT(6, "LocalListConflict", "The authorization information received from the\n"
            + "Central System is in conflict with the\n"
            + "LocalAuthorizationList."),
    NOERROR(7, "NoError", "No error to report."),
    OTHERERROR(8, "OtherError", "Other type of error. More information in\n"
            + "vendorErrorCode."),
    OVERCURRENTFAILURE(9, "OverCurrentFailure", "Over current protection device has tripped."),
    OVERVOLTAGE(10, "OverVoltage", "Voltage has risen above an acceptable level."),
    POWERMETERFAILURE(11, "PowerMeterFailure", "Failure to read power meter."),
    POWERSWITCHFAILURE(12, "PowerSwitchFailure", "Failure to control power switch"),
    READERFAILURE(13, "ReaderFailure", "Failure with idTag reader."),
    RESETFAILURE(14, "ResetFailure", "Unable to perform a reset."),
    UNDERVOLTAGE(15, "UnderVoltage", "Voltage has dropped below an acceptable level."),
    WEAKSIGNAL(16, "WeakSignal", "Wireless communication device reports a weak\n"
            + "signal");

    private Integer chargePointErrorCodeID;
    private String value;
    private String description;

    /**
     *
     * Constructor. Al asignarle uno de los valores posibles a una variable del
     * tipo enumerado el constructor asigna * automáticamente valores de los
     * campos
     *
     */
   
    private ChargePointErrorCode(Integer chargePointErrorCodeID, String value, String description) {
        this.chargePointErrorCodeID = chargePointErrorCodeID;
        this.value = value;
        this.description = description;
    }

    public Integer getChargePointErrorCodeID() {
        return chargePointErrorCodeID;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

}
