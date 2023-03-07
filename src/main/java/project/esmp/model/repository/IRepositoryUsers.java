package project.esmp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.esmp.model.Users;

/**@author Ale */
@Repository
public interface IRepositoryUsers extends JpaRepository<Users, Integer> {//<tipo_de_entidad, tipo_de_id>
}
