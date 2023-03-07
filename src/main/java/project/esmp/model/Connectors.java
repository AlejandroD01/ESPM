package project.esmp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import project.esmp.Status.ChargePointStatus;
import project.esmp.Type.AvailabilityType;

/**
 * @author Ale
 */
@Entity
public class Connectors implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Integer connectorID;

    private Timestamp changeStatus;
    private String info;
    private String vendorID;
    private String vendorErrorCode;

    //en un futuro el valor pasado por json puede dar problema sino se declara bien
    @Enumerated(EnumType.STRING)
    private AvailabilityType availabilityType;

    @Enumerated(EnumType.STRING)
    private ChargePointStatus chargePointStatus;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "chargePoints_id")
    private ChargePoints chargePoints;

    @OneToMany(mappedBy = "connector", cascade = {CascadeType.REMOVE})
    private List<Reservations> reservationses = new ArrayList<>();

    public Connectors() {
    }

    public Connectors(Integer connectorID, Timestamp changeStatus, String info, String vendorID, String vendorErrorCode, AvailabilityType availabilityType, ChargePointStatus chargePointStatus, ChargePoints chargePoints) {
        this.connectorID = connectorID;
        this.changeStatus = changeStatus;
        this.info = info;
        this.vendorID = vendorID;
        this.vendorErrorCode = vendorErrorCode;
        this.availabilityType = availabilityType;
        this.chargePointStatus = chargePointStatus;
        this.chargePoints = chargePoints;
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

    public List<Reservations> getReservationses() {
        return reservationses;
    }

    public void setReservationses(List<Reservations> reservationses) {
        this.reservationses = reservationses;
    }

    public AvailabilityType getAvailabilityType() {
        return availabilityType;
    }

    public void setAvailabilityType(AvailabilityType availabilityType) {
        this.availabilityType = availabilityType;
    }


}
