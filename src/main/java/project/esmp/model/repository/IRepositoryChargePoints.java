package project.esmp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.esmp.model.ChargePoints;


/**@author Ale */
@Repository
public interface IRepositoryChargePoints extends JpaRepository<ChargePoints, Integer> {//<tipo_de_entidad, tipo_de_id>
}
