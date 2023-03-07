package project.esmp.dto;
import java.sql.Timestamp;
import project.esmp.Status.ChargePointStatus;
import project.esmp.Type.AvailabilityType;
import project.esmp.model.ChargePoints;

/** @author Ale*/

public class DtoConnectors {

    private Integer connectorID;
    private Timestamp changeStatus;
    private String info; 
    private String vendorID; 
    private String vendorErrorCode; 
    private AvailabilityType availabilityType;
    private ChargePointStatus chargePointStatus;
    private ChargePoints chargePoints;

    public DtoConnectors() {
    }

    public DtoConnectors(Integer connectorID, Timestamp changeStatus, String info, String vendorID, String vendorErrorCode, AvailabilityType availabilityType, ChargePointStatus chargePointStatus, ChargePoints chargePoints) {
        this.connectorID = connectorID;
        this.changeStatus = changeStatus;
        this.info = info;
        this.vendorID = vendorID;
        this.vendorErrorCode = vendorErrorCode;
        this.availabilityType = availabilityType;
        this.chargePointStatus = chargePointStatus;
        this.chargePoints = chargePoints;
    }

    public AvailabilityType getAvailabilityType() {
        return availabilityType;
    }

    public void setAvailabilityType(AvailabilityType availabilityType) {
        this.availabilityType = availabilityType;
    }

    public ChargePointStatus getChargePointStatus() {
        return chargePointStatus;
    }

    public void setChargePointStatus(ChargePointStatus chargePointStatus) {
        this.chargePointStatus = chargePointStatus;
    }

   

    public Integer getConnectorID() {
        return connectorID;
    }

    public void setConnectorID(Integer connectorID) {
        this.connectorID = connectorID;
    }

    public Timestamp getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(Timestamp changeStatus) {
        this.changeStatus = changeStatus;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorErrorCode() {
        return vendorErrorCode;
    }

    public void setVendorErrorCode(String vendorErrorCode) {
        this.vendorErrorCode = vendorErrorCode;
    }

    public ChargePoints getChargePoints() {
        return chargePoints;
    }

    public void setChargePoints(ChargePoints chargePoints) {
        this.chargePoints = chargePoints;
    }

}
