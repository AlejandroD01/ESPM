package project.esmp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.esmp.model.ChargingSessions;


/**@author Ale */
@Repository
public interface IRepositoryChargeSessions extends JpaRepository<ChargingSessions, Integer> {//<tipo_de_entidad, tipo_de_id>
}
