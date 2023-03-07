package project.esmp.service;

import java.util.List;
import project.esmp.dto.DtoUsers;

/**
 * @author Ale
 */
public interface IServiceUsers {

    public DtoUsers registrar(DtoUsers dtoUsers);

    public List<DtoUsers> listar();

    public DtoUsers actualizar(DtoUsers dtoUsers, int id);

    public void eliminar(Integer id);
}
