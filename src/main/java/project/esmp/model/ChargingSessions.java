package project.esmp.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import project.esmp.errorCode.ChargePointErrorCode;

/**
 * @author Ale
 */
@Entity
public class ChargingSessions implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Integer chargingSessionID;

    private Timestamp timestampStart;
    private int meterStart;
    private Timestamp timestampStop;
    private int meterStop;
    private int duration;
    private double charged;

    @Enumerated(EnumType.STRING)
    private Reason reason;
    @Enumerated(EnumType.STRING)
    private ChargePointErrorCode chargePointErrorCode;

    public ChargingSessions() {
    }

    public ChargingSessions(Integer chargingSessionID, Timestamp timestampStart, int meterStart, Timestamp timestampStop, int meterStop, int duration, double charged, Reason reason, ChargePointErrorCode chargePointErrorCode) {
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
