package project.esmp.dto;
import java.time.LocalDateTime;
import project.esmp.Status.RegistrationStatus;



/** @author Alejandro*/

public class DtoChargePoints  {

    private Integer chargePointID;
    private String identity; 
    private String centralSystemPath; 
    private String description; 
    private LocalDateTime  lastHeartBeat; 
    private String chargeboxSerialNumber; 
    private String chargePointModel; 
    private String chargePointSerialNnumber; 
    private String chargePointVendor; 
    private String firmwareVersion; 
    private String iccid; 
    private String imsi; 
    private String meterSerialNumber; 
    private String meterType; 
    
    private RegistrationStatus registrationStatus;
    

    public DtoChargePoints() {
    }

    public DtoChargePoints(Integer chargePointID, String identity, String centralSystemPath, String description, LocalDateTime lastHeartBeat, String chargeboxSerialNumber, String chargePointModel, String chargePointSerialNnumber, String chargePointVendor, String firmwareVersion, String iccid, String imsi, String meterSerialNumber, String meterType, RegistrationStatus registrationStatus) {
        this.chargePointID = chargePointID;
        this.identity = identity;
        this.centralSystemPath = centralSystemPath;
        this.description = description;
        this.lastHeartBeat = lastHeartBeat;
        this.chargeboxSerialNumber = chargeboxSerialNumber;
        this.chargePointModel = chargePointModel;
        this.chargePointSerialNnumber = chargePointSerialNnumber;
        this.chargePointVendor = chargePointVendor;
        this.firmwareVersion = firmwareVersion;
        this.iccid = iccid;
        this.imsi = imsi;
        this.meterSerialNumber = meterSerialNumber;
        this.meterType = meterType;
        this.registrationStatus = registrationStatus;
    }

    public RegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public Integer getChargePointID() {
        return chargePointID;
    }

    public void setChargePointID(Integer chargePointID) {
        this.chargePointID = chargePointID;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getCentralSystemPath() {
        return centralSystemPath;
    }

    public void setCentralSystemPath(String centralSystemPath) {
        this.centralSystemPath = centralSystemPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getLastHeartBeat() {
        return lastHeartBeat;
    }

    public void setLastHeartBeat(LocalDateTime lastHeartBeat) {
        this.lastHeartBeat = lastHeartBeat;
    }

    public String getChargeboxSerialNumber() {
        return chargeboxSerialNumber;
    }

    public void setChargeboxSerialNumber(String chargeboxSerialNumber) {
        this.chargeboxSerialNumber = chargeboxSerialNumber;
    }

    public String getChargePointModel() {
        return chargePointModel;
    }

    public void setChargePointModel(String chargePointModel) {
        this.chargePointModel = chargePointModel;
    }

    public String getChargePointSerialNnumber() {
        return chargePointSerialNnumber;
    }

    public void setChargePointSerialNnumber(String chargePointSerialNnumber) {
        this.chargePointSerialNnumber = chargePointSerialNnumber;
    }

    public String getChargePointVendor() {
        return chargePointVendor;
    }

    public void setChargePointVendor(String chargePointVendor) {
        this.chargePointVendor = chargePointVendor;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getMeterSerialNumber() {
        return meterSerialNumber;
    }

    public void setMeterSerialNumber(String meterSerialNumber) {
        this.meterSerialNumber = meterSerialNumber;
    }

    public String getMeterType() {
        return meterType;
    }

    public void setMeterType(String meterType) {
        this.meterType = meterType;
    }

   
}
