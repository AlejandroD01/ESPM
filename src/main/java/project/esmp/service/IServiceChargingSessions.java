package project.esmp.service;

import java.util.List;
import project.esmp.dto.DtoChargingSessions;

/**
 * @author Ale
 */
public interface IServiceChargingSessions {

    public DtoChargingSessions registrar(DtoChargingSessions dtoChargingSessions);

    public List<DtoChargingSessions> listar();

    public DtoChargingSessions actualizar(DtoChargingSessions dtoChargingSessions, int id);

    public void eliminar(Integer id);
}
