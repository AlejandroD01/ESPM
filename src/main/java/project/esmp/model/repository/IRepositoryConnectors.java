package project.esmp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.esmp.model.Connectors;

/**@author Ale */
@Repository
public interface IRepositoryConnectors extends JpaRepository<Connectors, Integer> {//<tipo_de_entidad, tipo_de_id>
}
