package project.esmp.service;

import java.util.List;
import project.esmp.dto.DtoChargePoints;

/**
 * @author Ale
 */
public interface IServiceChargePoints {

    public DtoChargePoints registrar(DtoChargePoints dtoChargePoints);

    public List<DtoChargePoints> listar();

    public DtoChargePoints actualizar(DtoChargePoints dtoChargePoints, int id);

    public void eliminar(Integer id);

    public DtoChargePoints optenerPuntoCargaPorId(Integer id);
}
