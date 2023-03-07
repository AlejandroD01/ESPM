package project.esmp.service;

//import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.esmp.dto.DtoConnectors;
import project.esmp.model.ChargePoints;
import project.esmp.model.Connectors;
import project.esmp.model.repository.IRepositoryChargePoints;
import project.esmp.model.repository.IRepositoryConnectors;

/**
 *
 * @author Alw
 */
@Service
public class ServiceImplConnectors implements IServiceConnectors {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IRepositoryConnectors repo;

    @Autowired
    private IRepositoryChargePoints repositoryChargePoints;

    @Override
    public List<DtoConnectors> listar() {

        List<DtoConnectors> connectorses = repo.findAll()
                .stream()
                .map(connectors -> mapearDTO(connectors))
                .collect(Collectors.toList());

        return connectorses;
    }

    @Override
    public DtoConnectors registrarPorChargePoints(DtoConnectors dtoConnectors, int id) {
        ChargePoints chargePoints = repositoryChargePoints.findById(id).orElse(null);
        Connectors connectors = mapearEntidad(dtoConnectors);
        connectors.setChargePoints(chargePoints);

        Connectors newConnectors = repo.save(connectors);
        return mapearDTO(newConnectors);
    }

    @Override
    public DtoConnectors actualizar(DtoConnectors dtoConnectors, int id) {
        //esta linea de abajo es paraa controlar exeepciones que despues pondre
        Connectors connectors = repo.findById(id)
                .orElse(null);

        Connectors c = mapearEntidad(dtoConnectors);
        c.setConnectorID(connectors.getConnectorID());
        Connectors cAct = repo.save(c);

        return mapearDTO(cAct);
    }

    @Override
    public void eliminar(Integer id) {
        Connectors connectors = repo.findById(id)
                .orElse(null);
        repo.delete(connectors);
    }

//    convierte entidad a DTO
    private DtoConnectors mapearDTO(Connectors connectors) {
        DtoConnectors dtoConnectors = modelMapper.map(connectors, DtoConnectors.class);
        return dtoConnectors;
    }

    //convierte de DTO a entidad
    private Connectors mapearEntidad(DtoConnectors dtoConnectors) {
        Connectors connectors = modelMapper.map(dtoConnectors, Connectors.class);
        return connectors;
    }

}
