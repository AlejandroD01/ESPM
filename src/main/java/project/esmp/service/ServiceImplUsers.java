package project.esmp.service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.esmp.dto.DtoUsers;
import project.esmp.model.Users;
import project.esmp.model.repository.IRepositoryUsers;

/** @author Ale */
@Service
public class ServiceImplUsers implements IServiceUsers {

    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private IRepositoryUsers repo;


    @Override
    public DtoUsers registrar(DtoUsers  dtoUsers) {
        Users users = mapearEntidad(dtoUsers);     
        Users newUsers = repo.save(users);
        
        DtoUsers newDtoUsers = mapearDTO(newUsers);
        return newDtoUsers;
    }
    @Override
    public List<DtoUsers> listar() {

        List<DtoUsers> dtoUserses = repo.findAll()
                .stream()
                .map(user-> mapearDTO(user))
                .collect(Collectors.toList());
    
        return dtoUserses;
    }

    @Override
    public DtoUsers actualizar(DtoUsers dtoUsers, int id) {
       //esta linea de abajo es paraa controlar exeepciones que despues pondre
        Users users = repo.findById(id)
                .orElse(null);
        
        Users u = mapearEntidad(dtoUsers);
        u.setUserID(users.getUserID());
        Users uAct = repo.save(u);

        return mapearDTO(uAct);
    }

    @Override
    public void eliminar(Integer id) {
        Users users = repo.findById(id)
                .orElse(null);
        repo.delete(users);
    }
    
//    convierte entidad a DTO
    private DtoUsers mapearDTO(Users users) {
        DtoUsers dtoUsers = modelMapper.map(users, DtoUsers.class);
        return dtoUsers;
    }

    //convierte de DTO a entidad
    private Users mapearEntidad(DtoUsers dtoUsers) {
        Users users = modelMapper.map(dtoUsers, Users.class);
        return users;
    }
}
