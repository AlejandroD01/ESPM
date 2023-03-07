package project.esmp.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import project.esmp.Status.ReservationStatus;


/** @author Ale*/
@Entity
public class Reservations implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Integer ReservationID;

    private Timestamp expiryDate;
    
     //en un futuro el valor pasado por json puede dar problema sino se declara bien
    @Enumerated(EnumType.STRING)
    private ReservationStatus reservationStatus;
    
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "connector_id")
    private Connectors connector;
    
    public Reservations() {
    }

    public Reservations(Integer ReservationID, Timestamp expiryDate, ReservationStatus reservationStatus, Connectors connector) {
        this.ReservationID = ReservationID;
        this.expiryDate = expiryDate;
        this.reservationStatus = reservationStatus;
        this.connector = connector;
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
