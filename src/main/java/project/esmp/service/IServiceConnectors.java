package project.esmp.service;

import java.util.List;
import project.esmp.dto.DtoConnectors;

/**
 * @author Ale
 */
public interface IServiceConnectors {

    public DtoConnectors registrarPorChargePoints(DtoConnectors dtoConnectors, int id);

    public List<DtoConnectors> listar();

    public DtoConnectors actualizar(DtoConnectors dtoConnectors, int id);

    public void eliminar(Integer id);
}
