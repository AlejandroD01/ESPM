package project.esmp.dto;
import project.esmp.model.*;
import java.sql.Timestamp;
import project.esmp.Status.ReservationStatus;



/** @author Ale*/
public class DtoReservations  {


    private Integer ReservationID;
    private Timestamp expiryDate;
    private Connectors connector;
    private ReservationStatus reservationStatus;
    
    public DtoReservations() {
    }

    public DtoReservations(Integer ReservationID, Timestamp expiryDate, Connectors connector, ReservationStatus reservationStatus) {
        this.ReservationID = ReservationID;
        this.expiryDate = expiryDate;
        this.connector = connector;
        this.reservationStatus = reservationStatus;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    

    public Integer getReservationID() {
        return ReservationID;
    }

    public void setReservationID(Integer ReservationID) {
        this.ReservationID = ReservationID;
    }

    public Timestamp getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Connectors getConnector() {
        return connector;
    }

    public void setConnector(Connectors connector) {
        this.connector = connector;
    }

}
