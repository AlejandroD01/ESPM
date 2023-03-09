package project.esmp.service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.esmp.dto.DtoChargePoints;

import project.esmp.model.ChargePoints;
import project.esmp.model.repository.IRepositoryChargePoints;

/**
 *
 * @author mapa
 */
@Service
public class ServiceImplChargePoints implements IServiceChargePoints {

    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private IRepositoryChargePoints repo;


    @Override
    public DtoChargePoints registrar(DtoChargePoints  dtoChargePoints) {
        ChargePoints chargePoints = mapearEntidad(dtoChargePoints);
        
        ChargePoints newChargePoints = repo.save(chargePoints);
        DtoChargePoints newDtoChargePoints = mapearDTO(newChargePoints);
        return newDtoChargePoints;
    }
    @Override
    public List<DtoChargePoints> listar() {

        List<DtoChargePoints> chargePointses = repo.findAll()
                .stream()
                .map(chargeP-> mapearDTO(chargeP))
                .collect(Collectors.toList());
    
        return chargePointses;
    }

    @Override
    public DtoChargePoints actualizar(DtoChargePoints dtoChargePoints, int id) {
       //esta linea de abajo es paraa controlar exeepciones que despues pondre
        ChargePoints chargePoints = repo.findById(id)
                .orElse(null);
        
        ChargePoints cp = mapearEntidad(dtoChargePoints);
        cp.setChargePointID(chargePoints.getChargePointID());
        ChargePoints cpAct = repo.save(cp);

        return mapearDTO(cpAct);
    }

    @Override
    public void eliminar(Integer id) {
        ChargePoints chargePoints = repo.findById(id)
                .orElse(null);
        repo.delete(chargePoints);
    }
    
    @Override
    public DtoChargePoints optenerPuntoCargaPorId(Integer id) {
        ChargePoints chargePoints = repo.findById(id).orElse(null);
      return mapearDTO(chargePoints);
    }
    
//    convierte entidad a DTO
    private DtoChargePoints mapearDTO(ChargePoints chargePoints) {
        DtoChargePoints dtoChargePoints = modelMapper.map(chargePoints, DtoChargePoints.class);
        return dtoChargePoints;
    }

    //convierte de DTO a entidad
    private ChargePoints mapearEntidad(DtoChargePoints dtoChargePoints) {
        ChargePoints chargePoints = modelMapper.map(dtoChargePoints, ChargePoints.class);
        return chargePoints;
    }
}
