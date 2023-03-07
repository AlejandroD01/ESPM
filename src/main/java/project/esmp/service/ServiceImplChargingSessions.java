package project.esmp.service;

//import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.esmp.dto.DtoChargingSessions;
import project.esmp.model.ChargingSessions;
import project.esmp.model.repository.IRepositoryChargeSessions;


/**
 *
 * @author mapa
 */
@Service
public class ServiceImplChargingSessions implements IServiceChargingSessions {

    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private IRepositoryChargeSessions repo;


    @Override
    public DtoChargingSessions registrar(DtoChargingSessions  dtoChargingSessions) {
        ChargingSessions chargingSessions = mapearEntidad(dtoChargingSessions);   
        ChargingSessions newChargingSessions = repo.save(chargingSessions);
        
        DtoChargingSessions newDtoChargingSessions = mapearDTO(newChargingSessions);
        return newDtoChargingSessions;
    }
    @Override
    public List<DtoChargingSessions> listar() {

        List<DtoChargingSessions> chargingSessionses = repo.findAll()
                .stream()
                .map(cahrgingS-> mapearDTO(cahrgingS))
                .collect(Collectors.toList());
    
        return chargingSessionses;
    }

    @Override
    public DtoChargingSessions actualizar(DtoChargingSessions dtoChargingSessions, int id) {
       //esta linea de abajo es paraa controlar exeepciones que despues pondre
        ChargingSessions chargingSessions = repo.findById(id)
                .orElse(null);
        
        ChargingSessions cs = mapearEntidad(dtoChargingSessions);
        cs.setChargingSessionID(chargingSessions.getChargingSessionID());
        ChargingSessions cAct = repo.save(cs);

        return mapearDTO(cAct);
    }

    @Override
    public void eliminar(Integer id) {
        ChargingSessions chargingSessions = repo.findById(id)
                .orElse(null);
        repo.delete(chargingSessions);
    }
    
//    convierte entidad a DTO
    private DtoChargingSessions mapearDTO(ChargingSessions chargingSessions) {
        DtoChargingSessions dtoChargingSessions = modelMapper.map(chargingSessions, DtoChargingSessions.class);
        return dtoChargingSessions;
    }

    //convierte de DTO a entidad
    private ChargingSessions mapearEntidad(DtoChargingSessions dtoChargingSessions) {
        ChargingSessions chargingSessions = modelMapper.map(dtoChargingSessions, ChargingSessions.class);
        return chargingSessions;
    }
}
