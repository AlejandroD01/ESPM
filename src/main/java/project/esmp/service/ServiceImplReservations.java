package project.esmp.service;

//import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.esmp.dto.DtoReservations;

import project.esmp.model.Connectors;
import project.esmp.model.Reservations;
import project.esmp.model.repository.IRepositoryConnectors;
import project.esmp.model.repository.IRepositoryReservations;

/**
 *
 * @author Ale
 */
@Service
public class ServiceImplReservations implements IServiceReservations {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IRepositoryConnectors iRepositoryConnectors;

    @Autowired
    private IRepositoryReservations repo;

    @Override
    public List<DtoReservations> listar() {

        List<DtoReservations> reservationses = repo.findAll()
                .stream()
                .map(reservation -> mapearDTO(reservation))
                .collect(Collectors.toList());

        return reservationses;
    }

    @Override
    public DtoReservations registrarPorConector(DtoReservations dtoReservations, int id) {
        Connectors connectors = iRepositoryConnectors.findById(id).orElse(null);
        Reservations reservations = mapearEntidad(dtoReservations);
        reservations.setConnector(connectors);

        Reservations newReservations = repo.save(reservations);
        return mapearDTO(newReservations);
    }

    @Override
    public DtoReservations actualizar(DtoReservations dtoReservations, int id) {
        //esta linea de abajo es paraa controlar exeepciones que despues pondre
        Reservations reservations = repo.findById(id)
                .orElse(null);

        Reservations r = mapearEntidad(dtoReservations);
        r.setReservationID(reservations.getReservationID());
        Reservations rAct = repo.save(r);

        return mapearDTO(rAct);
    }

    @Override
    public void eliminar(Integer id) {
        Reservations reservations = repo.findById(id)
                .orElse(null);
        repo.delete(reservations);
    }

//    convierte entidad a DTO
    private DtoReservations mapearDTO(Reservations reservations) {
        DtoReservations dtoReservations = modelMapper.map(reservations, DtoReservations.class);
        return dtoReservations;
    }

    //convierte de DTO a entidad
    private Reservations mapearEntidad(DtoReservations dtoReservations) {
        Reservations reservations = modelMapper.map(dtoReservations, Reservations.class);
        return reservations;
    }
}
