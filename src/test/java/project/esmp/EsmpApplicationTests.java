package project.esmp;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import project.esmp.Status.ChargePointStatus;
import project.esmp.Status.RegistrationStatus;
import project.esmp.Status.ReservationStatus;
import project.esmp.Type.AvailabilityType;
import project.esmp.model.ChargePoints;
import project.esmp.model.Connectors;
import project.esmp.model.Reservations;
import project.esmp.model.repository.IRepositoryChargePoints;
import project.esmp.model.repository.IRepositoryConnectors;
import project.esmp.model.repository.IRepositoryReservations;

@SpringBootTest
class EsmpApplicationTests {

    @Autowired
    private IRepositoryConnectors repoC;

    @Autowired
    private IRepositoryChargePoints repoCP;

    @Autowired
    private IRepositoryReservations repoR;
    
//    @Test
//    public void createConnectores() {
//        Connectors connectors = new Connectors();
//        connectors.setAvailabilityType(AvailabilityType.OPERATIVE);
//        connectors.setInfo("asd");
//        connectors.setVendorErrorCode("asd");
//
//        Connectors c = repoC.save(connectors);
//
//        assertThat(c.getInfo()).isEqualTo(connectors.getInfo());
//    }
//    @Test
//    public void asd() {
//        Connectors c = repoC.findById(30).orElse(null);
//        System.out.println(" type value: " + c.getAvailabilityType().getValue());
//        System.out.println(" type description: " + c.getAvailabilityType().getDescription());
//        Assertions.assertTrue(true);
//    }
//    @Test
//    public void createConnectores() {
//        Connectors connectors = new Connectors();
//        connectors.setChargePointStatus(ChargePointStatus.UNAVAILABLE);
//        connectors.setInfo("asd");
//        connectors.setVendorErrorCode("asd");
//
//        Connectors c = repoC.save(connectors);
//
//        assertThat(c.getInfo()).isEqualTo(connectors.getInfo());
//    }
//    @Test
//    public void asd() {
//        Connectors c = repoC.findById(34).orElse(null);
//        System.out.println(" type value: " + c.getChargePointStatus().getValue());
//        System.out.println(" type description: " + c.getChargePointStatus().getDescription());
//        Assertions.assertTrue(true);
//    }
    
//    @Test
//    public void createChargePoint() {
//        ChargePoints chargePoints = new ChargePoints();
//        chargePoints.setRegistrationStatus(RegistrationStatus.ACCEPTED);
//        chargePoints.setIdentity("asd");
//        chargePoints.setCentralSystemPath("asd");
//
//        ChargePoints c = repoCP.save(chargePoints);
//
//        assertThat(c.getIdentity()).isEqualTo(chargePoints.getIdentity());
//    }
//    @Test
//    public void asd() {
//        ChargePoints c = repoCP.findById(32).orElse(null);
//        System.out.println(" type value: " + c.getRegistrationStatus().getValue());
//        System.out.println(" type description: " + c.getRegistrationStatus().getDescription());
//        Assertions.assertTrue(true);
//    }
//    @Test
//    public void createReservation() {
//        Reservations reservations = new Reservations();
//        reservations.setReservationStatus(ReservationStatus.FAULTED);
//
//        Reservations r = repoR.save(reservations);
//
//        assertThat(true);
//    }
//    @Test
//    public void asd() {
//        Reservations c = repoR.findById(33).orElse(null);
//        System.out.println(" type value: " + c.getReservationStatus().getValue());
//        System.out.println(" type description: " + c.getReservationStatus().getDescription());
//        Assertions.assertTrue(true);
//    }

    @Test
    void contextLoads() {
    }

}
