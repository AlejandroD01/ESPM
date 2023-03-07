package project.esmp.dto;

import java.sql.Timestamp;
import project.esmp.errorCode.ChargePointErrorCode;
import project.esmp.model.Reason;

/**
 * @author Ale
 */
public class DtoChargingSessions {

    private Integer chargingSessionID;
    private Timestamp timestampStart;
    private int meterStart;
    private Timestamp timestampStop;
    private int meterStop;
    private int duration;
    private double charged;

    private Reason reason;
    private ChargePointErrorCode chargePointErrorCode;

    public DtoChargingSessions() {
    }

    public DtoChargingSessions(Integer chargingSessionID, Timestamp timestampStart, int meterStart, Timestamp timestampStop, int meterStop, int duration, double charged, Reason reason, ChargePointErrorCode chargePointErrorCode) {
        this.chargingSessionID = chargingSessionID;
        this.timestampStart = timestampStart;
        this.meterStart = meterStart;
        this.timestampStop = timestampStop;
        this.meterStop = meterStop;
        this.duration = duration;
        this.charged = charged;
        this.reason = reason;
        this.chargePointErrorCode = chargePointErrorCode;
    }

    public ChargePointErrorCode getChargePointErrorCode() {
        return chargePointErrorCode;
    }

    public void setChargePointErrorCode(ChargePointErrorCode chargePointErrorCode) {
        this.chargePointErrorCode = chargePointErrorCode;
    }

   

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    public Integer getChargingSessionID() {
        return chargingSessionID;
    }

    public void setChargingSessionID(Integer chargingSessionID) {
        this.chargingSessionID = chargingSessionID;
    }

    public Timestamp getTimestampStart() {
        return timestampStart;
    }

    public void setTimestampStart(Timestamp timestampStart) {
        this.timestampStart = timestampStart;
    }

    public int getMeterStart() {
        return meterStart;
    }

    public void setMeterStart(int meterStart) {
        this.meterStart = meterStart;
    }

    public Timestamp getTimestampStop() {
        return timestampStop;
    }

    public void setTimestampStop(Timestamp timestampStop) {
        this.timestampStop = timestampStop;
    }

    public int getMeterStop() {
        return meterStop;
    }

    public void setMeterStop(int meterStop) {
        this.meterStop = meterStop;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getCharged() {
        return charged;
    }

    public void setCharged(double charged) {
        this.charged = charged;
    }

}
