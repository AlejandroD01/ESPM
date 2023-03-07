package project.esmp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.esmp.model.Reservations;

/**@author Ale */
@Repository
public interface IRepositoryReservations extends JpaRepository<Reservations, Integer> {//<tipo_de_entidad, tipo_de_id>
}
