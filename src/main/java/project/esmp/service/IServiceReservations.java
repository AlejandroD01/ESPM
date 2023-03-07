package project.esmp.service;

import java.util.List;
import project.esmp.dto.DtoReservations;

/**
 * @author Ale
 */
public interface IServiceReservations {

    public DtoReservations registrarPorConector(DtoReservations dtoReservations, int id);

    public List<DtoReservations> listar();

    public DtoReservations actualizar(DtoReservations dtoReservations, int id);

    public void eliminar(Integer id);
}
